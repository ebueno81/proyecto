package com.padre.cliente.bussiness.port;
import com.padre.cliente.bussiness.model.Cliente;

import java.util.List;

public interface IClienteRepository {

    List<Cliente> findByAll();
    Cliente findById(Long id);
}
