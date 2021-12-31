package com.Caso1Backend.back.security.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tallerInforme")
public class TallerInforme {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id_informetaller;

	@ManyToOne()
	@JoinColumn(name = "id_orden")
	private OrdenReparacion ordenreparacion;
    private String cedula;
	private String nombre;
	private String placa;
	private String Descripcion;
	private Double total;
       // private Double costoTotal;

	public TallerInforme() {
	}

	
	public TallerInforme(Integer id_informetaller, OrdenReparacion ordenreparacion, String cedula, String nombre,
			String placa, String descripcion, Double total) {
		super();
		this.id_informetaller = id_informetaller;
		this.ordenreparacion = ordenreparacion;
		this.cedula = cedula;
		this.nombre = nombre;
		this.placa = placa;
		Descripcion = descripcion;
		this.total = total;
                //this.costoTotal = costoTotal;
	}


	public Integer getId_informetaller() {
		return id_informetaller;
	}

	public void setId_informetaller(Integer id_informetaller) {
		this.id_informetaller = id_informetaller;
	}

	public String getCedula() {
		return cedula;
	}


	public void setCedula(String cedula) {
		this.cedula = cedula;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getPlaca() {
		return placa;
	}


	public void setPlaca(String placa) {
		this.placa = placa;
	}


	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.Descripcion = descripcion;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	OrdenReparacion getOrdenreparacion() {
		return ordenreparacion;
	}

	public void setOrdenreparacion(OrdenReparacion ordenreparacion) {
		this.ordenreparacion = ordenreparacion;
	}


}