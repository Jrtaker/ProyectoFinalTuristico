/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Login.Login;
import main.AccesoDatos.CiudadData;
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
       
       
        Login.Login();
        CiudadData ciudad=new CiudadData();
        
        Ciudad probandoMetodo = new Ciudad(2, "Santa Teresa", "Brasil", true, "Rio de Janeiro");
       ciudad.agregarCiudad(probandoMetodo);
      
        ciudad.borrarCiudad(1);
    }
    
}
