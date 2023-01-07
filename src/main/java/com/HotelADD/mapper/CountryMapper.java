/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.HotelADD.mapper;

import com.HotelADD.dto.CountryDto;
import com.HotelADD.entity.PaisEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

/**
 *
 * @author bonni
 */
@Mapper(componentModel = "spring")
public interface CountryMapper {
    @Mappings({
        @Mapping(source = "paisNombre", target = "countryName"),
        @Mapping(source = "paisCodigoPostal", target = "countryPostalCode")
    })
    CountryDto toCountry(PaisEntity empresa);
    
    @InheritInverseConfiguration
    @Mapping(target = "paisId", ignore = true)        
    PaisEntity toPais(CountryDto country);
}
