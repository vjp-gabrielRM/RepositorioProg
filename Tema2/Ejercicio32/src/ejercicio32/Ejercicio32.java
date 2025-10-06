/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio32;

    import java.util.Scanner;

public class Ejercicio32 {
    
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
    
    System.out.println(+ total + " euros se descomponen en " + de50 +" billetes de 50, " + de20 +" billetes de 20, "
            + de10 +" billetes de 10, " + de5 +" billetes de 5, " + de2 +" monedas de 2 euros y " + de1 +" monedas de 1 euro.");
        // TODO code application logic here
    }
    
}
