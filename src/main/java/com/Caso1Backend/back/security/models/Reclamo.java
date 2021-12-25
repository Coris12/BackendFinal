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

    public static Object findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_reclamo;
  @Column(name = "id_cliente", nullable = false)
	private Long id_cliente;
	
	@JoinColumn(name = "id_cliente", referencedColumnName = "id_cliente",insertable = false, updatable = false)
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Cliente cliente;
    
    private String nombre;
    private String motivo;
    private String placa;
    private int numero_chasis;
    private String marca;
    private String modelo;

    @Column(name = "id_solicitudgarantia", nullable = false)
    private int id_solicitudgarantia;

    @JoinColumn(name = "id_solicitudgarantia", referencedColumnName = "id_solicitudgarantia", insertable = false, updatable = false)
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private SolicitudGarantia solicitudGarantia;

    public Reclamo() {
    }

    public Reclamo(int id_reclamo, Long id_cliente, Cliente cliente, String nombre, String motivo, String placa, int numero_chasis, String marca, String modelo, int id_solicitudgarantia, SolicitudGarantia solicitudGarantia) {
        this.id_reclamo = id_reclamo;
        this.id_cliente = id_cliente;
        this.cliente = cliente;
        this.nombre = nombre;
        this.motivo = motivo;
        this.placa = placa;
        this.numero_chasis = numero_chasis;
        this.marca = marca;
        this.modelo = modelo;
        this.id_solicitudgarantia = id_solicitudgarantia;
        this.solicitudGarantia = solicitudGarantia;
    }

  
    public int getId_reclamo() {
        return id_reclamo;
    }

    public void setId_reclamo(int id_reclamo) {
        this.id_reclamo = id_reclamo;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public int getId_solicitudgarantia() {
        return id_solicitudgarantia;
    }

    public void setId_solicitudgarantia(int id_solicitudgarantia) {
        this.id_solicitudgarantia = id_solicitudgarantia;
    }

    public SolicitudGarantia getSolicitudGarantia() {
        return solicitudGarantia;
    }

    public void setSolicitudGarantia(SolicitudGarantia solicitudGarantia) {
        this.solicitudGarantia = solicitudGarantia;
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

   
}