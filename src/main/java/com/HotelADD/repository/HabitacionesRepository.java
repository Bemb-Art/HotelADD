/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.HotelADD.repository;

import com.HotelADD.entity.HabitacionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author bonni
 */
public interface HabitacionesRepository extends JpaRepository<HabitacionEntity, Long>{
    
    @Modifying
    @Query(value = "UPDATE hotel.tb_habitaciones SET estadohabitacion_id =:estadohabitacion_id\n" +
    "WHERE habitacion_numero =:habitacion_number", nativeQuery = true)
    public void updateEstadoHabitacion(@Param("habitacion_number") Long habitacion_number, @Param("estadohabitacion_id") Long estadohabitacion_id);
}
