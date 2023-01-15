/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.HotelADD.dto;

import java.util.Date;

/**
 *
 * @author bonni
 */
public class ReservationDto {
    private Integer reservationNumber;
    private Date reservationEntry;
    private Date reservationExit;
    private String reservationAdult;
    private String reservationKid;
    private int clientId;
    private int companyClientId;
    private int roomId;
    private int serviceId;
    
    public Integer getReservationNumber() {
        return reservationNumber;
    }

    public void setReservationNumber(Integer reservationNumber) {
        this.reservationNumber = reservationNumber;
    }

    public Date getReservationEntry() {
        return reservationEntry;
    }

    public void setReservationEntry(Date reservationEntry) {
        this.reservationEntry = reservationEntry;
    }

    public Date getReservationExit() {
        return reservationExit;
    }

    public void setReservationExit(Date reservationExit) {
        this.reservationExit = reservationExit;
    }

    public String getReservationAdult() {
        return reservationAdult;
    }

    public String setReservationAdult(String reservationAdult) {
        return this.reservationAdult = reservationAdult;
    }

    public String getReservationKid() {
        return reservationKid;
    }

    public String setReservationKid(String reservationKid) {
        return this.reservationKid = reservationKid;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public int getCompanyClientId() {
        return companyClientId;
    }

    public void setCompanyClientId(int companyClientId) {
        this.companyClientId = companyClientId;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    
    
}
