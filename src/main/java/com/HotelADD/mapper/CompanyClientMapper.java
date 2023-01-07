/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.HotelADD.mapper;

import com.HotelADD.dto.CompanyClientDto;
import com.HotelADD.entity.ClientesEmpresasEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

/**
 *
 * @author bonni
 */
@Mapper(componentModel = "spring", uses = {CompanyMapper.class})
public interface CompanyClientMapper {
    @Mappings({
        @Mapping(source = "clienteEmpresaIdentificacion", target = "companyClientId"),
        @Mapping(source = "clienteEmpresaNit", target = "companyClientNit"),
        @Mapping(source = "clienteEmpresaNombre1", target = "companyClientName1"),
        @Mapping(source = "clienteEmpresaNombre2", target = "companyClientName2"),
        @Mapping(source = "clienteEmpresaNombre3", target = "companyClientName3"),
        @Mapping(source = "clienteEmpresaApellido1", target = "companyClientLastname1"),
        @Mapping(source = "clienteEmpresaApellido2", target = "companyClientLastname2"), 
        @Mapping(source = "clienteEmpresaTelefono", target = "companyClientPhone"),
        @Mapping(source = "clienteEmpresaCorreo", target = "companyClientEmail"),   
        @Mapping(source = "empresaFk", target = "company")
    })
    CompanyClientDto toClient(ClientesEmpresasEntity clienteEmpresa);
    
    @InheritInverseConfiguration
    @Mapping(target = "clienteEmpresaId", ignore = true)        
    ClientesEmpresasEntity toClienteEmpresa(CompanyClientDto companyClient);
}
