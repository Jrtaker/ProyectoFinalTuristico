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
    
    //Nuevo Alojamiento
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
    
    //Cambia un Alojamiento
    public void modificarAlojamiento(Alojamiento alojamiento){                         //ok
        String sql= "UPDATE alojamiento SET fechaInicio=?, fechaFin=?, estado=?, servicio=?,importeDiario=?, idCiudad=? WHERE idAlojamiento=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            System.out.println(alojamiento.getFechaInicio());
            System.out.println(alojamiento.getFechaFin());
            
            ps.setDate(1, Date.valueOf(alojamiento.getFechaInicio()));
            ps.setDate(2, Date.valueOf(alojamiento.getFechaFin()));
            ps.setBoolean(3, alojamiento.isEstado());
            ps.setString(4, alojamiento.getServicio());
            ps.setDouble(5, alojamiento.getImporteDiario());
            ps.setInt(6, alojamiento.getCiudad().getIdCiudad());
            ps.setInt(7, alojamiento.getIdAlojamiento());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se ha modificado un alojamiento");
        } catch (SQLException e) {
           JOptionPane.showMessageDialog(null, "Error en (modificarAlojamiento) " + e.getMessage());
        }
    }
       public List <Alojamiento> listarAlojamiento (){
       List  <Alojamiento> alojamientos =new ArrayList <>();
       String sql = "SELECT * FROM alojamiento ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                Alojamiento alojamiento =new Alojamiento();
                Ciudad ciudad =new Ciudad ();
                
                alojamiento.setIdAlojamiento(rs.getInt("idAlojamiento"));
                alojamiento.setFechaInicio(rs.getDate("fechaInicio").toLocalDate());
                alojamiento.setFechaFin(rs.getDate("fechaFin").toLocalDate());
                alojamiento.setEstado(rs.getBoolean("estado"));
                alojamiento.setServicio(rs.getString("Servicio"));
                alojamiento.setImporteDiario(rs.getDouble("importeDiario"));
                
                alojamientos.add(alojamiento);
            }
            ps.close();
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error en (listarAlojamiento) " + ex.getMessage());
        }
        return alojamientos;
       
       }
       
    //Alojamientos para usar adentro de paquete
    public List<Alojamiento> alojamientosPorCiudad(Ciudad ciudad) {                //ok
    List<Alojamiento> alojamientos = new ArrayList<>();
    try {
     
        String sql = "SELECT * FROM Alojamiento WHERE idCiudad = ? AND estado=1";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, ciudad.getIdCiudad());
        ResultSet rs = ps.executeQuery();
        
        while (rs.next()) {
            Alojamiento alojamiento = new Alojamiento();
            
           alojamiento.setIdAlojamiento(rs.getInt("idAlojamiento"));
           alojamiento.setFechaInicio(rs.getDate("fechaInicio").toLocalDate());
           alojamiento.setFechaFin(rs.getDate("fechaFin").toLocalDate());
           alojamiento.setServicio(rs.getString("servicio"));
           alojamiento.setImporteDiario(rs.getInt("importeDiario"));
           alojamiento.setEstado(true);
           alojamiento.setCiudad(ciudad);
           
            alojamientos.add(alojamiento);
        }
       ps.close();
        
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error en (alojamientosPorCiudad) " + e.getMessage());
    }
    return alojamientos;
}
    //Alojamiento para uso de referencias de alojamientos como para poder cambiarlos en pagina de alojamiento
  public List<Alojamiento> alojamientosPorCiudadTodo(Ciudad ciudad) {                //ok
    List<Alojamiento> alojamientos = new ArrayList<>();
    try {
     
        String sql = "SELECT * FROM Alojamiento WHERE idCiudad = ? ";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, ciudad.getIdCiudad());
        ResultSet rs = ps.executeQuery();
        
        while (rs.next()) {
            Alojamiento alojamiento = new Alojamiento();
            
           alojamiento.setIdAlojamiento(rs.getInt("idAlojamiento"));
           alojamiento.setFechaInicio(rs.getDate("fechaInicio").toLocalDate());
           alojamiento.setFechaFin(rs.getDate("fechaFin").toLocalDate());
           alojamiento.setServicio(rs.getString("servicio"));
           alojamiento.setImporteDiario(rs.getInt("importeDiario"));
           alojamiento.setEstado(rs.getBoolean("estado"));
           
           
            alojamientos.add(alojamiento);
        }
       ps.close();
        
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error en (alojamientosPorCiudadTodo) " + e.getMessage());
    }
    return alojamientos;
}
    
  //Botom Eliminar | Borrado no logico
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
  public Alojamiento buscarAlojamiento (int id){
        Alojamiento alojamiento = null;
        String sql = "SELECT * FROM alojamiento WHERE idAlojamiento = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                
            alojamiento = new Alojamiento();
            alojamiento.setIdAlojamiento(id);
            alojamiento.setFechaInicio(rs.getDate("fechaInicio" ).toLocalDate());
            alojamiento.setFechaFin(rs.getDate("fechaFin").toLocalDate());
            alojamiento.setEstado(rs.getBoolean("estado"));
            alojamiento.setServicio(rs.getString("servicio"));
            alojamiento.setImporteDiario(rs.getDouble("importeDiario"));
            int idCiudad = rs.getInt("idCiudad");
            
            CiudadData ciudadData = new CiudadData();
            Ciudad ciudad = ciudadData.buscarCiudad(idCiudad);
            alojamiento.setCiudad(ciudad);
            
            }else{
            JOptionPane.showMessageDialog(null, "No existe el alojamiento");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en 'buscarAlojamiento' "+ex);
        }
        return alojamiento;
    }
}
