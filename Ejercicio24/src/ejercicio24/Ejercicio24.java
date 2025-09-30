/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio24;

    import java.util.Scanner;

public class Ejercicio24 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
    float media;
    Scanner entrada = new Scanner(System.in);
    
    System.out.println("Introduce tu nota de Programacion (con decimales si tiene): ");
        
    float notaProg = entrada.nextFloat();
    
    System.out.println("Introduce tu nota de Lenguajes de Marcas (con decimales si tiene): ");
        
    float notaLeng = entrada.nextFloat();
    
    System.out.println("Introduce tu nota de Bases de Datos (con decimales si tiene): ");
        
    float notaBases = entrada.nextFloat();
    
    System.out.println("Introduce tu nota de Entornos de Desarrollo (con decimales si tiene): ");
        
    float notaEnt = entrada.nextFloat();
    
    System.out.println("Introduce tu nota de Sistemas Informaticos (con decimales si tiene): ");
        
    float notaSist = entrada.nextFloat();
    
    System.out.println("Introduce tu nota de Formacion y Orientacion Laboral (con decimales si tiene): ");
        
    float notaFyol = entrada.nextFloat();
    
    media = (notaProg + notaLeng + notaBases + notaEnt + notaSist + notaFyol)/6;
        
    System.out.println("Tu nota media del curso es " + media + ".");
    }
    
}
