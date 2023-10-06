/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.AccesoDatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import main.entidades.Alojamiento;
import main.entidades.Ciudad;

/**
 *
 * @author Ana
 */
public class AlojamientoData {
    private Connection con= null; 
    
    public AlojamientoData(){
         con = ConexionData.getConexion();
    }
    
    //*********************ENZO (INSERT)********************************
    public void agregarAlojamiento(Alojamiento alojamiento){
        String sql= "INSERT INTO alojamiento ( fechaInicio, fechaFin, idEstadia) VALUES (?,?,?)";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDate(1, Date.valueOf(alojamiento.getFechaIn()));
            ps.setDate(2,Date.valueOf(alojamiento.getFechaOut()));
            ps.setInt(3, alojamiento.getEstadia().getIdEstadia());
            ps.close();
            JOptionPane.showMessageDialog(null, "Agregado con exito");
            
        }catch(SQLException e){
             JOptionPane.showMessageDialog(null, "Error en (agregarAlojamiento) " + e.getMessage());
        }
    }
    
    
    public void cambiarAlojamiento(Alojamiento alojamiento){
        String sql= "UPDATE alojamiento SET fechaInicio=?, fechaFin=?, idEstadia=? WHERE idAlojamiento=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
        } catch (SQLException e) {
           JOptionPane.showMessageDialog(null, "Error en (cambiarAlojamiento) " + e.getMessage());
        }
    }
    
    
  
    public List<Alojamiento> alojamientosPorCiudad(Ciudad ciudad) {
    List<Alojamiento> alojamientos = new ArrayList<>();
    try {
     
        String sql = "SELECT * FROM Alojamiento WHERE idCiudad = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, ciudad.getIdCiudad());
        ResultSet rs = ps.executeQuery();
        
        while (rs.next()) {
            Alojamiento alojamiento = new Alojamiento();
            alojamiento.setIdAlojamiento(rs.getInt("idAlojamiento"));
            // fechhas de inicio y fin 
            // tipos de alojamiento 
            //temporada?
            
            alojamientos.add(alojamiento);
        }
       ps.close();
        
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error en (alojamientosPorCiudad) " + e.getMessage());
    }
    return alojamientos;
}

    
  public void borrarAlojamiento (int idAlojamiento){
      String sql = "DELETE FROM alojamiento WHERE idAlojamiento=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,idAlojamiento);
            ResultSet rs = ps.executeQuery();
            ps.close();
            JOptionPane.showMessageDialog(null, "Borrado con exito");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en (borrarAlojamiento) " + ex.getMessage());
        }
  }
}
