/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.HotelADD.mapper;

import com.HotelADD.dto.VehicleDto;
import com.HotelADD.entity.VehiculoEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

/**
 *
 * @author bonni
 */
@Mapper(componentModel = "spring", uses = {VehicleStatusMapper.class})
public interface VehicleMapper {
    @Mappings({
        @Mapping(source = "vehiculoId", target = "vehicleId"),
        @Mapping(source = "vehiculoMarca", target = "vehicleMark"),
        @Mapping(source = "vehiculoTipo", target = "vehicleType"),
        @Mapping(source = "vehiculoPlaca", target = "vehiclePlaque"),
        @Mapping(source = "estadoVehiculoFk", target = "vehicleStatus")
    })
    VehicleDto toVehicle(VehiculoEntity vehiculo);
    
    @InheritInverseConfiguration          
    VehiculoEntity toVehiculo(VehicleDto vehicle);
}
