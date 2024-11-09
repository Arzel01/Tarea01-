package ec.edu.espol;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ricky
 */
public class BoletoVIP implements Boleto {
    private double precio;
    private String estodo;
    private String beneficios;

    @Override
    public void reservar() {
    }

    @Override
    public void cancelarReserva() {
    }

    @Override
    public void vender() {
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getEstodo() {
        return estodo;
    }

    public void setEstodo(String estodo) {
        this.estodo = estodo;
    }

    public String getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(String beneficios) {
        this.beneficios = beneficios;
    }
    
    
    
}
