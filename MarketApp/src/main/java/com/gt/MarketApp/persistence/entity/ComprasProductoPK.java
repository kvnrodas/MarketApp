package com.gt.MarketApp.persistence.entity;



import jakarta.persistence.*;
import java.io.Serializable;



@Embeddable
public class ComprasProductoPK implements Serializable {

    @Column(name="id_compra")
    private Integer idCompra;

    @Column(name="id_producto")
    private Integer idProducto;

    public Integer getIdProducto() {
        return idProducto;
    }

    public ComprasProductoPK setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
        return this;
    }

    public Integer getIdCompra() {
        return idCompra;
    }

    public ComprasProductoPK setIdCompra(Integer idCompra) {
        this.idCompra = idCompra;
        return this;
    }
}
