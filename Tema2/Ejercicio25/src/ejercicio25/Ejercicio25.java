/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio25;

    import java.util.Scanner;

public class Ejercicio25 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
    int suma, producto;
    Scanner entrada = new Scanner(System.in);
    
    System.out.println("Introduce un numero entero: ");
        
    int num1 = entrada.nextInt();
    
    System.out.println("Introduce otro numero entero: ");
        
    int num2 = entrada.nextInt();
    
    System.out.println("Finalmente, introduce otro numero entero: ");
        
    int num3 = entrada.nextInt();
    
    suma = num1 + num2 + num3;
    
    producto = num1 * num2 * num3;
        
    System.out.println("La suma de tus numeros es " + suma + ".");
    
    System.out.println("El prodcuto de los numeros es " + producto + ".");
    }
    
}
