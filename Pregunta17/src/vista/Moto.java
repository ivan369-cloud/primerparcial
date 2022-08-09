/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

/**
 *
 * @author IVAN
 */
public class Moto extends Vterrestre{
    private String moto;

    public Moto(String moto, String terrestre) {
        super(terrestre);
        this.moto = moto;
    }

    public Moto(String moto, String terrestre, String año, String modelo, String color) {
        super(terrestre, año, modelo, color);
        this.moto = moto;
    }

    
    
    public String getMoto() {
        return moto;
    }

    public void setMoto(String moto) {
        this.moto = moto;
    }
    
    
    
    
}
