/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema09ejercicio02;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Tema09Ejercicio02 {
    
    public static String pedirString() {
        Scanner entrada = new Scanner(System.in);
        return entrada.nextLine();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String palabra;
        
        System.out.print("Por favor introduzca una cadena de caracteres: ");
        palabra = pedirString();
        for(int i = 0; i < palabra.length(); i++){
            System.out.println(palabra.charAt(i));
        }
    }
    
}
