/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.HotelADD.mapper;

import com.HotelADD.dto.TraslationDto;
import com.HotelADD.entity.TrasladoEntiy;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

/**
 *
 * @author bonni
 */
@Mapper(componentModel = "spring")
public interface TraslationMapper {
    @Mappings({
        @Mapping(source = "trasladoOrigen", target = "traslationOrigin"),
        @Mapping(source = "trasladoDestino", target = "traslationDestination"),
        @Mapping(source = "trasladoPrecio", target = "traslationPrice")
    })
    TraslationDto toTraslation(TrasladoEntiy traslado);
    
    @InheritInverseConfiguration  
    @Mapping(target = "trasladoId", ignore = true)        
    TrasladoEntiy toTraslado(TraslationDto traslation);
}
