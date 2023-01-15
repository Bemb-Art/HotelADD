/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.HotelADD.mapper;

import com.HotelADD.dto.RoomStatusDto;
import com.HotelADD.entity.EstadoHabitacionEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

/**
 *
 * @author bonni
 */
@Mapper(componentModel = "spring")
public interface RoomStatusMapper {
    @Mappings({
        @Mapping(source = "estadoHabitacionTipo", target = "roomStatusType"),
        @Mapping(source = "mantenimientoId", target = "maintenanceId")    
    })
    RoomStatusDto toRoomStatus(EstadoHabitacionEntity estadoHabitacion);
    
    @InheritInverseConfiguration
    @Mapping(target = "estadoHabitacionId", ignore = true)
    EstadoHabitacionEntity toEstadoHabitacion(RoomStatusDto roomStatus);
}
