package com.Caso1Backend.back.security.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.Caso1Backend.back.dto.Mensaje;
import com.Caso1Backend.back.security.models.Repuestos;
import com.Caso1Backend.back.security.repository.RepuestoRepository;
import com.Caso1Backend.back.security.service.RepuestosService;

@CrossOrigin
@RestController
@RequestMapping("/repuestos/")
public class RepuestoController {
     @Autowired 
    private RepuestosService repuestosService;
 
     private RepuestoRepository repository ;
     
     @CrossOrigin
    @PostMapping()
    private ResponseEntity<Repuestos> saveRepuestos(@RequestBody Repuestos repuestos){
        try {
            Repuestos repuestoGuardado = repuestosService.save(repuestos);
            System.out.println(repuestoGuardado);
            return ResponseEntity.created(new URI("/repuestos/"+ repuestoGuardado.getId_repuesto())).body(repuestoGuardado);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
     @CrossOrigin
     @GetMapping()
     private ResponseEntity<List<Repuestos>> getAllRepuestos(){
         return ResponseEntity.ok(repuestosService.findAll());
     }
  
     @CrossOrigin
     @GetMapping(path = {"{id}"})
     public Optional<Repuestos> clienteById(@PathVariable("id")int id){
         return repuestosService.getOneRepuestos(id);
     }

     @CrossOrigin
     @PutMapping(path = {"{id}"})
     public Repuestos editar(@RequestBody Repuestos r, @PathVariable("id")int id){
         r.setId_repuesto(id);
         
         return repuestosService.editRepuestos(r);
     }
     
    /* @CrossOrigin
     @DeleteMapping(value = "delete/{id}")
     private ResponseEntity<Boolean> deleteRepuesto(@PathVariable("id")int id){
         repuestosService.deleteById(id);
         return ResponseEntity.ok(!(repuestosService.getOneRepuestos(id)!=null));
     }*/
     

     
     @CrossOrigin(origins = "*")
 	@DeleteMapping("/{id}")
 	public void delete(@PathVariable int id) {
 		this.repuestosService.deleteById(id);
 	}
    
}