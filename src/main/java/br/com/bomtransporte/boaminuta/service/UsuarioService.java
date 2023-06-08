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

@Service
public class UsuarioService implements UserDetailsService {

    private UsuarioEntity userDetails;

    @Autowired
    private IUsuarioRepository repository;
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
}
