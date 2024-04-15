package br.com.bomtransporte.boaminuta.service;

import br.com.bomtransporte.boaminuta.mili.Cliente;
import br.com.bomtransporte.boaminuta.persistence.entity.ClienteEntity;
import br.com.bomtransporte.boaminuta.persistence.entity.ClienteFreteEntity;
import br.com.bomtransporte.boaminuta.persistence.entity.FreteEntity;
import br.com.bomtransporte.boaminuta.persistence.repository.IClienteFreteRepository;
import br.com.bomtransporte.boaminuta.persistence.repository.IClienteRepository;
import br.com.bomtransporte.boaminuta.persistence.repository.IMunicipioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {


    @Autowired
    private IClienteRepository clienteRepository;

    @Autowired
    private IClienteFreteRepository clienteFreteRepository;

    @Autowired
    private EstadoService estadoService;

    @Autowired
    private IMunicipioRepository municipioRepository;

    public ClienteEntity montarCliente(Cliente cliente){
        var clienteEntity = clienteRepository.findByCodigoClienteMili(cliente.getCodCliente());
        if(clienteEntity == null){
            clienteEntity = clienteEntity = getEntity(cliente);
            clienteRepository.save(clienteEntity);
        }
        return clienteEntity;
    }


    public ClienteEntity montarCliente(Cliente cliente, FreteEntity freteEntity){
        var clienteEntity = clienteRepository.findByCodigoClienteMili(cliente.getCodCliente());
        if(clienteEntity == null){
            clienteEntity = getEntity(cliente);
        }
        return clienteEntity;
    }

    private ClienteEntity getEntity(Cliente cliente){
        var clienteEntity = new ClienteEntity();
        clienteEntity.setNome(cliente.getRazaoSocial().getValue());
        clienteEntity.setCnpj(cliente.getCnpj().getValue());
        clienteEntity.setCodigoClienteMili(cliente.getCodCliente());
        clienteEntity.setEndereco(cliente.getEndereco().getValue());
        clienteEntity.setEstado(estadoService.findBySigla(cliente.getUf().getValue()));

        var municipio = municipioRepository.findByCodigoIbge(cliente.getCodIbge().longValue());
        clienteEntity.setCidade(municipio);

        return clienteEntity;
    }
}
