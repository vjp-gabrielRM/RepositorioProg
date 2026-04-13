/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema12ejercicio05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Tema12Ejercicio05 {

    public static void mostrarMenu() {
        System.out.println("---- MENÚ ----\n");
        System.out.println("1. Añadir contactos a la agenda");
        System.out.println("2. Mostrar la agenda");
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
    
    public static void nuevoContacto(){
        System.out.print("Nombre del contacto: ");
        String nombre = pedirString();
        System.out.print("Edad del contacto: ");
        int edad = pedirNum();
        System.out.print("Número de teléfono del contacto: ");
        String telefono = pedirString();
        
        
        
    }
    
    public static void mostrarContactos() {
        System.out.println("Los contactos guardados en la lista son:\n");
        
        System.out.println("");
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FileWriter fw = null;
        PrintWriter pw = null;
        FileReader fr = null;
        BufferedReader br = null;
        int opcion;

        do {
            mostrarMenu();
            try {
                opcion = pedirNum();
            } catch (InputMismatchException e) {
                opcion = -1;
            }

            switch (opcion) {
                case 1:
                    nuevoContacto();
                    break;
                case 2:
                    mostrarContactos();
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
