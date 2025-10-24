/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1tema4;
    
    import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio1Tema4 {
    public static void positivoONegativo(int num){      //en el método compruebo si el número introducido es positivo o negativo comparando con 0
        if(num<0){
            System.out.println("El número introducido es negativo");
        } else {
            System.out.println("El número introducido es positivo");
        }
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);              //declaro las variables entrada y num
        int num;
        System.out.println("Por favor introduzca un número: ");   //pido un número al usuario
        num = entrada.nextInt();
        
        positivoONegativo(num);                                 //llamo al método para que se ejecute
        // TODO code application logic here
    }
    
}
