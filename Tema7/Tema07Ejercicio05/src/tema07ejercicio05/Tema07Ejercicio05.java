/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema07ejercicio05;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Tema07Ejercicio05 {
    
    /**
     * Método que rellena un array bidimensional con datos introducidos por el usuario
     * @param array 
     */
    public static void rellenarArray(int array[][]){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                System.out.println("Por favor introduzca un número entero para la fila " + (i+1)
                        + " y la columna " + (j+1) + " de la matriz");
                array[i][j] = pedirNum();
            }
        }
    }
    
    /**
     * Método que pide un número entero al usuario
     * @return el número introducido
     */
    public static int pedirNum(){
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }
    
    /**
     * Método que muestra un array bidimensional completo en forma de matriz
     * @param array 
     */
    public static void mostrarArray(int array[][]){
        System.out.println("El array completo es:");
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }
    }
    
    /**
     * Método que suma todos los elementos de un array bidimensional y muestra el resultado
     * @param array 
     */
    public static void mostrarSuma(int array[][]){
        int suma = 0;
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                suma += array[i][j];
            }
        }
        System.out.println("La suma de todos los elementos de la matriz es de " + suma);
    }
    
    /**
     * Método que compara todos los elementos de un array bidimensional y muestra el mayor de ellos
     * @param array 
     */
    public static void mostrarMayorNum(int array[][]){
        int posi = 0, posj = 0;
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                if(array[posi][posj] < array[i][j]){
                    posi = i;
                    posj = j;
                }  
            }
        }
        System.out.println("El mayor número dentro de la matriz es " + array[posi][posj]);
    }
    
    /**
     * Método que compara todos los elementos de un array bidimensional y muestra el menor de ellos
     * @param array 
     */
    public static void mostrarMenorNum(int array[][]){
        int posi = 0, posj = 0;
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                if(array[posi][posj] > array[i][j]){
                    posi = i;
                    posj = j;
                }  
            }
        }
        System.out.println("El menor número dentro de la matriz es " + array[posi][posj]);
    }
    
    public static void main(String[] args) {
        int array[][] = new int[4][2];
        rellenarArray(array);
        mostrarArray(array);
        mostrarMayorNum(array);
        mostrarMenorNum(array);
        mostrarSuma(array);
    }
    
}
