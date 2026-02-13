/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema09ejercicio03;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Tema09Ejercicio03 {
    
    public static String pedirString() {
        Scanner entrada = new Scanner(System.in);
        return entrada.nextLine();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String palabra;
        char[] array;
        
        System.out.print("Por favor introduzca una cadena de caracteres: ");
        palabra = pedirString();
        
        array = palabra.toCharArray();
        
        System.out.println(Arrays.toString(array));
    }
    
}
