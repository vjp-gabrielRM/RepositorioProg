/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema08ejercicio12;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Tema08Ejercicio12 {
    
    public static String pedirString(){
        Scanner entrada = new Scanner(System.in);
        return entrada.next();
    }

    public static void mostrarMenu(){
        System.out.println("---- MENÚ ----");
        System.out.println("1. Rellenar muebles");
        System.out.println("2. Mostrar muebles");
        System.out.println("3. Mostrar muebles por precio");
        System.out.println("4. Salir");
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
    
    public static void rellenarMuebles(Mueble[] array){
        for(int i = 0;i < array.length; i++){
            System.out.println("------ MUEBLE " + (i+1) + " ------");
            
            System.out.print("Por favor introduzca una breve descripción del mueble (Puede no tenerla): ");
            array[i].setDescripcion(pedirString());
            
            do{
                System.out.print("Por favor introduzca el precio del mueble: ");
                array[i].setPrecio(pedirOpcion());
                if(array[i].getPrecio() <= 0){
                    System.out.println("No válido, inténtelo de nuevo");
                }
            }while(array[i].getPrecio() <= 0);
            
            System.out.println("MUEBLE " + (i+1) + " ALMACENADO EXITOSAMENTE\n");
        }
    }
    
    public static void mostrarMuebles(Mueble[] array){
        System.out.println("Estos son todos los muebles: ");
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i].toString());
        }
        System.out.println("");
    }
    
    public static void mostrarPorPrecio(Mueble[] array){
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
        Mueble[] array = new Mueble[4];
        for(int i = 0; i < array.length; i++){
            array[i] = new Mueble();
        }
        
        do{
            mostrarMenu();
            opcion = pedirOpcion();
            System.out.println("");
            switch(opcion){
            case 1:
                rellenarMuebles(array);
                break;
            case 2:
                mostrarMuebles(array);
                break;
            case 3:
                mostrarPorPrecio(array);
                break;
            case 4:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Por favor introduzca una opción válida");
                System.out.println("");
            }
        }while(opcion != 4);
    }
    
}
