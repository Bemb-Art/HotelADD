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
    private int maintenanceId;

    public String getRoomStatusType() {
        return roomStatusType;
    }

    public void setRoomStatusType(String roomStatusType) {
        this.roomStatusType = roomStatusType;
    }        

    public int getMaintenanceId() {
        return maintenanceId;
    }

    public void setMaintenanceId(int maintenanceId) {
        this.maintenanceId = maintenanceId;
    }  
}
