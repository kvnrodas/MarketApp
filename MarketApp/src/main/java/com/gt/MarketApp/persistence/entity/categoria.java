package com.gt.MarketApp.persistence.entity;


import jakarta.persistence.*;

@Entity
@Table(name="categorias")
public class categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_categoria")
    private Integer idCategoria;

    private String descripcion;

    private String estado;

    public String getDescripcion() {
        return descripcion;
    }

    public categoria setDescripcion(String descripcion) {
        this.descripcion = descripcion;
        return this;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public categoria setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
        return this;
    }

    public String getEstado() {
        return estado;
    }

    public categoria setEstado(String estado) {
        this.estado = estado;
        return this;
    }
}
