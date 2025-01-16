package com.zup.pizzaria.dtos;

public class PedidoDTO {
    private String nomeCliente;
    private String emailCliente;
    private String descricaoPedido;
    private double valorTotal;

    public PedidoDTO(String nomeCliente, String emailCliente, String descricaoPedido, double valorTotal) {
        this.nomeCliente = nomeCliente;
        this.emailCliente = emailCliente;
        this.descricaoPedido = descricaoPedido;
        this.valorTotal = valorTotal;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    public String getDescricaoPedido() {
        return descricaoPedido;
    }

    public void setDescricaoPedido(String descricaoPedido) {
        this.descricaoPedido = descricaoPedido;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
}
