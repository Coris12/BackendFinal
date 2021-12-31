package com.Caso1Backend.back.security.repository;

import com.Caso1Backend.back.security.models.Reclamo;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ReclamoRepository extends JpaRepository<Reclamo, Integer> {

    @Query(value = "select * from reclamo  where estado_reclamo =1", nativeQuery = true)
    List<Reclamo> findAllActiveUsersNative();
    
    @Query(value = "select * from reclamo  where estado_reclamo =2", nativeQuery = true)
    List<Reclamo> findAllActiveReclamos();

    @Query(value = "select * from reclamo  where estado_reclamo =3", nativeQuery = true)
    List<Reclamo> findAllActiveReclamosDenegado();
    
    @Query(value = "select * from reclamo  where estado_reclamo =:estadoReclamo and id_cliente=:id_cliente", nativeQuery = true)
    List<Reclamo> findByCliente_Id_clienteAndEstadoReclamo(Long id_cliente, int estadoReclamo);

    @Query(value = "select * from reclamo  where estado_reclamo =:estadoReclamo", nativeQuery = true)
    List<Reclamo> findByEstadoReclamo(int estadoReclamo);
}
