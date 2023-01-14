/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.HotelADD.service;

import com.HotelADD.dto.BillDto;
import com.HotelADD.entity.FacturaEntity;
import com.HotelADD.repository.FacturaRepository;
import org.springframework.stereotype.Service;
import com.HotelADD.mapper.BillMapperImpl;
import java.util.List;
import java.util.Optional;
/**
 *
 * @author bonni
 */
@Service
public class FacturaService {
    private final FacturaRepository repositorio;
    private final BillMapperImpl mapper;
    
    public FacturaService(FacturaRepository repositorio, BillMapperImpl mapper){
        this.repositorio = repositorio;
        this.mapper = mapper;
    }
    
    public Optional<FacturaEntity> getFacturaByNumber(Long id){
        return this.repositorio.findById(id);
    }
    
    public FacturaEntity createFactura(BillDto bill) {
        FacturaEntity factura = mapper.toFactura(bill);
        return this.repositorio.save(factura);
    }
    
    public List<FacturaEntity> getFactura(){
        return this.repositorio.findAll();
    }
}
