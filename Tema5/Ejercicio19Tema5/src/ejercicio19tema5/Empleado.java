/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio19tema5;

/**
 *
 * @author alumno
 */
public class Empleado {
    private String nombre;
    private int horas;
    private int tarifa;
    
    public Empleado(){
        this.nombre = "";
        this.horas = 0;
        this.tarifa = 0;
    }
    
    public Empleado(String nombre, int horas, int tarifa){
        this.nombre = nombre;
        this.horas = horas;
        this.tarifa = tarifa;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public int getHoras(){
        return this.horas;
    }
    
    public void setHoras(int horas){
        this.horas = horas;
    }
    
    public int getTarifa(){
        return this.tarifa;
    }
    
    public void setTarifa(int tarifa){
        this.tarifa = tarifa;
    }
    
    public int salario(){
        int horasExtra = 0;
        int horasNormales = 0;
        if(this.horas>40){
            horasExtra = (this.horas - 40);
            horasNormales = 40;
        } else {
            horasNormales = this.horas;
        }
        return ((horasNormales * this.tarifa) + (horasExtra * (this.tarifa + (this.tarifa / 2))));
    }
    
    @Override
    public String toString(){
        return this.nombre + " trabajó " + this.horas + " horas, cobra " + this.tarifa + " euros la hora por lo que le corresponde un sueldo de " + salario() + " euros";
    }
}
