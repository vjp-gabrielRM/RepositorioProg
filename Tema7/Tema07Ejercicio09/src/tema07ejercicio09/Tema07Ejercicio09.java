/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema07ejercicio09;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Tema07Ejercicio09 {
    
    public static int pedirNum(){
        System.out.println("Por favor introduzca un número entero");
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }
    
    public static void mostrarArray(int num){
        int[] array = new int [calcularCifras(num)];
        array = intAArray(num);
        System.out.print("El número escrito al revés es ");
        
        for (int i = (array.length-1); i >= 0; i--){
            System.out.print(array[i]);
        }
        System.out.println("");
    }
    
    public static int[] intAArray(int num){
        int [] array = new int [calcularCifras(num)];
        
        // Divido el número en cifras y relleno el array al revés
        for(int i = 0; i < array.length; i++){
            array[(array.length - 1) - i] = num % 10;
            num /= 10;
        }
        
        return array;
    }
    
    public static int calcularCifras(int num){
        int cifras = 1;
        boolean calculado = false;
        
        while(!calculado){
            if(num>=10){
                cifras++;
                num /= 10;
            }else {
                calculado = true;
            }
        }
        return cifras;
    }
    
    public static void main(String[] args) {
        int num;
        
        num = pedirNum();
        
        mostrarArray(num);
    }
    
}
