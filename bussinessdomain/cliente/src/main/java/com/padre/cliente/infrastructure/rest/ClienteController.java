package com.padre.cliente.infrastructure.rest;

import com.padre.cliente.application.ClienteService;
import com.padre.cliente.bussiness.model.Cliente;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping
    public ResponseEntity<List<Cliente>>  findByAll(){
        return ResponseEntity.ok(clienteService.findByAll());
    }

    @GetMapping("/findById")
    public ResponseEntity<Cliente> findById(@RequestParam("id") Long id){
        return ResponseEntity.ok(clienteService.findById(id));
    }
}
