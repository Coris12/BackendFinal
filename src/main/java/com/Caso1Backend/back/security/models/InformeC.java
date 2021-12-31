package com.Caso1Backend.back.security.models;
import com.Caso1Backend.back.security.models.Reclamo;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "informe_c")
public class InformeC implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3031891514827289325L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_informe;

    private String contenido; 

    @OneToOne
    @JoinColumn(name = "id_reclamo")
    private Reclamo reclamo;

	public InformeC() {
		
	}

	public InformeC(int id_informe, String contenido, Reclamo reclamo) {
		super();
		this.id_informe = id_informe;
		this.contenido = contenido;
		this.reclamo = reclamo;
	}

	public int getId_informe() {
		return id_informe;
	}

	public void setId_informe(int id_informe) {
		this.id_informe = id_informe;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public Reclamo getReclamo() {
		return reclamo;
	}

	public void setReclamo(Reclamo reclamo) {
		this.reclamo = reclamo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
	
}