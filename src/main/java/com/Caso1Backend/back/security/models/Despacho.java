package com.Caso1Backend.back.security.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name = "despacho")
public class Despacho implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = -7717622556402493526L;

@Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
private int id_despacho;

@JoinColumn(name = "id_orden")
@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
private OrdenReparacion ordenReparacion;
 // @JoinColumn(name = "id_repuesto", referencedColumnName = "id_repuesto", insertable = false, updatable = false)
 //   @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
@ManyToMany(fetch = FetchType.EAGER)
@JoinTable(name = "despacho_repuestos", joinColumns = @JoinColumn(name = "despacho_id_despacho"),
        inverseJoinColumns = @JoinColumn(name = "repuestos_id_repuesto"))
    private List<Repuestos> repuestos;
  
public Despacho() {
	
}
public Despacho(int id_despacho, OrdenReparacion ordenReparacion, List<Repuestos> repuestos) {

	this.id_despacho = id_despacho;
	this.ordenReparacion = ordenReparacion;
	this.repuestos = repuestos;
}
public int getId_despacho() {
	return id_despacho;
}
public void setId_despacho(int id_despacho) {
	this.id_despacho = id_despacho;
}
public OrdenReparacion getOrdenReparacion() {
	return ordenReparacion;
}
public void setOrdenReparacion(OrdenReparacion ordenReparacion) {
	this.ordenReparacion = ordenReparacion;
}
public List<Repuestos> getRepuestos() {
	return repuestos;
}
public void setRepuestos(List<Repuestos> repuestos) {
	this.repuestos = repuestos;
}
public static long getSerialversionuid() {
	return serialVersionUID;
}

   
    
}