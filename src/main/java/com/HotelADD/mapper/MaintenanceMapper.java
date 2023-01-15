/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.HotelADD.mapper;

import com.HotelADD.dto.MaintenanceDto;
import com.HotelADD.entity.MantenimientoEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

/**
 *
 * @author bonni
 */
@Mapper(componentModel = "spring", uses = {UserMapper.class})
public interface MaintenanceMapper {
    @Mappings({
        @Mapping(source = "mantenimientoDescripcion", target = "maintenanceDescription"),
        @Mapping(source = "usuarioId", target = "userId")
    })
    MaintenanceDto toMaintenance(MantenimientoEntity mantenimiento);
    
    @InheritInverseConfiguration  
    @Mapping(target = "mantenimientoId", ignore = true)      
    @Mapping(target = "usuarioFk", ignore = true)
    MantenimientoEntity toMantenimiento(MaintenanceDto maintenance);
}
