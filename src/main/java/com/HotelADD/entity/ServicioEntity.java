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
@Table(name = "Tb_Servicios")
public class ServicioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Servicio_Id")
    private Long servicioId;
    
    @Column(name = "Servicio_Descripcion")
    private String servicioDescripcion;
    
    @OneToMany(mappedBy = "servicioFk")
    private List<ReservacionEntity> reservacion;
    
    @ManyToOne
    @JoinColumn(name = "RentaVehiculo_Id", insertable = false, updatable = false)
    private RentaVehiculoEntity rentaVehiculoFk;
    
    @ManyToOne
    @JoinColumn(name = "Desayuno_Id", insertable = false, updatable = false)
    private DesayunoEntity desayunoFk;
    
    @ManyToOne
    @JoinColumn(name = "Traslado_Id", insertable = false, updatable = false)
    private TrasladoEntiy trasladoFk;

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

    public TrasladoEntiy getTrasladoFk() {
        return trasladoFk;
    }

    public void setTrasladoFk(TrasladoEntiy trasladoFk) {
        this.trasladoFk = trasladoFk;
    }
    
}
