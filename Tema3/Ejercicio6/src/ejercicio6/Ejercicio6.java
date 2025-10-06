/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;

    import java.util.Scanner;

public class Ejercicio6 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Scanner entrada = new Scanner(System.in);
    
    System.out.println("Introduce una nota: ");
        
    float num = entrada.nextFloat();
     
    if (num >= 0 && num <5){
    System.out.println("Suspenso");
    } else if (num >= 0 && num < 7){
    System.out.println("Bien");
    } else if (num >= 0 && num < 9){
    System.out.println("Notable");
    } else if (num >= 0 && num <= 10){
    System.out.println("Sobresaliente");
    } else {
        System.out.println("Por favor introduzca una nota válida");
    }
    }
}
