package com.Caso1Backend.back.security.repository;

import com.Caso1Backend.back.security.models.Cliente;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
    
    Cliente findByCedula(String cedula);
}
 