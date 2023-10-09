
package main;

import Login.Login;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import main.AccesoDatos.AlojamientoData;
import main.AccesoDatos.CiudadData;
<<<<<<< Updated upstream
=======
import main.entidades.Alojamiento;
>>>>>>> Stashed changes
import main.entidades.Ciudad;


public class ProyectoFinal {

    public static void main(String[] args) {
       
<<<<<<< Updated upstream
       /*
=======
       
       
>>>>>>> Stashed changes
        Login.Login();
        CiudadData ciudad=new CiudadData();
        
       Ciudad probandoMetodo = new Ciudad("La Plata", "Argentina", true, "Buenos Aires");
      //ciudad.agregarCiudad(probandoMetodo);
      Ciudad probandoMetodo2 = new Ciudad(2,"Santa Teresa", "Brasil", true, "Rio de Janeiro");
//        ciudad.modificarCiudad(probandoMetodo2);
        List<Ciudad> ListadoDeCiudades = ciudad.listarCiudad();
        List<Ciudad> ListarCiudadTodo = ciudad.listarCiudadTodo(); 
        
       List<Ciudad> ListarCiudadPorPais = ciudad.listarCiudadPorPais("Argentina");
       List<Ciudad> ListarCiudadPorProvincia = ciudad.listarCiudadPorProvincia("Cordoba");
       //ciudad.borrarCiudad(1);
        System.out.println(ListadoDeCiudades);
        System.out.println(ListarCiudadTodo);
        System.out.println(ListarCiudadPorPais);
        System.out.println(ListarCiudadPorProvincia);
        
        AlojamientoData alojamiento = new AlojamientoData();
        Alojamiento probandoMetodo2 =new Alojamiento(LocalDate.of(2023, 11, 2), LocalDate.of(2013, 12, 24), true, "basico", 50.0, probandoMetodo);
       //Estadia probarMetodos = new Estadia( 5, "PremiunPro", 950, true, "Los Tronquitos");
       //estadia.agregarEstadia(probarMetodos);
       //estadia.borrarEstadia(3);

        


      // EstadiaData estadia =new EstadiaData();
      // Estadia probarMetodos = new Estadia( 1, "Basico", 900, true, "Las Juaninas");
       //estadia.agregarEstadia(probarMetodos);
       

//       EstadiaData estadia =new EstadiaData();
//       Estadia probarMetodos = new Estadia( 1, "Basico", 900, true, "Las Juaninas");
//       estadia.agregarEstadia(probarMetodos);

       

    }
    
}
