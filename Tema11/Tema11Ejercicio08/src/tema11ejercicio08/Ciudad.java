/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema11ejercicio08;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

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
        insertarSede();
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
        String resultado = "Nombre: " + this.nombre + "\nSedes:\n";
        for (Sede sede : sedes) {
            resultado = resultado.concat(sede.toString());
        }
        return resultado;
    }
    
    public static String pedirString() {
        Scanner entrada = new Scanner(System.in);
        return entrada.nextLine();
    }
    
    public static float pedirFloat() {
        Scanner entrada = new Scanner(System.in);
        return entrada.nextFloat();
    }
    
    public void insertarSede(){
        char respuesta = 'a';
        while(respuesta == 's' || respuesta == 'S'){
            System.out.print("Introduce el nombre de la sede: ");
            String nombre = pedirString();
        
            System.out.print("Introduce los ingresos de la sede: ");
            float ingresos = pedirFloat();
            
            sedes.add(new Sede(nombre, ingresos));
            
            System.out.print("¿Desea introducir otra sede? (S = Sí, otro = no) ");
            respuesta = pedirString().charAt(0);
        }
    }
    
    public float mediaIngresos(){
        float media = 0;
        
        for (Sede sede : sedes) {
            media += sede.getIngresos();
        }
        media /= sedes.size();
        return media;
    }
    
    public void sedesMayorMedia(float media){
        for (Sede sede : sedes) {
            if (sede.getIngresos() > media) {
                System.out.println(sede.getNombre() + "\n");
            }
        }
    }
    
    public boolean buscarSedePorNombre(String nombre){
        boolean encontrado = false;
        Iterator<Sede> it = sedes.iterator();
        Sede actual;
        while(it.hasNext() && !encontrado){
            actual = it.next();
            
            if(actual.getNombre().equalsIgnoreCase(nombre)){
                encontrado = true;
            }
        }
        return encontrado;
    }
}
