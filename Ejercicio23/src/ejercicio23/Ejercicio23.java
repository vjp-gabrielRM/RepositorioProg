/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio23;

    import java.util.Scanner;

public class Ejercicio23 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
    float precioTotal;
    Scanner entrada = new Scanner(System.in);
    
    System.out.println("Introduce el precio de un producto (con decimales si tiene): ");
        
    float precio = entrada.nextFloat();
    
    System.out.println("Introduce la cantidad de ese producto a comprar: ");
        
    int cantidad = entrada.nextInt();
    
    precioTotal = precio * cantidad;
        
    System.out.println("El precio total es de: " + precioTotal + " euros.");
    }
    
}