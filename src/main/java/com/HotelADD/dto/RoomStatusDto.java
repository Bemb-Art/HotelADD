/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.HotelADD.dto;

/**
 *
 * @author bonni
 */
public class RoomStatusDto {
    private String roomStatusType; 
    private MaintenanceDto maintenance;

    public String getRoomStatusType() {
        return roomStatusType;
    }

    public void setRoomStatusType(String roomStatusType) {
        this.roomStatusType = roomStatusType;
    }        

    public MaintenanceDto getMaintenance() {
        return maintenance;
    }

    public void setMaintenance(MaintenanceDto maintenance) {
        this.maintenance = maintenance;
    }
        
}
