/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13tema4;
    
    import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio13Tema4 {
    public static void contador(int num){      //creo un método para hacer las veces de contador
        int i;
        for (i=1; i<=num; i++){
            System.out.println(i);
        }
    }
    
    public static boolean mayorQue1(int num){

        boolean mayor = num>1;
        return mayor;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);              //declaro las variables entrada y num
        int num;
        System.out.println("Por favor introduzca un la nota de un alumno sin decimales: ");   //pido un número al usuario
        num = entrada.nextInt();
        
        contador(num);                                 //llamo al método para que se ejecute
        // TODO code application logic here
    }
    
}
