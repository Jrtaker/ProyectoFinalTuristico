/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.AccesoDatos;

import java.sql.Connection;
import main.entidades.Alojamiento;

/**
 *
 * @author Ana
 */
public class AlojamientoData {
    
    public AlojamientoData(){
        Connection con = ConexionData.getConexion();
    }
    
    public void agregarAlojamiento(Alojamiento alojamiento){
        String sql= "INSERT INTO ciudad( nombre, provincia, pais, estado) VALUES (?,?,?,?)";
    }
}
