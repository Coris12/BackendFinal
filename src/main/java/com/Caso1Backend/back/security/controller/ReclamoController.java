package com.Caso1Backend.back.security.controller;

import java.net.URI;

import com.Caso1Backend.back.security.models.Reclamo;
import com.Caso1Backend.back.security.service.ReclamoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/reclamos/")
public class ReclamoController {

    @Autowired
    private ReclamoService reclamoService;

    @PostMapping()
    private ResponseEntity<Reclamo> saveReclamos(@RequestBody Reclamo reclamo){
        try {
            Reclamo reclamoGuardado = reclamoService.save(reclamo);
            return ResponseEntity.created(new URI("/reclamos/"+ reclamoGuardado.getId_reclamo())).body(reclamoGuardado);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
}