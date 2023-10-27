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
import main.entidades.Alojamiento;
import main.entidades.Ciudad;
import main.entidades.Paquete;
import main.entidades.Pasaje;

/**
 *
 * @author Ana
 */
public class PaqueteData {
    private Connection con = null;
    
    public PaqueteData(){
        con = ConexionData.getConexion();
    }
    // Nuevo Paquete Crear - Boton Nuevo
    public void agregarPaquete(Paquete paquete){
         String sql= "INSERT INTO paquete (idOrigen,idDestino,idAlojamiento,idPasaje,nombre) VALUES (?,?,?,?,?)";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,paquete.getOrigen().getIdCiudad());
            ps.setInt(2,paquete.getDestino().getIdCiudad());
            ps.setInt(3,paquete.getAlojamiento().getIdAlojamiento());
            ps.setInt(4,paquete.getPasaje().getIdPasaje());
            ps.setString(5, paquete.getNombre());
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Agregado con exito");
            
        }catch(SQLException e){
             JOptionPane.showMessageDialog(null, "Error en (agregarPaquete) " + e.getMessage());
        }
    }
    //Paquete modificar - Boton Guardar
     public void modificarPaquete(Paquete paquete) {
        String sql = "UPDATE paquete SET idOrigen=?,idDestino=?,idAlojamiento=?,idPasaje=?,nombre=? WHERE idPaquete=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, paquete.getOrigen().getIdCiudad());
            ps.setInt(2, paquete.getDestino().getIdCiudad());
            ps.setInt(3, paquete.getAlojamiento().getIdAlojamiento());
            ps.setInt(4, paquete.getPasaje().getIdPasaje());
            ps.setString(5, paquete.getNombre());
            ps.setInt(6, paquete.getIdPaquete());
            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Se ha modificado un paquete.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en (modificarEstadia)" + e.getMessage());
        }
    }
     //Eliminado no logico de paquete - Boton Eliminar
    public void borrarPaquete(int idPaquete){
    String sql="DELETE FROM paquete WHERE idPaquete=?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,idPaquete);
            ps.executeUpdate();
            ps.close();
            JOptionPane.showMessageDialog(null, "Borrado con exito");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en (borrarPaquete) " + ex.getMessage());
        }
    }
    
    public List<Paquete> paqueteTodo(){
        List<Paquete> paquetes = new ArrayList<>();
        try {
            
            String sql = "SELECT * FROM paquete";
            PreparedStatement ps = con.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                
                int idPaquete = (rs.getInt("idPaquete"));
                int idCiudadOrigen = (rs.getInt("idOrigen"));
                int idCiudadDestino = (rs.getInt("idDestino"));
                int idAlojamiento = (rs.getInt("idAlojamiento"));
                int idPasaje = (rs.getInt("idPasaje"));
                String nombre = (rs.getString("nombre"));
                
                CiudadData ciudadData = new CiudadData();
                PasajeData pasajeData = new PasajeData();
                AlojamientoData alojamientoData = new AlojamientoData();
                
                Ciudad ciudadOrigen = ciudadData.buscarCiudad(idCiudadOrigen);
                Ciudad ciudadDestino = ciudadData.buscarCiudad(idCiudadDestino);
                Pasaje pasaje = pasajeData.buscarPasaje(idPasaje);
                Alojamiento alojamiento = alojamientoData.buscarAlojamiento(idAlojamiento);
                
                Paquete paquete = new Paquete();
                paquete.setAlojamiento(alojamiento);
                paquete.setOrigen(ciudadOrigen);
                paquete.setDestino(ciudadDestino);
                paquete.setIdPaquete(idPaquete);
                paquete.setPasaje(pasaje);
                paquete.setNombre(nombre);
                paquetes.add(paquete);
                
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en 'paqueteTodo' "+ex);
        }
        return paquetes;
    }
    
    public Paquete paquetePorNombre(){
        String sql = "SELECT * FROM paquete WHERE nombre=?";
        Paquete paquete =null;
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
                
                int idPaquete = (rs.getInt("idPaquete"));
                int idCiudadOrigen = (rs.getInt("idOrigen"));
                int idCiudadDestino = (rs.getInt("idDestino"));
                int idAlojamiento = (rs.getInt("idAlojamiento"));
                int idPasaje = (rs.getInt("idPasaje"));
                String nombre = (rs.getString("nombre"));
                
                CiudadData ciudadData = new CiudadData();
                PasajeData pasajeData = new PasajeData();
                AlojamientoData alojamientoData = new AlojamientoData();
                
                Ciudad ciudadOrigen = ciudadData.buscarCiudad(idCiudadOrigen);
                Ciudad ciudadDestino = ciudadData.buscarCiudad(idCiudadDestino);
                Pasaje pasaje = pasajeData.buscarPasaje(idPasaje);
                Alojamiento alojamiento = alojamientoData.buscarAlojamiento(idAlojamiento);
                
                paquete = new Paquete();
                paquete.setAlojamiento(alojamiento);
                paquete.setOrigen(ciudadOrigen);
                paquete.setDestino(ciudadDestino);
                paquete.setIdPaquete(idPaquete);
                paquete.setPasaje(pasaje);
                paquete.setNombre(nombre);
                
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Este usuario ya existe");
        }
        return paquete;
    }
}
