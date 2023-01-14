/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.HotelADD.controller;

import com.HotelADD.entity.VehiculoEntity;
import com.HotelADD.service.VehiculoService;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author bonni
 */
@RestController
@RequestMapping ("/vehiculos")
public class VehiculoController {
    private final VehiculoService vService;
    
    public VehiculoController(VehiculoService vService){
        this.vService = vService;        
    }
    
    @PatchMapping("/estadoVehiculo/{id}")
    public ResponseEntity<Void> updateEstadoVehiculo(Long vehiculo_numero, Long estadovehiculo_id){
        this.vService.updateEstadoVehiculo(vehiculo_numero, estadovehiculo_id);
        return ResponseEntity.noContent().build();
    }
    
    @GetMapping("/disponibles")
    public List<VehiculoEntity> getVehiculoDisponible(){
        return this.vService.getVehiculoDisponible();
    }
}
