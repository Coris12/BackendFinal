package com.Caso1Backend.back.security.repository;

import com.Caso1Backend.back.security.models.FacturaCuerpo;


import org.springframework.data.jpa.repository.JpaRepository;

public interface FacturaCuerpoRepository extends JpaRepository<FacturaCuerpo, Integer> {
    
    FacturaCuerpo findByPlaca(String placa);
}
