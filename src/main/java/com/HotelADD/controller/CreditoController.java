/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.HotelADD.controller;

import com.HotelADD.dto.CreditDto;
import com.HotelADD.entity.CreditoEntity;
import com.HotelADD.service.CreditoService;
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
@RequestMapping ("/credito")
public class CreditoController {
    private final CreditoService cService;
    
    public CreditoController(CreditoService cService){
        this.cService = cService;
    }
    
    @PostMapping("/createCredito")
    public CreditoEntity createCredito(@RequestBody CreditDto credit) {
       return this.cService.createCredito(credit);
    }
    
    @GetMapping("/obtenerCredito")
    public List<CreditoEntity> getCredito(){
        return this.cService.getCredito();
    }
}
