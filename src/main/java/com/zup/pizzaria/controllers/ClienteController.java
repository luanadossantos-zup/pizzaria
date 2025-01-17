package com.zup.pizzaria.controllers;

import com.zup.pizzaria.dtos.ClienteDTO;
import com.zup.pizzaria.dtos.ClienteRequestDTO;
import com.zup.pizzaria.services.ClienteService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    // Endpoint para listar todos os clientes
    @GetMapping
    public List<ClienteDTO> listarClientes() {
        return clienteService.listarClientes();
    }

    // Endpoint para cadastrar um novo cliente
    @PostMapping
    public ResponseEntity<ClienteDTO> salvarCliente(@Valid @RequestBody ClienteRequestDTO clienteRequestDTO) {
        ClienteDTO clienteSalvo = clienteService.salvarCliente(clienteRequestDTO);
        return ResponseEntity.status(201).body(clienteSalvo); // Retorna o status 201
    }
}
