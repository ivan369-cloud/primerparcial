/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

/**
 *
 * @author IVAN
 */
abstract class Vehiculos {
    private String año,modelo,color;

    public Vehiculos(){}
    public Vehiculos(String año, String modelo, String color) {
        this.año = año;
        this.modelo = modelo;
        this.color = color;
    }

            
    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    protected void agregar(){}
}
