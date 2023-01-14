/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.HotelADD.repository;

import com.HotelADD.entity.FacturaEntity;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author bonni
 */
public interface FacturaRepository extends JpaRepository<FacturaEntity, Long>{
//    @Query(value = "SELECT * FROM cpc.tb_facturas\n" +
//    "WHERE factura_numero =:factura_numero", nativeQuery = true)
//    public List<FacturaEntity> obtenerFactura(@Param("factura_numero") String factura_numero);
}
