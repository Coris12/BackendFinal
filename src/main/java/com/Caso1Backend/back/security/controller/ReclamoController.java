package com.Caso1Backend.back.security.controller;

import com.Caso1Backend.back.security.models.Cliente;
import java.net.URI;

import com.Caso1Backend.back.security.models.Reclamo;
import com.Caso1Backend.back.security.models.Repuestos;
import com.Caso1Backend.back.security.service.ReclamoService;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

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
    private ResponseEntity<Reclamo> saveReclamos(@RequestBody Reclamo reclamo) {
        try {
            Reclamo reclamoGuardado = reclamoService.save(reclamo);
            return ResponseEntity.created(new URI("/reclamos/" + reclamoGuardado.getId_reclamo())).body(reclamoGuardado);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();

        }
    }

    @GetMapping("/search")
    public ResponseEntity<List<Reclamo>> search() {
        List<Reclamo> list = reclamoService.search();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @CrossOrigin
    @GetMapping()
    private ResponseEntity<List<Reclamo>> getAllReclamos() {
        return ResponseEntity.ok(reclamoService.findAll());
    }

    @GetMapping(path = {"{id}"})
    public Optional<Reclamo> reclamoByID(@PathVariable("id") int id) {
        System.out.println("entro en buscar reclamo by id");
        return reclamoService.getOneReclamo(id);
    }
    @CrossOrigin
    @GetMapping("/tipo/{estado}")
    private ResponseEntity<List<Reclamo>> getEstado(@PathVariable("estado") int estado){
    	  List<Reclamo> list = reclamoService.getEstado(estado);
    	return new ResponseEntity(list, HttpStatus.OK);
    }
    
        @GetMapping("/searchAprobadas")
    public ResponseEntity<List<Reclamo>> searchAprobadas() {
        List<Reclamo> list = reclamoService.searchAprobadas();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
        @GetMapping("/searchDenegadas")
    public ResponseEntity<List<Reclamo>> searchDenegadas() {
        List<Reclamo> list = reclamoService.searchDenegadas();
        return new ResponseEntity(list, HttpStatus.OK);
    }
}


