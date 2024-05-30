package com.gt.MarketApp.persistence.entity;


import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name="categorias")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_categoria")
    private Integer idCategoria;

    private String descripcion;

    private String estado;

    @OneToMany(mappedBy = "categoria")
    private List<Producto> productos;



    public String getDescripcion() {
        return descripcion;
    }

    public Categoria setDescripcion(String descripcion) {
        this.descripcion = descripcion;
        return this;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public Categoria setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
        return this;
    }

    public String getEstado() {
        return estado;
    }

    public Categoria setEstado(String estado) {
        this.estado = estado;
        return this;
    }
}
