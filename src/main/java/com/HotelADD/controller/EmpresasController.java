/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.HotelADD.controller;

import com.HotelADD.dto.CompanyDto;
import com.HotelADD.entity.EmpresasEntity;
import com.HotelADD.service.EmpresaService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author bonni
 */
@RestController
@RequestMapping ("/empresas")
public class EmpresasController {
    private final EmpresaService eService;
    
    public EmpresasController(EmpresaService eService){
        this.eService = eService;
    }
    
    @PostMapping("/crearEmpresas")
    public EmpresasEntity createEmpresas(@RequestBody CompanyDto company) {
       return this.eService.createEmpresa(company);
    }
    
    @GetMapping("/obtenerEmpresas")
    public List<EmpresasEntity> getEmpresas(){
        return this.eService.getEmpresa();
    }
}
