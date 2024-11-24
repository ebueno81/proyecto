package com.padre.cliente.application;

import com.padre.cliente.bussiness.model.Cliente;
import com.padre.cliente.bussiness.port.IClienteRepository;
import java.util.List;

public class ClienteService {

    private final IClienteRepository iClienteRepository;

    public ClienteService(IClienteRepository iClienteRepository) {
        this.iClienteRepository = iClienteRepository;
    }

    public List<Cliente> findByAll(){
        return iClienteRepository.findByAll();
    }

    public Cliente findById(Long id){
        return iClienteRepository.findById(id);
    }

}
