/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio22;

    import java.util.Scanner;
    import java.util.InputMismatchException;

public class Ejercicio22 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int sumando1, sumando2, resultado;
        Scanner entrada = new Scanner(System.in);
    
    try{                                             //pido un número positivo, si no lo es, digo que es incorrecto y lo vuelvo a pedir hasta que me lo den
        System.out.print("Introduce el primer sumando: ");
        
        sumando1 = entrada.nextInt();
        
        System.out.print("Introduce el segundo sumando: ");
        
        sumando2 = entrada.nextInt();
        
        resultado = sumando1 + sumando2;
        
        System.out.println ("El resultado de la suma " + sumando1 + "+" + sumando2 + " es " + resultado);
    } catch (InputMismatchException e){
        
        System.out.println ("Introduce dos números");
        System.out.println (e);
    }
    }
}
    