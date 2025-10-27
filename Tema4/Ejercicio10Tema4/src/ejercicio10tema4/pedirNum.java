/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio10tema4;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class pedirNum {
    
    public static int pedir(){
    
    Scanner entrada = new Scanner(System.in);
    
    System.out.println("Por favor introduce un número: ");
    
    int num = entrada.nextInt();
    
    return num;
    }
}
