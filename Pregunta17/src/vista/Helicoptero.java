/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

/**
 *
 * @author IVAN
 */
public class Helicoptero extends Vaereo {
    private String helicoptero;

    public Helicoptero(String helicoptero, String aereo) {
        super(aereo);
        this.helicoptero = helicoptero;
    }

    public Helicoptero(String helicoptero, String aereo, String año, String modelo, String color) {
        super(aereo, año, modelo, color);
        this.helicoptero = helicoptero;
    }

    
    
    public String getHelicoptero() {
        return helicoptero;
    }

    public void setHelicoptero(String helicoptero) {
        this.helicoptero = helicoptero;
    }
    
    
    
}
