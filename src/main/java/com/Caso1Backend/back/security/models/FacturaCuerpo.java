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

    // @JoinColumn(name = "id_factura")
    @ManyToOne()
    private FacturaCabecera facturaCabecera;

    @Column(name = "id_factura")
    private int id_factura;

    @Column(name = "placa", nullable = true)
    private String placa;

  
    @JoinColumn(name = "placa", referencedColumnName = "placa", insertable = false, updatable = false)
    @ManyToOne()
    private Vehiculo vehiculo;

    public FacturaCuerpo() {
    }

    public FacturaCuerpo(int id_cuerpo, double subtotal, FacturaCabecera facturaCabecera, int id_factura, String placa,
            Vehiculo vehiculo) {
        this.id_cuerpo = id_cuerpo;
        this.subtotal = subtotal;
        this.facturaCabecera = facturaCabecera;
        this.id_factura = id_factura;
        this.placa = placa;
        this.vehiculo = vehiculo;
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

    public FacturaCabecera getFacturaCabecera() {
        return facturaCabecera;
    }

    public void setFacturaCabecera(FacturaCabecera facturaCabecera) {
        this.facturaCabecera = facturaCabecera;
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

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

}
