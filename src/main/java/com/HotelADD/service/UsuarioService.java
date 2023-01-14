/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.HotelADD.service;

import com.HotelADD.entity.UsuarioEntity;
import com.HotelADD.repository.UsuarioRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

/**
 *
 * @author bonni
 */
@Service
public class UsuarioService {
    private final UsuarioRepository repositorio;
    
    public UsuarioService(UsuarioRepository repositorio){
        this.repositorio = repositorio;
    }
    
    public List<UsuarioEntity> getUsuario(String usuario_nombre){
        return this.repositorio.obtenerUsuario(usuario_nombre);
    }
    
    public Optional<UsuarioEntity> getComparacionC(String usuario_nombre){
        return this.repositorio.comparacionC(usuario_nombre);
    }
}
