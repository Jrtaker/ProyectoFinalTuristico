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

    public Ciudad buscarCiudad(int id) {
        Ciudad ciudad = null;
        String sql = "SELECT * FROM ciudad WHERE idCiudad =?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                ciudad = new Ciudad();
                ciudad.setIdCiudad(id);
                ciudad.setNombre(rs.getString("nombre"));
                ciudad.setPais(rs.getString("pais"));
                ciudad.setProvincia(rs.getString("provincia"));
                ciudad.setEstado(rs.getBoolean("estado"));

            } else {
                JOptionPane.showMessageDialog(null, "Ciudad no existe");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en (buscarNombre(Ciudad))" + ex.getMessage());
        }
        return ciudad;

    }

    //IMPORTANTE

    //buscarCiudadRepetida "SELECT * FROM ciudad WHERE pais =? AND provincia =? AND nombre =?"
    
    public Ciudad buscarCiudadRepetida (String pais, String provincia, String nombre){
        String sql = "SELECT * FROM ciudad WHERE pais =? AND provincia =? AND nombre =?";
        Ciudad ciudad=null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, pais);
            ps.setString(2, provincia);
            ps.setString(3, nombre);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                ciudad = new Ciudad();
                
                ciudad.setNombre(rs.getString("nombre"));
                ciudad.setPais(rs.getString("pais"));
                ciudad.setProvincia(rs.getString("provincia"));
                ciudad.setEstado(rs.getBoolean("estado"));

            } else {
                
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en (buscarNombre(Ciudad))" + ex.getMessage());
        }
        return ciudad;        
    }
    
    

    //buscarCiudadRepetida "SELECT * FROM ciudad WHERE pais =? AND provincia =? AND nombre =?" 

    //Nueva Ciudad - Boton Nuevo
    public void agregarCiudad(Ciudad ciudad) {           //OK
        String sql = "INSERT INTO ciudad( nombre, provincia, pais, estado) VALUES (?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, ciudad.getNombre());
            ps.setString(2, ciudad.getProvincia());
            ps.setString(3, ciudad.getPais());
            ps.setBoolean(4, true);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "SE AÑADIO NUEVA CIUDAD.");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en (agregarCiudad)" + e.getMessage());
        }
    }

    //nombre =/= string
    //provincia =/= string
    //pais =/= string
    //estado!=boolean
    //Modificar Ciudad - Boton Guardar
    public void modificarCiudad(Ciudad ciudad) {             //OK

        String sql = "UPDATE ciudad SET  nombre = ?, provincia = ?, pais = ?, estado = ? WHERE idCiudad=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, ciudad.getNombre());
            ps.setString(2, ciudad.getProvincia());
            ps.setString(3, ciudad.getPais());
            ps.setBoolean(4, ciudad.isEstado());
            ps.setInt(5, ciudad.getIdCiudad());
            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "CIUDAD MODIFICADA.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en (modificarCiudad)" + e.getMessage());
        }
    }

    // Listar Ciudad - Uso en pasaje, alojamiento y paquete (Por ahora esperar con esto)
    public List<Ciudad> listarCiudad() {                   //OK

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

    //Lista de todas las ciudades- uso para referencias en ciudad-Usado para traer toda la informacion de ciudades activas o no
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

    //Uso para listar por pais, referencia a todas las provincias en un cierto pais
    public List<Ciudad> listarCiudadPorPais(String pais) {     //OK

        List<Ciudad> ciudades = new ArrayList<>();
        try {
            String sql = "SELECT * FROM ciudad WHERE pais=? AND estado=1";
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

    //Listar todas las ciudades adentro de una cierta provincia
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
    //Borrado no logico de ciudades

    public void borrarCiudad(String pais, String provincia, String ciudad) {                   //OK
        String sql = "DELETE FROM ciudad WHERE pais=? AND provincia =? AND nombre =?";
        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, pais);
            ps.setString(2, provincia);
            ps.setString(3, ciudad);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "CIUDAD BORRADA.");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en (borrarCiudad) " + ex.getMessage());
        }

    }

}
