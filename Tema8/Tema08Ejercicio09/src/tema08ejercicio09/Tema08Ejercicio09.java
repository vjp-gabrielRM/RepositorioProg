/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema08ejercicio09;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Tema08Ejercicio09 {
    
    public static String pedirString(){
        Scanner entrada = new Scanner(System.in);
        return entrada.next();
    }

    public static void mostrarMenu(){
        System.out.println("---- MENÚ ----");
        System.out.println("1. Rellenar notas");
        System.out.println("2. Mostrar notas");
        System.out.println("3. Mejor alumno");
        System.out.println("4. Alumno con más suspensos");
        System.out.println("5. Asignatura más difícil");
        System.out.println("6. Salir");
    }
    
    public static int pedirOpcion(){
        int opcion;
        Scanner entrada = new Scanner(System.in);
        
        try{
            opcion = entrada.nextInt();
        }catch(InputMismatchException e){
            opcion = -1;
            entrada.nextLine();
        }
        return opcion;
    }
    
    public static void rellenarNotas(Alumno[] alumnos){
        for(int i = 0;i < alumnos.length; i++){
            System.out.println("------ ALUMNO " + (i+1) + " ------");

            for(int j = 0; j < alumnos[i].getNotas().length; j++){
                do{
                    System.out.print("Por favor introduzca la nota de " + alumnos[i].getNotas()[j].getNombre() + " de " + alumnos[i].getNombre() + ": ");
                    alumnos[i].getNotas()[j].setNota(pedirOpcion());
                    if(alumnos[i].getNotas()[j].getNota() < 0){
                        System.out.println("No válido, inténtelo de nuevo");
                    }
                }while(alumnos[i].getNotas()[j].getNota() < 0);
            }
            System.out.println("NOTAS DE " + alumnos[i].getNombre() + " ALMACENADAS EXITOSAMENTE\n");
        }
    }
    
    public static void mostrarMuebles(Alumno[] alumnos){
        System.out.println("Estos son todos los muebles: ");
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i].toString());
        }
        System.out.println("");
    }
    
    public static void mostrarPorPrecio(Alumno[] alumnos){
        int precioMax;
        boolean encontrado = false;
        System.out.print("Por favor introduzca el precio máximo que busca: ");
        precioMax = pedirOpcion();
        for(int i = 0; i < array.length; i++){
            if(array[i].getPrecio() <= precioMax){
                System.out.println(array[i].toString());
                encontrado = true;
            }
        }
        if(!encontrado){
            System.out.println("Lo sentimos, no hay ningún mueble con un precio igual o menor a ese");
        }
        System.out.println("");
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;
        Alumno[] alumnos = new Alumno[3];
        String[] nombres = {"Pepe", "Juan", "Marta"};
        for(int i = 0; i < alumnos.length; i++){
            alumnos[i] = new Alumno();
            alumnos[i].setNombre(nombres[i]);
        }
        for(int i = 0; i < alumnos.length; i++){
            alumnos[i].nombrarAsignaturas();
        }
        
        do{
            mostrarMenu();
            opcion = pedirOpcion();
            System.out.println("");
            switch(opcion){
            case 1:
                rellenarMuebles(alumnos);
                break;
            case 2:
                mostrarMuebles(alumnos);
                break;
            case 3:
                mostrarPorPrecio(alumnos);
                break;
            case 6:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Por favor introduzca una opción válida");
                System.out.println("");
            }
        }while(opcion != 6);
    }
    
}
