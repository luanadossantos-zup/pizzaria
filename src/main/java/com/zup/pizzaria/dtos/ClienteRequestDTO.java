package com.zup.pizzaria.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class ClienteRequestDTO {

    @NotBlank(message = "Por favor, digite um nome!")
    private String nome;
    @NotBlank(message = "Por favor, digite um email!")
    @Email(message = "Por favor, digite um email válido!")
    private String email;
    @NotBlank(message = "Por favor, digite um telefone!")
    @Size(min = 8, message = "O telefone deve ter um mínimo de 8 dígitos!")
    private String telefone;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
