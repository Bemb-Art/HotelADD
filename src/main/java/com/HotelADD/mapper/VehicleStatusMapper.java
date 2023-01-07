/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.HotelADD.mapper;

import com.HotelADD.dto.VehicleStatusDto;
import com.HotelADD.entity.EstadoVehiculoEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

/**
 *
 * @author bonni
 */
@Mapper(componentModel = "spring")
public interface VehicleStatusMapper {
    @Mappings({
        @Mapping(source = "estadoVehiculoDescripcion", target = "vehicleStatusDescripcion")
    })
    VehicleStatusDto toVehicleStatus(EstadoVehiculoEntity traslado);
    
    @InheritInverseConfiguration  
    @Mapping(target = "estadoVehiculoId", ignore = true)        
    EstadoVehiculoEntity toEstadoVehiculo(VehicleStatusDto vehicleStatus);
}
