/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.HotelADD.controller;

import com.HotelADD.dto.EmployeeDto;
import com.HotelADD.entity.EmpleadoEntity;
import com.HotelADD.service.EmpleadoService;
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
@RequestMapping ("/empleado")
public class EmpleadoController {
    private final EmpleadoService eService;
    
    public EmpleadoController(EmpleadoService eService){
        this.eService = eService;
    }
    
    @GetMapping("/allEmployes")
    public List<EmpleadoEntity> getEmpleado(){
        return this.eService.getEmpleado();
    }
    
    @PostMapping("/CreateEmploye")
    public EmpleadoEntity createEmpleado(@RequestBody EmployeeDto employee) {
       return this.eService.createEmpleado(employee);
    }
}
