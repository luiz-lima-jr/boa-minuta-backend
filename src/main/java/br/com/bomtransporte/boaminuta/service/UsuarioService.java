package br.com.bomtransporte.boaminuta.service;

import br.com.bomtransporte.boaminuta.exception.UsuarioExistenteException;
import br.com.bomtransporte.boaminuta.model.RegistroUsuarioModel;
import br.com.bomtransporte.boaminuta.persistence.entity.UsuarioEntity;
import br.com.bomtransporte.boaminuta.persistence.repository.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
public class UsuarioService implements UserDetailsService {

    private UsuarioEntity userDetails;

    @Autowired
    private IUsuarioRepository repository;

    @Autowired
    private EmailService emailService;

    private final PasswordEncoder passwordEncoder;

    public UsuarioService(){
        passwordEncoder = new BCryptPasswordEncoder();
    }


    public List<UsuarioEntity> getAll(){
        return repository.findAll();
    }

    public void cadastrarUsuario(RegistroUsuarioModel request) throws UsuarioExistenteException {
        var user = UsuarioEntity.UsuarioEntityBuilder.builder()
                .nome(request.getNome())
                .email(request.getEmail())
                .senha(passwordEncoder.encode(request.getSenha()))
                .funcoes(request.getFuncoes())
                .filiais(request.getFiliais())
                .build();

        if (repository.findByEmail(request.getEmail()).isPresent()){
            throw new UsuarioExistenteException("Email já cadastrado");
        }

        repository.save(user);
    }

    public void alterarUsuario(RegistroUsuarioModel request) throws UsuarioExistenteException {
        var usuario = repository.findById(request.getId()).orElse(null);
        if(usuario == null){
            throw new UsernameNotFoundException("Usuário não encontrado");
        }
        usuario.setEmail(request.getEmail());
        usuario.setFiliais(request.getFiliais());
        usuario.setFuncoes(request.getFuncoes());
        usuario.setNome(request.getNome());
        usuario.setAtivo(request.isAtivo());

        repository.save(usuario);
    }

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
       this.userDetails = getUsuarioByEmail(username);
       return userDetails;
    }

    public UsuarioEntity getUserDetails(){
        return  userDetails;
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
        if(usuario == null){
            throw new UsernameNotFoundException("Usuário não encontrado");
        }
        var tokenReset = UUID.randomUUID();
        usuario.setTokenRecuperarSenha(tokenReset);
        var emailCorpo = "Acesse o link a seguir para recuperar a senha do seu cadastro: http://localhost:4200/nova-senha/"+tokenReset;
        emailService.enviar(usuario.getEmail(), "Recuperar senha", emailCorpo);
        repository.save(usuario);
    }

    public void recuperarSenha(String email){
        var usuario = repository.findByEmail(email).orElse(null);
        if(usuario == null){
            throw new UsernameNotFoundException("Usuário não encontrado");
        }
        var tokenReset = UUID.randomUUID();
        usuario.setTokenRecuperarSenha(tokenReset);
        var emailCorpo = "Acesse o link a seguir para recuperar a senha do seu cadastro: http://localhost:4200/nova-senha/"+tokenReset;
        emailService.enviar(usuario.getEmail(), "Recuperar senha", emailCorpo);
        repository.save(usuario);
    }
}
