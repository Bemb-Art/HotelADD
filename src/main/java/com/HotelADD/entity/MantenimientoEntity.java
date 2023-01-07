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
@Table(name = "Tb_Mantenimientos")
public class MantenimientoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Mantenimiento_Id")
    private Long mantenimientoId;
    
    @Column(name = "Mantenimiento_Descripcion")
    private Long mantenimientoDescripcion;
    
    @OneToMany(mappedBy = "mantenimientoFk")
    private List<EstadoHabitacionEntity> estadoHabitacion;
    
    @ManyToOne
    @JoinColumn(name = "Usuario_Id", insertable = false, updatable = false)
    private UsuarioEntity usuarioFk;

    public Long getMantenimientoId() {
        return mantenimientoId;
    }

    public void setMantenimientoId(Long mantenimientoId) {
        this.mantenimientoId = mantenimientoId;
    }

    public Long getMantenimientoDescripcion() {
        return mantenimientoDescripcion;
    }

    public void setMantenimientoDescripcion(Long mantenimientoDescripcion) {
        this.mantenimientoDescripcion = mantenimientoDescripcion;
    }

    public UsuarioEntity getUsuarioFk() {
        return usuarioFk;
    }

    public void setUsuarioFk(UsuarioEntity usuarioFk) {
        this.usuarioFk = usuarioFk;
    }
    
}
