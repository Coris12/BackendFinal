/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Caso1Backend.back.security.repository;

import com.Caso1Backend.back.security.models.FacturaCuerpo;
import com.Caso1Backend.back.security.models.Garantia;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Humberto Cisneros
 */
public interface GarantiaRepository extends JpaRepository<Garantia, Integer>{
    
    Garantia findByPlaca(String placa);
}
