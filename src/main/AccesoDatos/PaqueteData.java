/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.AccesoDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import main.entidades.Paquete;

/**
 *
 * @author Ana
 */
public class PaqueteData {
    private Connection con = null;
    
    public PaqueteData(){
        con = ConexionData.getConexion();
    }
    // Nuevo Paquete Crear - Boton Nuevo
    public void agregarPaquete(Paquete paquete){
         String sql= "INSERT INTO paquete (idOrigen,idDestino,idAlojamiento,idPasaje) VALUES (?,?,?,?)";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,paquete.getOrigen().getIdCiudad());
            ps.setInt(2,paquete.getDestino().getIdCiudad());
            ps.setInt(3,paquete.getAlojamiento().getIdAlojamiento());
            ps.setInt(4,paquete.getPasaje().getIdPasaje());
            ps.close();
            JOptionPane.showMessageDialog(null, "Agregado con exito");
            
        }catch(SQLException e){
             JOptionPane.showMessageDialog(null, "Error en (agregarPaquete) " + e.getMessage());
        }
    }
    //Paquete modificar - Boton Guardar
     public void modificarPaquete(Paquete paquete) {
        String sql = "UPDATE paquete SET idOrigen=?,idDestino=?,idAlojamiento=?,idPasaje=?,nombre=? WHERE idPaquete=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, paquete.getOrigen().getIdCiudad());
            ps.setInt(2, paquete.getDestino().getIdCiudad());
            ps.setInt(3, paquete.getAlojamiento().getIdAlojamiento());
            ps.setInt(4, paquete.getPasaje().getIdPasaje());
            ps.setInt(5, paquete.getIdPaquete());
            ps.executeUpdate();

            JOptionPane.showConfirmDialog(null, "Se ha modificado una Estadia.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en (modificarEstadia)" + e.getMessage());
        }
    }
     //Eliminado no logico de paquete - Boton Eliminar
    public void borrarPaquete(int idPaquete){
    String sql="DELETE FROM ciudad WHERE idPaquete=?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,idPaquete);
            ps.close();
            JOptionPane.showMessageDialog(null, "Borrado con exito");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en (borrarPaquete) " + ex.getMessage());
        }
    }
    
}
