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
    private Estadia estadia;
    
    public Alojamiento(){}

    public Alojamiento(int idAlojamiento, LocalDate fechaIn, LocalDate fechaOut, Estadia estadia) {
        this.idAlojamiento = idAlojamiento;
        this.fechaIn = fechaIn;
        this.fechaOut = fechaOut;
        this.estadia = estadia;
    }

    public Alojamiento(LocalDate fechaIn, LocalDate fechaOut, Estadia estadia) {
        this.fechaIn = fechaIn;
        this.fechaOut = fechaOut;
        this.estadia = estadia;
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

    public Estadia getEstadia() {
        return estadia;
    }

    public void setEstadia(Estadia estadia) {
        this.estadia = estadia;
    }
    
}
