/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema11ejercicio06;

/**
 *
 * @author alumno
 */
public class Donacion {
    private String nombre;
    private float cantidad;

    public Donacion() {
        this.nombre = "";
        this.cantidad = 0;
    }
    
    public Donacion(String nombre, float cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }
    
    @Override
    public String toString(){
        return this.nombre + ": " + this.cantidad + " euros";
    }
}
