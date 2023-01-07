/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.HotelADD.mapper;

import com.HotelADD.dto.ClientDto;
import com.HotelADD.entity.ClienteParticularEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

/**
 *
 * @author bonni
 */
@Mapper(componentModel = "spring")
public interface ClientMapper {
    @Mappings({
        @Mapping(source = "clienteParticularIdentificacion", target = "clientId"),
        @Mapping(source = "clienteParticularNit", target = "clientNit"),
        @Mapping(source = "clienteParticularNombre1", target = "clientName1"),
        @Mapping(source = "clienteParticularNombre2", target = "clientName2"),
        @Mapping(source = "clienteParticularNombre3", target = "clientName3"),
        @Mapping(source = "clienteParticularApellido1", target = "clientLastname1"),
        @Mapping(source = "clienteParticularApellido2", target = "clientLastname2"), 
        @Mapping(source = "clienteParticularTelefono", target = "clientPhone"),
        @Mapping(source = "clienteParticularCorreo", target = "clientEmail"),        
    })
    ClientDto toClient(ClienteParticularEntity clienteParticular);
    
    @InheritInverseConfiguration
    @Mapping(target = "clienteParticularId", ignore = true)        
    ClienteParticularEntity toCliente(ClientDto client);
}
