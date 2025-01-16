package com.zup.pizzaria.services;

import com.zup.pizzaria.dtos.PagamentoDTO;
import com.zup.pizzaria.models.Cliente;
import com.zup.pizzaria.models.Pagamento;
import com.zup.pizzaria.models.Pedido;
import com.zup.pizzaria.repository.ClienteRepository;
import com.zup.pizzaria.repository.PagamentoRepository;
import com.zup.pizzaria.repository.PedidoRepository;

public class PagamentoService {

    private final PagamentoRepository pagamentoRepository;
    private final PedidoRepository pedidoRepository;

    public PagamentoService(PagamentoRepository pagamentoRepository, PedidoRepository pedidoRepository, ClienteRepository clienteRepository) {
        this.pagamentoRepository = pagamentoRepository;
        this.pedidoRepository = pedidoRepository;

    }

    public PagamentoDTO realizarPagamento(Pagamento pagamento) {
        pagamentoRepository.save(pagamento);

        //Buscar pedido
        Pedido pedido = pedidoRepository
                .findById(pagamento.getPedidoId())
                .orElseThrow(() -> new RuntimeException("Pedido não encontrado"));


        return new PagamentoDTO(pedido.getId(), pagamento.getFormaPagamento(), pagamento.getValorPago(), pagamento.getDataHoraPagamento());
    }
}
