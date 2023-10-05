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
        String sql= "INSERT INTO ciudad( nombre, provincia, pais, estado) VALUES (?,?,?,?)";
    }
    
    
    //********************* YADHI  SELECT ***********************************
    public List<Alojamiento> AlojamientosPorCiudad(Ciudad ciudad) {
    List<Alojamiento> alojamientos = new ArrayList<>();
    try {
     
        String selectQuery = "SELECT * FROM Alojamiento WHERE ciudad_id = ?";
        PreparedStatement ps = con.prepareStatement(selectQuery);
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
        e.printStackTrace();
    }
    return alojamientos;
}

}
