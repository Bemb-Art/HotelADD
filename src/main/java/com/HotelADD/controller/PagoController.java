/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.HotelADD.controller;

import com.HotelADD.dto.PaymentDto;
import com.HotelADD.entity.PagoEntity;
import com.HotelADD.service.PagoService;
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
@RequestMapping("/pagos")
public class PagoController {
    private final PagoService pService;
    
    public PagoController(PagoService pService){
        this.pService = pService;
    }
    
    @PostMapping
    public PagoEntity createPago(@RequestBody PaymentDto payment) {
       return this.pService.createPago(payment);
    }
    
    @GetMapping
    public List<PagoEntity> getPago(){
        return this.pService.getPago();
    }
}
