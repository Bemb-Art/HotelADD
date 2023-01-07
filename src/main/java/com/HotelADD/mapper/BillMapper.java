/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.HotelADD.mapper;

import com.HotelADD.dto.BillDto;
import com.HotelADD.entity.FacturaEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

/**
 *
 * @author bonni
 */
@Mapper(componentModel = "spring", uses = {ClientMapper.class, CompanyMapper.class, CreditMapper.class})
public interface BillMapper {
    @Mappings({
        @Mapping(source = "facturaNumero", target = "billNumber"),
        @Mapping(source = "facturaSerie", target = "billSerie"),
        @Mapping(source = "facturaTotal", target = "billTotal"),
        @Mapping(source = "facturaEstado", target = "billStatus"),
        @Mapping(source = "clienteParticularFk", target = "client"),
        @Mapping(source = "clienteEmpresaFk", target = "companyClient"),
        @Mapping(source = "creditoFk", target = "credit")
    })
    BillDto toBill(FacturaEntity Factura);
    
    @InheritInverseConfiguration
    @Mapping(target = "facturaId", ignore = true)
    FacturaEntity toFactura(BillDto bill);
}
