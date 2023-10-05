/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.AccesoDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import main.entidades.Estadia;

public class EstadiaData {
    private Connection con = null;
    public EstadiaData(){
        con = ConexionData.getConexion();
    }
   
    public void agregarEstadia (Estadia estadia){
        String sql = "INSERT INTO estadia ( idCiudad, servicio, importeDiario, estado, nombre) VALUES (?,?,?,?,?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, estadia.getIdCiudad());
            ps.setString(2, estadia.getServicio());
            ps.setDouble(3, estadia.getImporteDiario());
            
        } catch (Exception e) {
        }
    }
    
    
    public void borrarEstadia(int idEstadia){
        String sql = "DELETE FROM estadia WHERE idEstadia=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,idEstadia);
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en (borrarEstadia) " + ex.getMessage());
        }
    }
    public void modificarEstadia(Estadia estadia){
        String sql = "UPDATE estadia SET idCiudad=?,servicio=?,importeDiario=?,estado=?,nombre=? WHERE idEstadia=?";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, estadia.getIdCiudad());
            ps.setString(2,estadia.getServicio());
            ps.setDouble(3, estadia.getImporteDiario());
            ps.setBoolean(4, true);
            ps.setString(5, estadia.getNombre());
            ps.executeUpdate();
            
            JOptionPane.showConfirmDialog(null, "Se ha modificado una Estadia.");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error en (modificarEstadia)" + e.getMessage());
        }
    }
}
