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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author bonni
 */
@Data
@Entity
@Table(name = "tb_clientesparticulares", schema = "clientes")
public class ClienteParticularEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "clienteparticular_id")
    private Long clienteParticularId;
    
    @Column(name = "clienteparticular_identificacion")
    private String clienteParticularIdentificacion;
    
    @Column(name = "clienteparticular_nit")
    private String clienteParticularNit;
    
    @Column(name = "clienteparticular_nombre1")
    private String clienteParticularNombre1;
    
    @Column(name = "clienteparticular_nombre2")
    private String clienteParticularNombre2;
    
    @Column(name = "clienteparticular_nombre3")
    private String clienteParticularNombre3;
    
    @Column(name = "clienteparticular_apellido1")
    private String clienteParticularApellido1;
    
    @Column(name = "clienteparticular_apellido2")
    private String clienteParticularApellido2;
    
    @Column(name = "clienteparticular_telefono")
    private String clienteParticularTelefono;
    
    @Column(name = "clienteparticular_correo")
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