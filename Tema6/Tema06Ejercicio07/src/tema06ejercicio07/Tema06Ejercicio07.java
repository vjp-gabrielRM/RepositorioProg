/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema06ejercicio07;

/**
 *
 * @author alumno
 */
public class Tema06Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Televisor tele = new Televisor(false, 33, 14);
        Radio radio = new Radio();
        
        System.out.println("------ TELEVISOR ------");
        tele.encender();
        System.out.println(tele.toString());
        tele.subirVolumen();
        tele.subirVolumen();
        tele.subirVolumen();
        System.out.println("El volumen actual del televisor es de " + tele.getVolumen());
        tele.setCanal(3);
        tele.bajarVolumen();
        tele.apagar();
        System.out.println(tele.toString());
        System.out.println("");
        
        System.out.println("------ RADIO ------");
        radio.encender();
        System.out.println(radio.toString());
        radio.subirVolumen();
        radio.subirVolumen();
        radio.subirVolumen();
        System.out.println("El volumen actual de la radio es de " + radio.getVolumen());
        radio.setEmisora((float) 99.6);
        radio.bajarVolumen();
        radio.apagar();
        System.out.println(radio.toString());
    }
    
}
