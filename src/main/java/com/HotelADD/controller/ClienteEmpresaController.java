/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.HotelADD.controller;

import com.HotelADD.dto.CompanyClientDto;
import com.HotelADD.entity.ClientesEmpresasEntity;
import com.HotelADD.service.ClienteEmpresaService;
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
@RequestMapping ("/clienteEmpresa")
public class ClienteEmpresaController {
    private final ClienteEmpresaService ceService;
    
    public ClienteEmpresaController(ClienteEmpresaService ceService){
        this.ceService = ceService;
    }
    
    @PostMapping("/CreateCliente")
    public ClientesEmpresasEntity createClienteE(@RequestBody CompanyClientDto companyC) {
       return this.ceService.createClienteE(companyC);
    }
    
    @GetMapping("/AllClientesEmpresa")
    public List<ClientesEmpresasEntity> getClienteE(){
        return this.ceService.getClienteE();
    }
}
