package com.Caso1Backend.back.security.service;

import java.util.List;

import com.Caso1Backend.back.security.models.Cotizacion;
import com.Caso1Backend.back.security.repository.CotizacionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CotizacionService {

    @Autowired
    private CotizacionRepository cotizacionRepository;

    public List<Cotizacion> findAll() {
        return cotizacionRepository.findAll();
    }

    public <S extends Cotizacion> S save(S entity) {
        return cotizacionRepository.save(entity);
    }
    
}
