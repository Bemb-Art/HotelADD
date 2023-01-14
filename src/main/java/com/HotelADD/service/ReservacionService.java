/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.HotelADD.service;

import com.HotelADD.dto.ReservationDto;
import com.HotelADD.entity.ReservacionEntity;
import com.HotelADD.mapper.ReservationMapperImpl;
import com.HotelADD.repository.ReservacionCrudRepository;
import java.util.List;
import java.util.Optional;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Service;

/**
 *
 * @author bonni
 */
@Service
public class ReservacionService {
    private final ReservacionCrudRepository repositorio;
    private final ReservationMapperImpl mapper;
    
    public ReservacionService(ReservacionCrudRepository repositorio, ReservationMapperImpl mapper){
        this.repositorio = repositorio;
        this.mapper = mapper;
    }
    
    public ReservacionEntity createReservacion(ReservationDto reservation) {
        ReservacionEntity reservacion = mapper.toReservacion(reservation);
        return this.repositorio.save(reservacion);
    }
    
    public List<ReservacionEntity> getReservacion(){
        return this.repositorio.findAll();
    }
    
    public Optional<ReservacionEntity> getReservacionByNumber(Long id){
        return this.repositorio.findById(id);
    }
}
