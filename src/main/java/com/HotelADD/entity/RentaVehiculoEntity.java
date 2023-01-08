/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.HotelADD.entity;

import java.math.BigDecimal;
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
@Table(name = "tb_rentasvehiculos", schema = "servicios")
public class RentaVehiculoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rentavehiculo_id")
    private Long rentaVehiculoId;
    
    @Column(name = "rentavehiculo_fechaInicio")
    private Date rentaVehiculoFechaInicio;
    
    @Column(name = "rentavehiculo_fechaFin")
    private Date rentaVehiculoFechaFin;
    
    @Column(name = "rentavehiculo_precio")
    private BigDecimal rentaVehiculoPrecio;
    
    @OneToMany(mappedBy = "rentavehiculofk")
    private List<ServicioEntity> servicio;
    
    @ManyToOne
    @JoinColumn(name = "vehiculo_id", insertable = false, updatable = false)
    private VehiculoEntity vehiculoFk;

    public Long getRentaVehiculoId() {
        return rentaVehiculoId;
    }

    public void setRentaVehiculoId(Long rentaVehiculoId) {
        this.rentaVehiculoId = rentaVehiculoId;
    }

    public Date getRentaVehiculoFechaInicio() {
        return rentaVehiculoFechaInicio;
    }

    public void setRentaVehiculoFechaInicio(Date rentaVehiculoFechaInicio) {
        this.rentaVehiculoFechaInicio = rentaVehiculoFechaInicio;
    }

    public Date getRentaVehiculoFechaFin() {
        return rentaVehiculoFechaFin;
    }

    public void setRentaVehiculoFechaFin(Date rentaVehiculoFechaFin) {
        this.rentaVehiculoFechaFin = rentaVehiculoFechaFin;
    }

    public BigDecimal getRentaVehiculoPrecio() {
        return rentaVehiculoPrecio;
    }

    public void setRentaVehiculoPrecio(BigDecimal rentaVehiculoPrecio) {
        this.rentaVehiculoPrecio = rentaVehiculoPrecio;
    }

    public VehiculoEntity getVehiculoFk() {
        return vehiculoFk;
    }

    public void setVehiculoFk(VehiculoEntity vehiculoFk) {
        this.vehiculoFk = vehiculoFk;
    }
    
}
