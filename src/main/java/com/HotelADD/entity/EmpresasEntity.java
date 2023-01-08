/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.HotelADD.entity;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author bonni
 */
@Data
@Entity
@Table(name = "tb_empresas", schema = "clientes")
public class EmpresasEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "empresa_id")
    private Long empresaId;
    
    @Column(name = "empresa_nit")
    private String empresaNit;
    
    @Column(name = "empresa_nombre")
    private String empresaNombre;
    
    @Column(name = "empresa_telefono")
    private String empresaTelefono;
    
    @OneToMany(mappedBy = "empresafk")
    private List<ClientesEmpresasEntity> clienteEmpresa;

    public Long getEmpresaId() {
        return empresaId;
    }

    public void setEmpresaId(Long empresaId) {
        this.empresaId = empresaId;
    }

    public String getEmpresaNit() {
        return empresaNit;
    }

    public void setEmpresaNit(String empresaNit) {
        this.empresaNit = empresaNit;
    }

    public String getEmpresaNombre() {
        return empresaNombre;
    }

    public void setEmpresaNombre(String empresaNombre) {
        this.empresaNombre = empresaNombre;
    }

    public String getEmpresaTelefono() {
        return empresaTelefono;
    }

    public void setEmpresaTelefono(String empresaTelefono) {
        this.empresaTelefono = empresaTelefono;
    }
    
}
