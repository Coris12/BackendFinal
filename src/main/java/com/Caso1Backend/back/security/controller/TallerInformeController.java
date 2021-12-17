package com.Caso1Backend.back.security.controller;

import com.Caso1Backend.back.security.models.TallerInforme;
import com.Caso1Backend.back.security.service.TallerInformeService;
import java.net.URI;
import java.net.URISyntaxException;
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


@RestController

@RequestMapping("/informe/")
@CrossOrigin()
public class TallerInformeController  {
	@Autowired
	TallerInformeService taller;
	
	@GetMapping()
	private ResponseEntity<List<TallerInforme>> obtenerInforme(){
		return ResponseEntity.ok(taller.findAll());
	}
	
	@PostMapping()
    private ResponseEntity<TallerInforme> saveInforme(@RequestBody TallerInforme tallerinforme) throws URISyntaxException{
        try {
            TallerInforme informe = taller.save(tallerinforme);
            return ResponseEntity.created(new URI("/informe/"+ informe.getId_InformeTaller())).body(informe);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }



	 @GetMapping(path = {"{id}"})
	    public Optional<TallerInforme> informebyId(@PathVariable("id")int id){
	        return taller.getOneInforme(id);
	    }


	    @PutMapping(path = {"{id}"})
	    public TallerInforme editar(@RequestBody TallerInforme i, @PathVariable("id")int id){
	        i.setId_InformeTaller(id);;
	        return taller.editarInforme(i);
	    }    		
     }      


