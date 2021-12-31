package com.Caso1Backend.back.security.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tallerSolicitud")
public class TallerSolicitud {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id_solicitud;

    @ManyToOne
    @JoinColumn(name = "id_orden")
    private OrdenReparacion ordenreparacion;
   
    private String repuestos;
    private Integer cantidad;
    private String descripcion;

    public TallerSolicitud() {
    }

    public TallerSolicitud(Integer id_solicitud, OrdenReparacion ordenreparacion, String repuestos, Integer cantidad,
			String descripcion) {
		this.id_solicitud = id_solicitud;
		this.ordenreparacion = ordenreparacion;
		this.repuestos = repuestos;
		this.cantidad = cantidad;
		this.descripcion = descripcion;
	}

	public Integer getId_solicitud() {
        return id_solicitud;
    }

    public void setId_solicitud(Integer id_solicitud) {
        this.id_solicitud = id_solicitud;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getRepuestos() {
        return repuestos;
    }

    public void setRepuestos(String repuestos) {
        this.repuestos = repuestos;
    }

	public OrdenReparacion getOrdenreparacion() {
		return ordenreparacion;
	}

	public void setOrdenreparacion(OrdenReparacion ordenreparacion) {
		this.ordenreparacion = ordenreparacion;
	}

}