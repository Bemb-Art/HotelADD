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
@Table(name = "Tb_RentasVehiculos")
public class RentaVehiculoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RentaVehiculo_Id")
    private Long rentaVehiculoId;
    
    @Column(name = "RentaVehiculo_FechaInicio")
    private Date rentaVehiculoFechaInicio;
    
    @Column(name = "RentaVehiculo_FechaFin")
    private Date rentaVehiculoFechaFin;
    
    @Column(name = "RentaVehiculo_Precio")
    private BigDecimal rentaVehiculoPrecio;
    
    @OneToMany(mappedBy = "rentaVehiculoFk")
    private List<ServicioEntity> servicio;
    
    @ManyToOne
    @JoinColumn(name = "Vehiculo_Id", insertable = false, updatable = false)
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
