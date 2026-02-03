/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema06ejercicio04;

/**
 *
 * @author alumno
 */
public class Tema06Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Perro perro = new Perro("Sultán", 7, 15) {};
        Lobo lobo = new Lobo("Lycus", 4, 50) {};
        Leon leon = new Leon("Ramón", 6, 165    ) {};
        Gato gato = new Gato("Silvestre", 2, 3) {};
        
        System.out.println("------ Perro ------");
        System.out.println("Nombre: " + perro.getNombre());
        System.out.println("Edad: " + perro.getEdad() + " años");
        System.out.println("Peso: " + perro.getPeso() + "kg");
        perro.mostrarSonido();
        perro.mostrarAlimentacion();
        perro.mostrarHabitat();
        perro.nombreCientifico();
        System.out.println("");
        
        System.out.println("------ Lobo ------");
        System.out.println("Nombre: " + lobo.getNombre());
        System.out.println("Edad: " + lobo.getEdad() + " años");
        System.out.println("Peso: " + lobo.getPeso() + "kg");
        lobo.mostrarSonido();
        lobo.mostrarAlimentacion();
        lobo.mostrarHabitat();
        lobo.nombreCientifico();
        System.out.println("");
        
        System.out.println("------ León ------");
        System.out.println("Nombre: " + leon.getNombre());
        System.out.println("Edad: " + leon.getEdad() + " años");
        System.out.println("Peso: " + leon.getPeso() + "kg");
        leon.mostrarSonido();
        leon.mostrarAlimentacion();
        leon.mostrarHabitat();
        leon.nombreCientifico();
        System.out.println("");
        
        System.out.println("------ Gato ------");
        System.out.println("Nombre: " + gato.getNombre());
        System.out.println("Edad: " + gato.getEdad() + " años");
        System.out.println("Peso: " + gato.getPeso() + "kg");
        gato.mostrarSonido();
        gato.mostrarAlimentacion();
        gato.mostrarHabitat();
        gato.nombreCientifico();
        System.out.println("");
        
        //POLIMORFISMO
        System.out.println("oºoºoºoºo POLIMORFISMO oºoºoºoºo");
        System.out.println("");
        Animal animal;
        
        System.out.println("------ Perro ------");
        animal = new Perro("Chucho", 3, 9) {};
        System.out.println("Nombre: " + animal.getNombre());
        System.out.println("Edad: " + animal.getEdad() + " años");
        System.out.println("Peso: " + animal.getPeso() + "kg");
        System.out.println("");
        
        System.out.println("------ Lobo ------");
        animal = new Lobo("Lobete", 2, 45) {};
        System.out.println("Nombre: " + animal.getNombre());
        System.out.println("Edad: " + animal.getEdad() + " años");
        System.out.println("Peso: " + animal.getPeso() + "kg");
        System.out.println("");
        
        System.out.println("------ León ------");
        animal = new Leon("Simba", 3, 150) {};
        System.out.println("Nombre: " + animal.getNombre());
        System.out.println("Edad: " + animal.getEdad() + " años");
        System.out.println("Peso: " + animal.getPeso() + "kg");
        System.out.println("");
        
        System.out.println("------ Gato ------");
        animal = new Gato("Tom", 5, 4) {};
        System.out.println("Nombre: " + animal.getNombre());
        System.out.println("Edad: " + animal.getEdad() + " años");
        System.out.println("Peso: " + animal.getPeso() + "kg");
    }
    
}
