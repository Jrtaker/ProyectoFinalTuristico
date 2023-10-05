
package main.entidades;

public class Estadia {
    private int idEstadia;
    private int idCiudad;
    private String servicio;
    private double importeDiario;
    private boolean estado;
    private String nombre;

    public Estadia(){};
    
    public Estadia(int idCiudad, String servicio, double importeDiario, boolean estado, String nombre) {
        this.idCiudad = idCiudad;
        this.servicio = servicio;
        this.importeDiario = importeDiario;
        this.estado = estado;
        this.nombre = nombre;
    }
    
    public Estadia(int idEstadia, int idCiudad, String servicio, double importeDiario, boolean estado, String nombre) {
        this.idEstadia = idEstadia;
        this.idCiudad = idCiudad;
        this.servicio = servicio;
        this.importeDiario = importeDiario;
        this.estado = estado;
        this.nombre = nombre;
    }

    public int getIdEstadia() {
        return idEstadia;
    }

    public void setIdEstadia(int idEstadia) {
        this.idEstadia = idEstadia;
    }

    public int getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(int idCiudad) {
        this.idCiudad = idCiudad;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public double getImporteDiario() {
        return importeDiario;
    }

    public void setImporteDiario(double importeDiario) {
        this.importeDiario = importeDiario;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
