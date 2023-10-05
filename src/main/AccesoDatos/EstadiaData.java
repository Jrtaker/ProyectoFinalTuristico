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



/**
 *
 * @author Joni
 */
public class EstadiaData {
    private Connection con = null;
    public EstadiaData(){
        con = ConexionData.getConexion();
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
}
