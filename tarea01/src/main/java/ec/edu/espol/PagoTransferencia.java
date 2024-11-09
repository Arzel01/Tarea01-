/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol;

/**
 *
 * @author ricky
 */
public class PagoTransferencia implements ProcesadorDePago{
    private String cuentaBancaria;

    @Override
    public void procesarPago(double monto) {
    }

    @Override
    public void cancelarPago() {
        
    }

    public String getCuentaBancaria() {
        return cuentaBancaria;
    }

    public void setCuentaBancaria(String cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }
    
    
    
}
