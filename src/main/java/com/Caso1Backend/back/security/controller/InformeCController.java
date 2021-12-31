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

import com.Caso1Backend.back.security.models.InformeC;
import com.Caso1Backend.back.security.models.OrdenReparacion;
import com.Caso1Backend.back.security.service.InformeCService;
import com.Caso1Backend.back.security.service.RepuestosService;


@CrossOrigin
@RestController
@RequestMapping("/informe_c/")
public class InformeCController {
	
	@Autowired 
    private InformeCService informeCService;
 
	 /* @CrossOrigin
	    @PostMapping()
	    private ResponseEntity<InformeC> saveRepuestos(@RequestBody InformeC informeC){
	
	        try {
	             InformeC informeCGuardado = informeCService.save(informeC);
	            System.out.println(informeCGuardado);
	            return ResponseEntity.created(new URI("/repuestos/"+ informeCGuardado.getId_informe())).body(informeCGuardado);
	        } catch (Exception e) {
	            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
	        }
	    }*/
	  @CrossOrigin
	    @PostMapping("/save")
	    private ResponseEntity<InformeC> saveInformeC(@RequestBody InformeC informeC){
		  return  new ResponseEntity<InformeC>(informeCService.save(informeC),HttpStatus.OK);
	      
	    }
}