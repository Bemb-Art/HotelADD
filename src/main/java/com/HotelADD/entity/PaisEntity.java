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
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author bonni
 */
@Entity
@Table(name = "tb_paises", schema = "clientes")
public class PaisEntity implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pais_id")
    private Long paisId;
    
    @Column(name = "pais_nombre")
    private String paisNombre;
    
    @Column(name = "pais_codigo")
    private String paisCodigoPostal;
    
    @OneToMany(mappedBy = "paisfk")
    private List<DireccionEntity> direccion;

    public Long getPaisId() {
        return paisId;
    }

    public void setPaisId(Long paisId) {
        this.paisId = paisId;
    }

    public String getPaisNombre() {
        return paisNombre;
    }

    public void setPaisNombre(String paisNombre) {
        this.paisNombre = paisNombre;
    }

    public String getPaisCodigoPostal() {
        return paisCodigoPostal;
    }

    public void setPaisCodigoPostal(String paisCodigoPostal) {
        this.paisCodigoPostal = paisCodigoPostal;
    }
    
}
