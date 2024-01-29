package br.com.bomtransporte.boaminuta.service;

import br.com.bomtransporte.boaminuta.config.PropertyConfig;
import br.com.bomtransporte.boaminuta.exception.BoaMinutaBusinessException;
import br.com.bomtransporte.boaminuta.exception.UsuarioException;
import br.com.bomtransporte.boaminuta.exception.UsuarioExistenteException;
import br.com.bomtransporte.boaminuta.model.*;
import br.com.bomtransporte.boaminuta.persistence.entity.FilialEntity;
import br.com.bomtransporte.boaminuta.persistence.entity.FuncaoEntity;
import br.com.bomtransporte.boaminuta.persistence.entity.UsuarioEntity;
import br.com.bomtransporte.boaminuta.persistence.repository.IFilialRepository;
import br.com.bomtransporte.boaminuta.persistence.repository.IFuncaoRepository;
import br.com.bomtransporte.boaminuta.persistence.repository.IUsuarioFilialRepository;
import br.com.bomtransporte.boaminuta.persistence.repository.IUsuarioRepository;
import io.jsonwebtoken.ExpiredJwtException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UsuarioService implements UserDetailsService {

    private UsuarioEntity userDetails;

    @Autowired
    private IUsuarioRepository repository;

    @Autowired
    private IFuncaoRepository funcaoRepository;

    @Autowired
    private IFilialRepository filialRepository;

    @Autowired
    private EmailServiceImpl emailService;

    @Autowired
    private PropertyConfig propertyCofig;

    @Autowired
    private IUsuarioFilialRepository usuarioFilialRepository;

    private final PasswordEncoder passwordEncoder;

    @Autowired private JwtService jwtService;

    public UsuarioService(){
        passwordEncoder = new BCryptPasswordEncoder();
    }


    public List<UsuarioEntity> getAll(){
        return repository.findAll();
    }
    public List<UsuarioModel> filtrarPorNome(String nome){
        var usuarios = repository.findByNomeContains(nome);
        return usuarios.stream().map(u -> UsuarioModel.builder().nome(u.getNome()).id(u.getId()).build()).collect(Collectors.toList());
    }

    public void cadastrarUsuario(RegistroUsuarioModel request) throws UsuarioExistenteException {
        var user = UsuarioEntity.UsuarioEntityBuilder.builder()
                .nome(request.getNome().trim())
                .email(request.getEmail().trim())
                .senha(passwordEncoder.encode(request.getSenha()))
                .funcoes(buscarFuncoes(request.getFuncoes()))
                .filiais(buscarFiliais(request.getFiliais()))
                .build();

        if (repository.findByEmail(request.getEmail().trim()).isPresent()){
            throw new UsuarioExistenteException("Email já cadastrado");
        }

        repository.save(user);
    }

    private List<FuncaoEntity> buscarFuncoes(List<FuncaoEntity> funcoes){
        return funcaoRepository.findAllById(funcoes.stream().map(f -> f.getId()).collect(Collectors.toList()));
    }

    private List<FilialEntity> buscarFiliais(List<FilialEntity> filiais){
        return filialRepository.findAllById(filiais.stream().map(f -> f.getId()).collect(Collectors.toList()));
    }
    /*
    private List<FilialEntity> buscarFiliaisUpdate(UsuarioEntity usuario, List<FilialEntity> filiais){
        var usuarioFiliais = new ArrayList<UsuarioFilialEntity>();
        var filiaisEncontradas = new  ArrayList<FilialEntity>();
        for(var filial : filiais){
            var usuarioFilial = usuarioFilialRepository.findByUsuarioIdAndFilialId(usuario.getId(), filial.getId());
            if(usuarioFilial.isEmpty()) {
                filiaisEncontradas.add();
            } else {
                usuarioFiliais.add(usuarioFilial.get());
            }
        }

        return filialRepository.findAllById(filiais.stream().map(f -> f.getId()).collect(Collectors.toList()));
    }*/

    public void alterarUsuario(RegistroUsuarioModel request) throws UsuarioExistenteException {
        var usuario = repository.findById(request.getId()).orElse(null);
        if(usuario == null){
            throw new UsernameNotFoundException("Usuário não encontrado");
        }
        usuario.setEmail(request.getEmail());
        usuario.setFiliais(buscarFiliais(request.getFiliais()));
        usuario.setFuncoes(buscarFuncoes(request.getFuncoes()));
        usuario.setNome(request.getNome());
        usuario.setAtivo(request.isSituacao());

        repository.save(usuario);
    }

    public void alterarDadosPessoais(DadosSessaoModel dadosSessaoModel) throws UsuarioException {
        var usuario = repository.findById(userDetails.getId()).orElse(null);
        if(usuario == null){
            throw new UsuarioException("Erro ao buscar o perfil");
        }
        usuario.setNome(dadosSessaoModel.getNome());
        usuario.setEmail(dadosSessaoModel.getEmail());
        repository.save(usuario);
    }

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
       this.userDetails = getUsuarioByEmail(username);
       return userDetails;
    }

    public UsuarioEntity getById(Long idUsuario){
        return repository.getById(idUsuario);
    }

    public UsuarioEntity getUserDetails(){
        return  userDetails;
    }

    public DadosSessaoModel getDadosSessao(){
        return new DadosSessaoModel(userDetails.getNome(), userDetails.getEmail());
    }

    public UsuarioEntity getUsuarioByEmail(String login){
        var usuario = repository.findByEmail(login);
        if(usuario.isEmpty()){
            throw new UsernameNotFoundException("Usuário não encontrado");
        }
        return usuario.get();
    }

    public PasswordEncoder getPasswordEncoder() {
        return passwordEncoder;
    }

    public void recuperarSenha(Long idUsuario){
        var usuario = repository.findById(idUsuario).orElse(null);
        gerarTokenRecuperacao(usuario);
    }

    public void recuperarSenha(String email){
        var usuario = repository.findByEmail(email).orElse(null);
        gerarTokenRecuperacao(usuario);
    }

    private void gerarTokenRecuperacao(UsuarioEntity usuario){
        if(usuario == null){
            throw new UsernameNotFoundException("Usuário não encontrado");
        }
        var token = jwtService.gerarTokenRecuperacaoSenha(usuario);
        usuario.setTokenRecuperarSenha(token);
        var url = propertyCofig.getFrontendUrl() + "/nova-senha/"+token;
        var emailCorpo = "Olá, " + usuario.getNome() + "<br><br>Acesse o link a seguir para recuperar a senha do seu cadastro. Ele é válido por 2 horas: "+url;
        emailService.enviar(usuario.getEmail(), "Recuperar senha", emailCorpo);
        repository.save(usuario);
    }

    public void alterarSenha(AlterarSenhaExternoModel model) throws BoaMinutaBusinessException {
        UsuarioEntity usuario;
        if(model.getToken() != null) {
            usuario =  repository.findByTokenRecuperarSenha(model.getToken()).orElse(null);
            try {
                if(jwtService.isTokenExpired(model.getToken()) || usuario == null){
                    throw new BoaMinutaBusinessException("Link de alteração expirado!");
                }
            } catch (ExpiredJwtException e){
                throw new BoaMinutaBusinessException("Link de alteração expirado!");
            }

        } else {
            usuario = repository.findById(userDetails.getId()).orElse(null);
        }
        alterarSenha(usuario, model.getSenha());
    }

    public void alterarSenha(AlterarSenhaModel model) throws BoaMinutaBusinessException {
        UsuarioEntity usuario = repository.findById(userDetails.getId()).orElse(null);
        if(!passwordEncoder.matches(model.getSenhaAtual(), usuario.getPassword())){
            throw new UsuarioException("Senha atual inválida!");
        }
        alterarSenha(usuario, model.getSenha());
    }

    private void alterarSenha(UsuarioEntity usuario, String novaSenha){
        if(usuario == null){
            throw new UsernameNotFoundException("Usuário não encontrado");
        }
        usuario.setSenha(passwordEncoder.encode(novaSenha));
        usuario.setTokenRecuperarSenha(null);
        repository.save(usuario);
    }

    public void excluir(Long id) throws Exception {
        repository.deleteById(id);
    }

}
