
package main.entidades;

/* @author Programita  */
public class paquete {
private int idPaquete;
private Ciudad origen;
private Ciudad destino;
private Alojamiento alojamiento;
private Pasaje pasaje;

public paquete(){
    
}
    public paquete(int idpaquete, Ciudad origen, Ciudad destino, Alojamiento alojamiento, Pasaje pasaje ){
    this.idPaquete = idPaquete;
    this.origen = origen;
    this.destino= destino; 
    this.alojamiento =alojamiento;
    this.pasaje = pasaje;
    
}


}
