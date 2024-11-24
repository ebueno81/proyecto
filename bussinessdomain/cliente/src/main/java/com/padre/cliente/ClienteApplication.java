package com.padre.cliente;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.padre.cliente.infrastructure.adapter")
@SpringBootApplication
public class ClienteApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClienteApplication.class, args);
	}

}
