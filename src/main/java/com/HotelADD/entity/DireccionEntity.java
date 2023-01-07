/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.HotelADD.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author bonni
 */
@Entity
@Table(name = "Tb_Direcciones")
public class DireccionEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Direccion_Id")
    private Long direccionId;
    
    @Column(name = "Direccion_Descripcion")
    private String direccionDescripcion;

    @ManyToOne
    @JoinColumn(name = "Pais_Id", insertable = false, updatable = false)
    private PaisEntity paisFk;
    
    public Long getDireccionId() {
        return direccionId;
    }       

    public void setDireccionId(Long direccionId) {
        this.direccionId = direccionId;
    }

    public String getDireccionDescripcion() {
        return direccionDescripcion;
    }

    public void setDireccionDescripcion(String direccionDescripcion) {
        this.direccionDescripcion = direccionDescripcion;
    }

    public PaisEntity getPaisFk() {
        return paisFk;
    }

    public void setPaisFk(PaisEntity paisFk) {
        this.paisFk = paisFk;
    }
    
}
