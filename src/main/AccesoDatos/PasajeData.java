package main.AccesoDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import main.entidades.Ciudad;
import main.entidades.Pasaje;

public class PasajeData {

    private Connection con = null;

    public PasajeData() {
        con = ConexionData.getConexion();
    }

    //Nuevo Pasaje - Boton Nuevo
    public void agregarPasaje(Pasaje pasaje) {
        String sql = "INSERT INTO pasaje (tipoTransporte, importe, idCiudad, estado) VALUES (?,?,?,?)";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, pasaje.getTipoTransporte());
            ps.setDouble(2, pasaje.getImporte());
            ps.setInt(3, pasaje.getOrigenCiudad().getIdCiudad());
            ps.setBoolean(4, pasaje.isEstado());
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Agregado con exito");
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Error en (agregarPasaje) " + e.getMessage());
        }
    }
    
    //Listado de pasajes por su transporte
    public List<Pasaje> tipoDePasajes(String tipo) {
        List<Pasaje> pasajes = new ArrayList<>();
        try {

            String selectQuery = "SELECT * FROM Pasaje WHERE tipoTransporte = ?";
            PreparedStatement ps = con.prepareStatement(selectQuery);
            ps.setString(1, tipo);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Pasaje pasaje = new Pasaje();
                pasaje.setIdPasaje(rs.getInt("idPasaje"));
                pasaje.setTipoTransporte(rs.getString("tipoTransporte"));
                pasaje.setImporte(rs.getDouble("importe"));
                //podria ponerse como fechas de inicio y salida para los pasajess (yadhi)
                pasaje.setEstado(rs.getBoolean("estado"));
                CiudadData ciudadData=new CiudadData();
                int idCiudad=rs.getInt("idCiudad");
                Ciudad ciudad = ciudadData.buscarCiudad(idCiudad);
                
                pasajes.add(pasaje);
            }
            ps.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en (tipoDePasajes) " + e.getMessage());
        }
        return pasajes;
    }
    
    //Listado de todos los pasajes activos o no
        public List<Pasaje> PasajesTodo() {
        List<Pasaje> pasajes = new ArrayList<>();
        try {

            String selectQuery = "SELECT * FROM Pasaje";
            PreparedStatement ps = con.prepareStatement(selectQuery);
            
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                
                int IdPasaje=(rs.getInt("idPasaje"));
                String TipoTransporte=(rs.getString("tipoTransporte"));
                double Importe=(rs.getDouble("importe"));
                boolean Estado=(rs.getBoolean("estado"));
                
                CiudadData ciudadData=new CiudadData();
                int idCiudad=rs.getInt("idCiudad");
                Ciudad ciudad = ciudadData.buscarCiudad(idCiudad);
                Pasaje pasaje = new Pasaje(IdPasaje,TipoTransporte,Importe,ciudad,Estado);
                pasajes.add(pasaje);
            }
            ps.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en (pasajesTodo) " + e.getMessage());
        }
        return pasajes;
    }
        //Listado de todos los pasajes para uso en paquete.
        public List<Pasaje> pasajesActivos(String tipo) {
        List<Pasaje> pasajes = new ArrayList<>();
        try {

            String selectQuery = "SELECT * FROM Pasaje WHERE tipoTransporte = ? AND estado=1";
            PreparedStatement ps = con.prepareStatement(selectQuery);
            ps.setString(1, tipo);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int IdPasaje=(rs.getInt("idPasaje"));
                String TipoTransporte=(rs.getString("tipoTransporte"));
                double Importe=(rs.getDouble("importe"));
                boolean Estado=(rs.getBoolean("estado"));
                
                CiudadData ciudadData=new CiudadData();
                int idCiudad=rs.getInt("idCiudad");
                Ciudad ciudad = ciudadData.buscarCiudad(idCiudad);
                Pasaje pasaje = new Pasaje(IdPasaje,TipoTransporte,Importe,ciudad,Estado);
                pasajes.add(pasaje);
            }
            ps.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en (pasajesActivo) " + e.getMessage());
        }
        return pasajes;
    }
        
        //Borrado de pasaje no logico
    public void borrarPasaje(int id) {
        String sql = "DELETE FROM pasaje WHERE idPasaje=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            JOptionPane.showMessageDialog(null, "Borrado con exito");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en (borrarPasaje) " + ex.getMessage());
        }
    }
    //Boton Guardar - Cambia cosas de pasaje
    public void modificarPasaje(Pasaje pasaje) {
        String sql = "UPDATE pasaje SET tipoTransporte= ?, importe=?, idCiudad=?, estado=? WHERE idPasaje=? ";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, pasaje.getTipoTransporte());
            ps.setDouble(2, pasaje.getImporte());
            ps.setInt(3, pasaje.getOrigenCiudad().getIdCiudad());
            ps.setBoolean(4, pasaje.isEstado());
            ps.setInt(5, pasaje.getIdPasaje());
            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Cambiado con exito");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en (modificarPasaje)" + e.getMessage());
        }
    }
    
    //?
//    public List<Integer> listarPasajePorTransporte(String transporte){
//        List<Integer> idCiudad = new ArrayList<>();
//        try {
//            String sql = "SELECT ciudad.idCiudad FROM ciudad INNER JOIN pasaje ON ciudad.idCiudad=pasaje.idCiudad "
//                    + "WHERE pasaje.tipoTransporte = ?";
//            PreparedStatement ps = con.prepareStatement(sql);
//            ps.setString(1, transporte);
//            ResultSet rs = ps.executeQuery();
//            ps.execute();
//            while (rs.next()) {
//                idCiudad.add(rs.getInt("idCiudad")); 
//            }
//            ps.close();
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Error en (listarPasajePorTransporte)"+ex.getMessage());
//        }
//        return idCiudad;
//        
//    }
    
    public Pasaje buscarPasaje (int id){
        Pasaje pasaje = null;
        String sql = "SELECT * FROM pasaje WHERE idPasaje = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                
            pasaje = new Pasaje();
            pasaje.setIdPasaje(id);
            pasaje.setTipoTransporte(rs.getString("tipoTransporte"));
            pasaje.setImporte(rs.getDouble("importe"));
            pasaje.setEstado(rs.getBoolean("estado"));
            int idCiudad = rs.getInt("idCiudad");
            CiudadData ciudadData = new CiudadData();
            Ciudad ciudad = ciudadData.buscarCiudad(idCiudad);
            pasaje.setOrigenCiudad(ciudad);
            
            }else{
            JOptionPane.showMessageDialog(null, "No existe el pasaje");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en 'buscarPasaje' "+ex);
        }
        return pasaje;
    }


}
