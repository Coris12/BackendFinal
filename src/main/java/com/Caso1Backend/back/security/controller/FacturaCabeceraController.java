package com.Caso1Backend.back.security.controller;

import java.net.URI;
import java.util.List;

import com.Caso1Backend.back.security.models.FacturaCabecera;
import com.Caso1Backend.back.security.service.FacturaCabeceraService;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/facturacabecera/")
public class FacturaCabeceraController {

    @Autowired
    FacturaCabeceraService facturaCabeceraService;

////    @GetMapping()
////    private ResponseEntity<List<FacturaCabecera>> getAllCotizaciones(){
////         return ResponseEntity.ok(facturaCabeceraService.findAll());
////    }

     @GetMapping()
    private ResponseEntity<List<FacturaCabecera>> getAllFacturas(){
        System.out.println("ENCONTO" + facturaCabeceraService.findAll().size());
        return ResponseEntity.ok(facturaCabeceraService.findAll());
    }
    
    @PostMapping()
    private ResponseEntity<FacturaCabecera> saveCabecera(@RequestBody FacturaCabecera facturaCabecera){
        try {
            FacturaCabecera facturaCabeceraGuardada = facturaCabeceraService.save(facturaCabecera);
            return ResponseEntity.created(new URI("/facturacabecera/"+ facturaCabecera.getId_factura())).body(facturaCabeceraGuardada);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @PostMapping("guardar/")
    public FacturaCabecera guardar(@RequestBody FacturaCabecera facturaCabecera){
        return facturaCabeceraService.registrar(facturaCabecera);
    }
    
    @GetMapping(path = {"{id}"})
    public Optional<FacturaCabecera> facturaById(@PathVariable("id")int id){
        System.out.println("entro en buscar factura by id");
        return facturaCabeceraService.facturaById(id);
    }
    
 


}
