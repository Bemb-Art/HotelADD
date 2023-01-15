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
@Table(name = "tb_habitaciones",  schema = "hotel")
public class HabitacionEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "habitacion_numero")
    private Long habitacionId;
    
    @Column(name = "habitacion_tipo")
    private String habitacionTipo;
    
    @Column(name = "habitacion_camas")
    private char habitacionCamas;
    
    @Column(name = "habitacion_descripcion")
    private String habitacionDescripcion;
    
    @Column(name = "habitacion_exterior")
    private char habitacionExterior;
    
    @Column(name = "habitacion_precioestandar")
    private BigDecimal habitacionPrecioEstandar;
    
    @Column(name = "habitacion_preciofindesemana")
    private BigDecimal habitacionFinDeSemana;
    
    @OneToMany(mappedBy = "habitacionFk")
    private List<ReservacionEntity> reservacion;
        
    @Column(name = "estadohabitacion_id")
    private int estadoHabitacionId;
    
    @ManyToOne
    @JoinColumn(name = "estadohabitacion_id", insertable = false, updatable = false)
    private EstadoHabitacionEntity estadoHabitacionFk;
    
    @Column(name = "usuario_id")
    private int usuarioId;
    
    @ManyToOne
    @JoinColumn(name = "usuario_id", insertable = false, updatable = false)
    private UsuarioEntity usuarioFk;
    
    @Column(name = "mantenimiento_id")
    private int mantenimientoId;
    
    @ManyToOne
    @JoinColumn(name = "mantenimiento_id", insertable = false, updatable = false)
    private MantenimientoEntity mantenimientoFk;

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

    public String getHabitacionDescripcion() {
        return habitacionDescripcion;
    }

    public void setHabitacionDescripcion(String habitacionDescripcion) {
        this.habitacionDescripcion = habitacionDescripcion;
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

    public UsuarioEntity getUsuarioFk() {
        return usuarioFk;
    }

    public void setUsuarioFk(UsuarioEntity usuarioFk) {
        this.usuarioFk = usuarioFk;
    }

    public MantenimientoEntity getMantenimientoFk() {
        return mantenimientoFk;
    }

    public void setMantenimientoFk(MantenimientoEntity mantenimientoFk) {
        this.mantenimientoFk = mantenimientoFk;
    }

    public int getEstadoHabitacionId() {
        return estadoHabitacionId;
    }

    public void setEstadoHabitacionId(int estadoHabitacionId) {
        this.estadoHabitacionId = estadoHabitacionId;
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    public int getMantenimientoId() {
        return mantenimientoId;
    }

    public void setMantenimientoId(int mantenimientoId) {
        this.mantenimientoId = mantenimientoId;
    }
    
}
