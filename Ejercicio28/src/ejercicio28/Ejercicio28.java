/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio28;

    import java.util.Scanner;

public class Ejercicio28 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
    int tiempo;
    Scanner entrada = new Scanner(System.in);
    
    System.out.println("Introduce el tamano en megabytes de un archivo: ");
        
    int tamano = entrada.nextInt();
    
    System.out.println("Introduce la velocidad de descarga en megabits por segundo: ");
        
    int velocidad = entrada.nextInt();
        
    tiempo = (tamano * 8) / (velocidad * 60);
    
    System.out.println("El archivo tardaria " + tiempo + " minutos en descargarse.");
        // TODO code application logic here
    }
    
}
