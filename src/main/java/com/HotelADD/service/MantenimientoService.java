/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.HotelADD.service;

import com.HotelADD.dto.MaintenanceDto;
import com.HotelADD.entity.MantenimientoEntity;
import com.HotelADD.mapper.MaintenanceMapperImpl;
import com.HotelADD.repository.MantenimientoRepository;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author bonni
 */
@Service
public class MantenimientoService {
    private final MantenimientoRepository repositorio;
    private final MaintenanceMapperImpl mapper;
    
    public MantenimientoService(MantenimientoRepository repositorio, MaintenanceMapperImpl mapper){
        this.repositorio = repositorio;
        this.mapper = mapper;
    }
    
    public MantenimientoEntity createMantenimiento(MaintenanceDto maintenance) {
        MantenimientoEntity mantenimiento = mapper.toMantenimiento(maintenance);
        return this.repositorio.save(mantenimiento);
    }
    
    public List<MantenimientoEntity> getMantenimiento(){
        return this.repositorio.findAll();
    }
}
