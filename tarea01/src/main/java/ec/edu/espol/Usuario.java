package ec.edu.espol;

public interface Usuario {
    Evento buscarEvento(String criterio);
    boolean reservarBoleto(Boleto boleto);
    void cancelarReserva(Boleto boleto);
}
