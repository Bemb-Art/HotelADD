/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.HotelADD.dto;

/**
 *
 * @author bonni
 */
public class CompanyClientDto {
    private String companyClientId;
    private String companyClientNit;
    private String companyClientName1;
    private String companyClientName2;
    private String companyClientName3;
    private String companyClientLastname1;    
    private String companyClientLastname2;
    private String companyClientPhone;
    private String companyClientEmail;
    private CompanyDto company;

    public String getCompanyClientId() {
        return companyClientId;
    }

    public void setCompanyClientId(String companyClientId) {
        this.companyClientId = companyClientId;
    }

    public String getCompanyClientNit() {
        return companyClientNit;
    }

    public void setCompanyClientNit(String companyClientNit) {
        this.companyClientNit = companyClientNit;
    }

    public String getCompanyClientName1() {
        return companyClientName1;
    }

    public void setCompanyClientName1(String companyClientName1) {
        this.companyClientName1 = companyClientName1;
    }

    public String getCompanyClientName2() {
        return companyClientName2;
    }

    public void setCompanyClientName2(String companyClientName2) {
        this.companyClientName2 = companyClientName2;
    }

    public String getCompanyClientName3() {
        return companyClientName3;
    }

    public void setCompanyClientName3(String companyClientName3) {
        this.companyClientName3 = companyClientName3;
    }

    public String getCompanyClientLastname1() {
        return companyClientLastname1;
    }

    public void setCompanyClientLastname1(String companyClientLastname1) {
        this.companyClientLastname1 = companyClientLastname1;
    }

    public String getCompanyClientLastname2() {
        return companyClientLastname2;
    }

    public void setCompanyClientLastname2(String companyClientLastname2) {
        this.companyClientLastname2 = companyClientLastname2;
    }

    public String getCompanyClientPhone() {
        return companyClientPhone;
    }

    public void setCompanyClientPhone(String companyClientPhone) {
        this.companyClientPhone = companyClientPhone;
    }

    public String getCompanyClientEmail() {
        return companyClientEmail;
    }

    public void setCompanyClientEmail(String companyClientEmail) {
        this.companyClientEmail = companyClientEmail;
    }

    public CompanyDto getCompany() {
        return company;
    }

    public void setCompany(CompanyDto company) {
        this.company = company;
    }
    
    
    
}
