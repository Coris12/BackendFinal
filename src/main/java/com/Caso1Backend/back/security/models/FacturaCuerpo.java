package com.Caso1Backend.back.security.models;

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

@Entity
@Table(name = "factura_cuerpo")
public class FacturaCuerpo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_cuerpo;
    private double subtotal;
    private int iva;
    private Double total;

    // @JoinColumn(name = "id_factura")
    // @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    // private FacturaCabecera facturaCabecera;
    @Column(name = "id_factura")
    private int id_factura;

    @Column(name = "placa", nullable = true)
    private String placa;

    // (fetch = FetchType.LAZY)
    @JoinColumn(name = "placa", referencedColumnName = "placa", insertable = false, updatable = false)
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Vehiculo vehiculo;

    public FacturaCuerpo() {
    }

    public FacturaCuerpo(int id_cuerpo, double subtotal, int iva, Double total, int id_factura, String placa) {
        this.id_cuerpo = id_cuerpo;
        this.subtotal = subtotal;
        this.iva = iva;
        this.total = total;
        this.id_factura = id_factura;
        this.placa = placa;
    }

    public int getId_cuerpo() {
        return id_cuerpo;
    }

    public void setId_cuerpo(int id_cuerpo) {
        this.id_cuerpo = id_cuerpo;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public int getId_factura() {
        return id_factura;
    }

    public void setId_factura(int id_factura) {
        this.id_factura = id_factura;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }    

}
