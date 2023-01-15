/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.HotelADD.entity;

import java.io.Serializable;
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
@Table(name = "tb_creditos", schema = "cpc")
public class CreditoEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "credito_numero")    
    private Long creditoNumero;
    
    @Column(name = "credito_total")
    private BigDecimal creditoTotal;
    
    @Column(name = "credito_dias")
    private String creditoDias;
    
    @Column(name = "credito_estado")
    private String creditoEstado;
    
    @Column(name = "clienteempresa_id")
    private int clienteEmpresa_id;
    
    @OneToMany(mappedBy = "creditoFk")
    private List<PagoEntity> pago;
    
    @OneToMany(mappedBy = "creditoFk")
    private List<FacturaEntity> factura;
    
    @ManyToOne
    @JoinColumn(name = "clienteempresa_id", insertable = false, updatable = false)
    private ClientesEmpresasEntity clienteEmpresaFk;

    public Long getCreditoNumero() {
        return creditoNumero;
    }

    public void setCreditoNumero(Long creditoNumero) {
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

    public Integer getClienteEmpresa_id() {
        return clienteEmpresa_id;
    }

    public void setClienteEmpresa_id(Integer clienteEmpresa_id) {
        this.clienteEmpresa_id = clienteEmpresa_id;
    }       

    public ClientesEmpresasEntity getClienteEmpresaFk() {
        return clienteEmpresaFk;
    }

    public void setClienteEmpresaFk(ClientesEmpresasEntity clienteEmpresaFk) {
        this.clienteEmpresaFk = clienteEmpresaFk;
    }

    
}
