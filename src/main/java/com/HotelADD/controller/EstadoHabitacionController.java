/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.HotelADD.controller;

import com.HotelADD.dto.RoomStatusDto;
import com.HotelADD.entity.EstadoHabitacionEntity;
import com.HotelADD.service.EstadoHabitacionService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author steven Garcia
 */
@RestController
@RequestMapping ("/estadoHabitacion")
public class EstadoHabitacionController {
    private final EstadoHabitacionService eService;
    
    public EstadoHabitacionController(EstadoHabitacionService eService){
        this.eService = eService;
    }
    
    @PostMapping("/crearEstado")
    public EstadoHabitacionEntity createEstado(@RequestBody RoomStatusDto roomStatus) {
       return this.eService.createEstadoH(roomStatus);
    }
}
