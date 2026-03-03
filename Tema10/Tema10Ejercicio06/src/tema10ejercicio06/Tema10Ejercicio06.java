/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema10ejercicio06;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Tema10Ejercicio06 {

    public final static int MESES = 12;

    public static int pedirNum() {
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }

    public static void mostrarMenu() {
        System.out.println("1. Introducir ventas");
        System.out.println("2. Mostrar ventas");
        System.out.println("3. Mostrar ventas al revés");
        System.out.println("4. Total de ventas del año");
        System.out.println("5. Ventas totales de meses con la letra 'a'");
        System.out.println("6. Mes(es) con más ventas");
        System.out.println("7. Salir");
    }

    public static void rellenarLista(ArrayList<Integer> meses) {
        System.out.println("Rellenando...");
        for (int i = 0; i < MESES; i++) {
            meses.set(i, (int) (Math.random() * 200));
        }
    }

    public static void mostrarLista(ArrayList<Integer> meses, String[] nombresMeses) {
        System.out.println("Las ventas de cada mes han sido: ");
        for (int i = 0; i < MESES; i++) {
            System.out.println(nombresMeses[i] + ": " + meses.get(i));
        }
    }

    public static void mostrarListaAlReves(ArrayList<Integer> meses, String[] nombresMeses) {
        System.out.println("Las ventas de cada mes en orden inverso han sido: ");
        for (int i = MESES - 1; i >= 0; i--) {
            System.out.println(nombresMeses[i] + ": " + meses.get(i));
        }
    }

    public static void mostrarTotal(ArrayList<Integer> meses) {
        int total = 0;
        for (int i = 0; i < MESES; i++) {
            total += meses.get(i);
        }
        System.out.println("El total de ventas de todo el año ha sido " + total);
    }

    public static void mesesConA(ArrayList<Integer> meses, String[] nombresMeses) {
        int total = 0;
        for (int i = 0; i < MESES; i++) {
            if (nombresMeses[i].contains("a") || nombresMeses[i].contains("A")) {
                total += meses.get(i);
            }
        }
        System.out.println("El total de ventas de los meses que contienen la letra 'a' ha sido " + total);
    }

    public static void masVentas(ArrayList<Integer> meses, String[] nombresMeses) {
        int max = 0;

        for (int i = 0; i < meses.size(); i++) {

            if (meses.get(i) > max) {
                max = meses.get(i);
            }

        }

        System.out.println("Los meses con más ventas son: ");
        for (int i = 0; i < meses.size(); i++) {

            if (meses.get(i) == max) {
                System.out.println(nombresMeses[i] + "con " + max + " ventas");
            }

        }
    }
        /**
         * @param args the command line arguments
         */
    public static void main(String[] args) {
        ArrayList<Integer> meses = new ArrayList<>();
        String[] nombresMeses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        int opcion;
        
        do{
            mostrarMenu();
            System.out.print("\nPor favor introduzca una opción: ");
            try{
                opcion = pedirNum();
            }catch(InputMismatchException e){
                opcion = -1;
            }
            System.out.println("");
            
            switch(opcion){
                case 1:
                    rellenarLista(meses);
                    break;
                case 2:
                    mostrarLista(meses, nombresMeses);
                    break;
                case 3:
                    mostrarListaAlReves(meses, nombresMeses);
                    break;
                case 4:
                    mostrarTotal(meses);
                    break;
                case 5:
                    mesesConA(meses, nombresMeses);
                    break;
                case 6:
                    masVentas(meses, nombresMeses);
                    break;
                case 7:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida, inténtelo de nuevo\n");
            }
        }while(opcion != 7);
    }

}
