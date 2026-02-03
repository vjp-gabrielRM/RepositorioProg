/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema08ejercicio07;

/**
 *
 * @author alumno
 */
public class Dia {
    private String nombre;
    private int temperatura;

    public Dia() {
        this.nombre = "";
        this.temperatura = 0;
    }
    
    public Dia(String nombre, int temperatura) {
        this.nombre = nombre;
        this.temperatura = temperatura;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }
    
    @Override
    public String toString(){
        return "";
    }
}
