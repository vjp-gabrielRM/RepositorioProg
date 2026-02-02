/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema08ejercicio09;

/**
 *
 * @author alumno
 */
public class Asignatura {
    private String nombre;
    private float nota;

    public Asignatura() {
        this.nombre = "";
        this.nota = 0;
    }
    
    public Asignatura(String nombre, float nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }
    
    @Override
    public String toString(){
        return this.nombre + ": " + this.nota;
    }
}
