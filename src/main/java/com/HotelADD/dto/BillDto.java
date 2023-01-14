/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.HotelADD.dto;

import java.math.BigDecimal;

/**
 *
 * @author bonni
 */
public class BillDto {    
    private Long billNumber;
    private String billSerie;
    private BigDecimal billTotal;
    private String billStatus;
    private ClientDto client;
    private CompanyClientDto companyClient;
    private CreditDto credit;
    private ServiceDto service;

    public Long getBillNumber() {
        return billNumber;
    }

    public void setBillNumber(Long billNumber) {
        this.billNumber = billNumber;
    }

    public String getBillSerie() {
        return billSerie;
    }

    public void setBillSerie(String billSerie) {
        this.billSerie = billSerie;
    }

    public BigDecimal getBillTotal() {
        return billTotal;
    }

    public void setBillTotal(BigDecimal billTotal) {
        this.billTotal = billTotal;
    }

    public String getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(String billStatus) {
        this.billStatus = billStatus;
    }

    public ClientDto getClient() {
        return client;
    }

    public void setClient(ClientDto client) {
        this.client = client;
    }

    public CompanyClientDto getCompanyClient() {
        return companyClient;
    }

    public void setCompanyClient(CompanyClientDto companyClient) {
        this.companyClient = companyClient;
    }

    public CreditDto getCredit() {
        return credit;
    }

    public void setCredit(CreditDto credit) {
        this.credit = credit;
    }

    public ServiceDto getService() {
        return service;
    }

    public void setService(ServiceDto service) {
        this.service = service;
    }
    
    
}
