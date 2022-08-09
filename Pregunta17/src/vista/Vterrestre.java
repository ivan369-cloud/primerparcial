/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

/**
 *
 * @author IVAN
 */
public class Vterrestre extends Vehiculos{
    private String terrestre;

    public Vterrestre(String terrestre) {
        this.terrestre = terrestre;
    }

    public Vterrestre(String terrestre, String año, String modelo, String color) {
        super(año, modelo, color);
        this.terrestre = terrestre;
    }

       
    public String getTerrestre() {
        return terrestre;
    }

    public void setTerrestre(String terrestre) {
        this.terrestre = terrestre;
    }

   
    
   
    
    
}
