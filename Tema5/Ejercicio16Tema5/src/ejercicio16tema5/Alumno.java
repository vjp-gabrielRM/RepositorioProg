/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio16tema5;

/**
 *
 * @author alumno
 */
public class Alumno {
    private String nombre;
    private int nota;
    
    public Alumno(){
        this.nombre = "";
        this.nota = 0;
    }
    
    public Alumno(String nombre, int nota){
        this.nombre = nombre;
        this.nota = nota;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public int getNota(){
        return this.nota;
    }
    
    public void setNota(int nota){
        this.nota = nota;
    }
    
    public void evaluar(){
        if(this.nota >= 0 && this.nota < 5){
            System.out.println(this.nombre + " tiene un suspenso");
        } else if(this.nota >= 5 && this.nota < 7){
            System.out.println(this.nombre + " tiene un aprobado");
        } else if(this.nota >= 7 && this.nota < 9){
            System.out.println(this.nombre + " tiene un notable");
        } else if(this.nota >= 9 && this.nota <= 10){
            System.out.println(this.nombre + " tiene un sobresaliente");
        }
    }
    
    @Override
    public String toString(){
        return this.nombre + " tiene de nota un " + this.nota;
    }
}
