/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.HotelADD.repository;

import com.HotelADD.crud.PaisCrudRepository;
import com.HotelADD.entity.PaisEntity;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author bonni
 */
@Repository
public class PaisRepository {
    private PaisCrudRepository paisCrud;
    
    public List<PaisEntity> getAll(){
        return (List<PaisEntity>) paisCrud.findAll();
    }
}
