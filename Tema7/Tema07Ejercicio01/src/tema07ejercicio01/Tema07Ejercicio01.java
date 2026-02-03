/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema07ejercicio01;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Tema07Ejercicio01 {


    public static int[] pedirArray(int array[]){
        Scanner entrada = new Scanner(System.in);
        
        for(int i = 0; i < array.length; i++){
            System.out.println("Introduzca el " + (i+1) + "º número del array:");
            array[i] = entrada.nextInt();
        }
        return array;
    }
    
    public static void mostrarPares(int array[]){
        System.out.println("\nLos elementos pares del array son:");
        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 == 0){
                System.out.println("El " + (i+1) + "º número del array, " + array[i]);
            }
        }
    }
    
    public static void main(String[] args) {
        int[] array = new int[10];
        array = pedirArray(array);
        
        mostrarPares(array);
    }
    
}
