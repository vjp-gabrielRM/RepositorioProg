/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema10ejercicio07;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Tema10Ejercicio07 {

    public final static int SEMANAS = 4;
    public final static int DIAS = 7;

    /**
     * Método que rellena la lista de listas con 28 temperaturas
     *
     * @param temperaturas
     */
    public static void rellenar(ArrayList<ArrayList<Integer>> temperaturas) {
        for (int i = 0; i < SEMANAS; i++) {
            //Creo el arrayList de temperaturas de la semana
            ArrayList<Integer> dias = new ArrayList<>();

            //Relleno el arrayList de temperaturas de la semana
            for (int j = 0; j < DIAS; j++) {
                dias.add((int) (Math.random() * 15));
            }

            //Inserto las temperaturas de la semana a la lista
            temperaturas.add(dias);
        }
    }

    /**
     * Método que muestra las temperaturas del mes
     *
     * @param temperaturas
     * @param dias
     */
    public static void mostrar(ArrayList<ArrayList<Integer>> temperaturas, String[] dias) {
        if (temperaturas.isEmpty()) {
            System.out.println("No hay temperaturas registradas en el mes");
        } else {
            for (int i = 0; i < temperaturas.size(); i++) {
                System.out.println("Semana " + (i + 1));

                for (int j = 0; j < temperaturas.get(i).size(); j++) {
                    System.out.println(dias[j] + (i * 7 + j) + ": " + temperaturas.get(i).get(j) + " ºC");
                }
            }
        }

    }

    /**
     * Método que muestra la temperatura media del mes
     *
     * @param temperaturas
     */
    public static void calcularMedia(ArrayList<ArrayList<Integer>> temperaturas) {
        if (temperaturas.isEmpty()) {
            System.out.println("No hay temperaturas registradas en el mes");
        } else {
            int media = 0;

            for (int i = 0; i < temperaturas.size(); i++) {

                for (int j = 0; j < temperaturas.get(i).size(); j++) {
                    media += temperaturas.get(i).get(j);
                }
            }

            media /= SEMANAS * DIAS;
            System.out.println("La temperatura media del mes es " + media);
        }
    }

    /**
     * Método que muestra las temperaturas más altas del mes
     *
     * @param temperaturas
     * @param dias
     */
    public static void mostrarTemperaturasMaximas(ArrayList<ArrayList<Integer>> temperaturas, String[] dias) {
        if (temperaturas.isEmpty()) {
            System.out.println("No hay temperaturas registradas en el mes");
        } else {
            int maxTemp = 0;

            for (int i = 0; i < temperaturas.size(); i++) {

                for (int j = 0; j < temperaturas.get(i).size(); j++) {
                    if (temperaturas.get(i).get(j) > maxTemp) {
                        maxTemp = temperaturas.get(i).get(j);
                    }
                }
            }

            System.out.println("Los días con temperaturas más altas son: ");
            for (int i = 0; i < temperaturas.size(); i++) {

                for (int j = 0; j < temperaturas.get(i).size(); j++) {
                    if (temperaturas.get(i).get(j) == maxTemp) {
                        System.out.println("El " + dias[j] + " de la semana " + (i + 1) + "con " + maxTemp + " grados");
                    }
                }
            }
        }
    }

    public static int pedirOpcion() {
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> temperaturas = new ArrayList<>();
        String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        int opcion = 0;

        do {

            try {
                System.out.println("1. Rellenar las temperaturas");
                System.out.println("2. Mostrar las temperaturas");
                System.out.println("3. Temperatura media");
                System.out.println("4. Días más calurosos");
                System.out.println("5. Salir");
                System.out.print("  Opción: ");

                opcion = pedirOpcion();

                switch (opcion) {
                    case 1 ->
                        rellenar(temperaturas);
                    case 2 ->
                        mostrar(temperaturas, dias);
                    case 3 ->
                        calcularMedia(temperaturas);
                    case 4 ->
                        mostrarTemperaturasMaximas(temperaturas, dias);
                    case 5 ->
                        System.out.print("Saliendo...");
                    default ->
                        System.out.println("Error: Introduzca un número entre 1 y 5");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Introduzca un número entre 1 y 5");
            }

        } while (opcion != 5);
    }

}
