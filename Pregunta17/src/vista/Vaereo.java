/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

/**
 *
 * @author IVAN
 */
public class Vaereo extends Vehiculos {
    private String aereo;

    public Vaereo(String aereo) {
        this.aereo = aereo;
    }

    public Vaereo(String aereo, String año, String modelo, String color) {
        super(año, modelo, color);
        this.aereo = aereo;
    }

    
    
    public String getAereo() {
        return aereo;
    }

    public void setAereo(String aereo) {
        this.aereo = aereo;
    }
    
    
}
