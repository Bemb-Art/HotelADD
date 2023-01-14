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
@Table(name = "tb_traslados", schema = "servicios")
public class TrasladoEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "traslado_id")
    private Long trasladoId;
    
    @Column(name = "traslado_origen")
    private String trasladoOrigen;
    
    @Column(name = "traslado_destino")
    private String trasladoDestino;
    
    @Column(name = "traslado_precio")
    private BigDecimal trasladoPrecio;
    
    @OneToMany(mappedBy = "trasladoFk")
    private List<ServicioEntity> servicio;

    public Long getTrasladoId() {
        return trasladoId;
    }

    public void setTrasladoId(Long trasladoId) {
        this.trasladoId = trasladoId;
    }

    public String getTrasladoOrigen() {
        return trasladoOrigen;
    }

    public void setTrasladoOrigen(String trasladoOrigen) {
        this.trasladoOrigen = trasladoOrigen;
    }

    public String getTrasladoDestino() {
        return trasladoDestino;
    }

    public void setTrasladoDestino(String trasladoDestino) {
        this.trasladoDestino = trasladoDestino;
    }

    public BigDecimal getTrasladoPrecio() {
        return trasladoPrecio;
    }

    public void setTrasladoPrecio(BigDecimal trasladoPrecio) {
        this.trasladoPrecio = trasladoPrecio;
    }
    
}
