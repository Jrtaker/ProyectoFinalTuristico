/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.entidades;

import java.util.*;

/**
 *
 * @author Joni
 */
public class Alojamiento {
    int idAlojamiento;
    Date fechaIn;
    Date fechaOut;
    boolean estado;
    String servicio;
    double importeDiario;
    Ciudad destinoCiudad;

    public Alojamiento() {
    }

    public Alojamiento(int idAlojamiento, Date fechaIn, Date fechaOut, boolean estado, String servicio, double importeDiario, Ciudad destinoCiudad) {
        this.idAlojamiento = idAlojamiento;
        this.fechaIn = fechaIn;
        this.fechaOut = fechaOut;
        this.estado = estado;
        this.servicio = servicio;
        this.importeDiario = importeDiario;
        this.destinoCiudad = destinoCiudad;
    }

    public Alojamiento(Date fechaIn, Date fechaOut, boolean estado, String servicio, double importeDiario, Ciudad destinoCiudad) {
        this.fechaIn = fechaIn;
        this.fechaOut = fechaOut;
        this.estado = estado;
        this.servicio = servicio;
        this.importeDiario = importeDiario;
        this.destinoCiudad = destinoCiudad;
    }

    public int getIdAlojamiento() {
        return idAlojamiento;
    }

    public void setIdAlojamiento(int idAlojamiento) {
        this.idAlojamiento = idAlojamiento;
    }

    public Date getFechaIn() {
        return fechaIn;
    }

    public void setFechaIn(Date fechaIn) {
        this.fechaIn = fechaIn;
    }

    public Date getFechaOut() {
        return fechaOut;
    }

    public void setFechaOut(Date fechaOut) {
        this.fechaOut = fechaOut;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public double getImporteDiario() {
        return importeDiario;
    }

    public void setImporteDiario(double importeDiario) {
        this.importeDiario = importeDiario;
    }

    public Ciudad getDestinoCiudad() {
        return destinoCiudad;
    }

    public void setDestinoCiudad(Ciudad destinoCiudad) {
        this.destinoCiudad = destinoCiudad;
    }
    
    
}
