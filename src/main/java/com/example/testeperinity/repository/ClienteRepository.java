package com.example.testeperinity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.testeperinity.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}