/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.HotelADD.controller;

import com.HotelADD.dto.ReservationDto;
import com.HotelADD.entity.ReservacionEntity;
import com.HotelADD.service.ReservacionService;
import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author bonni
 */
@RestController
@RequestMapping ("/reservaciones")
public class ReservacionController {
    private final ReservacionService rService;
    
    public ReservacionController(ReservacionService rService){
        this.rService = rService;
    }
    
    @PostMapping("/crearReservacion")
    public ReservacionEntity createReservacion(@RequestBody ReservationDto reservation) {
       return this.rService.createReservacion(reservation);
    }
    
    @GetMapping("/obtenerReservacion")
    public List<ReservacionEntity> getReservacion(){
        return this.rService.getReservacion();
    }
    
    @GetMapping("/reservacion/{numero}")
    public Optional<ReservacionEntity> getReservacionByNumber(@PathVariable("numero") Long reservacion_numero){
        return this.rService.getReservacionByNumber(reservacion_numero);
    }
}
