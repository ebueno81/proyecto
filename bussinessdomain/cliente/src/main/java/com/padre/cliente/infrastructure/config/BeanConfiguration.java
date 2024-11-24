package com.padre.cliente.infrastructure.config;

import com.padre.cliente.application.ClienteService;
import com.padre.cliente.bussiness.port.IClienteRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {


    @Bean
    public ClienteService clienteService(IClienteRepository iClienteRepository){
        return new ClienteService(iClienteRepository);
    }
}
