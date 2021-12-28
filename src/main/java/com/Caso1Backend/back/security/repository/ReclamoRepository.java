package com.Caso1Backend.back.security.repository;

import com.Caso1Backend.back.security.models.Reclamo;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ReclamoRepository extends JpaRepository<Reclamo, Integer> {
        @Query(value = "select * from reclamo  where estado_reclamo =1",nativeQuery = true)
    List<Reclamo> findAllActiveUsersNative();

}