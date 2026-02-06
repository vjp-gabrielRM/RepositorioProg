/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema08ejercicio15;

/**
 *
 * @author alumno
 */
public class Socio {
    private String nombre;
    private float abono;

    public Socio() {
        this.nombre = "";
        this.abono = 0;
    }
    
    public Socio(String nombre, float abono) {
        this.nombre = nombre;
        this.abono = abono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getAbono() {
        return abono;
    }

    public void setAbono(float abono) {
        this.abono = abono;
    }
    
    @Override
    public String toString(){
        return this.nombre + ", con un abono de " + this.abono;
    }
}
