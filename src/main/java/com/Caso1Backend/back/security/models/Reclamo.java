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
@Table(name = "reclamo")
public class Reclamo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_reclamo;

    private String id_cliente;
    private int tiempo;
    private String motivo;
    private String placa;
    private int numero_chasis;
    private String marca;
    private String modelo;

    @Column(name = "id_garantia", nullable = false)
    private int id_garantia;

    @JoinColumn(name = "id_garantia", referencedColumnName = "id_garantia", insertable = false, updatable = false)
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private SolicitudGarantia solicitudGarantia;

    public Reclamo() {
    }

    public Reclamo(int id_reclamo, String id_cliente, int tiempo, String motivo, String placa,
            int numero_chasis, String marca, String modelo) {
        this.id_reclamo = id_reclamo;

        this.id_cliente = id_cliente;
        this.tiempo = tiempo;
        this.motivo = motivo;
        this.placa = placa;
        this.numero_chasis = numero_chasis;
        this.marca = marca;
        this.modelo = modelo;
    }

    public int getId_reclamo() {
        return id_reclamo;
    }

    public void setId_reclamo(int id_reclamo) {
        this.id_reclamo = id_reclamo;
    }

    public String getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(String id_cliente) {
        this.id_cliente = id_cliente;
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

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getNumero_chasis() {
        return numero_chasis;
    }

    public void setNumero_chasis(int numero_chasis) {
        this.numero_chasis = numero_chasis;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public SolicitudGarantia getSolicitudGarantia() {
        return solicitudGarantia;
    }

    public void setSolicitudGarantia(SolicitudGarantia solicitudGarantia) {
        this.solicitudGarantia = solicitudGarantia;
    }

    public int getId_garantia() {
        return id_garantia;
    }

    public void setId_garantia(int id_garantia) {
        this.id_garantia = id_garantia;
    }

}