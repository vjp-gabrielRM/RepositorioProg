/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema09ejercicio07;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Tema09Ejercicio07 {

    public static String pedirString() {
        Scanner entrada = new Scanner(System.in);
        return entrada.nextLine();
    }
    
    public static void invertirPalabras(String frase){
        String[] array;
        
        array = frase.split(" ");
        
        System.out.println("La frase invertida palabra a palabra es: ");
        for(int i = (array.length - 1); i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String frase;
        
        System.out.print("Por favor introduzca una frase: ");
        frase = pedirString();
        
        invertirPalabras(frase);
    }
    
}
