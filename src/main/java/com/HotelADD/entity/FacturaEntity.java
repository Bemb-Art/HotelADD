/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.HotelADD.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author bonni
 */
@Data
@Entity
@Table(name = "tb_facturas", schema = "cpc")
public class FacturaEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "factura_numero")
    private Long facturaNumero;
    
    @Column(name = "factura_serie")
    private String facturaSerie;
    
    @Column(name = "factura_total")
    private BigDecimal facturaTotal;
    
    @Column(name = "factura_estado")
    private String facturaEstado;
    
    @Column(name = "clienteparticular_id")
    private int clienteParticularId;
    
    @ManyToOne
    @JoinColumn(name = "clienteparticular_id", insertable = false, updatable = false)
    private ClienteParticularEntity clienteParticularFk;
    
    @Column(name = "clienteempresa_id")
    private int clienteEmpresaId;
    
    @ManyToOne
    @JoinColumn(name = "clienteempresa_id", insertable = false, updatable = false)
    private ClientesEmpresasEntity clienteEmpresaFk;
    
    @Column(name = "credito_id")
    private int creditoId;
    
    @ManyToOne
    @JoinColumn(name = "credito_id", insertable = false, updatable = false)
    private CreditoEntity creditoFk;
    
    @Column(name = "servicio_id")
    private int servicioId;
    
    @ManyToOne
    @JoinColumn(name = "servicio_id", insertable = false, updatable = false)
    private ServicioEntity serivicioFk;

    @Column(name = "reservacion_id")
    private int reservacionId;
    
    @ManyToOne
    @JoinColumn(name = "reservacion_id", insertable = false, updatable = false)
    private ReservacionEntity reservacionFk;
    
    public Long getFacturaNumero() {
        return facturaNumero;
    }

    public void setFacturaNumero(Long facturaNumero) {
        this.facturaNumero = facturaNumero;
    }

    public String getFacturaSerie() {
        return facturaSerie;
    }

    public void setFacturaSerie(String facturaSerie) {
        this.facturaSerie = facturaSerie;
    }

    public BigDecimal getFacturaTotal() {
        return facturaTotal;
    }

    public void setFacturaTotal(BigDecimal facturaTotal) {
        this.facturaTotal = facturaTotal;
    }

    public String getFacturaEstado() {
        return facturaEstado;
    }

    public void setFacturaEstado(String facturaEstado) {
        this.facturaEstado = facturaEstado;
    }

    public ClienteParticularEntity getClienteParticularFk() {
        return clienteParticularFk;
    }

    public void setClienteParticularFk(ClienteParticularEntity clienteParticularFk) {
        this.clienteParticularFk = clienteParticularFk;
    }

    public ClientesEmpresasEntity getClienteEmpresaFk() {
        return clienteEmpresaFk;
    }

    public void setClienteEmpresaFk(ClientesEmpresasEntity clienteEmpresaFk) {
        this.clienteEmpresaFk = clienteEmpresaFk;
    }

    public CreditoEntity getCreditoFk() {
        return creditoFk;
    }

    public void setCreditoFk(CreditoEntity creditoFk) {
        this.creditoFk = creditoFk;
    }

    public ServicioEntity getSerivicioFk() {
        return serivicioFk;
    }

    public void setSerivicioFk(ServicioEntity serivicioFk) {
        this.serivicioFk = serivicioFk;
    }

    public int getClienteParticularId() {
        return clienteParticularId;
    }

    public void setClienteParticularId(int clienteParticularId) {
        this.clienteParticularId = clienteParticularId;
    }

    public int getClienteEmpresaId() {
        return clienteEmpresaId;
    }

    public void setClienteEmpresaId(int clienteEmpresaId) {
        this.clienteEmpresaId = clienteEmpresaId;
    }

    public int getCreditoId() {
        return creditoId;
    }

    public void setCreditoId(int creditoId) {
        this.creditoId = creditoId;
    }

    public int getServicioId() {
        return servicioId;
    }

    public void setServicioId(int servicioId) {
        this.servicioId = servicioId;
    }

    public int getReservacionId() {
        return reservacionId;
    }

    public void setReservacionId(int reservacionId) {
        this.reservacionId = reservacionId;
    }

    public ReservacionEntity getReservacionFk() {
        return reservacionFk;
    }

    public void setReservacionFk(ReservacionEntity reservacionFk) {
        this.reservacionFk = reservacionFk;
    }
    
    
}
