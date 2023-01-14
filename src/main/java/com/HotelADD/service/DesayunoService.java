/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.HotelADD.service;

import com.HotelADD.entity.DesayunoEntity;
import com.HotelADD.repository.DesayunoRepository;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author bonni
 */
@Service
public class DesayunoService {
    private final  DesayunoRepository repositorio;
    
    public DesayunoService(DesayunoRepository repositorio){
        this.repositorio = repositorio;
    }
    
    public List<DesayunoEntity> getDesayuno(){
        return this.repositorio.findAll();
    }
}
