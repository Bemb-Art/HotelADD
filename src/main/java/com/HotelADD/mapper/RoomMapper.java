/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.HotelADD.mapper;

import com.HotelADD.dto.RoomDto;
import com.HotelADD.entity.HabitacionEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

/**
 *
 * @author bonni
 */
@Mapper(componentModel = "spring", uses = {RoomStatusMapper.class, UserMapper.class, MaintenanceMapper.class})
public interface RoomMapper {
    @Mappings({
        @Mapping(source = "habitacionId", target = "roomId"),
        @Mapping(source = "habitacionTipo", target = "roomType"),
        @Mapping(source = "habitacionCamas", target = "roomBed"),
        @Mapping(source = "habitacionDescripcion", target = "roomDescription"),
        @Mapping(source = "habitacionExterior", target = "roomOutside"),
        @Mapping(source = "habitacionPrecioEstandar", target = "roomStandarPrice"),
        @Mapping(source = "habitacionFinDeSemana", target = "roomWeekendPrice"),
        @Mapping(source = "estadoHabitacionFk", target = "roomStatus"),
        @Mapping(source = "usuarioFk", target = "user"),
        @Mapping(source = "mantenimientoFk", target = "maintenance")    
    })
    RoomDto toRoom(HabitacionEntity habitacion);
    
    @InheritInverseConfiguration        
    HabitacionEntity toHabitacion(RoomDto room);
}
