/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

    import java.util.Scanner;

public class Ejercicio3 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
    int num1, num2, num3;
    Scanner entrada = new Scanner(System.in);
    
    System.out.println("Introduce el primer número: ");
        
    num1 = entrada.nextInt();
    
    System.out.println("Introduce el segundo número: ");
        
    num2 = entrada.nextInt();
    
    System.out.println("Introduce el tercer número: ");
        
    num3 = entrada.nextInt();
    
    if (num1>num2 && num1>num3){
        System.out.println("El mayor de los números introducidos es " + num1 );
    } else if (num2>num1 && num2>num3){
        System.out.println("El mayor de los números introducidos es " + num2 );
    } else {
        System.out.println("El mayor de los números introducidos es " + num3 );
    }
        // TODO code application logic here
    }
    
}
