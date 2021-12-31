package com.Caso1Backend.back.security.service;

import java.util.List;
import java.util.Optional;

import com.Caso1Backend.back.security.models.Reclamo;
import com.Caso1Backend.back.security.repository.ReclamoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReclamoService {

    @Autowired
     private ReclamoRepository reclamoRepository;
     
     public List<Reclamo> findAll() {
        return reclamoRepository.findAll();
    }

    public <S extends Reclamo> S save(S entity) {
        return reclamoRepository.save(entity);
    }

    public Reclamo EditarReclamo(Reclamo c){
        return reclamoRepository.save(c);
    }


    public Optional<Reclamo> getOneReclamo(int id){
        return reclamoRepository.findById(id);
    }
    
    public List<Reclamo>search(){
     return reclamoRepository.findAllActiveUsersNative();
    }
    
    public List<Reclamo>getEstado(int estado){
        return reclamoRepository.findByEstadoReclamo(estado);
       }
    
     public List<Reclamo>searchAprobadas(){
     return reclamoRepository.findAllActiveReclamos();
    }
     
      public List<Reclamo>searchDenegadas(){
     return reclamoRepository.findAllActiveReclamosDenegado();
    }
    
}