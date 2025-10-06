/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio21;

    import java.util.Scanner;

public class Ejercicio21 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
    int dias, horas, minutos, segundos;
    Scanner entrada = new Scanner(System.in);
    
    System.out.println("Introduce una cantidad de segundos: ");
        
    int segIniciales = entrada.nextInt();
    
    dias = segIniciales/86400;
    horas = (segIniciales - dias*86400)/3600;
    minutos = (segIniciales - dias*86400 - horas*3600)/60;
    segundos = segIniciales - dias*86400 - horas*3600 - minutos*60;
        
    System.out.println(+ segIniciales +" segundos hacen un total de: " + dias + " dia(s), " + horas + " hora(s), " + minutos + " minuto(s) y " + segundos + " segundos.");
    }
    
}
