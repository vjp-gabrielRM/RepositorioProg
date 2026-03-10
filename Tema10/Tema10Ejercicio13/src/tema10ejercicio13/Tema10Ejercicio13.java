/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema10ejercicio13;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Tema10Ejercicio13 {

    public static final int MESES = 12;
    
    public static int pedirNum() {
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }

    public static void mostrarMenu() {
        System.out.println("1. Introducir ventas de cada mes");
        System.out.println("2. Mostrar ventas");
        System.out.println("3. Total de ventas del año");
        System.out.println("4. Ventas totales de meses que empiezan con la letra 'a'");
        System.out.println("5. Mes(es) con más ventas");
        System.out.println("6. Salir");
    }
    
    public static void rellenarLista(ArrayList<Venta> meses, String[] nombresMeses) {
        System.out.println("Rellenando...\n");
        for (int i = 0; i < MESES; i++) {
            meses.add(new Venta(nombresMeses[i], (int) (Math.random() * 200)));
        }
    }
    
    public static void mostrarLista(ArrayList<Venta> meses) {
        System.out.println("Las ventas de cada mes han sido: ");
        for (int i = 0; i < MESES; i++) {
            System.out.println(meses.get(i).toString());
        }
        System.out.println("");
    }
    
    public static void mostrarTotal(ArrayList<Venta> meses) {
        int total = 0;
        for (int i = 0; i < MESES; i++) {
            total += meses.get(i).getVentasMes();
        }
        System.out.println("El total de ventas de todo el año ha sido " + total);
    }

    public static void mesesConA(ArrayList<Venta> meses) {
        int total = 0;
        for (int i = 0; i < MESES; i++) {
            if (meses.get(i).getNombreMes().indexOf("A") == 0) {
                total += meses.get(i).getVentasMes();
            }
        }
        System.out.println("El total de ventas de los meses que empiezan con la letra 'a' ha sido " + total);
    }
    
    public static void masVentas(ArrayList<Venta> meses) {
        int max = 0;

        for (int i = 0; i < meses.size(); i++) {

            if (meses.get(i).getVentasMes() > max) {
                max = meses.get(i).getVentasMes();
            }

        }

        System.out.println("El mes o meses con más ventas son: ");
        for (int i = 0; i < meses.size(); i++) {

            if (meses.get(i).getVentasMes() == max) {
                System.out.println(meses.get(i).getNombreMes() + " con " + max + " ventas");
            }

        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Venta> meses = new ArrayList<>();
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
                    rellenarLista(meses, nombresMeses);
                    break;
                case 2:
                    mostrarLista(meses);
                    break;
                case 3:
                    mostrarTotal(meses);
                    break;
                case 4:
                    mesesConA(meses);
                    break;
                case 5:
                    masVentas(meses);
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida, inténtelo de nuevo\n");
            }
        }while(opcion != 6);
    }
    
}
