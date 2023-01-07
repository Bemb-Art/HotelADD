/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.HotelADD.mapper;

import com.HotelADD.dto.ServiceDto;
import com.HotelADD.entity.ServicioEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

/**
 *
 * @author bonni
 */
@Mapper(componentModel = "spring", uses = {VehicleRentalMapper.class, BreakfastMapper.class, TraslationMapper.class})
public interface ServiceMapper {
    @Mappings({
        @Mapping(source = "servicioDescripcion", target = "serviceDescription"),
        @Mapping(source = "rentaVehiculoFk", target = "vehicleRental"),
        @Mapping(source = "desayunoFk", target = "traslation"),
        @Mapping(source = "trasladoFk", target = "breakfast")
    })
    ServiceDto toService(ServicioEntity servicio);
    
    @InheritInverseConfiguration  
    @Mapping(target = "servicioId", ignore = true)        
    ServicioEntity toServicio(ServiceDto service);
}
