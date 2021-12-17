package com.Caso1Backend.back.security.service;

import java.util.List;

import com.Caso1Backend.back.security.models.FacturaCabecera;
import com.Caso1Backend.back.security.repository.FacturaCabeceraRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FacturaCabeceraService {
    
    @Autowired
    private FacturaCabeceraRepository  facturaCabeceraRepository;

    public List<FacturaCabecera> findAll(){
        return facturaCabeceraRepository.findAll();
    }

    public <S extends FacturaCabecera> S save(S entity) {
        return facturaCabeceraRepository.save(entity);
    }

    public FacturaCabecera registrar(FacturaCabecera facturaCabecera){
        return facturaCabeceraRepository.save(facturaCabecera);
    }
}
