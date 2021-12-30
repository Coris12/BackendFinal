package com.Caso1Backend.back.security.controller;

import com.Caso1Backend.back.dto.ClienteDto;
import java.util.Optional;
import java.net.URI;
import java.util.List;

import com.Caso1Backend.back.security.models.Cliente;
import com.Caso1Backend.back.security.service.ClienteService;


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
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes/")
public class ClienteController {
    
    @Autowired
    private ClienteService clienteService;

    @GetMapping("xt/{cedula}") 
    public boolean xt(@PathVariable  String cedula){
    
       return clienteService.xt(cedula);

    }

    @GetMapping()
    private ResponseEntity<List<Cliente>> getAllClientes(){
        return ResponseEntity.ok(clienteService.findAll());
    }

    @PostMapping()
    private ResponseEntity<Cliente> saveCotizacion(@RequestBody Cliente cliente){
        try {
            Cliente clienteGuardado = clienteService.save(cliente);
            return ResponseEntity.created(new URI("/clientes/"+ clienteGuardado.getId_cliente())).body(clienteGuardado);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping(path = {"{id}"})
    public Optional<Cliente> clienteById(@PathVariable("id")int id){
        return clienteService.getOneCliente(id);
    }


    @PutMapping(path = {"{id}"})
    public Cliente editar(@RequestBody Cliente c, @PathVariable("id")int id){
        c.setId_cliente(id);
        return clienteService.editCliente(c);
    }

    @DeleteMapping(value = "delete/{id}")
    private ResponseEntity<Boolean> deleteCliente(@PathVariable("id")int id){
        clienteService.deleteById(id);
        return ResponseEntity.ok(!(clienteService.getOneCliente(id)!=null));
    }
    
    @CrossOrigin
    @GetMapping(path = {"vehiculos/{cedula}"})
    private ResponseEntity<ClienteDto> getVehiculos(@PathVariable("cedula") String cedula){
    return new ResponseEntity<ClienteDto>(clienteService.getVehiculos(cedula), HttpStatus.OK);	
    }

}
