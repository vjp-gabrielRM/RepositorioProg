/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema11ejercicio06;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author alumno
 */
public class Tema11Ejercicio06 {
    
    public static void mostrarMenu(){
        System.out.println("---- MENÚ ----\n");
        System.out.println("1. Añadir donación");
        System.out.println("2. Mostrar donaciones");
        System.out.println("3. Mostrar donaciones por nombre de donante");
        System.out.println("4. Mostrar número de donaciones");
        System.out.println("5. Mostrar total de dinero recaudado");
        System.out.println("6. Ordenar donaciones de mayor a menor");
        System.out.println("7. Salir\n");
        System.out.print("Elija una opción: ");
    }
    
    public static int pedirNum(){
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Campania campania = new Campania();
        int opcion;
        
        do{
            mostrarMenu();
            try{
                opcion = pedirNum();
            }catch(InputMismatchException e){
                opcion = -1;
            }
            
            switch(opcion){
                case 1:
                    campania.nuevaDonacion();
                    break;
                case 2:
                    campania.mostrarDonaciones();
                    break;
                case 3:
                    campania.mostrarPorDonante();
                    break;
                case 4:
                    campania.mostrarNumDonaciones();
                    break;
                case 5:
                    campania.mostrarTotal();
                    break;
                case 6:
                    campania.ordenarDonaciones();
                    break;
                case 7:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida, inténtelo de nuevo");
            }
        }while(opcion != 7);
    }
    
}
