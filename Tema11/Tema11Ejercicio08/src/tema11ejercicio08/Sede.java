/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema11ejercicio08;

/**
 *
 * @author alumno
 */
public class Sede {
    private String nombre;
    private float ingresos;

    public Sede() {
        this.nombre = "";
        this.ingresos = 0;
    }
    
    public Sede(String nombre, float ingresos) {
        this.nombre = nombre;
        this.ingresos = ingresos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getIngresos() {
        return ingresos;
    }

    public void setIngresos(float ingresos) {
        this.ingresos = ingresos;
    }
    
    @Override
    public String toString(){
        return "    Nombre: " + this.nombre + "\n   Ingresos: " + this.ingresos + " euros\n\n";
    }
}
