package com.gt.MarketApp.persistence.entity;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="clientes")
public class Cliente {


    @Id
    private String id;

    private String nombre;

    private String apellidos;

    private Long celular;

    private String direccion;

    @Column(name="correo_electronico")
    private String correoElectronico;

    @OneToMany(mappedBy = "cliente")
    private List<Compra> compras;


    public String getId() {
        return id;
    }

    public Cliente setId(String id) {
        this.id = id;
        return this;
    }

    public String getNombre() {
        return nombre;
    }

    public Cliente setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public String getApellidos() {
        return apellidos;
    }

    public Cliente setApellidos(String apellidos) {
        this.apellidos = apellidos;
        return this;
    }

    public Long getCelular() {
        return celular;
    }

    public Cliente setCelular(Long celular) {
        this.celular = celular;
        return this;
    }

    public String getDireccion() {
        return direccion;
    }

    public Cliente setDireccion(String direccion) {
        this.direccion = direccion;
        return this;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public Cliente setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
        return this;
    }
}
