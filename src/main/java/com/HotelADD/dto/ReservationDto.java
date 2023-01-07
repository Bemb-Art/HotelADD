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
    private char reservationAdult;
    private char reservationKid;
    private ClientDto client;
    private CompanyClientDto companyClient;
    private RoomDto room;
    private ServiceDto service;
    
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

    public char getReservationAdult() {
        return reservationAdult;
    }

    public void setReservationAdult(char reservationAdult) {
        this.reservationAdult = reservationAdult;
    }

    public char getReservationKid() {
        return reservationKid;
    }

    public void setReservationKid(char reservationKid) {
        this.reservationKid = reservationKid;
    }

    public ClientDto getClient() {
        return client;
    }

    public void setClient(ClientDto client) {
        this.client = client;
    }

    public CompanyClientDto getCompanyClient() {
        return companyClient;
    }

    public void setCompanyClient(CompanyClientDto companyClient) {
        this.companyClient = companyClient;
    }

    public RoomDto getRoom() {
        return room;
    }

    public void setRoom(RoomDto room) {
        this.room = room;
    }

    public ServiceDto getService() {
        return service;
    }

    public void setService(ServiceDto service) {
        this.service = service;
    }
    
    
    
}
