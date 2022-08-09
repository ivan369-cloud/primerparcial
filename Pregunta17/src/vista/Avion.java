/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

/**
 *
 * @author IVAN
 */
public class Avion extends Vaereo{
    private String avion;

    public Avion(String avion, String aereo) {
        super(aereo);
        this.avion = avion;
    }

    public Avion(String avion, String aereo, String año, String modelo, String color) {
        super(aereo, año, modelo, color);
        this.avion = avion;
    }

    
    
    public String getAvion() {
        return avion;
    }

    public void setAvion(String avion) {
        this.avion = avion;
    }
    
    
}
