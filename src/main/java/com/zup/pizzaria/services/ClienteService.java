package com.zup.pizzaria.services;

import com.zup.pizzaria.dtos.ClienteDTO;
import com.zup.pizzaria.dtos.ClienteRequestDTO;
import com.zup.pizzaria.models.Cliente;
import com.zup.pizzaria.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    // Lista todos os clientes e converte em DTOs
    public List<ClienteDTO> listarClientes() {
        List<Cliente> clientes = clienteRepository.findAll();
        // Convertendo a lista de entidades para uma lista de DTOs
        return clientes.stream()
                .map(cliente -> new ClienteDTO(cliente.getId(), cliente.getNome()))
                .collect(Collectors.toList());
    }

    // Salva um novo cliente
    public ClienteDTO salvarCliente(ClienteRequestDTO clienteRequestDTO) {
        // Converte o DTO para a entidade Cliente
        Cliente cliente = new Cliente();
        try {
            cliente.setNome(clienteRequestDTO.getNome());
        } catch (Exception e) {
            throw new RuntimeException(e + ": houve um erro ao setar/alterar o nome.");
        }

        try {
            cliente.setEmail(clienteRequestDTO.getEmail());
        } catch (Exception e) {
            throw new RuntimeException(e + ": houve um erro ao setar/alterar o email.");
        }


        // Salvar no BD

        Cliente clienteSalvo = clienteRepository.save(cliente);
        // Retorna o cliente salvo como DTO
        return new ClienteDTO(clienteSalvo.getId(), clienteSalvo.getNome());
    }

}
