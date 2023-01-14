/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.HotelADD.service;

import com.HotelADD.dto.CompanyClientDto;
import com.HotelADD.entity.ClientesEmpresasEntity;
import com.HotelADD.mapper.CompanyClientMapperImpl;
import com.HotelADD.repository.ClienteEmpresaRepository;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author bonni
 */
@Service
public class ClienteEmpresaService {
    private final ClienteEmpresaRepository repositorio;
    private final CompanyClientMapperImpl mapper;
    
    public ClienteEmpresaService(ClienteEmpresaRepository repositorio, CompanyClientMapperImpl mapper){
        this.repositorio = repositorio;
        this.mapper = mapper;
    }
    
    public ClientesEmpresasEntity createClienteE(CompanyClientDto companyC) {
        ClientesEmpresasEntity clienteE = mapper.toClienteEmpresa(companyC);
        return this.repositorio.save(clienteE);
    }
    
    public List<ClientesEmpresasEntity> getClienteE(){
        return this.repositorio.findAll();
    }
}
