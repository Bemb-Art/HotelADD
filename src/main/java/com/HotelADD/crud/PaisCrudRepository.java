/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.HotelADD.crud;

import com.HotelADD.entity.PaisEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author bonni
 */
public interface PaisCrudRepository extends CrudRepository<PaisEntity, Long>{
    
}
