/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.HotelADD.service;

import com.HotelADD.dto.ServiceDto;
import com.HotelADD.entity.ServicioEntity;
import com.HotelADD.mapper.ServiceMapperImpl;
import com.HotelADD.repository.ServicioRepository;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author bonni
 */
@Service
public class ServicioService {
    private final ServicioRepository repositorio;
    private final ServiceMapperImpl mapper;
    
    public ServicioService(ServicioRepository repositorio, ServiceMapperImpl mapper){
        this.repositorio = repositorio;
        this.mapper = mapper;
    }
    
    public ServicioEntity createServicio(ServiceDto service) {
        ServicioEntity servicio = mapper.toServicio(service);
        return this.repositorio.save(servicio);
    }
    
    public List<ServicioEntity> getServicio(){
        return this.repositorio.findAll();
    }
}
