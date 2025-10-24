/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2tema4;
    
    import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio2Tema4 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);              //declaro las variables entrada y num
        int num1, num2, resultado;
        System.out.println("Por favor introduzca el primer número: ");   //pido dos números al usuario
        num1 = entrada.nextInt();
        
        System.out.println("Por favor introduzca el segundo número: ");   
        num2 = entrada.nextInt();
        
        if (num1 > 10) {
            resultado = operaciones.multiplicacion(num1, num2);
        } else {
            resultado = operaciones.suma(num1, num2);
        }
        
        System.out.println("El resultado de la operación es " + resultado);
                                      //llamo al método para que se ejecute
        // TODO code application logic here
    }
    
}
