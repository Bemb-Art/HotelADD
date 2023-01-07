/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.HotelADD.mapper;

import com.HotelADD.dto.BreakfastDto;
import com.HotelADD.entity.DesayunoEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

/**
 *
 * @author bonni
 */
@Mapper(componentModel = "spring")
public interface BreakfastMapper {
    @Mappings({
        @Mapping(source = "desayunoNombre", target = "breakfastName"),
        @Mapping(source = "desayunoDescripcion", target = "breakfasDescription"),
        @Mapping(source = "desayunoPrecio", target = "breakfasPrice")
    })
    BreakfastDto toBreakfast(DesayunoEntity desayuno);
    
    @InheritInverseConfiguration
    @Mapping(target = "desayunoId", ignore = true)
    DesayunoEntity toFactura(BreakfastDto breakfast);
}
