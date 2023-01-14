/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.HotelADD.controller;

import com.HotelADD.dto.BillDto;
import com.HotelADD.entity.FacturaEntity;
import com.HotelADD.service.FacturaService;
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
@RequestMapping ("/facturas")
public class FacturaController {
    private final FacturaService fService;
    
    public FacturaController(FacturaService fService){
        this.fService = fService;
    }
    
    @GetMapping("/factura/{numero}")
    public Optional<FacturaEntity> getFacturaByNumber(@PathVariable("numero") Long factura_numero){
        return this.fService.getFacturaByNumber(factura_numero);
    }
    
    @PostMapping
    public FacturaEntity createFactura(@RequestBody BillDto bill) {
       return this.fService.createFactura(bill);
    }
    
    @GetMapping
    public List<FacturaEntity> getFactura(){
        return this.fService.getFactura();
    }
}
