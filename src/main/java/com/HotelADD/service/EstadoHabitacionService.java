/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.HotelADD.service;

import com.HotelADD.dto.RoomStatusDto;
import com.HotelADD.entity.EstadoHabitacionEntity;
import com.HotelADD.mapper.RoomStatusMapperImpl;
import com.HotelADD.repository.EstadoHabitacionRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author steven Garcia
 */
@Service
public class EstadoHabitacionService {
    private final  EstadoHabitacionRepository repositorio;
    private final RoomStatusMapperImpl mapper;
    
    public EstadoHabitacionService(EstadoHabitacionRepository repositorio, RoomStatusMapperImpl mapper){
        this.repositorio = repositorio;
        this.mapper = mapper;
    }
    
    public EstadoHabitacionEntity createEstadoH(RoomStatusDto roomStatus) {
        EstadoHabitacionEntity estadoH = mapper.toEstadoHabitacion(roomStatus);
        return this.repositorio.save(estadoH);
    }
}
