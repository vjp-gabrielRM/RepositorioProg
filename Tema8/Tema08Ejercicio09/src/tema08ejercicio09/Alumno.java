/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema08ejercicio09;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Alumno {
    private String nombre;
    private Asignatura[] notas;
    private final String[] NOMBRES_ASIGNATURAS = {"Lengua", "Mates", "Historia", "Física"};

    public Alumno() {
        this.nombre = "";
        this.notas = new Asignatura[4];
        
        for(int i = 0; i < 4; i++){
            this.notas[i] = new Asignatura(NOMBRES_ASIGNATURAS[i]);
        }
    }
    
    public Alumno(String nombre, Asignatura[] notas) {
        this.nombre = nombre;
        this.notas = notas;
    }
    
    public Alumno(String nombre) {
        this.nombre = nombre;
        this.notas = new Asignatura[4];
        
        for(int i = 0; i < 4; i++){
            this.notas[i] = new Asignatura(NOMBRES_ASIGNATURAS[i]);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Asignatura[] getNotas() {
        return notas;
    }

    public void setNotas(Asignatura[] notas) {
        this.notas = notas;
    }
    
    @Override
    public String toString(){
        return "Estas son las notas de " + this.nombre + ":\n"
                + this.notas[0].toString() + "\n"
                + this.notas[1].toString() + "\n"
                + this.notas[2].toString() + "\n"
                + this.notas[3].toString() + "\n";
    }
    
    public void ponerNotas(){
        Scanner entrada = new Scanner(System.in);
        /*for(int i = 0; i < this.notas.length; i++){
            System.out.print("Por favor introduzca la nota de " + this.notas[i].getNombre() + " de " + this.nombre + ": ");
            this.notas[i].setNota(entrada.nextFloat());
        }*/
        for(int i = 0; i < this.notas.length; i++){
            this.notas[i].setNota((float) Math.random() *10);
        }
    }
    
    public float calcularMedia(){
        float suma = 0, media = 0;
        for(int i = 0; i < this.notas.length; i++){
            suma += this.notas[i].getNota();
        }
        media = suma / this.notas.length;
        return media;
    }
}
