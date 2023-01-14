/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.HotelADD.service;

import com.HotelADD.dto.VehicleRentalDto;
import com.HotelADD.entity.RentaVehiculoEntity;
import com.HotelADD.mapper.VehicleRentalMapperImpl;
import com.HotelADD.repository.RentaVehiculoRepository;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author bonni
 */
@Service
public class RentaVehiculoService {
    private final RentaVehiculoRepository repositorio;
    private final VehicleRentalMapperImpl mapper;
    
    public RentaVehiculoService(RentaVehiculoRepository repositorio, VehicleRentalMapperImpl mapper){
        this.repositorio = repositorio;
        this.mapper = mapper;
    }
    
    public List<RentaVehiculoEntity> getRentaVehiculo(){
        return this.repositorio.findAll();
    }
    
    public RentaVehiculoEntity createRentaVehiculo(VehicleRentalDto vehicleRental) {
        RentaVehiculoEntity rentaVehiculo = mapper.toRentaVehiculo(vehicleRental);
        return this.repositorio.save(rentaVehiculo);
    }
}