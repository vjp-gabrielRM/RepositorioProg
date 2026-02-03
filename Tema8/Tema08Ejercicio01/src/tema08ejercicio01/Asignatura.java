/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema08ejercicio01;

/**
 *
 * @author alumno
 */
public class Asignatura {
    private String nombre;
    private float nota;

    public Asignatura(String nombre) {
        this.nombre = nombre;
        this.nota = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }
}
