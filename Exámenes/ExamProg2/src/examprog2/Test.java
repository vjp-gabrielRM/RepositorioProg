/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examprog2;

/**
 *
 * @author alumno
 */
public class Test {
    
    public static void main(String[] args) {
        CiclistaEscalador escalador = new CiclistaEscalador("Juan", false, 120, 30, 50, 30);
        CiclistaSprinter sprinter = new CiclistaSprinter("José", false, 100, 45, 15);
        
        System.out.println("------ NÚMERO DE CICLISTAS ------");
        Ciclista.verNumCiclistas();
        System.out.println("");
        
        System.out.println("------ POLIMORFISMO ------");
        System.out.println("");
        System.out.println("--- ciclista = escalador ---");
        
        Ciclista ciclista;
        ciclista = escalador;
        
        System.out.println("- Primera muestra -");
        
        System.out.println(ciclista.toString());
        
        System.out.println("- Ejecución de los métodos abstractos -");
        
        ciclista.comer();
        ciclista.beber();
        System.out.println("");
        
        System.out.println("- Segunda muestra -");
        
        System.out.println(ciclista.toString());
        System.out.println("");
        
        System.out.println("--- ciclista = sprinter ---");
        
        ciclista = sprinter;
        
        System.out.println("- Primera muestra -");
        
        System.out.println(ciclista.toString());
        
        System.out.println("- Ejecución de los métodos abstractos -");
        
        ciclista.comer();
        ciclista.beber();
        System.out.println("");
        
        System.out.println("- Segunda muestra -");
        
        System.out.println(ciclista.toString());
        System.out.println("");
        
        System.out.println("--- pedaleable = escalador ---");
        
        Pedaleable pedaleable;
        pedaleable = escalador;
        
        System.out.println("- Primera muestra -");
        
        System.out.println(pedaleable.toString());
        
        System.out.println("- Ejecución de los métodos abstractos -");
        
        pedaleable.atacar();
        System.out.println("La energía actual es de " + pedaleable.recuperar(5));
        pedaleable.sprintar();
        System.out.println("");
        
        System.out.println("- Segunda muestra -");
        
        System.out.println(pedaleable.toString());
        System.out.println("");
        
        System.out.println("--- pedaleable = sprinter ---");
        
        pedaleable = sprinter;
        
        System.out.println("- Primera muesta -");
        
        System.out.println(pedaleable.toString());
        
        System.out.println("- Ejecución de los métodos abstractos -");
        
        pedaleable.atacar();
        System.out.println("La energía actual es de " + pedaleable.recuperar(5));
        pedaleable.sprintar();
        System.out.println("");
        
        System.out.println("- Segunda muestra -");
        
        System.out.println(pedaleable.toString());
    }
}
