package com.Caso1Backend.back.security.service;

import com.Caso1Backend.back.security.models.Repuestos;
import com.Caso1Backend.back.security.repository.RepuestoRepository;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

@Service
 
public class RepuestosService {
  @Autowired
    private RepuestoRepository repuestoRepository;

    public List<Repuestos> findAll() {
    	List <Repuestos> repuestos = repuestoRepository.findAll();
    	repuestos.sort(Comparator.comparing(Repuestos::getId_repuesto));
        return repuestos;
    }

    public <S extends Repuestos> S save(S entity) {
        return repuestoRepository.save(entity);
    }

	

	public boolean findById(Long id) {
		return false;
	}

	public boolean existsById(int id) {
		 return repuestoRepository.existsById(id);
		
	}

	 
	
	 public Repuestos editRepuestos(Repuestos r) {
	        return repuestoRepository.save(r);
	    }

	    public Optional<Repuestos> getOneRepuestos(int id) {
	        return repuestoRepository.findById( id);
	        	
	    }

	    public void delete(Repuestos entity) {
	    	repuestoRepository.delete(entity);
	    	

	    }
		@Query(value="delete from repuesto where id_repuesto = :id", nativeQuery=true)
	    public void deleteById(int id) {
	    	repuestoRepository.deleteById(id);
	    }
	    
	    public void eliminarById(int idRepuesto) {
	        //GenericResponse<Object> response = new GenericResponse<>();
	        try {
	            Repuestos repuesto = repuestoRepository.findById(idRepuesto).get();
	            repuestoRepository.delete(repuesto);
	        } catch (Exception e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	    }
}