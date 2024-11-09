package ec.edu.espol;

import java.util.List;

public class AdministradorDeEventos implements Usuario{
    private String nombre;
    private List<Evento> eventosAdministrador;
    
    public AdministradorDeEventos(String nombre) {
        this.nombre = nombre;
        eventosAdministrador = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Evento> getEventosAdministrador() {
        return eventosAdministrador;
    }

    public void setEventosAdministrador(List<Evento> eventosAdministrador) {
        this.eventosAdministrador = eventosAdministrador;
    }

    public Evento buscarEvento(String criterio){

    }

    public boolean reservarBoleto(Boleto boleto){

    }

    public void cancelarReserva(Boleto boleto){

    }

    public void definirPoliticasDeDevolucion(Evento evento){

    }

    public void establecerRestricciones(Eveneto evento){

    }
}
