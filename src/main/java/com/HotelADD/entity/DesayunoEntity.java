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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author bonni
 */
@Data
@Entity
@Table(name = "tb_desayunos", schema  = "servicios")
public class DesayunoEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "desayuno_id")
    private Long desayunoId;
    
    @Column(name = "desayuno_nombre")
    private String desayunoNombre;
    
    @Column(name = "desayuno_descripcion")
    private String desayunoDescripcion;
    
    @Column(name = "desayuno_precio")
    private BigDecimal desayunoPrecio;
    
    @OneToMany(mappedBy = "desayunoFk")
    private List<ServicioEntity> servicio;

    public Long getDesayunoId() {
        return desayunoId;
    }

    public void setDesayunoId(Long DesayunoId) {
        this.desayunoId = DesayunoId;
    }

    public String getDesayunoNombre() {
        return desayunoNombre;
    }

    public void setDesayunoNombre(String DesayunoNombre) {
        this.desayunoNombre = DesayunoNombre;
    }

    public String getDesayunoDescripcion() {
        return desayunoDescripcion;
    }

    public void setDesayunoDescripcion(String DesayunoDescripcion) {
        this.desayunoDescripcion = DesayunoDescripcion;
    }

    public BigDecimal getDesayunoPrecio() {
        return desayunoPrecio;
    }

    public void setDesayunoPrecio(BigDecimal DesayunoPrecio) {
        this.desayunoPrecio = DesayunoPrecio;
    }
    
}
