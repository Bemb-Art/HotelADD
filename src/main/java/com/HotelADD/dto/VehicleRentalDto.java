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
    private VehicleDto vehicle;

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

    public VehicleDto getVehicle() {
        return vehicle;
    }

    public void setVehicle(VehicleDto vehicle) {
        this.vehicle = vehicle;
    }
        
}
