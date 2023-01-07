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
    private VehicleRentalDto vehicleRental;
    private TraslationDto traslation;
    private BreakfastDto breakfast;

    public String getServiceDescription() {
        return serviceDescription;
    }

    public void setServiceDescription(String serviceDescription) {
        this.serviceDescription = serviceDescription;
    }

    public VehicleRentalDto getVehicleRental() {
        return vehicleRental;
    }

    public void setVehicleRental(VehicleRentalDto vehicleRental) {
        this.vehicleRental = vehicleRental;
    }

    public TraslationDto getTraslation() {
        return traslation;
    }

    public void setTraslation(TraslationDto traslation) {
        this.traslation = traslation;
    }

    public BreakfastDto getBreakfast() {
        return breakfast;
    }

    public void setBreakfast(BreakfastDto breakfast) {
        this.breakfast = breakfast;
    }
    
    
}
