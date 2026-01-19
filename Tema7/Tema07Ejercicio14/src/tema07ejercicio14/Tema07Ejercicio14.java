/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema07ejercicio14;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author alumno
 */
public class Tema07Ejercicio14 {
    
    /**
     * Método que muestra un menú al usuario
     */
    public static void mostrarMenu(){
        System.out.println("---- Menú ----\n");
        System.out.println("1. Rellenar las temperaturas");
        System.out.println("2. Mostrar las temperaturas");
        System.out.println("3. Visualizar la temperatura media del mes");
        System.out.println("4. Día o días más calurosos del mes");
        System.out.println("5. Salir\n");
    }
    
    /**
     * Método que pide un dato al usuario con control de excepciones
     * @return el dato introducido por el usuario
     */
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
    
    /**
     * Método que rellena el array con datos introducidos por el usuario
     * @param array 
     */
    public static void rellenarArray(int array[][], String dias[]){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                System.out.println("Por favor introduzca la temperatura del " + dias[j]
                        + " de la semana " + (i+1) + " del mes");
                array[i][j] = pedirOpcion();
            }
        }
    }
    
    /**
     * Método que muestra todos los datos del array
     * @param array
     * @param dias 
     */
    public static void mostrarArray(int array[][], String dias[]){
        System.out.println("Las temperaturas de todo el mes son: ");
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                System.out.println("El " + dias[j] + " de la semana " + (i+1) + ": " + array[i][j] + " grados");
            }
        }
    }
    
    /**
     * Método que hace la media de todos los datos del array y muestra el resultado en pantalla
     * @param array 
     */
    public static void mostrarMedia(int array[][]){
        float suma = 0;
        float media;
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                suma += array[i][j];
            }
        }
        media = (suma / (float) (array.length * array[0].length));
        System.out.printf("La temperatura media del mes es de %.1f grados\n", media);
    }
    
    /**
     * Método que compara todos los elementos del array y muestra el mayor de todos en pantalla
     * @param array
     * @param dias 
     */
    public static void mostrarMayorTemp(int array[][], String dias[]){
        int posi = 0, posj = 0, mayor;
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                if(array[posi][posj] < array[i][j]){
                    posi = i;
                    posj = j;
                }
            }
        }
        mayor = array[posi][posj];
        System.out.println("Los días más calurosos del año han sido: ");
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                if(mayor == array[i][j]){
                System.out.println("El " + dias[j] + " de la semana " + (i+1) + " con " + mayor + " grados");
                }
            }
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;
        int[][] array = new int[4][7];
        String[] dias = {"lunes", "martes", "miércoles", "jueves", "viernes", "sábado", "domingo"};
        
        do{
            mostrarMenu();
            opcion = pedirOpcion();
            switch(opcion){
                case 1:
                    rellenarArray(array, dias);
                    break;
                    
                case 2:
                    mostrarArray(array, dias);
                    break;
                
                case 3:
                    mostrarMedia(array);
                    break;
                    
                case 4:
                    mostrarMayorTemp(array, dias);
                    break;
                default:
                    System.out.println("Opción no válida, por favor inténtelo de nuevo");
            }
        }while(opcion!=5);
        
    }
    
}
