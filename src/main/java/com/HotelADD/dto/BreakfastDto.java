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
public class BreakfastDto {
    private String breakfastName;
    private String breakfasDescription;
    private BigDecimal breakfasPrice;

    public String getBreakfastName() {
        return breakfastName;
    }

    public void setBreakfastName(String breakfastName) {
        this.breakfastName = breakfastName;
    }

    public String getBreakfasDescription() {
        return breakfasDescription;
    }

    public void setBreakfasDescription(String breakfasDescription) {
        this.breakfasDescription = breakfasDescription;
    }

    public BigDecimal getBreakfasPrice() {
        return breakfasPrice;
    }

    public void setBreakfasPrice(BigDecimal breakfasPrice) {
        this.breakfasPrice = breakfasPrice;
    }
    
    
}
