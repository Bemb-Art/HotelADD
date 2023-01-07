/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.HotelADD.dto;

/**
 *
 * @author bonni
 */
public class DirectionDto {
    private String directionDescription;
    private CountryDto country;

    public String getDirectionDescription() {
        return directionDescription;
    }

    public void setDirectionDescription(String directionDescription) {
        this.directionDescription = directionDescription;
    }    

    public CountryDto getCountry() {
        return country;
    }

    public void setCountry(CountryDto country) {
        this.country = country;
    }
    
}
