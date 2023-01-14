/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.HotelADD.controller;

import com.HotelADD.entity.TrasladoEntity;
import com.HotelADD.service.TrasladoService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author bonni
 */
@RestController
@RequestMapping ("/traslado")
public class TrasladoController {
    private final TrasladoService tService;
    
    public TrasladoController(TrasladoService tService){
        this.tService = tService;
    }
    
    @GetMapping
    public List<TrasladoEntity> getTrasladon(){
        return this.tService.getTraslado();
    }
}
