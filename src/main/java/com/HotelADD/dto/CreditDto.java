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
public class CreditDto {
    private String creditNumber;
    private BigDecimal creditTotal;
    private String creditDays;
    private String creditStatus;
    private CompanyClientDto companyClient;

    public String getCreditNumber() {
        return creditNumber;
    }

    public void setCreditNumber(String creditNumber) {
        this.creditNumber = creditNumber;
    }

    public BigDecimal getCreditTotal() {
        return creditTotal;
    }

    public void setCreditTotal(BigDecimal creditTotal) {
        this.creditTotal = creditTotal;
    }

    public String getCreditDays() {
        return creditDays;
    }

    public void setCreditDays(String creditDays) {
        this.creditDays = creditDays;
    }

    public String getCreditStatus() {
        return creditStatus;
    }

    public void setCreditStatus(String creditStatus) {
        this.creditStatus = creditStatus;
    }

    public CompanyClientDto getCompanyClient() {
        return companyClient;
    }

    public void setCompanyClient(CompanyClientDto companyClient) {
        this.companyClient = companyClient;
    }
    
    
}
