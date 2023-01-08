/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.HotelADD.service;

import com.HotelADD.dto.CountryInDto;
import com.HotelADD.entity.PaisEntity;
import com.HotelADD.mapper.CountryInDtoToPais;
import com.HotelADD.mapper.CountryMapper;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author bonni
 */
@Service
public class PaisService {
    //private final CountryInDtoToPais mapper;
    //private final PaisRepository repository;

//    public PaisService(PaisRepository repo, CountryInDtoToPais mapper) {
//        this.repository = repo;
//        this.mapper = mapper;
//    }
//    
//    public PaisEntity createCountry(CountryInDto country){
//        PaisEntity pais = mapper.map(country);
//        return this.repository.save(pais);
//    }
//
//    public List<PaisEntity> findAll (){
//        return (List<PaisEntity>) this.repository.findAll();
//    }
}
