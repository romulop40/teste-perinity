package com.example.testeperinity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.testeperinity.model.Tarefa;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
}