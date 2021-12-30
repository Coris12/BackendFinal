package com.Caso1Backend.back.security.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Caso1Backend.back.security.models.Cliente;
import com.Caso1Backend.back.security.models.OrdenReparacion;
import com.Caso1Backend.back.security.models.Vehiculo;
import com.Caso1Backend.back.security.repository.ClienteRepository;
import com.Caso1Backend.back.security.repository.OrdenReparacionRepository;
import com.Caso1Backend.back.security.repository.VehiculoRepository;

@Service
public class OrdenReparacionService {
	@Autowired
    private OrdenReparacionRepository ordenReparacionRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private VehiculoRepository vehiculoRepository;
	public List<OrdenReparacion> findAll() {
        return ordenReparacionRepository.findAll();
        		
    }
	
    public  OrdenReparacion guardar(OrdenReparacion entity) {
    	try {
    		Cliente cliente = clienteRepository.findByCedula(entity.getCliente().getCedula());
    		entity.setCliente(cliente);
    		Vehiculo vehiculo = vehiculoRepository.findByPlaca(entity.getVehiculo().getPlaca());
    		entity.setVehiculo(vehiculo);
    		    OrdenReparacion orden= ordenReparacionRepository.save(entity);	
    		    return orden;
		} catch (Exception e) {
			// TODO: handle exception
			return new OrdenReparacion();
		}
    	
    }
    public Optional<OrdenReparacion> getOneOrdenReparacion(int id) {
        return ordenReparacionRepository.findById(id);
    }
   
    
}