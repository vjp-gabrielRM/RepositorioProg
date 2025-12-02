/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema06ejercicio05;

/**
 *
 * @author alumno
 */
public class Tema06Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ornitorrinco ornitorrinco = new Ornitorrinco("Perry", "hembra", "azul", 7, 0) {};
        Murcielago murcielago = new Murcielago("Rimbo", "macho", "marrón", 2, 10) {};
        
        System.out.println("------ Ornitorrinco ------");
        System.out.println(ornitorrinco.toString());
        ornitorrinco.obtenerMensajeOviparo();
        ornitorrinco.ponerHuevo();
        ornitorrinco.mostrarNumHuevos();
        ornitorrinco.incubarHuevo();
        ornitorrinco.mostrarNumHuevos();
        System.out.println("");
        
        System.out.println("------ Murciélago ------");
        System.out.println(murcielago.toString());
        murcielago.obtenerMensajeVolador();
        murcielago.aumentarAlturaVuelo();
        murcielago.mostrarAlturaVuelo();
        murcielago.bajarAlturaVuelo();
        murcielago.mostrarAlturaVuelo();
        System.out.println("");
        
        System.out.println("oºoºoºo Polimorfismo oºoºoºo");
        Mamifero mamifero;
        
        System.out.println("------ Ornitorrinco ------");       
        mamifero = new Ornitorrinco("Pepa", "hembra", "morado", 12, 4) {};
        System.out.println(mamifero.toString());
        
        System.out.println("------ Murciélago ------");
        mamifero = new Murcielago("Lala", "hembra", "blanco", 3, 40) {};
        System.out.println(mamifero.toString());
        
        
        
        
    }
    
}
