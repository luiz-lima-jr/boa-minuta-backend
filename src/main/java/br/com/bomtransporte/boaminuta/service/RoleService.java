package br.com.bomtransporte.boaminuta.service;

import br.com.bomtransporte.boaminuta.persistence.entity.RoleEntity;
import br.com.bomtransporte.boaminuta.persistence.repository.IRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {
    @Autowired
    private IRoleRepository roleRepository;

    public void criarRole(String name){
        var role = new RoleEntity();
        role.setName(name);
        roleRepository.save(role);
    }
}
