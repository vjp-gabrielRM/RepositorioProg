/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema11ejercicio08;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Tema11Ejercicio08 {

    public static void mostrarMenu() {
        System.out.println("---- MENÚ ----\n");
        System.out.println("1. Añadir ciudad (con al menos una sede)");
        System.out.println("2. Mostrar ciudades y sus sedes");
        System.out.println("3. Sedes con ingresos superiores a la media");
        System.out.println("4. Mostrar sede por nombre");
        System.out.println("5. Añadir sede");
        System.out.println("6. Mostrar sedes por ingresos de mayor a menor");
        System.out.println("7. Salir\n");
        System.out.print("Elija una opción: ");
    }
    
    public static int pedirNum() {
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }
    
    public static String pedirString() {
        Scanner entrada = new Scanner(System.in);
        return entrada.nextLine();
    }
    
    public static void nuevaCiudad(ArrayList<Ciudad> ciudades){
        System.out.print("Por favor introduzca el nombre de la ciudad: ");
        String nombre = pedirString();
        ciudades.add(new Ciudad(nombre));
        System.out.println("");
    }
    
    public static void mostrarCiudades(ArrayList<Ciudad> ciudades){
        for (Ciudad ciudad : ciudades) {
            System.out.println(ciudad.toString());
        }
        System.out.println("");
    }
    
    public static void mediaMayor(ArrayList<Ciudad> ciudades){
        float media = 0;
        for (Ciudad ciudad : ciudades) {
            media += ciudad.mediaIngresos();
        }
        media /= ciudades.size();
        System.out.println("Las sedes con ingresos mayores a la media son:");
        for (Ciudad ciudad : ciudades) {
            ciudad.sedesMayorMedia(media);
        }
        System.out.println("");
    }
    
    public static boolean buscarPorNombre(ArrayList<Ciudad> ciudades){
        boolean encontrado = false;
        Iterator<Ciudad> it = ciudades.iterator();
        Ciudad actual;
        System.out.print("Introduzca el nombre de la sede que busca: ");
        String nombre = pedirString();
        
        while(it.hasNext() && !encontrado){
            actual = it.next();
            encontrado = actual.buscarSedePorNombre(nombre);
        }
        return encontrado;
    }
    
    public static void nuevaSede(ArrayList<Ciudad> ciudades){
        System.out.print("Por favor introduzca el nombre de la ciudad a la que añadir la sede: ");
        String nombreCiudad = pedirString();
        
        boolean encontrado = false;
        Iterator<Ciudad> it = ciudades.iterator();
        Ciudad actual = null;
        while(it.hasNext() && !encontrado){
            actual = it.next();
            
            if(actual.getNombre().equalsIgnoreCase(nombreCiudad)){
                encontrado = true;
            }
        }
        
        if (encontrado) {
            actual.insertarSede();
        }
    }
    
    public static void ordenarSedesPorIngresos(ArrayList<Ciudad> ciudades){
        ArrayList<Sede> ordenadas = new ArrayList<>();

        for (Ciudad ciudad : ciudades) {
            ordenadas.addAll(ciudad.getSedes());
        }
        
        ordenadas.sort((sede1, sede2) -> Float.compare(sede1.getIngresos(), sede2.getIngresos()));

        System.out.println("Estas son todas las sedes ordenadas por ingresos de mayor a menor:\n");
        for (Sede sede : ordenadas) {
            System.out.println(sede);
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Ciudad> ciudades = new ArrayList<>();
        int opcion;

        do {
            mostrarMenu();
            try {
                opcion = pedirNum();
            } catch (InputMismatchException e) {
                opcion = -1;
            }

            switch (opcion) {
                case 1:
                    nuevaCiudad(ciudades);
                    break;
                case 2:
                    mostrarCiudades(ciudades);
                    break;
                case 3:
                    mediaMayor(ciudades);
                    break;
                case 4:
                    if(buscarPorNombre(ciudades)){
                        System.out.println("Sede encontrada\n");
                    }else{
                        System.out.println("Sede no encontrada\n");
                    }
                    break;
                case 5:
                    nuevaSede(ciudades);
                    break;
                case 6:
                    ordenarSedesPorIngresos(ciudades);
                    break;
                case 7:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida, inténtelo de nuevo");
            }
        } while (opcion != 7);
    }
    
}
