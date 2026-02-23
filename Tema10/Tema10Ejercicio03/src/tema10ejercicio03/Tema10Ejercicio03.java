/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema10ejercicio03;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Tema10Ejercicio03 {
    
    public static void rellenarLista(ArrayList<Integer> lista){
        Scanner entrada = new Scanner(System.in);
        boolean seguir = true;
        do{
            System.out.print("Introduzca un número: ");
            lista.add(entrada.nextInt());
            System.out.print("¿Desea introducir otro número? (S/N) ");
            if(entrada.next().equalsIgnoreCase("N")){
                seguir = false;
            }
            entrada.nextLine();
        }while(seguir);
    }
    
    public static void mostrarLista(ArrayList<Integer> lista){
        for(int i = 0; i < lista.size(); i++){
            System.out.print(lista.get(i));
            if(i < lista.size() - 1){
                System.out.print(", ");
            }
        }
        System.out.println("");
    }
    
    public static void intercambio(ArrayList<Integer> lista){
        int aux;
        aux = lista.get(1);
        lista.set(1, lista.get(3));
        lista.set(3, aux);
        System.out.println("Intercambiando elementos 2 y 4...");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        rellenarLista(lista);
        mostrarLista(lista);
        intercambio(lista);
        mostrarLista(lista);
    }
    
}
