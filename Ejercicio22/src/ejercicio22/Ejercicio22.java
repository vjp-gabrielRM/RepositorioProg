/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio22;

    import java.util.Scanner;

public class Ejercicio22 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
    float area, perimetro;
    Scanner entrada = new Scanner(System.in);
    
    System.out.println("Introduce la medida de la base: ");
        
    float base = entrada.nextFloat();
    
    System.out.println("Introduce la medida de otro lado: ");
        
    float lado1 = entrada.nextFloat();
    
    System.out.println("Finalmente, introduce la medida del tercer lado: ");
        
    float lado2 = entrada.nextFloat();
    
    System.out.println("Introduce la altura del triangulo (desde la base): ");
    
    float altura = entrada.nextFloat();
    
    area = base * altura / 2;
    
    perimetro = base + lado1 + lado2;
    
    System.out.println("El area de un triangulo de lados " + base + ", " + lado1 + " y " + lado2 +" es: " + area + ".");
    System.out.println("El perimetro de un triangulo de lados " + base + ", " + lado1 + " y " + lado2 +" es: " + perimetro + ".");
        // TODO code application logic here
    }
    
}
