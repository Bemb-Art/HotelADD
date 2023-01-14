/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.HotelADD.repository;

import com.HotelADD.entity.VehiculoEntity;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author bonni
 */
public interface VehiculoRepository extends JpaRepository<VehiculoEntity, Long>{
    @Modifying
    @Query(value = "UPDATE servicios.tb_vehiculos SET estadovehiculo_id =:estadovehiculo_id\n" +
    "WHERE vehiculo_numero =:vehiculo_number", nativeQuery = true)
    public void updateEstadoVehiculo(@Param("vehiculo_number") Long vehiculo_number, @Param("estadovehiculo_id") Long estadovehiculo_id);
    
    @Query(value = "SELECT * FROM servicios.tb_vehiculos\n" +
    "WHERE estadovehiculo_id =1", nativeQuery = true)
    public List<VehiculoEntity> getVehiculoDisponible();
}
