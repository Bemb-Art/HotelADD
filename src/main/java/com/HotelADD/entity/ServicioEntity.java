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
@Table(name = "tb_servicios", schema = "servicios")
public class ServicioEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "servicio_id")
    private Long servicioId;
    
    @Column(name = "servicio_descripcion")
    private String servicioDescripcion;
    
    @OneToMany(mappedBy = "serivicioFk")
    private List<ReservacionEntity> reservacion;
    
    @OneToMany(mappedBy = "serivicioFk")
    private List<ReservacionEntity> factura;
    
    @Column(name = "rentavehiculo_id")
    private int rentaVehiculoId;
    
    @ManyToOne
    @JoinColumn(name = "rentavehiculo_id", insertable = false, updatable = false)
    private RentaVehiculoEntity rentaVehiculoFk;
    
    @Column(name = "desayuno_id")
    private int desayunoId;
    
    @ManyToOne
    @JoinColumn(name = "desayuno_id", insertable = false, updatable = false)
    private DesayunoEntity desayunoFk;
    
    @Column(name = "traslado_id")
    private int trasladoId;
    
    @ManyToOne
    @JoinColumn(name = "traslado_id", insertable = false, updatable = false)
    private TrasladoEntity trasladoFk;

    public Long getServicioId() {
        return servicioId;
    }

    public void setServicioId(Long servicioId) {
        this.servicioId = servicioId;
    }

    public String getServicioDescripcion() {
        return servicioDescripcion;
    }

    public void setServicioDescripcion(String servicioDescripcion) {
        this.servicioDescripcion = servicioDescripcion;
    }

    public RentaVehiculoEntity getRentaVehiculoFk() {
        return rentaVehiculoFk;
    }

    public void setRentaVehiculoFk(RentaVehiculoEntity rentaVehiculoFk) {
        this.rentaVehiculoFk = rentaVehiculoFk;
    }

    public DesayunoEntity getDesayunoFk() {
        return desayunoFk;
    }

    public void setDesayunoFk(DesayunoEntity desayunoFk) {
        this.desayunoFk = desayunoFk;
    }

    public TrasladoEntity getTrasladoFk() {
        return trasladoFk;
    }

    public void setTrasladoFk(TrasladoEntity trasladoFk) {
        this.trasladoFk = trasladoFk;
    }

    public int getRentaVehiculoId() {
        return rentaVehiculoId;
    }

    public void setRentaVehiculoId(int rentaVehiculoId) {
        this.rentaVehiculoId = rentaVehiculoId;
    }

    public int getDesayunoId() {
        return desayunoId;
    }

    public void setDesayunoId(int desayunoId) {
        this.desayunoId = desayunoId;
    }

    public int getTrasladoId() {
        return trasladoId;
    }

    public void setTrasladoId(int trasladoId) {
        this.trasladoId = trasladoId;
    }
    
    
}
