package com.padre.cliente.infrastructure.adapter;


import com.padre.cliente.bussiness.model.Cliente;
import com.padre.cliente.bussiness.port.IClienteRepository;
import com.padre.cliente.infrastructure.entity.ClienteEntity;
import com.padre.cliente.infrastructure.mapper.IClienteMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ClienteRepositoryImpl implements IClienteRepository {

    private final IClienteCrudRepository iClienteCrudRepository;
    private final IClienteMapper iClienteMapper;

    public ClienteRepositoryImpl(IClienteCrudRepository iClienteCrudRepository, IClienteMapper iClienteMapper) {
        this.iClienteCrudRepository = iClienteCrudRepository;
        this.iClienteMapper = iClienteMapper;
    }

    @Override
    public List<Cliente> findByAll() {
        List<ClienteEntity> clienteEntityList = (List<ClienteEntity>) iClienteCrudRepository.findAll();
        return iClienteMapper.toModelList(clienteEntityList);
    }

    @Override
    public Cliente findById(Long id) {
        return iClienteMapper.toModel(iClienteCrudRepository.findById(id));
    }
}
