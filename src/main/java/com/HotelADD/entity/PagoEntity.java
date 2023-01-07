/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.HotelADD.entity;

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
@Table(name = "Tb_Pagos")
public class PagoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Pago_Id")
    private Long pagoId;
    
    @Column(name = "Pago_Total")
    private BigDecimal pagoTotal;
    
    @Column(name = "Pago_Abono")
    private BigDecimal pagoAbono;
    
    @Column(name = "Pago_Debe")
    private BigDecimal pagoDebe;
    
    @Column(name = "Pago_Fecha")
    private Date pagoFecha;
    
    @ManyToOne
    @JoinColumn(name = "ClienteParticular_Id", insertable = false, updatable = false)
    private ClienteParticularEntity clienteParticularFk;
    
    @ManyToOne
    @JoinColumn(name = "ClienteEmpresa_Id", insertable = false, updatable = false)
    private ClientesEmpresasEntity clienteEmpresaFk;
    
    @ManyToOne
    @JoinColumn(name = "Credito_Id", insertable = false, updatable = false)
    private CreditoEntity creditoFk;

    public Long getPagoId() {
        return pagoId;
    }

    public void setPagoId(Long pagoId) {
        this.pagoId = pagoId;
    }

    public BigDecimal getPagoTotal() {
        return pagoTotal;
    }

    public void setPagoTotal(BigDecimal pagoTotal) {
        this.pagoTotal = pagoTotal;
    }

    public BigDecimal getPagoAbono() {
        return pagoAbono;
    }

    public void setPagoAbono(BigDecimal pagoAbono) {
        this.pagoAbono = pagoAbono;
    }

    public BigDecimal getPagoDebe() {
        return pagoDebe;
    }

    public void setPagoDebe(BigDecimal pagoDebe) {
        this.pagoDebe = pagoDebe;
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
    
}
