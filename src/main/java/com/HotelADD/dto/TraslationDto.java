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
public class TraslationDto {
    private String traslationOrigin;
    private String traslationDestination;
    private BigDecimal traslationPrice;

    public String getTraslationOrigin() {
        return traslationOrigin;
    }

    public void setTraslationOrigin(String traslationOrigin) {
        this.traslationOrigin = traslationOrigin;
    }

    public String getTraslationDestination() {
        return traslationDestination;
    }

    public void setTraslationDestination(String traslationDestination) {
        this.traslationDestination = traslationDestination;
    }

    public BigDecimal getTraslationPrice() {
        return traslationPrice;
    }

    public void setTraslationPrice(BigDecimal traslationPrice) {
        this.traslationPrice = traslationPrice;
    }
    
    
}
