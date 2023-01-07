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
    private char roomOutside;
    private BigDecimal roomStandarPrice;
    private BigDecimal roomWeekendPrice;
    private RoomStatusDto roomStatus;

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

    public RoomStatusDto getRoomStatus() {
        return roomStatus;
    }

    public void setRoomStatus(RoomStatusDto roomStatus) {
        this.roomStatus = roomStatus;
    }
    
    
}
