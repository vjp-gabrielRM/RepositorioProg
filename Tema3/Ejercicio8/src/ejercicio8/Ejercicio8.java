/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8;

    import java.util.Scanner;

public class Ejercicio8 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
    int de50, de20, de10, de5, de2, de1;
    Scanner entrada = new Scanner(System.in);
    
    System.out.println("Introduce una cantidad de dinero: ");
        
    int total = entrada.nextInt();
    
    de50 = total / 50;
    
    de20 = (total%50) / 20;
    
    de10 = ((total%50)%20) / 10;
    
    de5 = (((total%50)%20)%10) / 5;
    
    de2 = ((((total%50)%20)%10)%5) / 2;
    
    de1 = (((((total%50)%20)%10)%5)%2);
    
    System.out.println(+ total + " euros se descomponen en:");
    
    if (de50 > 0){
        System.out.println("Billetes de 50: " + de50);
    }
    if (de20 > 0){
        System.out.println("Billetes de 20: " + de20);
    }
    if (de10 > 0){
        System.out.println("Billetes de 10: " + de10);
    }
    if (de5 > 0){
        System.out.println("Billetes de 5: " + de5);
    }
    if (de2 > 0){
        System.out.println("Monedas de 2: " + de2);
    }
    if (de1 > 0){
        System.out.println("Monedas de 1: " + de1);
    }
        // TODO code application logic here
    }
    
}
