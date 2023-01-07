/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.HotelADD.mapper;

import com.HotelADD.dto.UserDto;
import com.HotelADD.entity.UsuarioEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

/**
 *
 * @author bonni
 */
@Mapper(componentModel = "spring", uses = {EmployeeMapper.class})
public interface UserMapper {
    @Mappings({
        @Mapping(source = "usuarioId", target = "userId"),
        @Mapping(source = "usuarioNombre", target = "userName"),
        @Mapping(source = "usuarioContrasenia", target = "userPasword"),
        @Mapping(source = "empleadoFk", target = "employee")
    })
    UserDto toUser(UsuarioEntity usuario);
    
    @InheritInverseConfiguration         
    UsuarioEntity toUsuario(UserDto user);
}
