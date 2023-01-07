/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.HotelADD.entity;

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
@Table(name = "Tb_Facturas")
public class FacturaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Factura_Id")
    private Long facturaId;
    
    @Column(name = "Factura_Numero")
    private String facturaNumero;
    
    @Column(name = "Factura_Serie")
    private String facturaSerie;
    
    @Column(name = "Factura_Total")
    private BigDecimal facturaTotal;
    
    @Column(name = "Factura_Estado")
    private String facturaEstado;
    
    @ManyToOne
    @JoinColumn(name = "ClienteParticular_Id", insertable = false, updatable = false)
    private ClienteParticularEntity clienteParticularFk;
    
    @ManyToOne
    @JoinColumn(name = "ClienteEmpresa_Id", insertable = false, updatable = false)
    private ClientesEmpresasEntity clienteEmpresaFk;
    
    @ManyToOne
    @JoinColumn(name = "Credito_Id", insertable = false, updatable = false)
    private CreditoEntity creditoFk;

    public Long getFacturaId() {
        return facturaId;
    }

    public void setFacturaId(Long facturaId) {
        this.facturaId = facturaId;
    }

    public String getFacturaNumero() {
        return facturaNumero;
    }

    public void setFacturaNumero(String facturaNumero) {
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
    
    
}
