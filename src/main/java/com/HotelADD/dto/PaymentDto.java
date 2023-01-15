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
public class PaymentDto {
    private Long paymentNumber;
    private BigDecimal paymentTotal;
    private Date paymentDate;
    private int companyClientId;
    private int clientId;
    private int creditId;

    public Long getPaymentNumber() {
        return paymentNumber;
    }

    public void setPaymentNumber(Long paymentNumber) {
        this.paymentNumber = paymentNumber;
    }

    public BigDecimal getPaymentTotal() {
        return paymentTotal;
    }

    public void setPaymentTotal(BigDecimal paymentTotal) {
        this.paymentTotal = paymentTotal;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public int getCompanyClientId() {
        return companyClientId;
    }

    public void setCompanyClientId(int companyClientId) {
        this.companyClientId = companyClientId;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public int getCreditId() {
        return creditId;
    }

    public void setCreditId(int creditId) {
        this.creditId = creditId;
    }

    
    
}
