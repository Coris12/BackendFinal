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

@Entity
@Table(name = "orden")
public class OrdenReparacion {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_orden;
        
         
       private Long id_cliente;

    @JoinColumn(name = "id_cliente", referencedColumnName = "id_cliente", insertable = false, updatable = false)
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Cliente cliente;

    private String descripcion;
    
	public OrdenReparacion() {
		super();
	}

	public OrdenReparacion(int id_orden,Long id_cliente, String descripcion) {
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

    public Long getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Long id_cliente) {
        this.id_cliente = id_cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

	

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	} 
    
}
