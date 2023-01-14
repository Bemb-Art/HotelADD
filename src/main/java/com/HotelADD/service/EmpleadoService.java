/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.HotelADD.service;

import com.HotelADD.dto.EmployeeDto;
import com.HotelADD.entity.EmpleadoEntity;
import com.HotelADD.mapper.EmployeeMapperImpl;
import com.HotelADD.repository.EmpleadoRepository;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author bonni
 */
@Service
public class EmpleadoService {
    private final EmpleadoRepository repositorio;
    private final EmployeeMapperImpl mapper;
    
    public EmpleadoService(EmpleadoRepository repositorio, EmployeeMapperImpl mapper){
        this.repositorio = repositorio;
        this.mapper = mapper;
    }
    
    public List<EmpleadoEntity> getEmpleado(){
        return this.repositorio.findAll();
    }
    
    public EmpleadoEntity createEmpleado(EmployeeDto employee) {
        EmpleadoEntity empleado = mapper.toEmpleado(employee);
        return this.repositorio.save(empleado);
    }
    
    
}
