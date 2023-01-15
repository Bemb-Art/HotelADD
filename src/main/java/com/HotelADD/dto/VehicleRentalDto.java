/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.HotelADD.dto;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author bonni
 */
public class VehicleRentalDto {
    private Date vehicleRentalStartDate;
    private Date vehicleRentalEndDate;
    private BigDecimal vehicleRentalPrice;
    private int vehicleId;

    public Date getVehicleRentalStartDate() {
        return vehicleRentalStartDate;
    }

    public void setVehicleRentalStartDate(Date vehicleRentalStartDate) {
        this.vehicleRentalStartDate = vehicleRentalStartDate;
    }

    public Date getVehicleRentalEndDate() {
        return vehicleRentalEndDate;
    }

    public void setVehicleRentalEndDate(Date vehicleRentalEndDate) {
        this.vehicleRentalEndDate = vehicleRentalEndDate;
    }

    public BigDecimal getVehicleRentalPrice() {
        return vehicleRentalPrice;
    }

    public void setVehicleRentalPrice(BigDecimal vehicleRentalPrice) {
        this.vehicleRentalPrice = vehicleRentalPrice;
    }

    public Integer getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Integer vehicleId) {
        this.vehicleId = vehicleId;
    }
        
}
