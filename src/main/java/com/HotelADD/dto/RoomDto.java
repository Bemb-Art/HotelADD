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
public class RoomDto {
    private Long roomId;
    private String roomType;
    private char roomBed;
    private String roomDescription;
    private char roomOutside;
    private BigDecimal roomStandarPrice;
    private BigDecimal roomWeekendPrice;
    private int roomStatusId;
    private int userId;
    private int maintenanceId;

    public Long getRoomId() {
        return roomId;
    }

    public void setRoomId(Long roomId) {
        this.roomId = roomId;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public char getRoomBed() {
        return roomBed;
    }

    public void setRoomBed(char roomBed) {
        this.roomBed = roomBed;
    }

    public String getRoomDescription() {
        return roomDescription;
    }

    public void setRoomDescription(String roomDescription) {
        this.roomDescription = roomDescription;
    }

    public char getRoomOutside() {
        return roomOutside;
    }

    public void setRoomOutside(char roomOutside) {
        this.roomOutside = roomOutside;
    }

    public BigDecimal getRoomStandarPrice() {
        return roomStandarPrice;
    }

    public void setRoomStandarPrice(BigDecimal roomStandarPrice) {
        this.roomStandarPrice = roomStandarPrice;
    }

    public BigDecimal getRoomWeekendPrice() {
        return roomWeekendPrice;
    }

    public void setRoomWeekendPrice(BigDecimal roomWeekendPrice) {
        this.roomWeekendPrice = roomWeekendPrice;
    }

    public int getRoomStatusId() {
        return roomStatusId;
    }

    public void setRoomStatusId(int roomStatusId) {
        this.roomStatusId = roomStatusId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getMaintenanceId() {
        return maintenanceId;
    }

    public void setMaintenanceId(int maintenanceId) {
        this.maintenanceId = maintenanceId;
    }

}
