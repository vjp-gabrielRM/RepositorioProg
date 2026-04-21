/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema12ejercicio12bis;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author alumno
 */
public class Tema12Ejercicio12bis {

    public static void sumarDoc() {
        String linea;
        int recorrer = 0;
        boolean encontradas = false;
        String numero = "";
        int posInicio = 0;
        int suma = 0;

        try (
            FileReader fr = new FileReader("masnumeros.txt");
            BufferedReader br = new BufferedReader(fr);
        ) {
            linea = br.readLine();
            System.out.println("Los números encontrados en el documento son: ");
            while (linea != null){
                for (int i = 0; i < linea.length(); i++) {
                    if (Character.isDigit(linea.charAt(i))) {
                        numero = numero.concat(Character.toString(linea.charAt(i)));
                    }else {
                        System.out.print(numero + " ");
                        suma += Integer.parseInt(numero);
                        numero = "";
                    }
                }
                linea = br.readLine();
            }
            System.out.println("\nLa suma de todos los números en el documento es " + suma);
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        } catch (IOException e) {
            System.out.println("Error en la lectura del archivo");
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        sumarDoc();
    }
    
}
