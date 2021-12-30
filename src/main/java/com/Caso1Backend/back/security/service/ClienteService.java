package com.Caso1Backend.back.security.service;

import com.Caso1Backend.back.dto.ClienteDto;
import java.util.List;
import java.util.Optional;

import com.Caso1Backend.back.security.models.Cliente;
import com.Caso1Backend.back.security.models.FacturaCabecera;
import com.Caso1Backend.back.security.models.Reclamo;
import com.Caso1Backend.back.security.models.Vehiculo;
import com.Caso1Backend.back.security.repository.ClienteRepository;
import com.Caso1Backend.back.security.repository.FacturaCabeceraRepository;
import com.Caso1Backend.back.security.repository.ReclamoRepository;
import com.Caso1Backend.back.security.repository.VehiculoRepository;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private FacturaCabeceraRepository facturaCabeceraRepository;
    @Autowired
    private VehiculoRepository vehiculoRepository;
    @Autowired
    private ReclamoRepository reclamoRepository;
 

    public List<Cliente> findAll() {
        return clienteRepository.findAll();
    }

    public <S extends Cliente> S save(S entity) {
        return clienteRepository.save(entity);
    }

    public Cliente editCliente(Cliente c) {
        return clienteRepository.save(c);
    }

    public Optional<Cliente> getOneCliente(int id) {
        return clienteRepository.findById(id);
    }

    public void delete(Cliente entity) {
        clienteRepository.delete(entity);

    }

    public void deleteById(int id) {
        clienteRepository.deleteById(id);
    }

    public Cliente existe(String cedula) {

        return clienteRepository.findByCedula(cedula);

    }

    public boolean xt(String cedula) {

        if (clienteRepository.findByCedula(cedula) != null) {
            return true;
        } else {
            return false;
        }
    }

    public ClienteDto getVehiculos(String cedula) {
        ClienteDto clienteDto = new ClienteDto();

        if (clienteRepository.findByCedula(cedula) != null) {

            Cliente cliente = clienteRepository.findByCedula(cedula);
            Long id = Long.valueOf(cliente.getId_cliente());
            List<String> placas = new ArrayList<>();
            List<Reclamo> reclamos = reclamoRepository.findByCliente_Id_clienteAndEstadoReclamo(id, 2);
           
            clienteDto.setCliente(cliente);

            reclamos.forEach(reclamo -> {
            
                    Vehiculo vehiculo = new Vehiculo();
                    vehiculo = vehiculoRepository.findByPlaca(reclamo.getPlaca());

                    placas.add(vehiculo.getPlaca());

            });
            clienteDto.setPlacas(placas);
            return clienteDto;
        } else {
            return clienteDto;
        }
    }
}
