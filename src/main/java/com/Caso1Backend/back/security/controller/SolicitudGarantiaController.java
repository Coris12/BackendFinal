package com.Caso1Backend.back.security.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import com.Caso1Backend.back.security.models.Reclamo;
import com.Caso1Backend.back.security.models.SolicitudGarantia;
import com.Caso1Backend.back.security.service.SolicitudGarantiaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/garantias/")
public class SolicitudGarantiaController {

    @Autowired
    private SolicitudGarantiaService solicitudGarantiaService;

    @GetMapping()
    private ResponseEntity<List<SolicitudGarantia>> getAllSolicitudes(){
        return ResponseEntity.ok(solicitudGarantiaService.findAll());
    }

    @GetMapping(path = {"{id}"})
    public Optional<SolicitudGarantia> clienteById(@PathVariable("id")int id){
        return solicitudGarantiaService.getOneReclamo(id);
    }

    @PostMapping()
    private ResponseEntity<SolicitudGarantia> saveReclamos(@RequestBody SolicitudGarantia solicitudGarantia){
        try {
            SolicitudGarantia reclamoGuardado = solicitudGarantiaService.save(solicitudGarantia);
            return ResponseEntity.created(new URI("/garantias/"+ reclamoGuardado.getId_garantia())).body(reclamoGuardado);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }


    @PutMapping(path = {"{id}"})
    public SolicitudGarantia editar(@RequestBody SolicitudGarantia c, @PathVariable("id")int id){
        c.setId_garantia(id);
        return solicitudGarantiaService.EditarReclamo(c);
    }

    
}
