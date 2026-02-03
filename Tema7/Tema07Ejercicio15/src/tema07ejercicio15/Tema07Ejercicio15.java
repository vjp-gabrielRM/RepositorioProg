/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema07ejercicio15;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author alumno
 */
public class Tema07Ejercicio15 {
    
    /**
     * Método que muestra un menú al usuario
     */
    public static void mostrarMenu(){
        System.out.println("---- Menú ----\n");
        System.out.println("1. Rellenar con ventas mensuales del año");
        System.out.println("2. Mostrar las ventas");
        System.out.println("3. Mostrar las ventas en orden inverso");
        System.out.println("4. Mostrar el total de ventas del año");
        System.out.println("5. Mostrar el total de ventas de los meses pares");
        System.out.println("6. Mostrar el mes con más ventas del año");
        System.out.println("7. Salir\n");
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
     * Método que rellena el array con número aleatorios del 10 al 100
     * @param array 
     */
    public static void rellenarArray(int array[]){
        for(int i = 0; i < array.length; i++){
            array[i] = (int) (Math.random() * (101 - 10) + 10);
        }
        System.out.println("Array creado");
    }
    
    /**
     * Método que muestra todos los datos del array
     * @param array
     * @param meses 
     */
    public static void mostrarArray(int array[], String meses[]){
        for(int i = 0; i < array.length; i++){
            System.out.println("El mes de " + meses[i] + " se hicieron un total de " + array[i] + " ventas");
        }
    }
    
    /**
     * Método que muestra todos los datos del array en orden inverso, de mayor índice a menor
     * @param array
     * @param meses 
     */
    public static void mostrarArrayReves(int array[], String meses[]){
        for(int i = array.length - 1; i >= 0; i--){
            System.out.println("El mes de " + meses[i] + " se hicieron un total de " + array[i] + " ventas");
        }
    }
    
    /**
     * Método que suma todos los datos del array y muestra el resultado en pantalla
     * @param array 
     */
    public static void mostrarSuma(int array[]){
        int suma = 0;
        
        for(int i = 0; i < array.length; i++){
            suma += array[i];
        }
        
        System.out.println("El total de ventas del año ha sido de " + suma);
    }
    
    /**
     * Método que suma los elementos pares del array (índice impar) y muestra el resultado en pantalla
     * @param array 
     */
    public static void mostrarSumaPares(int array[]){
        int suma = 0;
        
        for(int i = 1; i < array.length; i+=2){
            suma += array[i];
        }
        
        System.out.println("El total de ventas de los meses pares del año ha sido de " + suma);
    }
    
    /**
     * Método que compara todos los elementos del array y muestra el mayor de todos en pantalla
     * @param array
     * @param meses 
     */
    public static void mostrarMayorNum(int array[], String meses[]){
        int pos = 0;
        for(int i = 1; i < array.length; i++){
            if(i < array.length){
                if(array[pos] < array[i]){
                    pos = i;
                }
            }
        }
        System.out.println("El mes con más ventas ha sido " + meses[pos] + " con " + array[pos] + " ventas");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;
        int[] array = new int[12];
        String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        
        do{
            mostrarMenu();
            opcion = pedirOpcion();
            if(opcion < 1 || opcion > 7){
                System.out.println("Opción no válida, por favor inténtelo de nuevo");
            }
            switch(opcion){
                case 1:
                    rellenarArray(array);
                    break;
                    
                case 2:
                    mostrarArray(array, meses);
                    break;
                
                case 3:
                    mostrarArrayReves(array, meses);
                    break;
                    
                case 4:
                    mostrarSuma(array);
                    break;
                    
                case 5:
                    mostrarSumaPares(array);
                    break;
                    
                case 6:
                    mostrarMayorNum(array, meses);
                    break;
            }
        }while(opcion!=7);
        
    }
    
}
