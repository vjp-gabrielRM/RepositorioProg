/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema08ejercicio11;

/**
 *
 * @author alumno
 */
public class Tema08Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mueble silla = new Mueble();
        Mueble mesa = new Mueble(200, "Mesa");
        
        silla.setDescripcion("Silla");
        silla.setPrecio(120);
        
        System.out.println(silla.toString());
        System.out.println(mesa.toString());
    }
    
}
