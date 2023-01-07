/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.HotelADD.mapper;

import com.HotelADD.dto.VehicleRentalDto;
import com.HotelADD.entity.RentaVehiculoEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

/**
 *
 * @author bonni
 */
@Mapper(componentModel = "spring", uses = {VehicleMapper.class})
public interface VehicleRentalMapper {
    @Mappings({
        @Mapping(source = "rentaVehiculoFechaInicio", target = "vehicleRentalStartDate"),
        @Mapping(source = "rentaVehiculoFechaFin", target = "vehicleRentalEndDate"),
        @Mapping(source = "rentaVehiculoPrecio", target = "vehicleRentalPrice"),
        @Mapping(source = "vehiculoFk", target = "vehicle")
    })
    VehicleRentalDto toVehicleRental(RentaVehiculoEntity rentaVehiculo);
    
    @InheritInverseConfiguration  
    @Mapping(target = "rentaVehiculoId", ignore = true)        
    RentaVehiculoEntity toRentaVehiculo(VehicleRentalDto vehicleRental);
}
