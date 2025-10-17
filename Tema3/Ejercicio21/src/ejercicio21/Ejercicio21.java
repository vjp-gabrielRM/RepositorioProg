/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio21;

    import java.util.Scanner;

public class Ejercicio21 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int dividendo, divisor, resultado;
        Scanner entrada = new Scanner(System.in);
    
    try{                                             //pido un número positivo, si no lo es, digo que es incorrecto y lo vuelvo a pedir hasta que me lo den
        System.out.print("Introduce el dividendo: ");
        
        dividendo = entrada.nextInt();
        
        System.out.print("Introduce el divisor: ");
        
        divisor = entrada.nextInt();
        
        resultado = dividendo / divisor;
        
        System.out.println ("El resultado de la división " + dividendo + "/" + divisor + " es " + resultado);
    } catch (ArithmeticException e){
        
        System.out.println ("Introduce un divisor distinto de 0");
        System.out.println (e);
    }
    }
}
    