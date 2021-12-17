package com.Caso1Backend.back.security.repository;

import com.Caso1Backend.back.security.models.Vehiculo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VehiculoRepository extends JpaRepository<Vehiculo, String> {
    
}
