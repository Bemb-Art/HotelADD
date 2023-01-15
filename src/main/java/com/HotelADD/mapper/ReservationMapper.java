/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.HotelADD.mapper;

import com.HotelADD.dto.ReservationDto;
import com.HotelADD.entity.ReservacionEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

/**
 *
 * @author bonni
 */
@Mapper(componentModel = "spring", uses = {ClientMapper.class, CompanyClientMapper.class, RoomMapper.class, ServiceMapper.class})
public interface ReservationMapper {
    @Mappings({
        @Mapping(source = "reservacionNumero", target = "reservationNumber"),
        @Mapping(source = "reservacionFechaInicio", target = "reservationEntry"),
        @Mapping(source = "reservacionFechaFin", target = "reservationExit"),
        @Mapping(source = "reservacionHuespedAdulto", target = "reservationAdult"),
        @Mapping(source = "reservacionNinio", target = "reservationKid"),
        @Mapping(source = "clienteParticularId", target = "clientId"),
        @Mapping(source = "clienteEmpresaId", target = "companyClientId"),
        @Mapping(source = "habitacionId", target = "roomId"),
        @Mapping(source = "servicioId", target = "serviceId")
    })
    ReservationDto toReservation(ReservacionEntity reservacion);
    
    @InheritInverseConfiguration   
    @Mapping(target = "clienteParticularFk", ignore = true)
    @Mapping(target = "clienteEmpresaFk", ignore = true)
    @Mapping(target = "habitacionFk", ignore = true)
    @Mapping(target = "serivicioFk", ignore = true)
    ReservacionEntity toReservacion(ReservationDto reservation);
}
