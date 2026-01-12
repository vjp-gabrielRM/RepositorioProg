/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema07ejercicio08;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Tema07Ejercicio08 {
    
    public static int pedirNum(){
        System.out.println("Por favor introduzca un número de 5 cifras");
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }
    
    public static void mostrarArray(int num){
        int[] array = new int [5];
        array = darVuelta(num);
        System.out.println("El número escrito al revés es " + array[4] + array[3] + array[2] + array[1] + array[0]);
    }
    
    public static int[] darVuelta(int num){
        int [] array = new int [5];
        
        // Divido el número en cifras y relleno el array al revés
        for(int i = 0; i < array.length; i++){
            array[(array.length - 1) - i] = num % 10;
            num /= 10;
        }
        
        return array;
    }
    
    public static void main(String[] args) {
        int num;
        
        num = pedirNum();
        
        mostrarArray(num);
    }
    
}
