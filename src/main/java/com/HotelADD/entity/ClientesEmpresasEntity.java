/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.HotelADD.entity;

import java.io.Serializable;
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
@Table(name = "tb_clientesempresas", schema = "clientes")
public class ClientesEmpresasEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "clienteempresa_id")
    private Long clienteEmpresaId;
    
    @Column(name = "clienteempresa_identificacion")
    private String clienteEmpresaIdentificacion;
    
    @Column(name = "clienteempresa_nit")
    private String clienteEmpresaNit;
    
    @Column(name = "clienteempresa_nombre1")
    private String clienteEmpresaNombre1;
    
    @Column(name = "clienteempresa_nombre2")
    private String clienteEmpresaNombre2;
    
    @Column(name = "clienteempresa_nombre3")
    private String clienteEmpresaNombre3;
    
    @Column(name = "clienteempresa_apellido1")
    private String clienteEmpresaApellido1;
    
    @Column(name = "clienteempresa_apellido2")
    private String clienteEmpresaApellido2;
    
    @Column(name = "clienteempresa_telefono")
    private String clienteEmpresaTelefono;
    
    @Column(name = "clienteempresa_correo")
    private String clienteEmpresaCorreo;
    
    @OneToMany(mappedBy = "clienteEmpresaFk")
    private List<PagoEntity> pago;
    
    @OneToMany(mappedBy = "clienteEmpresaFk")
    private List<FacturaEntity> factura;
    
    @OneToMany(mappedBy = "clienteEmpresaFk")
    private List<ReservacionEntity> reservacion;
    
    @OneToMany(mappedBy = "clienteEmpresaFk")
    private List<CreditoEntity> credito;
    
    @ManyToOne
    @JoinColumn(name = "empresa_id", insertable = false, updatable = false)
    private EmpresasEntity empresaFk;

    public Long getClienteEmpresaId() {
        return clienteEmpresaId;
    }

    public void setClienteEmpresaId(Long clienteEmpresaId) {
        this.clienteEmpresaId = clienteEmpresaId;
    }

    public String getClienteEmpresaIdentificacion() {
        return clienteEmpresaIdentificacion;
    }

    public void setClienteEmpresaIdentificacion(String clienteEmpresaIdentificacion) {
        this.clienteEmpresaIdentificacion = clienteEmpresaIdentificacion;
    }

    public String getClienteEmpresaNit() {
        return clienteEmpresaNit;
    }

    public void setClienteEmpresaNit(String clienteEmpresaNit) {
        this.clienteEmpresaNit = clienteEmpresaNit;
    }

    public String getClienteEmpresaNombre1() {
        return clienteEmpresaNombre1;
    }

    public void setClienteEmpresaNombre1(String clienteEmpresaNombre1) {
        this.clienteEmpresaNombre1 = clienteEmpresaNombre1;
    }

    public String getClienteEmpresaNombre2() {
        return clienteEmpresaNombre2;
    }

    public void setClienteEmpresaNombre2(String clienteEmpresaNombre2) {
        this.clienteEmpresaNombre2 = clienteEmpresaNombre2;
    }

    public String getClienteEmpresaNombre3() {
        return clienteEmpresaNombre3;
    }

    public void setClienteEmpresaNombre3(String clienteEmpresaNombre3) {
        this.clienteEmpresaNombre3 = clienteEmpresaNombre3;
    }

    public String getClienteEmpresaApellido1() {
        return clienteEmpresaApellido1;
    }

    public void setClienteEmpresaApellido1(String clienteEmpresaApellido1) {
        this.clienteEmpresaApellido1 = clienteEmpresaApellido1;
    }

    public String getClienteEmpresaApellido2() {
        return clienteEmpresaApellido2;
    }

    public void setClienteEmpresaApellido2(String clienteEmpresaApellido2) {
        this.clienteEmpresaApellido2 = clienteEmpresaApellido2;
    }

    public String getClienteEmpresaTelefono() {
        return clienteEmpresaTelefono;
    }

    public void setClienteEmpresaTelefono(String clienteEmpresaTelefono) {
        this.clienteEmpresaTelefono = clienteEmpresaTelefono;
    }

    public String getClienteEmpresaCorreo() {
        return clienteEmpresaCorreo;
    }

    public void setClienteEmpresaCorreo(String clienteEmpresaCorreo) {
        this.clienteEmpresaCorreo = clienteEmpresaCorreo;
    }

    public EmpresasEntity getEmpresaFk() {
        return empresaFk;
    }

    public void setEmpresaFk(EmpresasEntity empresaFk) {
        this.empresaFk = empresaFk;
    }
    
    
        
}
