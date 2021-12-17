package com.Caso1Backend.back.security.service;

import java.util.List;
import java.util.Optional;

import com.Caso1Backend.back.security.models.Vehiculo;
import com.Caso1Backend.back.security.repository.VehiculoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehiculoService {
    
    @Autowired
    private VehiculoRepository vehiculoRepository;

    public List<Vehiculo> findAll() {
        return vehiculoRepository.findAll();
    }

    public Vehiculo editVehiculo(Vehiculo c) {
        return vehiculoRepository.save(c);
    }

    public Optional<Vehiculo> getOneVehiculo(String id) {
        return vehiculoRepository.findById(id);
    }

    public void delete(Vehiculo entity) {
        vehiculoRepository.delete(entity);

    }

    public void deleteById(String id) {
        vehiculoRepository.deleteById(id);
    }
}
