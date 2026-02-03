/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema07ejercicio02;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Tema07Ejercicio02 {
    
    public static int pedirDato(){
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }
    
    public static void mostrarArray(int array[]){
        for(int i = 0; i < array.length; i++){
            System.out.println("El " + (i+1) + "º número del array es " + array[i]);
        }
    }
    
    public static void intercambioDatos(int array[], int posicion1, int posicion2){
        int aux;
        System.out.println("\nIntercambiando " + (posicion1 + 1) + "º y " + (posicion2 + 1) + "º elemento\n");
        aux = array[posicion1];
        array[posicion1] = array[posicion2];
        array[posicion2] = aux;
    }
    
    public static void main(String[] args) {
        int[] array = new int[7];
        
        for(int i = 0; i < array.length; i++){
            System.out.println("Introduzca el " + (i+1) + "º número del array:");
            array[i] = pedirDato();
        }
        
        mostrarArray(array);
        
        intercambioDatos(array, 1, 3);
        
        mostrarArray(array);
    }
    
}
