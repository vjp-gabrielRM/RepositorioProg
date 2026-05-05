/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenra6parte2;

/**
 *
 * @author alumno
 */
public class Equipo {
    private String codigo;
    private String nombre;
    private int trofeos;

    public Equipo() {
        this.codigo = "";
        this.nombre = "";
        this.trofeos = 0;
    }
    
    public Equipo(String codigo, String nombre, int trofeos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.trofeos = trofeos;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTrofeos() {
        return trofeos;
    }

    public void setTrofeos(int trofeos) {
        this.trofeos = trofeos;
    }
    
    @Override
    public String toString(){
        return "\nCódigo: " + this.codigo + "\nNombre: " + this.nombre + "\nCantidad de trofeos: " + this.trofeos + "\n";
    }
    
    public boolean comprobarNombre(String nombre){
        return this.nombre.equalsIgnoreCase(nombre);
    }
}
