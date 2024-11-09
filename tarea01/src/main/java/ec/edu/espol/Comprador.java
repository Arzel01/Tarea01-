package ec.edu.espol;

import java.util.ArrayList;
import java.util.List;

public class Comprador implements Usuario{
    private String nombre;
    private String email;
    private List<Boleto> boletosReservados;
    
    public Comprador(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
        boletosReservados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Boleto> getBoletosReservados() {
        return boletosReservados;
    }

    public void setBoletosReservados(List<Boleto> boletosReservados) {
        this.boletosReservados = boletosReservados;
    }

    public Evento buscarEvento(String criterio){

    }

    public boolean reservarBoleto(Boleto boleto){

    }

    public void cancelarReserva(Boleto boleto){

    }

    public void recibirNotificacion(Notificacion notificacion){

    }

    public Incidente reportarIncidente(String descripcion){

    }

    public void realizarPago(double monto, ProcesadorPago procesador){

    }
}
