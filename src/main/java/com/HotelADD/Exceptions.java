/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.HotelADD;

import org.springframework.http.HttpStatus;

/**
 *
 * @author bonni
 */
public class Exceptions extends RuntimeException{
    
    private String mensaje;
    private HttpStatus httpStatus;
    
    public Exceptions(String mensaje, HttpStatus httpStatus){
        super(mensaje);
        this.mensaje = mensaje;
        this.httpStatus = httpStatus;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }
    
    
}
