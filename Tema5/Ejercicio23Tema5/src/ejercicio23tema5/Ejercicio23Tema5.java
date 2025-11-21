/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio23tema5;

/**
 *
 * @author alumno
 */
public class Ejercicio23Tema5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Taxi taxi = new Taxi("1234ABC", "Grande", 530, 1001);
        Autobus autobus = new Autobus("4321CBA", "Minibús", 800, 61);
        
        System.out.println(autobus.toString());
        System.out.println(taxi.toString());
    }
    
}
