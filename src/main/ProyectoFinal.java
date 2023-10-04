/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.sql.Connection;
import main.AccesoDatos.CiudadData;
import main.AccesoDatos.ConexionData;
import main.entidades.Ciudad;

/**
 *
 * @author Joni
 */
public class ProyectoFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //hola soy enzo reportense
        Connection con=ConexionData.getConexion();
        CiudadData ciudad=new CiudadData();
        Ciudad probandoMetodo = new Ciudad("Capital Federal", "Argentina", true, "Buenos Aires");
        ciudad.agregarCiudad(probandoMetodo);
    }
    
}
