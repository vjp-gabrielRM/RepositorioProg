/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio27;

    import java.util.Scanner;

public class Ejercicio27 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
    int cuadrado, cubo;
    Scanner entrada = new Scanner(System.in);
    
    System.out.println("Introduce un numero: ");
        
    int num = entrada.nextInt();
    
    cuadrado = num * num;
    
    cubo = num * num * num;
    
    System.out.println("El cuadrado de " + num + " es " + cuadrado + ".");
    System.out.println("El cubo de " + num + " es " + cubo + ".");
        // TODO code application logic here
    }
    
}
