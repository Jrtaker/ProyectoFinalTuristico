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
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import main.entidades.Ciudad;

/**
 *
 * @author Joni
 */
public class CiudadData {

    private Connection con = null;

    public CiudadData() {
        con = ConexionData.getConexion();
    }

    public void agregarCiudad(Ciudad ciudad) {           //OK
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
            JOptionPane.showMessageDialog(null, "Error en (agregarCiudad)" + e.getMessage());
        }
    }
<<<<<<< Updated upstream
    //nombre =/= string
    //provincia =/= string
    //pais =/= string
    //estado!=boolean
    
    public void modificarCiudad(Ciudad ciudad) {
=======

    public void modificarCiudad(Ciudad ciudad) {             //OK
>>>>>>> Stashed changes
        String sql = "UPDATE ciudad SET  nombre = ?, provincia = ?, pais = ?, estado = ? WHERE idCiudad=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, ciudad.getNombre());
            ps.setString(2, ciudad.getProvincia());
            ps.setString(3, ciudad.getPais());
            ps.setBoolean(4, true);
            ps.setInt(5, ciudad.getIdCiudad());
            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Cambiado con exito");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en (modificarCiudad)" + e.getMessage());
        }
    }
<<<<<<< Updated upstream
    
    public List<Ciudad> listarCiudad() {
=======

    public List<Ciudad> listarCiudad() {                   //OK
>>>>>>> Stashed changes

        List<Ciudad> ciudades = new ArrayList<>();
        try {
            String sql = "SELECT * FROM ciudad WHERE estado = 1 ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Ciudad ciudad = new Ciudad();

                ciudad.setIdCiudad(rs.getInt("idCiudad"));
                ciudad.setNombre(rs.getString("nombre"));
                ciudad.setProvincia(rs.getString("provincia"));
                ciudad.setPais(rs.getString("pais"));
                ciudad.setEstado(true);

                ciudades.add(ciudad);

            }
            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en (listarCiudad) " + e.getMessage());
        }
        return ciudades;
    }
    
    
    public List<Ciudad> listarCiudadTodo() {           //OK

        List<Ciudad> ciudades = new ArrayList<>();
        try {
            String sql = "SELECT * FROM ciudad";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Ciudad ciudad = new Ciudad();

                ciudad.setIdCiudad(rs.getInt("idCiudad"));
                ciudad.setNombre(rs.getString("nombre"));
                ciudad.setProvincia(rs.getString("provincia"));
                ciudad.setPais(rs.getString("pais"));
                ciudad.setEstado(rs.getBoolean("estado"));

                ciudades.add(ciudad);

            }
            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en (listarCiudadTodo) " + e.getMessage());
        }
        return ciudades;
    }
    
      public List<Ciudad> listarCiudadPorPais(String pais) {     //OK

        List<Ciudad> ciudades = new ArrayList<>();
        try {
            String sql = "SELECT * FROM ciudad WHERE pais=?";
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, pais);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Ciudad ciudad = new Ciudad();

                ciudad.setIdCiudad(rs.getInt("idCiudad"));
                ciudad.setNombre(rs.getString("nombre"));
                ciudad.setProvincia(rs.getString("provincia"));
                ciudad.setPais(rs.getString("pais"));
                ciudad.setEstado(rs.getBoolean("estado"));
                
                ciudades.add(ciudad);

            }
            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en (listarCiudadPorPais)" + e.getMessage());
        }
        return ciudades;
    }

      
       public List<Ciudad> listarCiudadPorProvincia(String provincia) {   //OK

        List<Ciudad> ciudades = new ArrayList<>();
        try {
            String sql = "SELECT * FROM ciudad WHERE provincia=?";
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, provincia);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Ciudad ciudad = new Ciudad();
                
                
                
                ciudad.setIdCiudad(rs.getInt("idCiudad"));
                ciudad.setNombre(rs.getString("nombre"));
                ciudad.setProvincia(rs.getString("provincia"));
                ciudad.setPais(rs.getString("pais"));
                ciudad.setEstado(rs.getBoolean("estado"));
                
                ciudades.add(ciudad);

            }
            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en (listarCiudadPorProvincia) " + e.getMessage());
        }
        return ciudades;
    }
       
    public void borrarCiudad(int idCiudad) {                   //OK
        String sql = "DELETE FROM ciudad WHERE idCiudad=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idCiudad);
            ps.executeUpdate();
            ps.close();
            JOptionPane.showMessageDialog(null, "Borrado con exito");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en (borrarCiudad) " + ex.getMessage());
        }

    }

}
