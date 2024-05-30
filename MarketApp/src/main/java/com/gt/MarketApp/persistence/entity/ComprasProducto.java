package com.gt.MarketApp.persistence.entity;


import jakarta.persistence.*;

@Entity
@Table(name="compras_productos")

public class ComprasProducto {

    @EmbeddedId
    private ComprasProductoPK id;

    private String cantidad;

    private Double total;

    private Boolean estado;

    @ManyToOne
    @JoinColumn(name="id_producto", insertable=false, updatable=false)
    private Producto producto;

    @ManyToOne
    @JoinColumn(name = "id_compra", insertable=false, updatable=false)
    private Compra compra;


    public ComprasProductoPK getId() {
        return id;
    }

    public ComprasProducto setId(ComprasProductoPK id) {
        this.id = id;
        return this;
    }

    public String getCantidad() {
        return cantidad;
    }

    public ComprasProducto setCantidad(String cantidad) {
        this.cantidad = cantidad;
        return this;
    }

    public Double getTotal() {
        return total;
    }

    public ComprasProducto setTotal(Double total) {
        this.total = total;
        return this;
    }

    public Boolean getEstado() {
        return estado;
    }

    public ComprasProducto setEstado(Boolean estado) {
        this.estado = estado;
        return this;
    }
}
