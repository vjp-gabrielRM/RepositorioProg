/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema08ejercicio06;

/**
 *
 * @author alumno
 */
public class Empleado {
    private String nombre;
    private int horas;
    private int tarifa;

    public Empleado() {
        this.nombre = "";
        this.horas = 0;
        this.tarifa = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getHoras() {
        return horas;
    }

    public int getTarifa() {
        return tarifa;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public void setTarifa(int tarifa) {
        this.tarifa = tarifa;
    }
    
    public void sueldoBruto(){
        System.out.println(this.nombre + " trabajó " + this.horas + " horas, cobra " + this.tarifa + " euros la hora por lo que le corresponde"
                + " un sueldo de " + this.horas * this.tarifa + " euros.");
    }
}
