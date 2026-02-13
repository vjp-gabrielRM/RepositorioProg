/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema9;

import java.util.Arrays;

/**
 *
 * @author alumno
 */
public class Tema9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre = "Pepe";
        
        String nombreMayus = nombre.toUpperCase();
        
        System.out.println(nombreMayus + " -> HashCode de nombreMayus: " + nombreMayus.hashCode());
        System.out.println(nombre + " -> HashCode de nombre: " + nombre.hashCode());
        
        System.out.println("\n- MÉTODOS -");
        
        System.out.println("\n· cadena1.equals(cadena2):");
        System.out.println(nombre.equals(nombreMayus));
        
        System.out.println("\n· cadena1.equalsIgnoreCase(cadena2):");
        System.out.println(nombre.equalsIgnoreCase(nombreMayus));
        
        System.out.println("\n· cadena1.compareTo(cadena2):");
        System.out.println(nombre.compareTo(nombreMayus));
        
        System.out.println("\n· cadena1.compareToIgnoreCase(cadena2):");
        System.out.println(nombre.compareToIgnoreCase(nombreMayus));
        
        System.out.println("\n· String.valueOf(dato)");
        int edad = 20;
        System.out.print("edad como int: ");
        System.out.println(edad + 2);
        System.out.println("edad como String: " + String.valueOf(edad + 2));
        System.out.println("¿De qué clase es edad? " + String.valueOf(edad).getClass());
        
        System.out.println("\n· cadena.toCharArray()");
        char[] arrayNombre = nombre.toCharArray();
        System.out.println(Arrays.toString(arrayNombre));
        
        System.out.println("\n· cadena.length()");
        System.out.println(nombre.length());
        
        System.out.println("\n· cadena1.concat(cadena2)");
        System.out.println(nombre.concat(nombreMayus));
        
        System.out.println("\n· cadena.substring(desdeIncluido, hastaSinIncluir)");
        System.out.println(nombre.substring(0, 2));
        
        System.out.println("\n· cadena.charAt(indice)");
        System.out.println(nombre.charAt(0));
        
        System.out.println("\n· cadena.indexOf(subcadena)");
        System.out.println("Cadena original: " + nombre);
        System.out.println("Índice de 'P': " + nombre.indexOf("P"));
        System.out.println("Índice de 'pe': " + nombre.indexOf("pe"));
        
        System.out.println("Índice de 'e' a partir del índice 2: ");
        System.out.println(nombre.indexOf("e", 2));
        
        System.out.println("Último índice de 'e': ");
        System.out.println(nombre.lastIndexOf("e"));
        
        System.out.println("\n· cadena.startsWith(subcadena) y cadena.endsWith(subcadena)");
        System.out.println("¿Empieza 'Pepe' por 'Pe'? ");
        System.out.println(nombre.startsWith("Pe"));
        System.out.println("¿Termina 'Pepe' por 'Z'? ");
        System.out.println(nombre.endsWith("Z"));
        
        System.out.println("\n· cadena.replace(caracter1, caracter2)");
        System.out.println(nombre.replace("e", "u"));
        
        System.out.println("\n· cadena.replaceAll(regtx, caracter2)");
        String numCuenta = "ES01 0000 1111 2222 3333";
        System.out.println(numCuenta.replaceAll("\\d", "*"));
        System.out.println(numCuenta.replace("\\d", "*"));
        
        System.out.println("\n· cadena.toUpperCase() y cadena.toLowerCase()");
        System.out.println(nombre.toUpperCase());
        System.out.println(nombre.toLowerCase());
        
        System.out.println("\n· cadena.split(patrón)");
        String[] n = numCuenta.split(" ");
        System.out.println(Arrays.toString(n));
    }
    
}
