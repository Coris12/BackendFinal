package com.Caso1Backend.back.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Caso1Backend.back.security.models.OrdenReparacion;
import com.Caso1Backend.back.security.repository.OrdenReparacionRepository;

@Service
public class OrdenReparacionService {
	@Autowired
    private OrdenReparacionRepository ordenReparacionRepository;

    public <S extends OrdenReparacion> S save(S entity) {
        return ordenReparacionRepository.save(entity);
    }
}
