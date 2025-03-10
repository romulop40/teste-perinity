package com.example.testeperinity.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;

import com.example.testeperinity.model.Cliente;
import com.example.testeperinity.repository.ClienteRepository;

class ClienteServiceTest {

    @Mock
    private ClienteRepository clienteRepository;

    @InjectMocks
    private ClienteService clienteService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void getAllClientes() {
        Cliente cliente1 = new Cliente("Nome 1", "Departamento 1");
        Cliente cliente2 = new Cliente("Nome 2", "Departamento 2");
        List<Cliente> clientes = Arrays.asList(cliente1, cliente2);

        when(clienteRepository.findAll()).thenReturn(clientes);

        List<Cliente> result = clienteService.getAllClientes();

        assertEquals(2, result.size());
        verify(clienteRepository, times(1)).findAll();
    }

    @Test
    void getClienteById() {
        Cliente cliente = new Cliente("Nome 1", "Departamento 1");

        when(clienteRepository.findById(1L)).thenReturn(Optional.of(cliente));

        Optional<Cliente> result = clienteService.getClienteById(1L);

        assertTrue(result.isPresent());
        assertEquals("Nome 1", result.get().getNome());
        verify(clienteRepository, times(1)).findById(1L);
    }

    @Test
    void saveCliente() {
        Cliente cliente = new Cliente("Nome 1", "Departamento 1");

        when(clienteRepository.save(cliente)).thenReturn(cliente);

        Cliente result = clienteService.saveCliente(cliente);

        assertEquals("Nome 1", result.getNome());
        verify(clienteRepository, times(1)).save(cliente);
    }

    @Test
    void deleteCliente() {
        doNothing().when(clienteRepository).deleteById(1L);

        clienteService.deleteCliente(1L);

        verify(clienteRepository, times(1)).deleteById(1L);
    }
}