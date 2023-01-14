/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.HotelADD.repository;

import com.HotelADD.entity.UsuarioEntity;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author bonni
 */
public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long>{
    
    @Query(value = "SELECT * FROM administracion.tb_usuarios\n" +
    "WHERE usuario_nombre =:usuario_nombre", nativeQuery = true)
    public List<UsuarioEntity> obtenerUsuario(@Param("usuario_nombre") String usuario_nombre);
    
    @Query(value = "SELECT usuario_contrasenia FROM administracion.tb_usuarios\n" +
    "WHERE usuario_nombre =:usuario_nombre", nativeQuery = true)
    public Optional<UsuarioEntity> comparacionC(@Param("usuario_nombre") String usuario_nombre);
    
}
