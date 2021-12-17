package com.Caso1Backend.back.security.repository;

import com.Caso1Backend.back.security.models.FacturaCabecera;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FacturaCabeceraRepository extends JpaRepository<FacturaCabecera, Integer> {
    
}
