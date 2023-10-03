/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.AccesoDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Ana
 */
public class ConexionData {

    private static final String URL = "jdbc:mariadb://localhost/";
    private static final String DB = "paqueteturistico";
    private static final String USUARIO = "root";
    private static final String PASSWORD = "";

    private static Connection conexion;

    public static Connection getConexion() {
        if (conexion == null) {
            try {
                Class.forName("org.mariadb.jdbc.Driver");
                conexion = DriverManager
                        .getConnection(URL + DB + "?useLegacyyDatetimeCode=false&serverTimezone=UTC"
                                + "&user=" + USUARIO + "&password=" + PASSWORD);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al conectarse a la BD" + ex.getMessage());
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, " Error al cargar los drivers " + ex.getMessage());
            }

        }
        return conexion;
    }

}
