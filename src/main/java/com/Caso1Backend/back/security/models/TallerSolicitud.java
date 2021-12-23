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
@Table(name = "tallerSolicitud")
public class TallerSolicitud {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id_solicitud;

    @Column(name = "id_cliente", nullable = false)
    private Long id_cliente;

    @JoinColumn(name = "id_cliente", referencedColumnName = "id_cliente", insertable = false, updatable = false)
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Cliente cliente;

    private String placa;
    
    @JoinColumn(name = "id_repuesto", referencedColumnName = "id_repuesto", insertable = false, updatable = false)
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Repuestos Repuestos;
 
    private String descripcion;

    public TallerSolicitud() {

    }

    public TallerSolicitud(Integer id_solicitud, Long id_cliente, Cliente cliente, String placa, int id_repuestos, String descripcion) {
        this.id_solicitud = id_solicitud;
        this.id_cliente = id_cliente;
        this.cliente = cliente;
        this.placa = placa;
       
        this.descripcion = descripcion;
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

    public Integer getId_solicitud() {
        return id_solicitud;
    }

    public void setId_solicitud(Integer id_solicitud) {
        this.id_solicitud = id_solicitud;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    



    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
