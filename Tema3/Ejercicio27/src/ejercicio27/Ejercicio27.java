/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio27;

    import java.util.Scanner;

public class Ejercicio27 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num1, num2, resultado, operacion;       //declaro todas las variables que voy a usar
        Scanner entrada = new Scanner(System.in);
    
    try{                                             //creo un control de excepción aritmética
        System.out.print("Introduce el primer número: ");
        
        num1 = entrada.nextInt();
        
        System.out.print("Introduce el segundo número: ");
        
        num2 = entrada.nextInt();                   //pido los 2 números
        
        do{
            
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Producto");
        System.out.println("4. División");
        System.out.println("5. Salir");
        
        operacion = entrada.nextInt();          //creo un menú y procedo en base a lo que elija el usuario
            switch (operacion) {
                case 1:
                    resultado = num1 + num2;
                    System.out.println ("El resultado de la suma " + num1 + "+" + num2 + " es " + resultado);
                    break;
                case 2:
                    resultado = num1 - num2;
                    System.out.println ("El resultado de la resta " + num1 + "-" + num2 + " es " + resultado);
                    break;
                case 3:
                    resultado = num1 * num2;
                    System.out.println ("El resultado del producto " + num1 + "x" + num2 + " es " + resultado);
                    break;
                case 4:
                    resultado = num1 / num2;
                    System.out.println ("El resultado de la división " + num1 + "/" + num2 + " es " + resultado);
                    break;
                default:
                    System.out.println ("Por favor, introduce una opción válida");
                    break;
            }
        } while (operacion!=5); //con esto me aseguro de que el programa no termine hasta que el usuario pida salir
        
    } catch (ArithmeticException e){
        
        System.out.println ("No se puede dividir entre 0");
        System.out.println (e);                             //si pide dividir entre 0 termino el programa
    }
    }
}
    