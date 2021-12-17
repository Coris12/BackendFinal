package com.Caso1Backend.back.security.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import com.Caso1Backend.back.security.models.FacturaCabecera;
import com.Caso1Backend.back.security.models.FacturaCuerpo;
import com.Caso1Backend.back.security.repository.FacturaCabeceraRepository;
import com.Caso1Backend.back.security.repository.FacturaCuerpoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/facturacuerpo/")
public class FacturaCuerpoController {

    @Autowired
    FacturaCabeceraRepository facturaCabeceraRepository;
    
    @Autowired
    FacturaCuerpoRepository facturaCuerpoRepository;

    
    @GetMapping(path = "facturas")
    public List<FacturaCabecera> buscar(){
        return facturaCabeceraRepository.findAll();
    }

    @PostMapping(path = "guardar")
    public FacturaCabecera guardar(@RequestBody FacturaCabecera facturaCabecera){
        List<FacturaCuerpo> detalles = facturaCabecera.getDetalleList();
        facturaCabecera.setDetalleList(null);
        facturaCabeceraRepository.save(facturaCabecera);
        for(FacturaCuerpo det: detalles){
            det.setId_factura(facturaCabecera.getId_factura());
        }
        facturaCuerpoRepository.saveAll(detalles);
        facturaCabecera.setDetalleList(detalles);

        return facturaCabecera;
    }

    @DeleteMapping(path = "eliminar/{id_factura}" )
    public void eliminar(@PathVariable("id_factura")int idfactura){
        Optional<FacturaCabecera> factura = facturaCabeceraRepository.findById(idfactura);
        if(factura.isPresent()){
            facturaCuerpoRepository.deleteAll(factura.get().getDetalleList());
            facturaCabeceraRepository.delete(factura.get());
        }
    }


}
