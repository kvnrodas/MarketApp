package com.gt.MarketApp.persistence.entity;


import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name="compras")
public class Compra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_compra")
    private Integer idCompra;

    @Column(name = "id_cliente")
    private String idCliente;

    private LocalDateTime fecha;

    @Column(name = "medio_pago")
    private String medioPago;

    private String comentario;

    private String estado;

    @ManyToOne
    @JoinColumn(name="id_cliente", updatable = false, insertable = false)
    private Cliente cliente;

    @OneToMany(mappedBy = "compra")
    private List<ComprasProducto> comprasProducto;


    public Integer getIdCompra() {
        return idCompra;
    }

    public Compra setIdCompra(Integer idCompra) {
        this.idCompra = idCompra;
        return this;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public Compra setIdCliente(String idCliente) {
        this.idCliente = idCliente;
        return this;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public Compra setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
        return this;
    }

    public String getMedioPago() {
        return medioPago;
    }

    public Compra setMedioPago(String medioPago) {
        this.medioPago = medioPago;
        return this;
    }

    public String getComentario() {
        return comentario;
    }

    public Compra setComentario(String comentario) {
        this.comentario = comentario;
        return this;
    }

    public String getEstado() {
        return estado;
    }

    public Compra setEstado(String estado) {
        this.estado = estado;
        return this;
    }
}
