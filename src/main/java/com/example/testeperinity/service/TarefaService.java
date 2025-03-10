package com.example.testeperinity.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.testeperinity.model.Tarefa;
import com.example.testeperinity.repository.TarefaRepository;

@Service
public class TarefaService {

    @Autowired
    private TarefaRepository tarefaRepository;

    public List<Tarefa> getAllTarefas() {
        return tarefaRepository.findAll();
    }

    public Optional<Tarefa> getTarefaById(Long id) {
        return tarefaRepository.findById(id);
    }

    public Tarefa saveTarefa(Tarefa tarefa) {
        return tarefaRepository.save(tarefa);
    }

    public void deleteTarefa(Long id) {
        tarefaRepository.deleteById(id);
    }
}