package io.github.cassimirodaniel.domain.repository;

import io.github.cassimirodaniel.domain.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Produtos extends JpaRepository<Produto,Integer> {
}