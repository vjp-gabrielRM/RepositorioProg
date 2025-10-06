/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

    import java.util.Scanner;

public class Ejercicio1 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Scanner entrada = new Scanner(System.in);
    
    System.out.println("Introduce un número: ");
        
    int num = entrada.nextInt();
     
    if (num<0){
    System.out.println("El número introducido es negativo");
              } else {
    System.out.println("El número introducido es positivo");
           }
    }
}
