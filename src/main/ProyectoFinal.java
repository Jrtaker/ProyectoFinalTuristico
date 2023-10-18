package main;

import java.time.LocalDate;
import java.util.List;

import main.AccesoDatos.AlojamientoData;
import main.AccesoDatos.CiudadData;
import main.AccesoDatos.PasajeData;
import main.Vistas.Menu3;

import main.entidades.Alojamiento;

import main.entidades.Ciudad;
import main.entidades.Pasaje;

public class ProyectoFinal {

    public static void main(String[] args) {

        Menu3.menu3();

        //Login.Login();
//        CiudadData ciudad=new CiudadData();
//        
//       Ciudad probandoMetodo = new Ciudad("La Plata", "Argentina", true, "Buenos Aires");
//      //ciudad.agregarCiudad(probandoMetodo);
     Ciudad probandoMetodo2 = new Ciudad(4,"Santa Teresa", "Brasil", true, "Rio de Janeiro");
//      
////        ciudad.modificarCiudad(probandoMetodo2);
//        //List<Ciudad> ListadoDeCiudades = ciudad.listarCiudad();
//       // List<Ciudad> ListarCiudadTodo = ciudad.listarCiudadTodo(); 
//        
//       //List<Ciudad> ListarCiudadPorPais = ciudad.listarCiudadPorPais("Argentina");
//       //List<Ciudad> ListarCiudadPorProvincia = ciudad.listarCiudadPorProvincia("Cordoba");
//       //ciudad.borrarCiudad(1);
//       //System.out.println(ListadoDeCiudades);
////        System.out.println(ListarCiudadTodo);
////        System.out.println(ListarCiudadPorPais);
////        System.out.println(ListarCiudadPorProvincia);
//        
//        AlojamientoData alojamiento = new AlojamientoData();
//        Alojamiento alojamientoPrueba =new Alojamiento(LocalDate.of(2023, 11, 1), LocalDate.of(2023, 12, 15), true, "premium", 50.0, probandoMetodo2);
//        alojamiento.agregarAlojamiento(alojamientoPrueba);
//        Alojamiento alojamientoAModificar =new Alojamiento(5, LocalDate.of(2024, 1, 3), LocalDate.of(2014, 2, 5), true, "basico", 50.0, probandoMetodo);
//        //alojamiento.modificarAlojamiento(alojamientoAModificar);
//       // alojamiento.borrarAlojamiento(5);
//        
//        
//       // List <Alojamiento> ListarAlojamientosPorCiudad= alojamiento.alojamientosPorCiudad(probandoMetodo2);
//        //System.out.println(ListarAlojamientosPorCiudad);
//        
//        
//        
//       //Estadia probarMetodos = new Estadia( 5, "PremiunPro", 950, true, "Los Tronquitos");
//       //estadia.agregarEstadia(probarMetodos);
//       //estadia.borrarEstadia(3);
//
//        
//
//
//      // EstadiaData estadia =new EstadiaData();
//      // Estadia probarMetodos = new Estadia( 1, "Basico", 900, true, "Las Juaninas");
//       //estadia.agregarEstadia(probarMetodos);
//       
//
////       EstadiaData estadia =new EstadiaData();
////       Estadia probarMetodos = new Estadia( 1, "Basico", 900, true, "Las Juaninas");
////       estadia.agregarEstadia(probarMetodos);

//        PasajeData pasajeData = new PasajeData();
       Pasaje nuevoPasaje = new Pasaje("avion", 25000.00,probandoMetodo2 , true);
//       pasajeData.agregarPasaje(nuevoPasaje);
////    --------------metodo listar pasaje por tipo: ---------------------
//      Pasaje nuevoPasajeId = new Pasaje(2, "Avion", 25000.00,probandoMetodo2 , true);     
//      List <Pasaje> listaPasajeTodo = pasajeData.PasajesTodo("avion");
//        System.out.println(""+listaPasajeTodo);


       //------------metodo modificar pasaje -------------------
       PasajeData pasajeData = new PasajeData();
        Pasaje pasaje = new Pasaje (2, "Colectivo", 18.00, probandoMetodo2, true);
//        pasajeData.modificarPasaje(pasaje);
//        System.out.println("pasaje modificado: "+pasaje);
        //------------metodo borrar pasaje: probado con los datos de los pasajes ya creados aqui--------------
//        pasajeData.borrarPasaje(2);
//        System.out.println("pasaje borrado: "+pasaje);
    }
    
}
