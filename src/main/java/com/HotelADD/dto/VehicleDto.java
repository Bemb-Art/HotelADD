/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.HotelADD.dto;

/**
 *
 * @author bonni
 */
public class VehicleDto {
    private Long vehicleId;
    private String vehicleMark;
    private String vehicleType;
    private String vehiclePlaque;
    private VehicleStatusDto vehicleStatus;

    public Long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Long vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getVehicleMark() {
        return vehicleMark;
    }

    public void setVehicleMark(String vehicleMark) {
        this.vehicleMark = vehicleMark;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehiclePlaque() {
        return vehiclePlaque;
    }

    public void setVehiclePlaque(String vehiclePlaque) {
        this.vehiclePlaque = vehiclePlaque;
    }
    
    public VehicleStatusDto getVehicleStatus() {
        return vehicleStatus;
    }

    public void setVehicleStatus(VehicleStatusDto vehicleStatus) {
        this.vehicleStatus = vehicleStatus;
    }
    
    
}
