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
import main.entidades.Pasaje;

/**
 *
 * @author Ana
 */
public class PasajeData {
    
    private Connection con = null;
    
    public PasajeData(){
        con = ConexionData.getConexion();
    }
    
    public void GuardarPasaje (Pasaje pasaje ){
        
        
    }
    //********************* yadhi select *****************
    public List<Pasaje> TipoDePsajes (String tipo) {
    List<Pasaje> pasajes = new ArrayList<>();
    try {
        
        String selectQuery = "SELECT * FROM Pasaje WHERE tipo = ?";
        PreparedStatement ps = con.prepareStatement(selectQuery);
        ps.setString(1, tipo);
        ResultSet rs = ps.executeQuery();
        
        while (rs.next()) {
            Pasaje pasaje = new Pasaje();
            pasaje.setIdPasaje(rs.getInt("idPasaje"));
            pasaje.setTipoTransporte(rs.getString("tipoTrnsporte"));
            pasaje.setImporte(rs.getDouble("importe"));
            //podria ponerse como fechas de inicio y salida para los pasajess (yadhi)
            pasaje.setEstado(rs.getBoolean("estado"));
            pasajes.add(pasaje);
        }
        
       
        ps.close();
      
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return pasajes;
}

    
}
