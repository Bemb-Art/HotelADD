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
@Table(name = "Tb_EstadosHabitaciones")
public class HabitacionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Habitacion_Id")
    private Long habitacionId;
    
    @Column(name = "Habitacion_Tipo")
    private String habitacionTipo;
    
    @Column(name = "Habitacion_Camas")
    private char habitacionCamas;
    
    @Column(name = "Habitacion_Exterior")
    private char habitacionExterior;
    
    @Column(name = "Habitacion_PrecioEstandar")
    private BigDecimal habitacionPrecioEstandar;
    
    @Column(name = "Habitacion_FinDeSemana")
    private BigDecimal habitacionFinDeSemana;
    
    @OneToMany(mappedBy = "habitacionFk")
    private List<ReservacionEntity> reservacion;
    
    @ManyToOne
    @JoinColumn(name = "EstadoHabitacion_Id", insertable = false, updatable = false)
    private EstadoHabitacionEntity estadoHabitacionFk;

    public Long getHabitacionId() {
        return habitacionId;
    }

    public void setHabitacionId(Long habitacionId) {
        this.habitacionId = habitacionId;
    }

    public String getHabitacionTipo() {
        return habitacionTipo;
    }

    public void setHabitacionTipo(String habitacionTipo) {
        this.habitacionTipo = habitacionTipo;
    }

    public char getHabitacionCamas() {
        return habitacionCamas;
    }

    public void setHabitacionCamas(char habitacionCamas) {
        this.habitacionCamas = habitacionCamas;
    }

    public char getHabitacionExterior() {
        return habitacionExterior;
    }

    public void setHabitacionExterior(char habitacionExterior) {
        this.habitacionExterior = habitacionExterior;
    }

    public BigDecimal getHabitacionPrecioEstandar() {
        return habitacionPrecioEstandar;
    }

    public void setHabitacionPrecioEstandar(BigDecimal habitacionPrecioEstandar) {
        this.habitacionPrecioEstandar = habitacionPrecioEstandar;
    }

    public BigDecimal getHabitacionFinDeSemana() {
        return habitacionFinDeSemana;
    }

    public void setHabitacionFinDeSemana(BigDecimal habitacionFinDeSemana) {
        this.habitacionFinDeSemana = habitacionFinDeSemana;
    }

    public EstadoHabitacionEntity getEstadoHabitacionFk() {
        return estadoHabitacionFk;
    }

    public void setEstadoHabitacionFk(EstadoHabitacionEntity estadoHabitacionFk) {
        this.estadoHabitacionFk = estadoHabitacionFk;
    }
    
}
