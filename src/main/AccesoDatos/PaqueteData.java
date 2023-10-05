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

/**
 *
 * @author Ana
 */
public class PaqueteData {
    private Connection con = null;
    
    public PaqueteData(){
        con = ConexionData.getConexion();
    }
    /* IDEAAAA
    public List<PaqueteData> PaqueteXCliente(//deberia recibir un cliente) {
    List<PaqueteData> paquetin = new ArrayList<>();
    try {
     
        String selectQuery = "SELECT * FROM Paquete WHERE cliente_id = ?";
        PreparedStatement preparedStatement = con.prepareStatement(selectQuery);
        preparedStatement.setInt(1, cliente.getIdCliente());
        ResultSet rs = preparedStatement.executeQuery();
        
        while (rs.next()) {
            PaqueteData paquete = new PaqueteData();
            paquete.setIdPaquete(rs.getInt("idPaquete"));
          
            paquetes.add(paquete);
        }
        
       
        preparedStatement.close();
      
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return paquetin;
}
*/
    public void borrarPaquete(int idPaquete){
    String sql="DELETE FROM ciudad WHERE idPaquete=?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,idPaquete);
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en (borrarPaquete) " + ex.getMessage());
        }
    }
    
}
