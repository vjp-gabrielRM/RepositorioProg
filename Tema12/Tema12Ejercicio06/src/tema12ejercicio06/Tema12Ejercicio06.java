/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema12ejercicio06;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Tema12Ejercicio06 {

    public static void mostrarMenu() {
        System.out.println("---- MENÚ ----\n");
        System.out.println("1. Volcado de los 100 primeros pares a un fichero con nombre personalizado");
        System.out.println("2. Mostrar el contenido del fichero");
        System.out.println("3. Salir\n");
        System.out.print("Elija una opción: ");
    }

    public static int pedirNum() throws InputMismatchException{
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }
    
    public static String pedirString() throws InputMismatchException{
        Scanner entrada = new Scanner(System.in);
        return entrada.nextLine();
    }
    
    public static String nombrarFichero(){
        System.out.print("Elija el nombre del fichero en el que volcar los números: ");
        return pedirString();
    }
    
    public static void volcarArray(int[] array, String nombreFichero){        
        try (
            FileWriter fw = new FileWriter(nombreFichero + ".txt");
            PrintWriter pw = new PrintWriter(fw);
        ) {
            pw.println(Arrays.toString(array));
        } catch (IOException e) {
            System.out.println("Error en la escritura del archivo");
        }
    }
    
    public static void rellenarArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] = (i+1) * 2;
        }
    }
    
    public static void mostrarFichero(String nombreFichero) {
        String linea;
        System.out.println("El contenido del fichero es:\n");
        try (
            FileReader fr = new FileReader(nombreFichero + ".txt");
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
        System.out.println("");
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;
        int[] array = new int[100];
        rellenarArray(array);
        String nombreFichero = "";

        do {
            mostrarMenu();
            try {
                opcion = pedirNum();
            } catch (InputMismatchException e) {
                opcion = -1;
            }

            switch (opcion) {
                case 1:
                    nombreFichero = nombrarFichero();
                    volcarArray(array, nombreFichero);
                    break;
                case 2:
                    mostrarFichero(nombreFichero);
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida, inténtelo de nuevo");
            }
        } while (opcion != 3);
    }
    
}
