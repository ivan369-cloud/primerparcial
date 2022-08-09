/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

/**
 *
 * @author IVAN
 */
public class Automovil extends Vterrestre{
    private String auto;

    public Automovil(String auto, String terrestre) {
        super(terrestre);
        this.auto = auto;
    }

    public Automovil(String auto, String terrestre, String año, String modelo, String color) {
        super(terrestre, año, modelo, color);
        this.auto = auto;
    }

        
    public String getAuto() {
        return auto;
    }

    public void setAuto(String auto) {
        this.auto = auto;
    }
    
    
    
    
}
