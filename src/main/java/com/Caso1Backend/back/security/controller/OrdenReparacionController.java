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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Caso1Backend.back.security.models.Cliente;
import com.Caso1Backend.back.security.models.OrdenReparacion;
import com.Caso1Backend.back.security.repository.OrdenReparacionRepository;
import com.Caso1Backend.back.security.service.OrdenReparacionService;


@CrossOrigin
@RestController
@RequestMapping("/ordenR")
public class OrdenReparacionController {
	@Autowired 
    private OrdenReparacionService ordenService;
 
	  @CrossOrigin
	    @PostMapping("/save")
	    private ResponseEntity<OrdenReparacion> saveOrden(@RequestBody OrdenReparacion orden){
		  return  new ResponseEntity<OrdenReparacion>(ordenService.guardar(orden),HttpStatus.OK);
	      
	    }
	  @GetMapping()
	    private ResponseEntity<List<OrdenReparacion>> obtenerOrden() {
	        return ResponseEntity.ok(ordenService.findAll());
	    }
	  @GetMapping(path = {"{id}"})
	    public Optional<OrdenReparacion> ordenById(@PathVariable("id")int id){
		  
	        //return ordenService.getOneOrdenReparacion(id);
		  return null;
	    }

}