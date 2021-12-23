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
@Table(name = "tallerInforme")
public class TallerInforme {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id_InformeTaller;
    
       private Long id_cliente;

    @JoinColumn(name = "id_cliente", referencedColumnName = "id_cliente", insertable = false, updatable = false)
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Cliente cliente;
   
    private String placa;
    private String Descripcion;

    public TallerInforme() {

    }

    public TallerInforme(Integer id_InformeTaller, Long id_cliente, String placa,
            String descripcion) {
        super();
        this.id_InformeTaller = id_InformeTaller;
        this.id_cliente = id_cliente;
        this.placa = placa;
        Descripcion = descripcion;
    }

    public Integer getId_InformeTaller() {
        return id_InformeTaller;
    }

    public void setId_InformeTaller(Integer id_InformeTaller) {
        this.id_InformeTaller = id_InformeTaller;
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

 
 
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

}
