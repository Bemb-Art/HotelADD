/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.HotelADD.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
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
@Table(name = "tb_pagos", schema = "cpc")
public class PagoEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pago_numero")
    private Long pagoNumero;
    
    @Column(name = "pago_total")
    private BigDecimal pagoTotal;
    
    @Column(name = "pago_fecha")
    private Date pagoFecha;
    
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

    public Long getPagoNumero() {
        return pagoNumero;
    }

    public void setPagoNumero(Long pagoNumero) {
        this.pagoNumero = pagoNumero;
    }

    public BigDecimal getPagoTotal() {
        return pagoTotal;
    }

    public void setPagoTotal(BigDecimal pagoTotal) {
        this.pagoTotal = pagoTotal;
    }

    public Date getPagoFecha() {
        return pagoFecha;
    }

    public void setPagoFecha(Date pagoFecha) {
        this.pagoFecha = pagoFecha;
    }

    public ClientesEmpresasEntity getClienteEmpresaFk() {
        return clienteEmpresaFk;
    }

    public void setClienteEmpresaFk(ClientesEmpresasEntity clienteEmpresaFk) {
        this.clienteEmpresaFk = clienteEmpresaFk;
    }

    public ClienteParticularEntity getClienteParticularFk() {
        return clienteParticularFk;
    }

    public void setClienteParticularFk(ClienteParticularEntity clienteParticularFk) {
        this.clienteParticularFk = clienteParticularFk;
    }

    public CreditoEntity getCreditoFk() {
        return creditoFk;
    }

    public void setCreditoFk(CreditoEntity creditoFk) {
        this.creditoFk = creditoFk;
    }

    public int getClienteParticularId() {
        return clienteParticularId;
    }

    public void setClienteParticularId(int clienteparticularId) {
        this.clienteParticularId = clienteparticularId;
    }

    public int getClienteEmpresaId() {
        return clienteEmpresaId;
    }

    public void setClienteEmpresaId(int clienteempresaId) {
        this.clienteEmpresaId = clienteempresaId;
    }

    public int getCreditoId() {
        return creditoId;
    }

    public void setCreditoId(int creditoId) {
        this.creditoId = creditoId;
    }
    
}
