/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14tema4;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio14Tema4 {
    public final static int PRIMERO=1, DIVISOR=3;
    /**
     * Método que pide un número entero al usuario
     * @return el número introducido por el usuario
     */
    public static int pedirNum(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor introduzca un número: ");
        return entrada.nextInt();
    }

    /**
     * Método que comprueba si un número es mayor que 0
     * @param num
     * @return true si el número es mayor que 0, false si no
     */
    public static boolean mayorQue0(int num){
        return(num>0);
    }
    
    /**
     * Método que comprueba los números múltiplos de otro comprendidos entre 2 números
     * @param min
     * @param max
     * @param divisor 
     */
    public static void multiplos(int min, int max, int divisor){
        int cont=0, i;
        for(i=min;i<=max;i++){
            if(i%divisor==0){
                System.out.println(i);
                cont++;
            }
        }
        System.out.println("Entre " + min + " y " + max + " hay comprendidos " + cont + " múltiplos de " + divisor);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        do{
            num = pedirNum();
            if(num<=0){
                System.out.println("Por favor introduzca un número mayor que 0");
            }
        } while (!mayorQue0(num));
        
        multiplos(PRIMERO, num, DIVISOR);
        
        // TODO code application logic here
    }
    
}
