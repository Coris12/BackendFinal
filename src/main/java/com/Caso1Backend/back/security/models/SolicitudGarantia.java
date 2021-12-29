/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Caso1Backend.back.security.models;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author corin
 */
//crear del vehiculo 
@Entity
@Table(name = "solicitud_garantia")
public class SolicitudGarantia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_solicitudgarantia;
    private int tiempo;
    private String motivo;
    private Date fecha_solicitud;

    public Date getFecha_solicitud() {
        return fecha_solicitud;
    }

    public void setFecha_solicitud(Date fecha_solicitud) {
        this.fecha_solicitud = fecha_solicitud;
    }
    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "placa")
    private Vehiculo vehiculo;

    public int getId_solicitudgarantia() {
        return id_solicitudgarantia;
    }

    public void setId_solicitudgarantia(int id_solicitudgarantia) {
        this.id_solicitudgarantia = id_solicitudgarantia;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    } 
}
