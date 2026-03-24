/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema11ejercicio08;

import java.util.HashSet;

/**
 *
 * @author alumno
 */
public class Ciudad {
    private String nombre;
    private HashSet<Sede> sedes;

    public Ciudad() {
        this.nombre = "";
        this.sedes = new HashSet<Sede>();
    }
    
    public Ciudad(String nombre, HashSet<Sede> sedes) {
        this.nombre = nombre;
        this.sedes = sedes;
    }
    
    public Ciudad(String nombre) {
        this.nombre = nombre;
        this.sedes = new HashSet<Sede>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashSet<Sede> getSedes() {
        return sedes;
    }

    public void setSedes(HashSet<Sede> sedes) {
        this.sedes = sedes;
    }
    
    @Override
    public String toString(){
        return "";
    }
}
