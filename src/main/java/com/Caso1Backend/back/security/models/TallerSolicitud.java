package com.Caso1Backend.back.security.models;

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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tallerSolicitud")
public class TallerSolicitud {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id_solicitud;

    @JoinColumn(name = "id_factura")
    @ManyToOne()
    private FacturaCabecera facturacabecera;

    private String cedula;
    private String nombre;
    private String placa;
    private String repuestos;
    private Integer cantidad;
    private String descripcion;

    public TallerSolicitud() {

    }

    public TallerSolicitud(Integer id_solicitud, FacturaCabecera facturacabecera, String cedula, String nombre,
            String placa, String repuestos, Integer cantidad, String descripcion) {
        super();
        this.id_solicitud = id_solicitud;
        this.facturacabecera = facturacabecera;
        this.cedula = cedula;
        this.nombre = nombre;
        this.placa = placa;
        this.repuestos = repuestos;
        this.cantidad = cantidad;
        this.descripcion = descripcion;
    }

    public Integer getId_solicitud() {
        return id_solicitud;
    }

    public void setId_solicitud(Integer id_solicitud) {
        this.id_solicitud = id_solicitud;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getRepuestos() {
        return repuestos;
    }

    public void setRepuestos(String repuestos) {
        this.repuestos = repuestos;
    }

    public FacturaCabecera getFacturacabecera() {
        return facturacabecera;
    }

    public void setFacturacabecera(FacturaCabecera facturacabecera) {
        this.facturacabecera = facturacabecera;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

}
