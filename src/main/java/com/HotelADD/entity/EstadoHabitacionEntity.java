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
@Table(name = "Tb_EstadosHabitaciones")
public class EstadoHabitacionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EstadoHabitacion_Id")
    private Long estadoHabitacionId;
    
    @Column(name = "EstadoHabitacion_Tipo")
    private String estadoHabitacionTipo;   
    
    @OneToMany(mappedBy = "estadoHabitacionFk")
    private List<HabitacionEntity> habitacion;
    
    @ManyToOne
    @JoinColumn(name = "Mantenimiento_Id", insertable = false, updatable = false)
    private MantenimientoEntity mantenimientoFk;

    public Long getEstadoHabitacionId() {
        return estadoHabitacionId;
    }

    public void setEstadoHabitacionId(Long estadoHabitacionId) {
        this.estadoHabitacionId = estadoHabitacionId;
    }

    public String getEstadoHabitacionTipo() {
        return estadoHabitacionTipo;
    }

    public void setEstadoHabitacionTipo(String estadoHabitacionTipo) {
        this.estadoHabitacionTipo = estadoHabitacionTipo;
    }
    
}
