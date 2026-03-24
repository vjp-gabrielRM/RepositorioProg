/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema11ejercicio07;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Tema11Ejercicio07 {

    public static void mostrarMenu() {
        System.out.println("---- MENÚ ----\n");
        System.out.println("1. Añadir campaña");
        System.out.println("2. Añadir donación");
        System.out.println("3. Mostrar campañas y sus donaciones");
        System.out.println("4. Mostrar campañas por nombre");
        System.out.println("5. Mostrar total de dinero recaudado");
        System.out.println("6. Mostrar mayor donación");
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

    public static void nuevaCampania(HashSet<Campania> campanias) {
        System.out.print("Por favor introduzca el nombre de la nueva campaña: ");
        String nombre = pedirString();

        campanias.add(new Campania(nombre));
    }

    public static void nuevaDonacion(HashSet<Campania> campanias) {
        System.out.print("Por favor introduzca el nombre de la campaña de la donación: ");
        String nombreCampania = pedirString();
        for (Campania campania : campanias) {
            if (campania.getNombre().equalsIgnoreCase(nombreCampania)) {
                campania.nuevaDonacion();
            }
        }
    }

    public static void mostrarCampanias(HashSet<Campania> campanias) {
        for (Campania campania : campanias) {
            System.out.println(campania);
        }
        System.out.println("");
    }

    public static void mostrarCampaniaPorNombre(HashSet<Campania> campanias) {
        boolean encontrado = false;

        System.out.print("Nombre de la campaña: ");
        String nombreCampania = pedirString();
        for (Campania campania : campanias) {
            if (campania.getNombre().equalsIgnoreCase(nombreCampania)) {
                System.out.println(campania);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No encontrado\n");
        }
    }

    public static void mostrarTotal(HashSet<Campania> campanias) {
        float total = 0;
        for (Campania campania : campanias) {
            total += campania.calcularTotal();
        }

        System.out.println("El total recaudado entre todas las campañas es de " + total + " euros\n");
    }

    public static void mayorDonacion(HashSet<Campania> campanias) {
        float mayor = 0;

        for (Campania campania : campanias) {
            if (campania.mayorDonacion() > mayor) {
                mayor = campania.mayorDonacion();
            }
        }
        System.out.println("La mayor donación de todas las campañas es de " + mayor + " euros");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashSet<Campania> campanias = new HashSet<>();
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
                    nuevaCampania(campanias);
                    break;
                case 2:
                    nuevaDonacion(campanias);
                    break;
                case 3:
                    mostrarCampanias(campanias);
                    break;
                case 4:
                    mostrarCampaniaPorNombre(campanias);
                    break;
                case 5:
                    mostrarTotal(campanias);
                    break;
                case 6:
                    mayorDonacion(campanias);
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
