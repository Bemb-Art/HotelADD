/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.HotelADD.service;

import com.HotelADD.entity.TrasladoEntity;
import com.HotelADD.repository.TrasladoRepository;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author bonni
 */
@Service
public class TrasladoService {
    private final TrasladoRepository repositorio;
    
    public TrasladoService(TrasladoRepository repositorio){
        this.repositorio = repositorio;
    }
    
    public List<TrasladoEntity> getTraslado(){
        return this.repositorio.findAll();
    }
}
