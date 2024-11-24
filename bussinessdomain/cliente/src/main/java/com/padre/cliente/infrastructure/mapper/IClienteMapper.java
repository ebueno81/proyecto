package com.padre.cliente.infrastructure.mapper;

import com.padre.cliente.bussiness.model.Cliente;
import com.padre.cliente.infrastructure.entity.ClienteEntity;
import org.mapstruct.Mapper;
import java.util.List;
import java.util.Optional;

@Mapper(componentModel = "spring")
public interface IClienteMapper {

    Cliente toModel(Optional<ClienteEntity> entity);
    ClienteEntity toEntity(Cliente model);

    List<Cliente> toModelList(List<ClienteEntity> entityList);
    List<ClienteEntity> toEntityList(List<Cliente> modelList);

}
