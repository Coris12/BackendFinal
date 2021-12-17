package com.Caso1Backend.back.security.controller;

import java.util.List;
import java.util.Optional;

import com.Caso1Backend.back.security.models.Vehiculo;
import com.Caso1Backend.back.security.service.VehiculoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vehiculos/")
public class VehiculoController {
    
    @Autowired
    private VehiculoService vehiculoService;

    @GetMapping()
    private ResponseEntity<List<Vehiculo>> getAllVehiculos(){
        return ResponseEntity.ok(vehiculoService.findAll());
    }

    @GetMapping(path = {"{id}"})
    public Optional<Vehiculo> clienteById(@PathVariable("id")String id){
        return vehiculoService.getOneVehiculo(id);
    }


    @PutMapping(path = {"{id}"})
    public Vehiculo editar(@RequestBody Vehiculo v, @PathVariable("id")String id){
        v.setPlaca(id);
        return vehiculoService.editVehiculo(v);
    }

    @DeleteMapping(value = "delete/{id}")
    private ResponseEntity<Boolean> deleteCliente(@PathVariable("id")String id){
        vehiculoService.deleteById(id);
        return ResponseEntity.ok(!(vehiculoService.getOneVehiculo(id)!=null));
    }

}
