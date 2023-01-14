/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.HotelADD.controller;

import com.HotelADD.dto.ClientDto;
import com.HotelADD.entity.ClienteParticularEntity;
import com.HotelADD.service.ClienteParticularService;
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
@RequestMapping ("/clienteP")
public class ClienteParticularController {
    private final ClienteParticularService cpService;
    
    public ClienteParticularController(ClienteParticularService cpService){
        this.cpService = cpService;
    }
    
    @PostMapping
    public ClienteParticularEntity createClienteP(@RequestBody ClientDto client) {
       return this.cpService.createClienteP(client);
    }
    
    @GetMapping
    public List<ClienteParticularEntity> getClienteP(){
        return this.cpService.getClienteP();
    }
}
