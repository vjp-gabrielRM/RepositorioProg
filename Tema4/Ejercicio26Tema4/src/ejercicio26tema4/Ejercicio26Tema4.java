/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio26tema4;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio26Tema4 {
    
    /**
     * Método que comprueba si el número recibido es primo
     * @param num
     * @return boolean = true si es primo, false si no
     */
    public static boolean esPrimo(int num){
        int i=2;
        boolean primo=false, encontrado=false;
        
        while(i<num && !encontrado){
            if(num%i==0){
                encontrado = true;
            } else {
                i++;
            }
        }
        if(!encontrado){
            primo = true;
        }
        return primo;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
        
        System.out.println("Por favor introduzca un número");
        num = entrada.nextInt();
        
        if(esPrimo(num)){
            System.out.println("El número introducido es primo");
        } else {
            System.out.println("El número introducido no es primo");
        }
        // TODO code application logic here
    }
    
}
