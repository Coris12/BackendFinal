package com.Caso1Backend.back.security.repository;

import com.Caso1Backend.back.security.models.Cliente;
import com.Caso1Backend.back.security.models.FacturaCabecera;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FacturaCabeceraRepository extends JpaRepository<FacturaCabecera, Integer> {
    List<FacturaCabecera> findByClienteAndTipo(Cliente cliente, String tipo);
}
