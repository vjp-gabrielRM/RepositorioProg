/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio25tema5;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio25Tema5 {

    public static int pedirNum(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor introduzca un número:");
        return entrada.nextInt();
    }
    
    public static String pedirString(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor introduzca el texto:");
        return entrada.nextLine();
    }
    
    public static void main(String[] args) {
        Servidor servidor1 = new Servidor(pedirNum(), pedirNum(), pedirString(), pedirString(), pedirNum(), pedirNum(), pedirString(), pedirString());
        Servidor servidor2 = new Servidor(pedirNum(), pedirNum(), pedirString(), pedirString(), pedirNum(), pedirNum(), pedirString(), pedirString());
        Portatil portatil1 = new Portatil(pedirNum(), pedirNum(), pedirString(), pedirString(), pedirNum(), pedirString(), pedirNum(), pedirNum());
        Portatil portatil2 = new Portatil(pedirNum(), pedirNum(), pedirString(), pedirString(), pedirNum(), pedirString(), pedirNum(), pedirNum());
        
        System.out.println(servidor1.toString());
        System.out.println(servidor2.toString());
        System.out.println(portatil1.toString());
        System.out.println(portatil2.toString());
    }
    
}
