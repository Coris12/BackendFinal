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

import com.Caso1Backend.back.security.models.Despacho;
import com.Caso1Backend.back.security.models.OrdenReparacion;
import com.Caso1Backend.back.security.service.DespachoService;

@CrossOrigin
@RestController
@RequestMapping("/despacho")
public class DespachoController {
	 @Autowired
	    private DespachoService despachoService;


	    
	    @CrossOrigin
	    @PostMapping("/save")
	    private ResponseEntity<Despacho>saveDespacho(@RequestBody Despacho d){
	    	return new ResponseEntity<Despacho>(despachoService.guardar(d),HttpStatus.OK);
	    }
	    @CrossOrigin
	    @GetMapping()
	    private ResponseEntity<List<Despacho>> getAllDespacho(){
	        return ResponseEntity.ok(despachoService.findAll());
	    }

	/*    
	    
	    @CrossOrigin
	    @PostMapping("/save")
	    private ResponseEntity<Despacho> saveDespacho(@RequestBody Despacho despacho){
		  return  new ResponseEntity<Despacho>(despachoService.save(despacho),HttpStatus.OK);
	    }

	   
*/
	   
}