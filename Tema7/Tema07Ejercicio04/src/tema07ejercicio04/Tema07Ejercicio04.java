/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema07ejercicio04;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author alumno
 */
public class Tema07Ejercicio04 {
    
    public static void rellenarArray(int array[][]){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                array[i][j] = (int) (Math.random() * (201 - 100) + 100);
            }
        }
    }
    
    public static void mostrarPares(int array[][]){
        System.out.println("Los elementos pares del array son:");
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                if(array[i][j] % 2 == 0){
                    System.out.println("Columna " + (i+1) + " y fila " + (j+1) + " del array, " + array[i][j]);
                }
            }
        }
    }
    
    public static void mostrarArray(int array[][]){
        System.out.println("El array completo es:");
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }
    }
    
    public static void main(String[] args) {
        int[][] array = new int[4][3];
        rellenarArray(array);
        mostrarArray(array);        //Este método no es necesario pero lo pongo para comprobar que funciona
        mostrarPares(array);
    }
    
}
