/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema10ejercicio04;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Tema10Ejercicio04 {
    
    public static void rellenarLista(ArrayList<Integer> lista){
        Scanner entrada = new Scanner(System.in);
        boolean seguir = true;
        int num;
        do{
            System.out.print("Introduzca un número positivo, si quiere terminar uno negativo: ");
            num = entrada.nextInt();
            if(num >= 0){
                lista.add(num);
            }else{
                System.out.println("Saliendo...");
                seguir = false;
            }
            entrada.nextLine();
        }while(seguir);
    }
    
    public static void mostrarLista(ArrayList<Integer> lista){
        Object[] array = lista.toArray();
        
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]);
            if(i < array.length - 1){
                System.out.print(" - ");
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
