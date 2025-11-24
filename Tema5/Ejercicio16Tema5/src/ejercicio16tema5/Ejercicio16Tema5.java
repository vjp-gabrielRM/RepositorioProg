/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16tema5;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio16Tema5 {

    /**
     * @param args the command line arguments
     */
    
    public static int pedirNota(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor introduzca la nota del alumno");
        int nota = entrada.nextInt();
        entrada.nextLine();
        return nota;
    }
    
    public static String pedirNombre(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor introduzca el nombre del alumno");
        return entrada.nextLine();
    }
    
    
    public static void main(String[] args) {
        int nota=-100;
        String nombre;

        do{
            try{
            nota = pedirNota();
        }catch(InputMismatchException e){
            System.out.println("Introduzca un número entero");
        }
        }while(nota == -100);
        nombre = pedirNombre();
        
        Alumno alumno1 = new Alumno(nombre, nota);
        
        nota = -100;
        do{
            try{
            nota = pedirNota();
        }catch(InputMismatchException e){
            System.out.println("Introduzca un número entero");
        }
        }while(nota == -100);
        nombre = pedirNombre();
        
        Alumno alumno2 = new Alumno(nombre, nota);
        
        nota = -100;
        do{
            try{
            nota = pedirNota();
        }catch(InputMismatchException e){
            System.out.println("Introduzca un número entero");
        }
        }while(nota == -100);
        nombre = pedirNombre();
        
        Alumno alumno3 = new Alumno(nombre, nota);
        
        
        
        alumno1.evaluar();
        alumno2.evaluar();
        alumno3.evaluar();
        // TODO code application logic here
    }
    
}
