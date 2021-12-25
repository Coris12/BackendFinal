/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Caso1Backend.back.security.service;

import com.Caso1Backend.back.security.repository.GarantiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Humberto Cisneros
 */
@Service
@Transactional
public class GarantiaService {
    
    @Autowired
    GarantiaRepository garantiaRepository;
}
