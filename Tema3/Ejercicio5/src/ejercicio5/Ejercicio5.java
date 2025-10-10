/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

    import java.util.Scanner;

public class Ejercicio5 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
    int num;
    Scanner entrada = new Scanner(System.in);
    
    System.out.println("Introduce un número: ");
        
    num = entrada.nextInt();
    
    if (num%2 == 1){
        System.out.println("El número introducido es impar");
    } else {
        System.out.println("El número introducido es par");
    }
        // TODO code application logic here
    }
    
}
