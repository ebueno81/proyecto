package com.padre.cliente.infrastructure.adapter;

import com.padre.cliente.infrastructure.entity.ClienteEntity;
import org.springframework.data.repository.CrudRepository;

public interface IClienteCrudRepository extends CrudRepository<ClienteEntity,Long> {
}
