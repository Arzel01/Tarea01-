package ec.edu.espol;

import java.util.Date;
import java.util.List;


public class Evento {
    private String nombre;
    private Date fecha;
    private String ubicacion;
    private List<Boleto> boletos;
    private List<Restricciones> restricciones;
    private String politicaDevolucion;
    
    public Evento(String nombre, Date fecha, String ubicacion, String politicaDevolucion) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.ubicacion = ubicacion;
        this.politicaDevolucion = politicaDevolucion;
        restricciones = null;
        politicaDevolucion = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public List<Boleto> getBoletos() {
        return boletos;
    }

    public void setBoletos(List<Boleto> boletos) {
        this.boletos = boletos;
    }

    public List<Restricciones> getRestricciones() {
        return restricciones;
    }

    public void setRestricciones(List<Restricciones> restricciones) {
        this.restricciones = restricciones;
    }

    public String getPoliticaDevolucion() {
        return politicaDevolucion;
    }

    public void setPoliticaDevolucion(String politicaDevolucion) {
        this.politicaDevolucion = politicaDevolucion;
    }

    public boolean obtenerDisponibilidad(){

    }

    public Notificacion notificar(String mensaje){

    }
    
}
