/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.HotelADD.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author bonni
 */
@Data
@Entity
@Table(name = "tb_reservaciones", schema = "hotel")
public class ReservacionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reservacion_id")
    private Long reservacionId;
    
    @Column(name = "reservacion_numero")
    private Integer reservacionNumero;
    
    @Column(name = "reservacion_fechainicio")
    private Date reservacionFechaInicio;
    
    @Column(name = "reservacion_fechafin")
    private Date reservacionFechaFin;
    
    @Column(name = "reservacion_huespedadulto")
    private char reservacionHuespedAdulto;
    
    @Column(name = "reservacion_huespedninio")
    private char reservacionNinio;
    
    @ManyToOne
    @JoinColumn(name = "clienteparticular_id", insertable = false, updatable = false)
    private ClienteParticularEntity clienteParticularFk;
    
    @ManyToOne
    @JoinColumn(name = "clienteempresa_id", insertable = false, updatable = false)
    private ClientesEmpresasEntity clienteEmpresaFk;
    
    @ManyToOne
    @JoinColumn(name = "habitacion_id", insertable = false, updatable = false)
    private HabitacionEntity habitacionFk;
    
    @ManyToOne
    @JoinColumn(name = "servicio_id", insertable = false, updatable = false)
    private ServicioEntity serivicioFk;

    public Long getReservacionId() {
        return reservacionId;
    }

    public void setReservacionId(Long reservacionId) {
        this.reservacionId = reservacionId;
    }

    public Integer getReservacionNumero() {
        return reservacionNumero;
    }

    public void setReservacionNumero(Integer reservacionNumero) {
        this.reservacionNumero = reservacionNumero;
    }

    public Date getReservacionFechaInicio() {
        return reservacionFechaInicio;
    }

    public void setReservacionFechaInicio(Date reservacionFechaInicio) {
        this.reservacionFechaInicio = reservacionFechaInicio;
    }

    public Date getReservacionFechaFin() {
        return reservacionFechaFin;
    }

    public void setReservacionFechaFin(Date reservacionFechaFin) {
        this.reservacionFechaFin = reservacionFechaFin;
    }

    public char getReservacionHuespedAdulto() {
        return reservacionHuespedAdulto;
    }

    public void setReservacionHuespedAdulto(char reservacionHuespedAdulto) {
        this.reservacionHuespedAdulto = reservacionHuespedAdulto;
    }

    public char getReservacionNinio() {
        return reservacionNinio;
    }

    public void setReservacionNinio(char reservacionNinio) {
        this.reservacionNinio = reservacionNinio;
    }

    public ClienteParticularEntity getClienteParticularFk() {
        return clienteParticularFk;
    }

    public void setClienteParticularFk(ClienteParticularEntity clienteParticularFk) {
        this.clienteParticularFk = clienteParticularFk;
    }

    public ClientesEmpresasEntity getClienteEmpresaFk() {
        return clienteEmpresaFk;
    }

    public void setClienteEmpresaFk(ClientesEmpresasEntity clienteEmpresaFk) {
        this.clienteEmpresaFk = clienteEmpresaFk;
    }

    public HabitacionEntity getHabitacionFk() {
        return habitacionFk;
    }

    public void setHabitacionFk(HabitacionEntity habitacionFk) {
        this.habitacionFk = habitacionFk;
    }

    public ServicioEntity getSerivicioFk() {
        return serivicioFk;
    }

    public void setSerivicioFk(ServicioEntity serivicioFk) {
        this.serivicioFk = serivicioFk;
    }
            
}
