package com.gt.MarketApp.persistence.entity;

import jakarta.persistence.*;

import java.util.List;


@Entity
@Table(name = "productos")
public class Producto {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_productos")
    private Integer idProducto;

    private String nombre;

    @Column(name = "id_categoria")
    private Integer idCategoria;

    @Column(name = "codigo_barras")
    private String codigoBarras;

    @Column(name = "precio_venta")
    private Double precioVenta;

    @Column(name = "cantidad_stock")
    private Integer cantidadStock;

    private Boolean estado;

    @ManyToOne
    @JoinColumn(name= "id_categoria", insertable = false, updatable = false)
    private Categoria categoria;

    @OneToMany
    private List<ComprasProducto> comprasProductos;



    public Integer getIdProducto() {
        return idProducto;
    }

    public Producto setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
        return this;
    }

    public Boolean getEstado() {
        return estado;
    }

    public Producto setEstado(Boolean estado) {
        this.estado = estado;
        return this;
    }

    public Integer getCantidadStock() {
        return cantidadStock;
    }

    public Producto setCantidadStock(Integer cantidadStock) {
        this.cantidadStock = cantidadStock;
        return this;
    }

    public Double getPrecioVenta() {
        return precioVenta;
    }

    public Producto setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
        return this;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public Producto setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
        return this;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public Producto setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
        return this;
    }

    public String getNombre() {
        return nombre;
    }

    public Producto setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }
}
