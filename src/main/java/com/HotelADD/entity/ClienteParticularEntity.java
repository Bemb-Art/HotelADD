/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.HotelADD.entity;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author bonni
 */
@Data
@Entity
@Table(name = "Tb_ClientesParticulares")
public class ClienteParticularEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ClienteParticular_Id")
    private Long clienteParticularId;
    
    @Column(name = "ClienteParticular_Identificacion")
    private String clienteParticularIdentificacion;
    
    @Column(name = "ClienteParticular_NIT")
    private String clienteParticularNit;
    
    @Column(name = "ClienteEmpresa_Nombre1")
    private String clienteParticularNombre1;
    
    @Column(name = "ClienteParticular_Nombre2")
    private String clienteParticularNombre2;
    
    @Column(name = "ClienteParticular_Nombre3")
    private String clienteParticularNombre3;
    
    @Column(name = "ClienteParticular_Apellido1")
    private String clienteParticularApellido1;
    
    @Column(name = "ClienteParticular_Apellido2")
    private String clienteParticularApellido2;
    
    @Column(name = "ClienteParticular_Telefono")
    private String clienteParticularTelefono;
    
    @Column(name = "ClienteParticular_Correo")
    private String clienteParticularCorreo;
    
    @OneToMany(mappedBy = "clienteParticularFk")
    private List<PagoEntity> pago;
    
    @OneToMany(mappedBy = "clienteParticularFk")
    private List<FacturaEntity> factura;
    
    @OneToMany(mappedBy = "clienteParticularFk")
    private List<ReservacionEntity> reservacion;

    public Long getClienteParticularId() {
        return clienteParticularId;
    }

    public void setClienteParticularId(Long clienteParticularId) {
        this.clienteParticularId = clienteParticularId;
    }

    public String getClienteParticularIdentificacion() {
        return clienteParticularIdentificacion;
    }

    public void setClienteParticularIdentificacion(String clienteParticularIdentificacion) {
        this.clienteParticularIdentificacion = clienteParticularIdentificacion;
    }

    public String getClienteParticularNit() {
        return clienteParticularNit;
    }

    public void setClienteParticularNit(String clienteParticularNit) {
        this.clienteParticularNit = clienteParticularNit;
    }

    public String getClienteParticularNombre1() {
        return clienteParticularNombre1;
    }

    public void setClienteParticularNombre1(String clienteParticularNombre1) {
        this.clienteParticularNombre1 = clienteParticularNombre1;
    }

    public String getClienteParticularNombre2() {
        return clienteParticularNombre2;
    }

    public void setClienteParticularNombre2(String clienteParticularNombre2) {
        this.clienteParticularNombre2 = clienteParticularNombre2;
    }

    public String getClienteParticularNombre3() {
        return clienteParticularNombre3;
    }

    public void setClienteParticularNombre3(String clienteParticularNombre3) {
        this.clienteParticularNombre3 = clienteParticularNombre3;
    }

    public String getClienteParticularApellido1() {
        return clienteParticularApellido1;
    }

    public void setClienteParticularApellido1(String clienteParticularApellido1) {
        this.clienteParticularApellido1 = clienteParticularApellido1;
    }

    public String getClienteParticularApellido2() {
        return clienteParticularApellido2;
    }

    public void setClienteParticularApellido2(String clienteParticularApellido2) {
        this.clienteParticularApellido2 = clienteParticularApellido2;
    }

    public String getClienteParticularTelefono() {
        return clienteParticularTelefono;
    }

    public void setClienteParticularTelefono(String clienteParticularTelefono) {
        this.clienteParticularTelefono = clienteParticularTelefono;
    }

    public String getClienteParticularCorreo() {
        return clienteParticularCorreo;
    }

    public void setClienteParticularCorreo(String clienteParticularCorreo) {
        this.clienteParticularCorreo = clienteParticularCorreo;
    }
    
    
        
}