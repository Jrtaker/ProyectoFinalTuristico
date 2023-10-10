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
    public void agregarAlojamiento(Alojamiento alojamiento){                      //ok
        String sql= "INSERT INTO alojamiento ( fechaInicio, fechaFin, estado, servicio,importeDiario, idCiudad) VALUES (?,?,?,?,?,?)";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDate(1, Date.valueOf(alojamiento.getFechaInicio()));
            ps.setDate(2,Date.valueOf(alojamiento.getFechaFin()));
            ps.setBoolean(3,alojamiento.isEstado());
            ps.setString(4, alojamiento.getServicio());
            ps.setDouble(5, alojamiento.getImporteDiario());
            
            ps.setInt(6, alojamiento.getCiudad().getIdCiudad());
            ps.executeUpdate();
            ps.close();
            JOptionPane.showMessageDialog(null, "Alojamiento agregado con exito.");
            
        }catch(SQLException e){
             JOptionPane.showMessageDialog(null, "Error en (agregarAlojamiento) " + e.getMessage());
        }
    }
    
    
    public void modificarAlojamiento(Alojamiento alojamiento){                         //ok
        String sql= "UPDATE alojamiento SET fechaInicio=?, fechaFin=? WHERE idAlojamiento=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            System.out.println(alojamiento.getFechaInicio());
            System.out.println(alojamiento.getFechaFin());
            
            ps.setDate(1, Date.valueOf(alojamiento.getFechaInicio()));
            ps.setDate(2, Date.valueOf(alojamiento.getFechaFin()));
            ps.setInt(3, alojamiento.getIdAlojamiento());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se ha modificado un alojamiento");
        } catch (SQLException e) {
           JOptionPane.showMessageDialog(null, "Error en (modificarAlojamiento) " + e.getMessage());
        }
    }
    
    
  
    public List<Alojamiento> alojamientosPorCiudad(Ciudad ciudad) {                //ok
    List<Alojamiento> alojamientos = new ArrayList<>();
    try {
     
        String sql = "SELECT * FROM Alojamiento WHERE idCiudad = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, ciudad.getIdCiudad());
        ResultSet rs = ps.executeQuery();
        
        while (rs.next()) {
            Alojamiento alojamiento = new Alojamiento();
            
            alojamiento.setIdAlojamiento(rs.getInt("idAlojamiento"));
           alojamiento.setFechaInicio(rs.getDate("fechaInicio").toLocalDate());
           alojamiento.setFechaFin(rs.getDate("fechaFin").toLocalDate());
           alojamiento.setEstado(true);
           alojamiento.setServicio(rs.getString("servicio"));
           alojamiento.setImporteDiario(rs.getInt("importeDiario"));
           
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
            ps.executeUpdate();
            ps.close();
            JOptionPane.showMessageDialog(null, "Borrado con exito");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en (borrarAlojamiento) " + ex.getMessage());
        }
  }
}
