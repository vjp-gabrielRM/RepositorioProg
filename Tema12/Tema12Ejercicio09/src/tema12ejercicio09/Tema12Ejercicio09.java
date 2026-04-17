/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema12ejercicio09;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

/**
 *
 * @author alumno
 */
public class Tema12Ejercicio09 {
    
    public static String leerFrase(){
        String resultado = "";
        String linea;
        int contador = 0;

        try (
            FileReader fr = new FileReader("frase.txt");
            BufferedReader br = new BufferedReader(fr);
        ) {
            linea = br.readLine();
            while (linea != null) {
                resultado = linea;
                linea = br.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        } catch (IOException e) {
            System.out.println("Error en la lectura del archivo");
        }
        
        System.out.println("Frase normal:\n" + resultado + "\n");
        return resultado;
    }
    
    public static void fraseInvertida(String frase){
        String fraseInvertida = "";
        String linea;
        
        for (int i = frase.length() - 1; i >= 0; i--) {
            fraseInvertida = fraseInvertida.concat(Character.toString(frase.charAt(i)));
        }
        try (
            FileWriter fw = new FileWriter("fraseinvertida.txt");
            PrintWriter pw = new PrintWriter(fw);
        ) {
            pw.println(fraseInvertida);
        } catch (IOException e) {
            System.out.println("Error en la escritura del archivo");
        }
       
        System.out.println("Frase invertida:");
        try (
            FileReader fr = new FileReader("fraseinvertida.txt");
            BufferedReader br = new BufferedReader(fr);
        ) {
            linea = br.readLine();
            while (linea != null) {
                System.out.println(linea);
                linea = br.readLine();
            }
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
        String frase = leerFrase();
        fraseInvertida(frase);
    }
    
}
