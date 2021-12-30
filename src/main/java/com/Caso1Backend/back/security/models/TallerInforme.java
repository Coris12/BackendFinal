package com.Caso1Backend.back.security.models;

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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tallerInforme")
public class TallerInforme {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id_InformeTaller;
   
    @JoinColumn(name = "id_factura")
    @ManyToOne()
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private FacturaCabecera facturacabecera;
    
    private String cedula;
    private String nombre;
    private String placa;
    private String Descripcion;
    private Double total;

    public TallerInforme() {
    }
    
	public TallerInforme(Integer id_InformeTaller, FacturaCabecera facturacabecera, String cedula, String nombre,
			String placa, String descripcion, Double total) {
		super();
		this.id_InformeTaller = id_InformeTaller;
		this.facturacabecera = facturacabecera;
		this.cedula = cedula;
		this.nombre = nombre;
		this.placa = placa;
		Descripcion = descripcion;
		this.total = total;
	}




	public Integer getId_InformeTaller() {
        return id_InformeTaller;
    }

    public void setId_InformeTaller(Integer id_InformeTaller) {
        this.id_InformeTaller = id_InformeTaller;
    }


    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }


	public Double getTotal() {
		return total;
	}


	public void setTotal(Double total) {
		this.total = total;
	}

	public FacturaCabecera getFacturacabecera() {
		return facturacabecera;
	}

	public void setFacturacabecera(FacturaCabecera facturacabecera) {
		this.facturacabecera = facturacabecera;
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


	
}