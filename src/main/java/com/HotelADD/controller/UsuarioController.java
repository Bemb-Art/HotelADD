/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.HotelADD.controller;

import com.HotelADD.entity.UsuarioEntity;
import com.HotelADD.service.UsuarioService;
import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author bonni
 */ 
@RestController
@RequestMapping ("/ingresos")
public class UsuarioController{
    private final UsuarioService uService;
    
    public UsuarioController(UsuarioService uService){
        this.uService = uService;
    }
    
    @GetMapping("/user/{userName}")
    public List<UsuarioEntity> getUsuario(@PathVariable("userName") String usuario_nombre){
        return this.uService.getUsuario(usuario_nombre);
    }
    
    @GetMapping("/log/{userName}")
    public Optional<UsuarioEntity> getComparacionC(@PathVariable("userName") String usuario_nombre){
        return this.uService.getComparacionC(usuario_nombre);
    }
}
