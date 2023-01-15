/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.HotelADD.entity;

import java.io.Serializable;
import java.util.Date;
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
@Table(name = "tb_reservaciones", schema = "hotel")
public class ReservacionEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reservacion_numero")
    private Long reservacionNumero;
    
    @Column(name = "reservacion_fechainicio")
    private Date reservacionFechaInicio;
    
    @Column(name = "reservacion_fechafin")
    private Date reservacionFechaFin;
    
    @Column(name = "reservacion_adulto")
    private String reservacionHuespedAdulto;
    
    @Column(name = "reservacion_ninio")
    private String reservacionNinio;
    
    @OneToMany(mappedBy = "reservacionFk")
    private List<FacturaEntity> factura;
    
    @Column(name = "clienteparticular_id")
    private int clienteParticularId;
    
    @ManyToOne
    @JoinColumn(name = "clienteparticular_id", insertable = false, updatable = false)
    private ClienteParticularEntity clienteParticularFk;
    
    @Column(name = "clienteempresa_id")
    private int clienteEmpresaId;
    
    @ManyToOne
    @JoinColumn(name = "clienteempresa_id", insertable = false, updatable = false)
    private ClientesEmpresasEntity clienteEmpresaFk;
    
    @Column(name = "habitacion_id")
    private int habitacionId;
    
    @ManyToOne
    @JoinColumn(name = "habitacion_id", insertable = false, updatable = false)
    private HabitacionEntity habitacionFk;
    
    @Column(name = "servicio_id")
    private int servicioId;
    
    @ManyToOne
    @JoinColumn(name = "servicio_id", insertable = false, updatable = false)
    private ServicioEntity serivicioFk;

    public Long getReservacionNumero() {
        return reservacionNumero;
    }

    public void setReservacionNumero(Long reservacionNumero) {
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

    public String getReservacionHuespedAdulto() {
        return reservacionHuespedAdulto;
    }

    public String setReservacionHuespedAdulto(String reservacionHuespedAdulto) {
        return this.reservacionHuespedAdulto = reservacionHuespedAdulto;
    }

    public String getReservacionNinio() {
        return reservacionNinio;
    }

    public String setReservacionNinio(String reservacionNinio) {
        return this.reservacionNinio = reservacionNinio;
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

    public int getClienteParticularId() {
        return clienteParticularId;
    }

    public void setClienteParticularId(int clienteParticularId) {
        this.clienteParticularId = clienteParticularId;
    }

    public int getClienteEmpresaId() {
        return clienteEmpresaId;
    }

    public void setClienteEmpresaId(int clienteEmpresaId) {
        this.clienteEmpresaId = clienteEmpresaId;
    }

    public int getHabitacionId() {
        return habitacionId;
    }

    public void setHabitacionId(int habitacionId) {
        this.habitacionId = habitacionId;
    }

    public int getServicioId() {
        return servicioId;
    }

    public void setServicioId(int servicioId) {
        this.servicioId = servicioId;
    }
            
}
