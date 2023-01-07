/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.HotelADD.mapper;

import com.HotelADD.dto.CompanyDto;
import com.HotelADD.entity.EmpresasEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

/**
 *
 * @author bonni
 */
@Mapper(componentModel = "spring")
public interface CompanyMapper {
    @Mappings({
        @Mapping(source = "empresaNit", target = "companyNit"),
        @Mapping(source = "empresaNombre", target = "companyName"),
        @Mapping(source = "empresaTelefono", target = "companyPhone")
    })
    CompanyDto toCompany(EmpresasEntity empresa);
    
    @InheritInverseConfiguration
    @Mapping(target = "empresaId", ignore = true)        
    EmpresasEntity toEmpresa(CompanyDto company);
}
