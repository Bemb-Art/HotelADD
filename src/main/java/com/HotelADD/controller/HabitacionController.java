/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.HotelADD.controller;

import com.HotelADD.entity.HabitacionEntity;
import com.HotelADD.service.HabitacionService;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author bonni
 */
@RestController
@RequestMapping ("/habitacion")
public class HabitacionController {
    private final HabitacionService hService;
    
    public HabitacionController(HabitacionService hService){
        this.hService = hService;
    }
    
    @GetMapping
    public List<HabitacionEntity> getHabitacion(){
        return this.hService.getHabitacion();
    }
    
    @PatchMapping("/estadoHabitacion/{id}{id}")
    public ResponseEntity<Void> updateEstadoHabitacion(Long habitacion_numero, Long estadohabitacion_id){
        this.hService.updateEstadoHabitacion(habitacion_numero, estadohabitacion_id);
        return ResponseEntity.noContent().build();
    }
}
