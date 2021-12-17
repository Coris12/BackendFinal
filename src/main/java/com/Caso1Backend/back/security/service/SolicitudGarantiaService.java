package com.Caso1Backend.back.security.service;

import java.util.List;
import java.util.Optional;

import com.Caso1Backend.back.security.models.Reclamo;
import com.Caso1Backend.back.security.models.SolicitudGarantia;
import com.Caso1Backend.back.security.repository.SolicitudesRespository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SolicitudGarantiaService {

    @Autowired
    private SolicitudesRespository solicitudesRespository;

    public List<SolicitudGarantia> findAll() {
        return solicitudesRespository.findAll();
    }

    public <S extends SolicitudGarantia> S save(S entity) {
        return solicitudesRespository.save(entity);
    }

    public SolicitudGarantia EditarReclamo(SolicitudGarantia c){
        return solicitudesRespository.save(c);
    }


    public Optional<SolicitudGarantia> getOneReclamo(int id){
        return solicitudesRespository.findById(id);
    }
    

    
}