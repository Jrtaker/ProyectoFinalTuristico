/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.AccesoDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import main.entidades.Ciudad;

/**
 *
 * @author Joni
 */
public class CiudadData {

    private Connection con = null;
    
    public CiudadData(){
        con=ConexionData.getConexion();
    }
    
    public void agregarCiudad(Ciudad ciudad) {
        String sql = "INSERT INTO ciudad( nombre, provincia, pais, estado) VALUES (?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, ciudad.getNombre());
            ps.setString(2, ciudad.getProvincia());
            ps.setString(3, ciudad.getPais());
            ps.setBoolean(4, true);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se añadio una nueva Ciudad.");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se guardo la Ciudad.");
        }
    }
}
