/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema07ejercicio03;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author alumno
 */
public class Tema07Ejercicio03 {
    
    public static int pedirLongitud(){
        int longitud = 0;
        Scanner entrada = new Scanner(System.in);
        
        while(longitud < 1 || longitud > 10){
            System.out.println("Introduzca la longitud del array deseado entre 1 y 10");
            try{
                longitud = entrada.nextInt();
            }catch(InputMismatchException e){
                entrada.nextLine();
            }
            if(longitud < 1 || longitud > 10){
                System.out.println("No válido, introduzca un número entero del 1 al 10");
            }
        }
        
        return longitud;
    }
    
    public static void mostrarArray(int array[]){
        for(int i = 0; i < array.length; i++){
            System.out.println("El " + (i+1) + "º número del array es " + array[i]);
        }
    }
    
    public static void rellenarArray(int array[]){
        for(int i = 0; i < array.length; i++){
            array[i] = (int) (Math.random() * (7 - 1) + 1);
        }
    }
    
    public static void main(String[] args) {
        int[] array = new int[pedirLongitud()];
        rellenarArray(array);
        mostrarArray(array);
    }
    
}
