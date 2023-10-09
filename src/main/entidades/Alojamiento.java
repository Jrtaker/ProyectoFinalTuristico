/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.entidades;

import java.time.LocalDate;
import java.util.*;

/**
 *
 * @author Joni
 */
public class Alojamiento {
    private int idAlojamiento;
    private LocalDate fechaIn;
    private LocalDate fechaOut;
    private boolean estado;
    private String servicio;
    private double importeDiario;
    private Ciudad ciudad;
    
    
    public Alojamiento(){}

    public Alojamiento(int idAlojamiento, LocalDate fechaIn, LocalDate fechaOut, boolean estado, String servicio, double importeDiario, Ciudad ciudad) {
        this.idAlojamiento = idAlojamiento;
        this.fechaIn = fechaIn;
        this.fechaOut = fechaOut;
        this.estado = estado;
        this.servicio = servicio;
        this.importeDiario = importeDiario;
        this.ciudad = ciudad;
    }

    public Alojamiento(LocalDate fechaIn, LocalDate fechaOut, boolean estado, String servicio, double importeDiario, Ciudad ciudad) {
        this.fechaIn = fechaIn;
        this.fechaOut = fechaOut;
        this.estado = estado;
        this.servicio = servicio;
        this.importeDiario = importeDiario;
        this.ciudad = ciudad;
    }

    public int getIdAlojamiento() {
        return idAlojamiento;
    }

    public void setIdAlojamiento(int idAlojamiento) {
        this.idAlojamiento = idAlojamiento;
    }

    public LocalDate getFechaIn() {
        return fechaIn;
    }

    public void setFechaIn(LocalDate fechaIn) {
        this.fechaIn = fechaIn;
    }

    public LocalDate getFechaOut() {
        return fechaOut;
    }

    public void setFechaOut(LocalDate fechaOut) {
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

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

     
}
