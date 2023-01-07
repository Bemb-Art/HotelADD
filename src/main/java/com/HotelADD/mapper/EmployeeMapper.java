/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.HotelADD.mapper;

import com.HotelADD.dto.EmployeeDto;
import com.HotelADD.entity.EmpleadoEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

/**
 *
 * @author bonni
 */
@Mapper(componentModel = "spring")
public interface EmployeeMapper {
    @Mappings({
        @Mapping(source = "empleadoId", target = "employeeId"),
        @Mapping(source = "empleadoNombre1", target = "employeeName1"),
        @Mapping(source = "empleadoNombre2", target = "employeeName2"),
        @Mapping(source = "empleadoNombre3", target = "employeeName3"),
        @Mapping(source = "empleadoApellido1", target = "employeeLastname1"),
        @Mapping(source = "empleadoApellido2", target = "employeeLastname2"),
        @Mapping(source = "empleadoTelefono", target = "employeePhone"),
        @Mapping(source = "empleadoCorreo", target = "employeeEmail"),
    })
    EmployeeDto toEmployee(EmpleadoEntity empleado);
    
    @InheritInverseConfiguration      
    EmpleadoEntity toEmpleado(EmployeeDto employee);
}
