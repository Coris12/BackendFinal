/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Caso1Backend.back.security.models;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Humberto Cisneros
 */

@Entity
@Table(name = "garantia")
public class Garantia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_garantia;
    private Date fecha_inicio;
    private Date fecha_fin;
    
    @Column(name = "placa", nullable = true)
    private String placa;
    
    @JoinColumn(name = "placa", referencedColumnName = "placa", insertable = false, updatable = false)
    @OneToOne()
    private Vehiculo vehiculo;

    public Garantia() {
    }

    public Garantia(int id_garantia, Date fecha_inicio, Date fecha_fin, String placa, Vehiculo vehiculo) {
        this.id_garantia = id_garantia;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.placa = placa;
        this.vehiculo = vehiculo;
    }

    public int getId_garantia() {
        return id_garantia;
    }

    public void setId_garantia(int id_garantia) {
        this.id_garantia = id_garantia;
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public Date getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(Date fecha_fin) {
        this.fecha_fin = fecha_fin;
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
