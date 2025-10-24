/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4tema4;
    
    import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio4Tema4 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);              //declaro las variables entrada y num1, num2 y num3
        int num1, num2, num3;
        System.out.println("Por favor introduzca el primer número: ");   //pido dos números al usuario
        num1 = entrada.nextInt();
        
        System.out.println("Por favor introduzca el segundo número: ");   
        num2 = entrada.nextInt();
        
        System.out.println("Por favor introduzca el tercer número: ");   
        num3 = entrada.nextInt();
        
        System.out.println("El menor número de los 3 introducidos es " + menor.comparacion(num1, num2, num3));
        
                                      //llamo al método para que se ejecute
        // TODO code application logic here
    }
    
}
