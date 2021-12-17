package com.Caso1Backend.back.security.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orden")
public class OrdenReparacion {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_orden;
    private int id_cliente;
    private String descripcion;
    
	public OrdenReparacion() {
		super();
	}

	public OrdenReparacion(int id_orden, int id_cliente, String descripcion) {
		super();
		this.id_orden = id_orden;
		this.id_cliente = id_cliente;
		this.descripcion = descripcion;
	}

	public int getId_orden() {
		return id_orden;
	}

	public void setId_orden(int id_orden) {
		this.id_orden = id_orden;
	}

	public int getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	} 
    
}
