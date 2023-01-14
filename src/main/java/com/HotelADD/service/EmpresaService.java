/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.HotelADD.service;

import com.HotelADD.dto.CompanyDto;
import com.HotelADD.entity.EmpresasEntity;
import com.HotelADD.mapper.CompanyMapperImpl;
import com.HotelADD.repository.EmpresasRepository;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author bonni
 */
@Service
public class EmpresaService {
    private final EmpresasRepository repositorio;
    private final CompanyMapperImpl mapper;
    
    public EmpresaService(EmpresasRepository repositorio, CompanyMapperImpl mapper){
        this.repositorio = repositorio;
        this.mapper = mapper;
    }
    
    public EmpresasEntity createEmpresa(CompanyDto company) {
        EmpresasEntity empresa = mapper.toEmpresa(company);
        return this.repositorio.save(empresa);
    }
    
    public List<EmpresasEntity> getEmpresa(){
        return this.repositorio.findAll();
    }
}
