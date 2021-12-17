package com.Caso1Backend.back.security.repository;
import com.Caso1Backend.back.security.models.SolicitudGarantia;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SolicitudesRespository extends JpaRepository<SolicitudGarantia, Integer>{
    
}