package com.Caso1Backend.back.security.service;

import java.util.List;
import java.util.Optional;

import com.Caso1Backend.back.security.models.Cliente;
import com.Caso1Backend.back.security.repository.ClienteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> findAll() {
        return clienteRepository.findAll();
    }

    public <S extends Cliente> S save(S entity) {
        return clienteRepository.save(entity);
    }

    public Cliente editCliente(Cliente c) {
        return clienteRepository.save(c);
    }

    public Optional<Cliente> getOneCliente(int id) {
        return clienteRepository.findById(id);
    }

    public void delete(Cliente entity) {
        clienteRepository.delete(entity);

    }

    public void deleteById(int id) {
        clienteRepository.deleteById(id);
    }

}
