package com.Caso1Backend.back.security.service;

import java.util.List;

import com.Caso1Backend.back.security.models.FacturaCabecera;
import com.Caso1Backend.back.security.models.FacturaCuerpo;
import com.Caso1Backend.back.security.repository.FacturaCuerpoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FacturaCuerpoService {

    @Autowired
    private FacturaCuerpoRepository facturaCuerpoRepository;

    public List<FacturaCuerpo> findAll(){
        return facturaCuerpoRepository.findAll();
    }

    public <S extends FacturaCuerpo> S save(S entity) {
        return facturaCuerpoRepository.save(entity);
    }

    public FacturaCuerpo registrar(FacturaCuerpo facturaCuerpo){
        return facturaCuerpoRepository.save(facturaCuerpo);
    }


    public boolean pf(String placa) {

        if (facturaCuerpoRepository.findByPlaca(placa) != null) {
            return true;
        } else {
            return false;
        }
    }
    
    
    
}
