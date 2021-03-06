package com.generation.loja.game.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.loja.game.model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository <Categoria, Long> {

	List <Categoria> findAllByTipoContainingIgnoreCase(String tipo);
}