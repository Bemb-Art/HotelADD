/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.HotelADD.mapper;

import com.HotelADD.dto.PaymentDto;
import com.HotelADD.entity.PagoEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

/**
 *
 * @author bonni
 */
@Mapper(componentModel = "spring", uses = {ClientMapper.class, CompanyClientMapper.class, CreditMapper.class})
public interface PaymentMapper {
    @Mappings({
        @Mapping(source = "pagoNumero", target = "paymentNumber"),
        @Mapping(source = "pagoTotal", target = "paymentTotal"),
        @Mapping(source = "pagoFecha", target = "paymentDate"),
        @Mapping(source = "clienteParticularId", target = "companyClientId"),
        @Mapping(source = "clienteEmpresaId", target = "clientId"),
        @Mapping(source = "creditoId", target = "creditId"),
    })
    PaymentDto toPayment(PagoEntity pago);
    
    @InheritInverseConfiguration    
    @Mapping(target = "clienteParticularFk", ignore = true)
    @Mapping(target = "clienteEmpresaFk", ignore = true)
    @Mapping(target = "creditoFk", ignore = true)
    PagoEntity toPayment(PaymentDto payment);
}
