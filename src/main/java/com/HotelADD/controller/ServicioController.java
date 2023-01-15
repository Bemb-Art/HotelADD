/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.HotelADD.controller;

import com.HotelADD.dto.ServiceDto;
import com.HotelADD.entity.ServicioEntity;
import com.HotelADD.service.ServicioService;
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
@RequestMapping("/servicios")
public class ServicioController {
    private final ServicioService sService;
    
    public ServicioController(ServicioService sService){
        this.sService = sService;
    }
    
    @PostMapping("/crearServicio")
    public ServicioEntity createServicio(@RequestBody ServiceDto service){
        return this.sService.createServicio(service);
    }
    
    @GetMapping("/obtenerServicio")
    public List<ServicioEntity> getServicio(){
        return this.sService.getServicio();
    }
}
