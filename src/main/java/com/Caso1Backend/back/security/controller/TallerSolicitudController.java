package com.Caso1Backend.back.security.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Caso1Backend.back.security.models.TallerSolicitud;
import com.Caso1Backend.back.security.service.TallerSolicitudService;

@RestController
@RequestMapping("/solicitud/")
@CrossOrigin()
public class TallerSolicitudController {

    @Autowired
    TallerSolicitudService solicitudService;

    @GetMapping()
    private ResponseEntity<List<TallerSolicitud>> obtenerSolicitud() {
        return ResponseEntity.ok(solicitudService.findAll());
    }

    @PostMapping()
    private ResponseEntity<TallerSolicitud> saveSolicitud(@RequestBody TallerSolicitud tallersolicitud) {
        try {
            TallerSolicitud solicitud = solicitudService.save(tallersolicitud);
            return ResponseEntity.created(new URI("/solicitud/" + solicitud.getId_solicitud())).body(solicitud);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping(path = {"{id}"})
    public Optional<TallerSolicitud> solicitudById(@PathVariable("id") int id) {
        return solicitudService.getOneSolicitud(id);
    }

    @PutMapping(path = {"{id}"})
    public TallerSolicitud editar(@RequestBody TallerSolicitud s, @PathVariable("id") int id) {
        s.setId_solicitud(id);
        return solicitudService.editarSolicitud(s);

    }

}