/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6tema4;
    
    import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio6Tema4 {
    public static void calificacion(int num){    //compruebo el rango de valores de la nota
        if(num>=0 && num<5){
            System.out.println("Suspenso");
        } else if(num>=5 && num<7) {
            System.out.println("Bien");
        } else if(num>=7 && num<9) {
            System.out.println("Notable");
        } else if(num>=9 && num<=10) {
            System.out.println("Sobresaliente");
        } else {
            System.out.println("Por favor introduzca una nota válida");
        }
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);              //declaro las variables entrada y num
        int nota;
        System.out.println("Por favor introduzca un la nota de un alumno sin decimales: ");   //pido un número al usuario
        nota = entrada.nextInt();
        
        calificacion(nota);                                 //llamo al método para que se ejecute
        // TODO code application logic here
    }
    
}
