/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17;

import static java.lang.Math.sqrt;
    import java.util.Scanner;

public class Ejercicio17 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double raiz, num;
        Scanner entrada = new Scanner(System.in);
    
    do{                                             //pido un número positivo, si no lo es, digo que es incorrecto y lo vuelvo a pedir hasta que me lo den
        System.out.println("Introduce un número positivo: ");
        
        num = entrada.nextFloat();
        
        if (num<0){
            System.out.println("Error, introduce un número positivo.");
        }
    } while (num<0);
    
    raiz = sqrt(num);
                            //calculo la raíz y la imprimo en pantalla
    System.out.println("La raíz cuadrada del número introducido es " + raiz + ".");
        // TODO code application logic here
    }
    
}
