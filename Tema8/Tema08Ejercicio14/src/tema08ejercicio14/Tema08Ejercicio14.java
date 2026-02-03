/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema08ejercicio14;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author eseva
 */
public class Tema08Ejercicio14 {

    public static String pedirString(){
        Scanner entrada = new Scanner(System.in);
        return entrada.next();
    }
    
    public static float pedirFloat(){
        Scanner entrada = new Scanner(System.in);
        return entrada.nextFloat();
    }

    public static void mostrarMenu(){
        System.out.println("---- MENÚ ----");
        System.out.println("1. Rellenar un alumno");
        System.out.println("2. Mostrar alumnos");
        System.out.println("3. Mostrar alumnos con una media mayor a la dada");
        System.out.println("4. Mostrar cantidad de alumnos con una media suspensa");
        System.out.println("5. Buscar alumnos por nombre");
        System.out.println("6. Salir");
    }
    
    public static int pedirOpcion(){
        int opcion;
        Scanner entrada = new Scanner(System.in);
        
        try{
            opcion = entrada.nextInt();
        }catch(InputMismatchException e){
            opcion = 0;
            entrada.nextLine();
        }
        return opcion;
    }

    public static void rellenarAlumno(Alumno[] array){
        int posicion;
        
        do{
            System.out.print("Por favor introduzca la posición del alumno a rellenar: ");
            posicion = pedirOpcion();
        }while(posicion < 0 || posicion > 4);
            
            System.out.print("Por favor introduzca el nombre del alumno: ");
            array[posicion].setNombre(pedirString());
            
            System.out.print("Por favor introduzca la edad del alumno: ");
            array[posicion].setEdad(pedirOpcion());
            
            System.out.print("Por favor introduzca la media del alumno: ");
            array[posicion].setNotaMedia(pedirFloat());
            
            System.out.println("DATOS DE " + array[posicion].getNombre() + " ALMACENADO EXITOSAMENTE\n");
    }
        
    public static void mostrarAlumnos(Alumno[] array){
        System.out.println("Estos son todos los alumnos: ");
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i].toString());
        }
        System.out.println("");
    }
    
    public static void mostrarPorMedia(Alumno[] array){
        float media;
        boolean encontrado = false;
        System.out.print("Por favor introduzca la nota media mínima: ");
        media = pedirFloat();
        for(int i = 0; i < array.length; i++){
            if(array[i].getNotaMedia() >= media){
                System.out.println(array[i].toString());
                encontrado = true;
            }
        }
        if(!encontrado){
            System.out.println("Lo sentimos, no hay ningún alumno con una media igual superior a esa");
        }
        System.out.println("");
    }
    
    public static void mostrarSuspensos(Alumno[] array){
        int suspensos = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i].getNotaMedia() < 5){
                suspensos++;
            }
        }
        System.out.println("El número de alumnos suspensos es " + suspensos);
    }
    
    public static void buscarAlumno(Alumno[] array){
        String nombre;
        System.out.print("Por favor introduzca el nombre que quiere buscar: ");
        nombre = pedirString();
        
        for(int i = 0; i < array.length; i++){
            if(array[i].getNombre().equals(nombre)){
                System.out.println(array[i].toString());
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;
        Alumno[] array = new Alumno[5];
        for(int i = 0; i < array.length; i++){
            array[i] = new Alumno();
        }
        
        do{
            mostrarMenu();
            opcion = pedirOpcion();
            System.out.println("");
            switch(opcion){
            case 1:
                rellenarAlumno(array);
                break;
            case 2:
                mostrarAlumnos(array);
                break;
            case 3:
                mostrarPorMedia(array);
                break;
            case 4:
                mostrarSuspensos(array);
                break;
            case 5:
                buscarAlumno(array);
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
