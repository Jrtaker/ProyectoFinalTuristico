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
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private boolean estado;
    private String servicio;
    private double importeDiario;
    private Ciudad ciudad;
    
    
    public Alojamiento(){}

    public Alojamiento(int idAlojamiento, LocalDate fechaInicio, LocalDate fechaFin, boolean estado, String servicio, double importeDiario, Ciudad ciudad) {
        this.idAlojamiento = idAlojamiento;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.estado = estado;
        this.servicio = servicio;
        this.importeDiario = importeDiario;
        this.ciudad = ciudad;
    }

   

    public Alojamiento(LocalDate fechaInicio, LocalDate fechaFin, boolean estado, String servicio, double importeDiario, Ciudad ciudad) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
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

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
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

    @Override
    public String toString() {
        return "Entrada : "+fechaInicio + "| Salida: " + fechaFin + "| Precio: " + importeDiario + "$| Ciudad: "+ ciudad.getNombre() ;
        
    }

     
}
