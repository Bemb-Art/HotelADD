/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.HotelADD.mapper;

import com.HotelADD.dto.DirectionDto;
import com.HotelADD.entity.DireccionEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

/**
 *
 * @author bonni
 */
@Mapper(componentModel = "spring", uses = {CountryMapper.class})
public interface DirectionMapper {
    @Mappings({
        @Mapping(source = "direccionDescripcion", target = "directionDescription"),
        @Mapping(source = "paisFk", target = "country")
    })
    DirectionDto toDirection(DireccionEntity direccion);
    
    @InheritInverseConfiguration
    @Mapping(target = "direccionId", ignore = true)        
    DireccionEntity toDireccion(DirectionDto direction);
}
