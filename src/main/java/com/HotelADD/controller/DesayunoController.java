/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.HotelADD.controller;

import com.HotelADD.entity.DesayunoEntity;
import com.HotelADD.service.DesayunoService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author bonni
 */
@RestController
@RequestMapping ("/desayuno")
public class DesayunoController {
    private final DesayunoService dService;
    
    public DesayunoController(DesayunoService dService){
        this.dService = dService;
    }
    
    @GetMapping("/obtenerDesayuno")
    public List<DesayunoEntity> getDesayuno(){
        return this.dService.getDesayuno();
    }
}
