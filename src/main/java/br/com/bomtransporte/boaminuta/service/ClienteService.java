package br.com.bomtransporte.boaminuta.service;

import br.com.bomtransporte.boaminuta.exception.BoaMinutaBusinessException;
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
    private MunicipioService municipioService;


    public ClienteEntity montarCliente(Cliente cliente) throws BoaMinutaBusinessException {
        try {
            var clienteEntity = clienteRepository.findByCodigoClienteMili(cliente.getCodCliente());
            if (clienteEntity == null) {
                clienteEntity = getEntity(cliente);
                clienteRepository.saveAndFlush(clienteEntity);
            }
            return clienteEntity;
        } catch (Exception e){
            throw e;
        }
    }

    private ClienteEntity getEntity(Cliente cliente) throws BoaMinutaBusinessException {
        var clienteEntity = new ClienteEntity();
        clienteEntity.setNome(cliente.getRazaoSocial().getValue());
        clienteEntity.setCnpj(cliente.getCnpj().getValue());
        clienteEntity.setCodigoClienteMili(cliente.getCodCliente());
        clienteEntity.setEndereco(cliente.getEndereco().getValue());
        clienteEntity.setEstado(estadoService.findBySigla(cliente.getUf().getValue()));

        var municipio = municipioService.buscarPorCodigoIbge(cliente.getCodIbge().longValue());
        clienteEntity.setCidade(municipio);

        return clienteEntity;
    }
}
