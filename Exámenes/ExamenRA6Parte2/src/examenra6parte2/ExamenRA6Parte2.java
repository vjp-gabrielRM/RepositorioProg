/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenra6parte2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class ExamenRA6Parte2 {

    /**
     * Método estático que muestra un menú en pantalla
     */
    public static void mostrarMenu(){
        System.out.println("1. Añadir un deporte");
        System.out.println("2. Mostrar deportes y equipos");
        System.out.println("3. Buscar equipo en deporte");
        System.out.println("4. Mostrar mapa de equipos");
        System.out.println("5. Mostrar todos los equipos de todos los deportes ordenados de más a menos trofeos");
        System.out.println("6. Salir");
        System.out.print("\nElija una opción: ");
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
     * Método estático que crea un deporte nuevo y añade los equipos que quiera el usuario hasta que decida parar
     * @param deportes 
     */
    public static void nuevoDeporte(ArrayList<Deporte> deportes){
        System.out.println("Por favor introduzca el nombre del deporte: ");
        String nombre = pedirString();
        deportes.add(new Deporte(nombre));
    }
    
    /**
     * Método estático que imprime en pantalla todos los deportes y todos sus equipos
     * @param deportes 
     */
    public static void mostrarTodo(ArrayList<Deporte> deportes){
        for(Deporte deporte : deportes){
            System.out.println(deporte.toString());
        }
    }
    
    /**
     * Método que le pide por teclado al usuario el nombre de un equipo a buscar y muestra el deporte al que pertenece
     * @param deportes 
     */
    public static void buscarEquipo(ArrayList<Deporte> deportes){
        System.out.print("Por favor introduzca el nombre del equipo que busca: ");
        String nombre = pedirString();
        boolean encontrado = false;
        
        for(Deporte deporte : deportes){
            if (deporte.buscarEquipo(nombre)) {
                System.out.println("El equipo " + nombre + " pertenece al deporte: " + deporte.getNombre() + "\n");
                encontrado = true;
            }
        }
        
        if (!encontrado) {
            System.out.println("Equipo no encontrado en ningún deporte\n");
        }
    }
    
    /**
     * Método estático que añade todos los equipos que tengan más de 3 trofeos a un mapa y los muestra en pantalla
     * @param deportes 
     */
    public static void mostrarMapaEquipos(ArrayList<Deporte> deportes){
        HashMap<String, Equipo> mapa = new HashMap<>();
        Iterator<Equipo> it;
        Equipo actual;
        System.out.println("Los equipos con más de 3 trofeos son: ");
        for(Deporte deporte : deportes){
            it = deporte.getEquipos().iterator();
            while(it.hasNext()){
                actual = it.next();
                if (actual.getTrofeos() > 3) {
                    mapa.put(actual.getCodigo(), actual);
                    System.out.println(actual.toString()); //Si el equipo cumple la condición para añadirlo al mapa lo muestro en pantalla
                }
            }
        }
    }
    
    public static void mostrarPorTrofeos(ArrayList<Deporte> deportes){
        
    }
    
    public static void main(String[] args) {
        ArrayList deportes = new ArrayList<Deporte>();
        int opcion;
        
        do{
            try{
                mostrarMenu();
                opcion = pedirNum();
                
                switch(opcion){
                    case 1:
                        nuevoDeporte(deportes);
                        break;
                    case 2:
                        mostrarTodo(deportes);
                        break;
                    case 3:
                        buscarEquipo(deportes);
                        break;
                    case 4:
                        mostrarMapaEquipos(deportes);
                        break;
                    case 5:
                        mostrarPorTrofeos(deportes);
                        break;
                    case 6:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opción no válida, inténtelo de nuevo");
                }
            }catch(InputMismatchException e){
                opcion = 0;
            }
        }while (opcion != 6);
    }
    
}
