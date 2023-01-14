/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.HotelADD.service;

import com.HotelADD.Exceptions;
import com.HotelADD.entity.VehiculoEntity;
import com.HotelADD.repository.VehiculoRepository;
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
public class VehiculoService {
    private final VehiculoRepository repositorio;
    
    public VehiculoService(VehiculoRepository repositorio){
        this.repositorio = repositorio;
    }
    
    @Transactional
    public void updateEstadoVehiculo(Long vehiculo_numero, Long estadovehiculo_id){
        Optional<VehiculoEntity> optionalVehiculo = this.repositorio.findById(vehiculo_numero);
        if (optionalVehiculo.isEmpty()) {
            throw new Exceptions("Vehicle not found", HttpStatus.NOT_FOUND);
        }
        this.repositorio.updateEstadoVehiculo(vehiculo_numero, estadovehiculo_id);
    }
    
    public List<VehiculoEntity> getVehiculoDisponible(){
        return this.repositorio.getVehiculoDisponible();
    }
}
