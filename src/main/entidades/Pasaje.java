 
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.entidades;

import main.AccesoDatos.CiudadData;

/**
 *
 * @author Ana
 */
public class Pasaje {
    private int idPasaje;
    private String tipoTransporte;
    private double importe;
    private Ciudad origenCiudad;
    private boolean estado;

    public Pasaje() {
    }

    public Pasaje(int idPasaje, String tipoTransporte, double importe, Ciudad origenCiudad, boolean estado) {
        this.idPasaje = idPasaje;
        this.tipoTransporte = tipoTransporte;
        this.importe = importe;
        this.origenCiudad = origenCiudad;
        this.estado = estado;
    }

    public Pasaje(String tipoTransporte, double importe, Ciudad origenCiudad, boolean estado) {
        this.tipoTransporte = tipoTransporte;
        this.importe = importe;
        this.origenCiudad = origenCiudad;
        this.estado = estado;
    }

    public int getIdPasaje() {
        return idPasaje;
    }

    public void setIdPasaje(int idPasaje) {
        this.idPasaje = idPasaje;
    }

    public String getTipoTransporte() {
        return tipoTransporte;
    }

    public void setTipoTransporte(String tipoTransporte) {
        this.tipoTransporte = tipoTransporte;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public Ciudad getOrigenCiudad() {
        return origenCiudad;
    }

    public void setOrigenCiudad(Ciudad origenCiudad) {
        this.origenCiudad = origenCiudad;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    @Override
    public String toString() {
       
        String nombreCiudad = origenCiudad.getNombre();
        
        return  tipoTransporte + ", " + importe + "$, " + nombreCiudad ;
    
    }
    
    
}
