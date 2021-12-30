package com.Caso1Backend.back.security.models;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "orden")
public class OrdenReparacion implements Serializable {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_orden;
	private String descripcion;    
         
	@JoinColumn(name = "id_cliente")
    @ManyToOne()
   
    private Cliente cliente;

	@JoinColumn(name = "placa")
    @ManyToOne()
	private Vehiculo vehiculo;
 
    
	public OrdenReparacion() {
		
	}


	public OrdenReparacion(int id_orden, String descripcion, Cliente cliente, Vehiculo vehiculo) {
		super();
		this.id_orden = id_orden;
		this.descripcion = descripcion;
		this.cliente = cliente;
		this.vehiculo = vehiculo;
	}


	public int getId_orden() {
		return id_orden;
	}


	public void setId_orden(int id_orden) {
		this.id_orden = id_orden;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public Vehiculo getVehiculo() {
		return vehiculo;
	}


	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}


}