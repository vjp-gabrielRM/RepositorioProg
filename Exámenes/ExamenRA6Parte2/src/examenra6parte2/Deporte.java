/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenra6parte2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Deporte {
    private String nombre;
    private HashSet equipos;

    public Deporte() {
        this.nombre = "";
        this.equipos = new HashSet<Equipo>();
    }
    
    public Deporte(String nombre) {
        this.nombre = nombre;
        this.equipos = new HashSet<Equipo>();
        nuevoEquipo();
    }
    
    public Deporte(String nombre, HashSet equipos) {
        this.nombre = nombre;
        this.equipos = equipos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashSet getEquipos() {
        return equipos;
    }

    public void setEquipos(HashSet equipos) {
        this.equipos = equipos;
    }
    
    @Override
    public String toString(){
        String equiposString = "";
        for(Object equipo : equipos){
            equiposString = equiposString.concat(equipo.toString());
        }
        return this.nombre + "\nEquipos:\n" + equiposString;
    }
    
    /**
     * Método estático que pide un número entero al usuario por teclado
     * @return el número que introduce el usuario
     */
    public static int pedirNum(){
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }
    
    /**
     * Método estático que pide un String al usuario por teclado
     * @return el String que introduce el usuario
     */
    public static String pedirString(){
        Scanner entrada = new Scanner(System.in);
        return entrada.nextLine();
    }
    
    /**
     * Método que añade un equipo con los datos que introduce el usuario al HashSet equipos
     */
    public void nuevoEquipo(){
        char opcion;
        String codigo, nombreEquipo;
        int trofeos;        
        
        do{
            System.out.println("(S = SÍ / Cualquier otra cosa = NO)");
            System.out.print("¿Desea introducir un equipo al deporte? ");
            opcion = pedirString().toLowerCase().charAt(0);
            
            if (opcion == 's') {
                System.out.println("Por favor introduzca el código del equipo: ");
                codigo = pedirString();
                System.out.println("Por favor introduzca el nombre del equipo: ");
                nombreEquipo = pedirString();
                System.out.println("Por favor introduzca el número de trofeos del equipo: ");
                trofeos = pedirNum();
                equipos.add(new Equipo(codigo, nombreEquipo, trofeos));
            } else{
                System.out.println("Saliendo...");
            }
        }while (opcion == 's');
    }
    
    public boolean buscarEquipo(String nombre){
        Iterator<Equipo> it = equipos.iterator();
        boolean encontrado = false;
        Equipo actual;
        while(it.hasNext() && !encontrado){
            actual = it.next();
            if (actual.getNombre().equalsIgnoreCase(nombre)) {
                encontrado = true;
            }
        }
        
        return encontrado;
    }
}
