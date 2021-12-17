package com.Caso1Backend.back.security.models;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity 
@Table(name = "factura_cabecera")
public class FacturaCabecera {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_factura;
    private String tipo;

    @Temporal(TemporalType.DATE)
    private Date fecha;

    @Column(name = "id_cliente", nullable = false)
	private Long id_cliente;
	
	@JoinColumn(name = "id_cliente", referencedColumnName = "id_cliente",insertable = false, updatable = false)
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Cliente cliente;

    @OneToMany(mappedBy = "id_factura")
    private List<FacturaCuerpo> detalleList;

   

    public FacturaCabecera() {
    }



    public FacturaCabecera(int id_factura, String tipo, Date fecha, Long id_cliente, List<FacturaCuerpo> detalleList) {
        this.id_factura = id_factura;
        this.tipo = tipo;
        this.fecha = fecha;
        this.id_cliente = id_cliente;
        this.detalleList = detalleList;
    }



    public int getId_factura() {
        return id_factura;
    }



    public void setId_factura(int id_factura) {
        this.id_factura = id_factura;
    }



    public String getTipo() {
        return tipo;
    }



    public void setTipo(String tipo) {
        this.tipo = tipo;
    }



    public Date getFecha() {
        return fecha;
    }



    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }



    public Long getId_cliente() {
        return id_cliente;
    }



    public void setId_cliente(Long id_cliente) {
        this.id_cliente = id_cliente;
    }



    public List<FacturaCuerpo> getDetalleList() {
        return detalleList;
    }



    public void setDetalleList(List<FacturaCuerpo> detalleList) {
        this.detalleList = detalleList;
    }

    
}