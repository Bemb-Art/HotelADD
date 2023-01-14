/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.HotelADD.controller;

import com.HotelADD.dto.MaintenanceDto;
import com.HotelADD.entity.MantenimientoEntity;
import com.HotelADD.service.MantenimientoService;
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
@RequestMapping ("/mantenimientos")
public class MantenimientoController {
    private final MantenimientoService mService;
    
    public MantenimientoController(MantenimientoService mService){
        this.mService = mService;
    }
    
    @PostMapping
    public MantenimientoEntity createMantenimiento(@RequestBody MaintenanceDto maintenance) {
       return this.mService.createMantenimiento(maintenance);
    }
    
    @GetMapping
    public List<MantenimientoEntity> getMantenimiento(){
        return this.mService.getMantenimiento();
    }
}
