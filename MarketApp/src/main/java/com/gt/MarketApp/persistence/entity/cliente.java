package com.gt.MarketApp.persistence.entity;


import jakarta.persistence.*;

@Entity
@Table(name="clientes")
public class cliente {


    @Id
    private String id;

    private String nombre;

    private String apellidos;

    private Long celular;

    private String direccion;

    @Column(name="correo_electronico")
    private String correoElectronico;

    public String getId() {
        return id;
    }

    public cliente setId(String id) {
        this.id = id;
        return this;
    }

    public String getNombre() {
        return nombre;
    }

    public cliente setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public String getApellidos() {
        return apellidos;
    }

    public cliente setApellidos(String apellidos) {
        this.apellidos = apellidos;
        return this;
    }

    public Long getCelular() {
        return celular;
    }

    public cliente setCelular(Long celular) {
        this.celular = celular;
        return this;
    }

    public String getDireccion() {
        return direccion;
    }

    public cliente setDireccion(String direccion) {
        this.direccion = direccion;
        return this;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public cliente setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
        return this;
    }
}
