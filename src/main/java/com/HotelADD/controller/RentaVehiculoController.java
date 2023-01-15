/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.HotelADD.controller;

import com.HotelADD.dto.VehicleRentalDto;
import com.HotelADD.entity.RentaVehiculoEntity;
import com.HotelADD.service.RentaVehiculoService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author bonni
 */
@RestController
@RequestMapping ("/rentaVehiculo")
public class RentaVehiculoController {
    private final RentaVehiculoService rService;
    
    public RentaVehiculoController(RentaVehiculoService rService){
        this.rService = rService;
    }
    
    @GetMapping("/obtenerRentaVeh")
    public List<RentaVehiculoEntity> getRentaVehiculo(){
        return this.rService.getRentaVehiculo();
    }
    
    @PostMapping("/crearRentaVeh")
    public RentaVehiculoEntity createRentaVehiculo(@RequestBody VehicleRentalDto vehicleRental) {
       return this.rService.createRentaVehiculo(vehicleRental);
    }
}
