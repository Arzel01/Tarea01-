/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol;

/**
 *
 * @author ricky
 */
public class BoletoGeneral implements Boleto {
    
    private double precio;
    private String estado;

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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
}
