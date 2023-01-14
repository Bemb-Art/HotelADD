/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.HotelADD.service;

import com.HotelADD.Exceptions;
import com.HotelADD.entity.HabitacionEntity;
import com.HotelADD.repository.HabitacionesRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author bonni
 */
@Service
public class HabitacionService {
    private final HabitacionesRepository repositorio;
    
    public HabitacionService(HabitacionesRepository repositorio){
        this.repositorio = repositorio;
    }
    
    public List<HabitacionEntity> getHabitacion(){
        return this.repositorio.findAll();
    }
    
    @Transactional
    public void updateEstadoHabitacion(Long habitacion_numero, Long estadohabitacion_id){
        Optional<HabitacionEntity> optionalHabitacion = this.repositorio.findById(habitacion_numero);
        if (optionalHabitacion.isEmpty()) {
            throw new Exceptions("Room not found", HttpStatus.NOT_FOUND);
        }
        this.repositorio.updateEstadoHabitacion(habitacion_numero, estadohabitacion_id);
    }
}
