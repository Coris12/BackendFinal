package com.Caso1Backend.back.security.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.Caso1Backend.back.security.models.OrdenReparacion;
import com.Caso1Backend.back.security.repository.OrdenReparacionRepository;


@CrossOrigin
@RestController
@RequestMapping("/ordenR/")
public class OrdenReparacionController {
	@Autowired 
    private OrdenReparacionRepository ordenService;
 
	  @CrossOrigin
	    @PostMapping()
	    private ResponseEntity<OrdenReparacion> saveRepuestos(@RequestBody OrdenReparacion informeC){
	
	        try {
	        	OrdenReparacion ordenGuardado = ordenService.save(informeC);
	            System.out.println(ordenGuardado);
	            return ResponseEntity.created(new URI("/repuestos/"+ ordenGuardado.getId_orden())).body(ordenGuardado);
	        } catch (Exception e) {
	            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
	        }
	    }
}
