package io.github.cassimirodaniel.domain.repository;

import io.github.cassimirodaniel.domain.entity.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemsPedido extends JpaRepository<ItemPedido, Integer> {
}
