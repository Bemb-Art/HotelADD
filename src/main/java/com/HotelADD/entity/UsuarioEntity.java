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
@Table(name = "Tb_Usuario")
public class UsuarioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Usuario_Id")
    private Long usuarioId;
    
    @Column(name = "Usuario_Nombre")
    private String usuarioNombre;
    
    @Column(name = "Usuario_Contrasenia")
    private String usuarioContrasenia;
    
    @OneToMany(mappedBy = "usuarioFk")
    private List<MantenimientoEntity> mantenimiento;
    
    @ManyToOne
    @JoinColumn(name = "Empleado_Id", insertable = false, updatable = false)
    private EmpleadoEntity empleadoFk;

    public Long getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Long usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getUsuarioNombre() {
        return usuarioNombre;
    }

    public void setUsuarioNombre(String usuarioNombre) {
        this.usuarioNombre = usuarioNombre;
    }

    public String getUsuarioContrasenia() {
        return usuarioContrasenia;
    }

    public void setUsuarioContrasenia(String usuarioContrasenia) {
        this.usuarioContrasenia = usuarioContrasenia;
    }

    public EmpleadoEntity getEmpleadoFk() {
        return empleadoFk;
    }

    public void setEmpleadoFk(EmpleadoEntity empleadoFk) {
        this.empleadoFk = empleadoFk;
    }
    
}
