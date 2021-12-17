package com.Caso1Backend.back.security.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name ="repuesto")
public class Repuestos {

@Id	
@GeneratedValue(strategy=GenerationType.AUTO)
private int id_repuesto;
private String materiales;
private Double precio;
private Double stock;
@OneToOne
@JoinColumn(name = "id_solicitud")
private TallerSolicitud tallerSolicitud;

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
public double getPrecio() {
	return precio;
}
public void setPrecio(double precio) {
	this.precio = precio;
}
public double getStock() {
	return stock;
}
public void setStock(double stock) {
	this.stock = stock;
}
public Repuestos( String materiales, double precio, double stock) {
	super();
	this.materiales = materiales;
	this.precio = precio;
	this.stock = stock;
}

public Repuestos(int id_repuesto, String materiales, double precio, double stock, TallerSolicitud tallerSolicitud) {
	super();
	this.id_repuesto = id_repuesto;
	this.materiales = materiales;
	this.precio = precio;
	this.stock = stock;
	this.tallerSolicitud = tallerSolicitud;
}
public Repuestos() {
	
}  
}
