/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.HotelADD.service;

import com.HotelADD.dto.CreditDto;
import com.HotelADD.entity.CreditoEntity;
import com.HotelADD.mapper.CreditMapperImpl;
import com.HotelADD.repository.CreditoRepository;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author bonni
 */
@Service
public class CreditoService {
    private final CreditoRepository repositorio;
    private final CreditMapperImpl mapper;
    
    public CreditoService(CreditoRepository repositorio, CreditMapperImpl mapper){
        this.repositorio = repositorio;
        this.mapper = mapper;
    }
    
    public CreditoEntity createCredito(CreditDto credit) {
        CreditoEntity credito = mapper.toCredito(credit);
        return this.repositorio.save(credito);
    }
    
    public List<CreditoEntity> getCredito(){
        return this.repositorio.findAll();
    }
}
