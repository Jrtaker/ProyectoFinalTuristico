/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Login.Login;
import java.util.List;
import main.AccesoDatos.CiudadData;
import main.AccesoDatos.EstadiaData;
import main.entidades.Ciudad;
import main.entidades.Estadia;

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
        
       Ciudad probandoMetodo = new Ciudad("Horlando", "EE.UU", true, "Miami");
 //     ciudad.agregarCiudad(probandoMetodo);
//       Ciudad probandoMetodo2 = new Ciudad(2,"Santa Teresa", "Brasil", false, "Rio de Janeiro");
//        ciudad.modificarCiudad(probandoMetodo2);


        EstadiaData estadia =new EstadiaData();
       Estadia probarMetodos = new Estadia( 4, "Basico", 900, true, "Las Juaninas");
       estadia.agregarEstadia(probarMetodos);
       
    }
    
}
