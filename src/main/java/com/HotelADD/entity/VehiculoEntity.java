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
@Table(name = "tb_vehiculos", schema = "servicios")
public class VehiculoEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vehiculo_numero")
    private Long vehiculoId;
    
    @Column(name = "vehiculo_marca")
    private String vehiculoMarca;
    
    @Column(name = "vehiculo_tipo")
    private String vehiculoTipo;
    
    @Column(name = "vehiculo_placa")
    private String vehiculoPlaca;
    
    @OneToMany(mappedBy = "vehiculoFk")
    private List<RentaVehiculoEntity> rentaVehiculo;
    
    @ManyToOne
    @JoinColumn(name = "estadovehiculo_id", insertable = false, updatable = false)
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
