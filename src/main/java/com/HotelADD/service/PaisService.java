/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.HotelADD.service;

import com.HotelADD.crud.PaisCrudRepository;
import com.HotelADD.repository.PaisRepository;
import com.HotelADD.entity.PaisEntity;
import com.HotelADD.mapper.CountryMapper;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author bonni
 */
@Service
public class PaisService {
    private final PaisCrudRepository repo;
    private final CountryMapper mapper;
    private final PaisRepository repository;

    public PaisService(PaisRepository repo, CountryMapper mapper, PaisCrudRepository repository) {
        this.repository = repo;
        this.mapper = mapper;
        this.repo = repository;
    }

    public List<PaisEntity> findAll (){
        return (List<PaisEntity>) this.repo.findAll();
    }
}
