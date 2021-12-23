package com.Caso1Backend.back.security.service;

import java.util.List;

import com.Caso1Backend.back.security.models.FacturaCabecera;
import com.Caso1Backend.back.security.repository.FacturaCabeceraRepository;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

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
        
    public Optional<FacturaCabecera> facturaById(int id){        
        return facturaCabeceraRepository.findById(id);
    }
        
}
