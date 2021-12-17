package com.Caso1Backend.back.security.repository;

import com.Caso1Backend.back.security.models.Cotizacion;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CotizacionRepository extends JpaRepository<Cotizacion, Long> {
    
}
