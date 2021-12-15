package com.Caso1Backend.back.security.controller;

import com.Caso1Backend.back.security.models.Usuario;
import com.Caso1Backend.back.security.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/usuario")
@CrossOrigin
public class UserController {
    @Autowired
    UsuarioService usuarioService;

    @GetMapping
    public List<Usuario> listar(){
        return usuarioService.listarUsers();
    }


}
