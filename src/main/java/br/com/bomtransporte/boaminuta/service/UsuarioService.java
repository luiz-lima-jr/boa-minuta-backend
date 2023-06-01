package br.com.bomtransporte.boaminuta.service;

import br.com.bomtransporte.boaminuta.exception.UsuarioExistenteException;
import br.com.bomtransporte.boaminuta.model.RegisterRequestModel;
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

@Service
public class UsuarioService implements UserDetailsService {

    private UsuarioEntity userDetails;

    @Autowired
    private IUsuarioRepository repository;
    private PasswordEncoder passwordEncoder;

    public UsuarioService(){
        passwordEncoder = new BCryptPasswordEncoder();
    }

    public void register(RegisterRequestModel request) throws UsuarioExistenteException {
        var user = UsuarioEntity.builder()
                .nome(request.getNome())
                .login(request.getUsername())
                .email(request.getEmail())
                .senha(passwordEncoder.encode(request.getPassword()))
                .roles(request.getRoles())
                .build();

        if (repository.findByUserLogin(request.getEmail()).isPresent()){
            throw new UsuarioExistenteException("Email já cadastrado");
        }
        if (repository.findByUserLogin(request.getUsername()).isPresent()){
            throw new UsuarioExistenteException("Nome de usuário já cadastrado");
        }

        repository.save(user);
    }

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
       this.userDetails = getUsuarioByUsernameEmail(username);
       return userDetails;
    }

    public UsuarioEntity getUserDetails(){
        return  userDetails;
    }

    public UsuarioEntity getUsuarioByUsernameEmail(String login){
        var usuario = repository.findByUserLogin(login);
        if(usuario.isEmpty()){
            throw new UsernameNotFoundException("Usuário não encontrado");
        }
        return usuario.get();
    }

    public PasswordEncoder getPasswordEncoder() {
        return passwordEncoder;
    }
}
