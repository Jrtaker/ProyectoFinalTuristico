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
import main.entidades.Estadia;

public class EstadiaData {

    private Connection con = null;

    public EstadiaData() {
        con = ConexionData.getConexion();
    }

    public void agregarEstadia(Estadia estadia) {
        String sql = "INSERT INTO estadia ( idCiudad, servicio, importeDiario, estado, nombre) VALUES (?,?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, estadia.getIdCiudad());
            ps.setString(2, estadia.getServicio());
            ps.setDouble(3, estadia.getImporteDiario());
            ps.setBoolean(4, estadia.isEstado());
            ps.setString(5, estadia.getNombre());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se añadió una nueva estadía");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en (agregarEstadia)" + ex.getMessage());
        }
    }

    public void borrarEstadia(int idEstadia) {
        String sql = "DELETE FROM estadia WHERE idEstadia=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idEstadia);
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en (borrarEstadia) " + ex.getMessage());
        }
    }

    public void modificarEstadia(Estadia estadia) {
        String sql = "UPDATE estadia SET idCiudad=?,servicio=?,importeDiario=?,estado=?,nombre=? WHERE idEstadia=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, estadia.getIdCiudad());
            ps.setString(2, estadia.getServicio());
            ps.setDouble(3, estadia.getImporteDiario());
            ps.setBoolean(4, true);
            ps.setString(5, estadia.getNombre());
            ps.executeUpdate();

            JOptionPane.showConfirmDialog(null, "Se ha modificado una Estadia.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en (modificarEstadia)" + e.getMessage());
        }
    }

    public List<Estadia> listarEstadia() {

        List<Estadia> estadias = new ArrayList<>();
        try {                                                    //int idCiudad, String servicio, double importeDiario, boolean estado, String nombre
            String sql = "SELECT * FROM estadia WHERE estado = 1 ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Estadia estadia = new Estadia();

                estadia.setIdEstadia(rs.getInt("idEstadia"));
                estadia.setIdCiudad(rs.getInt("idCiudad"));
                estadia.setServicio(rs.getString("servicio"));
                estadia.setImporteDiario(rs.getDouble("importeDiario"));
                estadia.setNombre(rs.getString("nombre"));

                estadias.add(estadia);

            }

            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en (listarEstadia) " + e.getMessage());
        }
        return estadias;
    }
    
     public List<Estadia> listarEstadiaTodo() {

        List<Estadia> estadias = new ArrayList<>();
        try {                                                    //int idCiudad, String servicio, double importeDiario, boolean estado, String nombre
            String sql = "SELECT * FROM estadia";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Estadia estadia = new Estadia();

                estadia.setIdEstadia(rs.getInt("idEstadia"));
                estadia.setIdCiudad(rs.getInt("idCiudad"));
                estadia.setServicio(rs.getString("servicio"));
                estadia.setImporteDiario(rs.getDouble("importeDiario"));
                estadia.setNombre(rs.getString("nombre"));

                estadias.add(estadia);

            }

            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en (listarEstadiaTodo) " + e.getMessage());
        }
        return estadias;
    }
}
