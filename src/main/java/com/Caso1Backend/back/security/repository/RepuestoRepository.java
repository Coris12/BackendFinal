package com.Caso1Backend.back.security.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Caso1Backend.back.security.models.*;

public interface RepuestoRepository extends JpaRepository<Repuestos, Integer> {
    

	//void deleteRepuesto(Repuestos r);
}