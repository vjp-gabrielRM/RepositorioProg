/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema08ejercicio02;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Tema08Ejercicio02 {
    
    public static int pedirLongitud(){
        int longitud;
        Scanner entrada = new Scanner(System.in);
        do{
            System.out.print("Por favor introduzca la longitud del array siendo el mínimo 1 y el máximo 10: ");
            try{
                longitud = entrada.nextInt();
            }catch(InputMismatchException e){
                longitud = 0;
                entrada.nextLine();
            }
            if(longitud < 1 || longitud > 10){
                System.out.println("No válido, inténtelo de nuevo");
            }
        }while(longitud < 1 || longitud > 10);
        return longitud;
    }
    
    public static void rellenarArray(int array[]){
        for(int i = 0; i < array.length; i++){
            array[i] = (int) (Math.random() * 6 + 1);
        }
    }
    
    public static void mostrarArray(int array[]){
        for(int i : array){
            System.out.print(i + " ");
        }
        System.out.println("");
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array = new int[pedirLongitud()];
        rellenarArray(array);
        mostrarArray(array);
    }
}
