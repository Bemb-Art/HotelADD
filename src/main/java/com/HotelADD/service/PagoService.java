/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.HotelADD.service;

import com.HotelADD.dto.PaymentDto;
import com.HotelADD.entity.PagoEntity;
import com.HotelADD.mapper.PaymentMapperImpl;
import com.HotelADD.repository.PagoRepository;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author bonni
 */
@Service
public class PagoService {
    private final PagoRepository repositorio;
    private final PaymentMapperImpl mapper;
    
    public PagoService(PagoRepository repositorio, PaymentMapperImpl mapper){
        this.repositorio = repositorio;
        this.mapper = mapper;
    }
    
    public PagoEntity createPago(PaymentDto payment) {
        PagoEntity pago = mapper.toPayment(payment);
        return this.repositorio.save(pago);
    }
    
    public List<PagoEntity> getPago(){
        return this.repositorio.findAll();
    }
}
