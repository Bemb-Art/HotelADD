/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.HotelADD.service;

import com.HotelADD.dto.ClientDto;
import com.HotelADD.entity.ClienteParticularEntity;
import com.HotelADD.mapper.ClientMapperImpl;
import com.HotelADD.repository.ClienteParticularRepository;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author bonni
 */
@Service
public class ClienteParticularService {
    private final ClienteParticularRepository repositorio;
    private final ClientMapperImpl mapper;
    
    public ClienteParticularService(ClienteParticularRepository repositorio, ClientMapperImpl mapper){
        this.repositorio = repositorio;
        this.mapper = mapper;
    }
    
    public ClienteParticularEntity createClienteP(ClientDto client) {
        ClienteParticularEntity clienteP = mapper.toCliente(client);
        return this.repositorio.save(clienteP);
    }
    
    public List<ClienteParticularEntity> getClienteP(){
        return this.repositorio.findAll();
    }
    
}
