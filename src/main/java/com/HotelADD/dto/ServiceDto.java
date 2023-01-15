/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.HotelADD.dto;

/**
 *
 * @author bonni
 */
public class ServiceDto {
    private String serviceDescription;
    private int vehicleRentalId;
    private int traslationId;
    private int breakfastId;

    public String getServiceDescription() {
        return serviceDescription;
    }

    public void setServiceDescription(String serviceDescription) {
        this.serviceDescription = serviceDescription;
    }

    public int getVehicleRentalId() {
        return vehicleRentalId;
    }

    public void setVehicleRentalId(int vehicleRentalId) {
        this.vehicleRentalId = vehicleRentalId;
    }

    public int getTraslationId() {
        return traslationId;
    }

    public void setTraslationId(int traslationId) {
        this.traslationId = traslationId;
    }

    public int getBreakfastId() {
        return breakfastId;
    }

    public void setBreakfastId(int breakfastId) {
        this.breakfastId = breakfastId;
    }

    
}
