package com.Caso1Backend.back.security.models;

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
public class InformeC {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_informe;
    private int id_cliente;
    private String contenido; 
    private String placa;
 
    
	public int getId_informe() {
		return id_informe;
	}
	public void setId_informe(int id_informe) {
		this.id_informe = id_informe;
	}
	public int getId_cliente() {
		return id_cliente;
	}
	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}
	public String getContenido() {
		return contenido;
	}
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
    
}
