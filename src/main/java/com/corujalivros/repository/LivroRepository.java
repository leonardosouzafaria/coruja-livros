package com.corujalivros.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.corujalivros.models.Livro;

public interface LivroRepository extends JpaRepository<Livro, String> {

}
