package io.github.cassimirodaniel.service;

import io.github.cassimirodaniel.domain.entity.Pedido;
import io.github.cassimirodaniel.domain.enums.StatusPedido;
import io.github.cassimirodaniel.rest.dto.PedidoDTO;

import java.util.Optional;

public interface PedidoService {
    Pedido salvar( PedidoDTO dto );
    Optional<Pedido> obterPedidoCompleto(Integer id);
    void atualizaStatus(Integer id, StatusPedido statusPedido);
}
