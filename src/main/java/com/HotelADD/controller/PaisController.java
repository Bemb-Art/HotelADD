/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.HotelADD.controller;

import com.HotelADD.entity.PaisEntity;
import com.HotelADD.service.PaisService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author bonni
 */
@RestController
@RequestMapping ("/paises")
public class PaisController {
    
    private final PaisService pService;

    public PaisController(PaisService pService) {
        this.pService = pService;
    }
    
    @GetMapping
    public List<PaisEntity> findAll (){
        return this.pService.findAll();
    }
}
