/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio26;

    import java.util.Scanner;

public class Ejercicio26 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
    int cifra1, cifra2, cifra3, cifra4;
    Scanner entrada = new Scanner(System.in);
    
    System.out.println("Introduce un numero de 4 cifras: ");
        
    int num = entrada.nextInt();
    
    cifra1 = num / 1000;
    
    cifra2 = (num%1000) / 100;
    
    cifra3 = ((num%1000)%100) / 10;
    
    cifra4 = (((num%1000)%100)%10);
    
    System.out.println("La primera cifra del numero es: " + cifra1 +".");
    System.out.println("La segunda cifra del numero es: " + cifra2 +".");
    System.out.println("La tercera cifra del numero es: " + cifra3 +".");
    System.out.println("La cuarta cifra del numero es: " + cifra4 +".");
        // TODO code application logic here
    }
    
}
