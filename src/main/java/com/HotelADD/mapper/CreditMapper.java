/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.HotelADD.mapper;

import com.HotelADD.dto.CreditDto;
import com.HotelADD.entity.CreditoEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

/**
 *
 * @author bonni
 */
@Mapper(componentModel = "spring", uses = {CompanyClientMapper.class})
public interface CreditMapper {
    @Mappings({
        @Mapping(source = "creditoNumero", target = "creditNumber"),
        @Mapping(source = "creditoTotal", target = "creditTotal"),
        @Mapping(source = "creditoDias", target = "creditDays"),
        @Mapping(source = "creditoEstado", target = "creditStatus"),
        @Mapping(source = "clienteEmpresaFk", target = "companyClient")
    })
    CreditDto toCredit(CreditoEntity credito);
    
    @InheritInverseConfiguration        
    CreditoEntity toCredito(CreditDto credit);
}
