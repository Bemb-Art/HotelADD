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
@Table(name = "Tb_Vehiculos")
public class VehiculoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Vehiculo_Id")
    private Long vehiculoId;
    
    @Column(name = "Vehiculo_Marca")
    private String vehiculoMarca;
    
    @Column(name = "Vehiculo_Tipo")
    private String vehiculoTipo;
    
    @Column(name = "Vehiculo_Placa")
    private String vehiculoPlaca;
    
    @OneToMany(mappedBy = "vehiculoFk")
    private List<RentaVehiculoEntity> rentaVehiculo;
    
    @ManyToOne
    @JoinColumn(name = "EstadoVehiculo_Id", insertable = false, updatable = false)
    private EstadoVehiculoEntity estadoVehiculoFk;

    public Long getVehiculoId() {
        return vehiculoId;
    }

    public void setVehiculoId(Long vehiculoId) {
        this.vehiculoId = vehiculoId;
    }

    public String getVehiculoMarca() {
        return vehiculoMarca;
    }

    public void setVehiculoMarca(String vehiculoMarca) {
        this.vehiculoMarca = vehiculoMarca;
    }

    public String getVehiculoTipo() {
        return vehiculoTipo;
    }

    public void setVehiculoTipo(String vehiculoTipo) {
        this.vehiculoTipo = vehiculoTipo;
    }

    public String getVehiculoPlaca() {
        return vehiculoPlaca;
    }

    public void setVehiculoPlaca(String vehiculoPlaca) {
        this.vehiculoPlaca = vehiculoPlaca;
    }

    public EstadoVehiculoEntity getEstadoVehiculoFk() {
        return estadoVehiculoFk;
    }

    public void setEstadoVehiculoFk(EstadoVehiculoEntity estadoVehiculoFk) {
        this.estadoVehiculoFk = estadoVehiculoFk;
    }
    
}
