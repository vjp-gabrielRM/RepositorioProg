/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema11ejercicio09;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author alumno
 */
public class Tema11Ejercicio09 {

    public static void mostrarMenu() {
        System.out.println("---- MENÚ ----\n");
        System.out.println("1. Realizar sorteo");
        System.out.println("2. Repetir sorteo");
        System.out.println("3. Mostrar sorteos del mes actual");
        System.out.println("4. Mostrar sorteo según fecha");
        System.out.println("5. Realizar sorteo por fecha");
        System.out.println("6. Mostrar sorteos");
        System.out.println("7. Salir\n");
        System.out.print("Elija una opción: ");
    }

    public static int pedirNum() {
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }

    public static String pedirString() {
        Scanner entrada = new Scanner(System.in);
        return entrada.nextLine();
    }

    public static void nuevoSorteo(TreeMap<LocalDate, Sorteo> sorteos) {
        System.out.println("Creando sorteo para hoy...\n");
        if (sorteos.containsKey(LocalDate.now())) {
            System.out.println("Error, ya hay un sorteo hoy");
        } else {
            sorteos.put(LocalDate.now(), new Sorteo());
        }
    }

    public static void repetirSorteo(TreeMap<LocalDate, Sorteo> sorteos) {
        System.out.println("Repitiendo el sorteo de hoy...\n");
        sorteos.put(LocalDate.now(), new Sorteo());
    }

    public static void mostrarMesActual(TreeMap<LocalDate, Sorteo> sorteos) {

    }

    public static void mostrarPorFecha(TreeMap<LocalDate, Sorteo> sorteos) {

    }

    public static void sorteoPorFecha(TreeMap<LocalDate, Sorteo> sorteos) {

    }

    public static void mostrarSorteos(TreeMap<LocalDate, Sorteo> sorteos) {
        for(LocalDate clave : sorteos.keySet()){
            System.out.println(sorteos.get(clave));
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TreeMap<LocalDate, Sorteo> sorteos = new TreeMap<>();

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
                    nuevoSorteo(sorteos);
                    break;
                case 2:
                    repetirSorteo(sorteos);
                    break;
                case 3:
                    mostrarMesActual(sorteos);
                    break;
                case 4:
                    mostrarPorFecha(sorteos);
                    break;
                case 5:
                    sorteoPorFecha(sorteos);
                    break;
                case 6:
                    mostrarSorteos(sorteos);
                    break;
                case 7:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida, inténtelo de nuevo");
            }
        } while (opcion != 7);
    }

}
