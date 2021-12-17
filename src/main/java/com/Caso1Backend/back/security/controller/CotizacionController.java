package com.Caso1Backend.back.security.controller;

import java.net.URI;
import java.util.List;

import com.Caso1Backend.back.security.models.Cotizacion;
import com.Caso1Backend.back.security.service.CotizacionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cotizaciones/")
public class CotizacionController {

    @Autowired 
    private CotizacionService cotizacionService;

    @GetMapping()
    private ResponseEntity<List<Cotizacion>> getAllCotizaciones(){
        return ResponseEntity.ok(cotizacionService.findAll());
    }

    @PostMapping()
    private ResponseEntity<Cotizacion> saveCotizacion(@RequestBody Cotizacion cotizacion){
        try {
            Cotizacion cotizacionGuardada = cotizacionService.save(cotizacion);
            return ResponseEntity.created(new URI("/cotizaciones/"+ cotizacionGuardada.getId_cotizacion())).body(cotizacionGuardada);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
    
}
