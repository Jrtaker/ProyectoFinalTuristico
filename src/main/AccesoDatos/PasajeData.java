package main.AccesoDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import main.entidades.Pasaje;

public class PasajeData {

    private Connection con = null;

    public PasajeData() {
        con = ConexionData.getConexion();
    }

    //*********************Enzo create*******************
    public void agregarPasaje(Pasaje pasaje) {

    }

    /*
     public void agregarEstadia (Estadia estadia){
        String sql = "INSERT INTO estadia ( idCiudad, servicio, importeDiario, estado, nombre) VALUES (?,?,?,?,?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, estadia.getIdCiudad());
            ps.setString(2, estadia.getServicio());
            ps.setDouble(3, estadia.getImporteDiario());
            ps.setBoolean(4, estadia.isEstado());
            ps.setString(5, estadia.getNombre());
            JOptionPane.showMessageDialog(null, "Se añadió una nueva estadía");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en (agregarEstadia)"+ex.getMessage());
        }
    }
     */
    public void GuardarPasaje(Pasaje pasaje) {

    }

    //********************* yadhi select *****************
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
                pasajes.add(pasaje);
            }
            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en (tipoDePasajes) " + e.getMessage());
        }
        return pasajes;
    }

    public void borrarPasaje(int id) {
        String sql = "DELETE FROM ciudad WHERE idPasaje=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en (borrarCiudad) " + ex.getMessage());
        }
    }

    public void modificarPasaje(Pasaje pasaje) {
        String sql = "UPDATE pasaje SET tipoTransporte= ?, importe=?, idOrigenPasaje=?, estado=? WHERE idPasaje=? ";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, pasaje.getTipoTransporte());
            ps.setDouble(2, pasaje.getImporte());
            ps.setInt(3, pasaje.getOrigenCiudad().getIdCiudad());
            ps.setBoolean(4, true);
            ps.setInt(5, pasaje.getIdPasaje());
            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Cambiado con exito");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en (modificarCiudad)" + e.getMessage());
        }
    }

}
