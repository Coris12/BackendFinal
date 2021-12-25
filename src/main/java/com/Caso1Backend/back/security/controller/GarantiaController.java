/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Caso1Backend.back.security.controller;

import com.Caso1Backend.back.security.models.FacturaCabecera;
import com.Caso1Backend.back.security.models.FacturaCuerpo;
import com.Caso1Backend.back.security.models.Garantia;
import com.Caso1Backend.back.security.repository.FacturaCuerpoRepository;
import com.Caso1Backend.back.security.repository.GarantiaRepository;
import com.Caso1Backend.back.security.service.FacturaCuerpoService;
import com.Caso1Backend.back.security.service.GarantiaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Humberto Cisneros
 */
@RestController()
@RequestMapping("/garantia/")
public class GarantiaController {

    @Autowired
    GarantiaRepository GarantiaRepository;

    @Autowired
    GarantiaService GarantiaService;

   

}
