/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.HotelADD.dto;

/**
 *
 * @author bonni
 */
public class CountryDto {
    private String countryName;
    private String countryPostalCode;

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryPostalCode() {
        return countryPostalCode;
    }

    public void setCountryPostalCode(String countryPostalCode) {
        this.countryPostalCode = countryPostalCode;
    }

    @Override
    public String toString() {
        return "CountryDto{" + "countryName=" + countryName + ", countryPostalCode=" + countryPostalCode + '}';
    }
    
    
}
