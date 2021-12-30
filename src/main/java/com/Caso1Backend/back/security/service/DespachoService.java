package com.Caso1Backend.back.security.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Caso1Backend.back.security.models.Cliente;
import com.Caso1Backend.back.security.models.Despacho;
import com.Caso1Backend.back.security.models.OrdenReparacion;
import com.Caso1Backend.back.security.models.Vehiculo;
import com.Caso1Backend.back.security.repository.DespachoRepository;
import com.Caso1Backend.back.security.repository.OrdenReparacionRepository;
import com.Caso1Backend.back.security.repository.RepuestoRepository;

@Service
public class DespachoService {
	@Autowired
    private DespachoRepository despachoRepository;
	@Autowired
	private OrdenReparacionRepository ordenRepository;
	@Autowired
	private RepuestoRepository repuestoRepository;
    public List<Despacho> findAll() {
        return despachoRepository.findAll();
    }

    public  Despacho guardar(Despacho entity) {
    	try {
    		OrdenReparacion orden = ordenRepository.findById(entity.getOrdenReparacion().getId_orden()).get();
    		entity.setOrdenReparacion(orden);
    		
    		    Despacho despacho= despachoRepository.save(entity);	
    		    despacho.getRepuestos().forEach(repuesto->{
    		    	repuesto.setStock(repuesto.getStock()-1);
    		    	repuestoRepository.save(repuesto);
    		    });
    		    return despacho;
		} catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
			return new Despacho();
		}
    	
    }
}