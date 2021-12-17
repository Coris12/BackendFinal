package com.Caso1Backend.back.security.repository;

import com.Caso1Backend.back.security.models.Reclamo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ReclamoRepository extends JpaRepository<Reclamo, Integer> {
    
}