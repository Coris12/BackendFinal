package com.Caso1Backend.back.security.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name ="repuesto")
public class Repuestos implements Serializable {

/**
	 * 
	 */
	private static final long serialVersionUID = 3343824993405918594L;
@Id	
@GeneratedValue(strategy=GenerationType.AUTO)
private int id_repuesto;
private String materiales;
private Double precio;
private Double stock;
public Repuestos() {
	
}
public Repuestos(int id_repuesto, String materiales, Double precio, Double stock) {
	super();
	this.id_repuesto = id_repuesto;
	this.materiales = materiales;
	this.precio = precio;
	this.stock = stock;
}
public int getId_repuesto() {
	return id_repuesto;
}
public void setId_repuesto(int id_repuesto) {
	this.id_repuesto = id_repuesto;
}
public String getMateriales() {
	return materiales;
}
public void setMateriales(String materiales) {
	this.materiales = materiales;
}
public Double getPrecio() {
	return precio;
}
public void setPrecio(Double precio) {
	this.precio = precio;
}
public Double getStock() {
	return stock;
}
public void setStock(Double stock) {
	this.stock = stock;
}
public static long getSerialversionuid() {
	return serialVersionUID;
}





}