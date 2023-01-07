/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.HotelADD.entity;

import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author bonni
 */
@Data
@Entity
@Table(name = "Tb_Creditos")
public class CreditoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Credito_Id")
    private Long creditoId;
    
    @Column(name = "Credito_Numero")
    private String creditoNumero;
    
    @Column(name = "Credito_Total")
    private BigDecimal creditoTotal;
    
    @Column(name = "Credito_Dias")
    private String creditoDias;
    
    @Column(name = "Credito_Estado")
    private String creditoEstado;
    
    @OneToMany(mappedBy = "creditoFk")
    private List<PagoEntity> pago;
    
    @OneToMany(mappedBy = "creditoFk")
    private List<FacturaEntity> factura;
    
    @ManyToOne
    @JoinColumn(name = "ClienteEmpresa_Id", insertable = false, updatable = false)
    private ClientesEmpresasEntity clienteEmpresaFk;

    public Long getCreditoId() {
        return creditoId;
    }

    public void setCreditoId(Long creditoId) {
        this.creditoId = creditoId;
    }

    public String getCreditoNumero() {
        return creditoNumero;
    }

    public void setCreditoNumero(String creditoNumero) {
        this.creditoNumero = creditoNumero;
    }

    public BigDecimal getCreditoTotal() {
        return creditoTotal;
    }

    public void setCreditoTotal(BigDecimal creditoTotal) {
        this.creditoTotal = creditoTotal;
    }

    public String getCreditoDias() {
        return creditoDias;
    }

    public void setCreditoDias(String creditoDias) {
        this.creditoDias = creditoDias;
    }

    public String getCreditoEstado() {
        return creditoEstado;
    }

    public void setCreditoEstado(String creditoEstado) {
        this.creditoEstado = creditoEstado;
    }

    public ClientesEmpresasEntity getClienteEmpresaFk() {
        return clienteEmpresaFk;
    }

    public void setClienteEmpresaFk(ClientesEmpresasEntity clienteEmpresaFk) {
        this.clienteEmpresaFk = clienteEmpresaFk;
    }
    
}
