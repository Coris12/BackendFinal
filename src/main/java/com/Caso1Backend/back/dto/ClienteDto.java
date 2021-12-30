package com.Caso1Backend.back.dto;

import java.io.Serializable;
import java.util.List;

import com.Caso1Backend.back.security.models.Cliente;
import com.Caso1Backend.back.security.models.Vehiculo;

public class ClienteDto implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = -8808096417666749035L;
private Cliente cliente;
private List<String > placas;
public ClienteDto() {
	
}
public ClienteDto(Cliente cliente, List<String> placas) {
	this.cliente = cliente;
	this.placas = placas;
}
public Cliente getCliente() {
	return cliente;
}
public void setCliente(Cliente cliente) {
	this.cliente = cliente;
}
public List<String> getPlacas() {
	return placas;
}
public void setPlacas(List<String> placas) {
	this.placas = placas;
}
public static long getSerialversionuid() {
	return serialVersionUID;
}


}