/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema12ejercicio26;

import java.io.Serializable;

/**
 *
 * @author alumno
 */
public class Bebida implements Serializable {
    private String nombre;
    private float precio;
    private int stock;

    public Bebida() {
        this.nombre = "";
        this.precio = 0;
        this.stock = 0;
    }
    
    public Bebida(String nombre, float precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    @Override
    public String toString(){
        return this.nombre + 
                "\nPrecio: " + this.precio + 
                " euro(s)\nCantidad disponible: " + this.stock;
    }
}
