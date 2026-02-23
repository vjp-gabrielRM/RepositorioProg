/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema10ejercicio02;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Tema10Ejercicio02 {
    
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
        for(int i = 0; i < lista.size(); i++){
            System.out.print(lista.get(i));
            if(i < lista.size() - 1){
                System.out.print(" - ");
            }
        }
        System.out.println("");
    }
    
    public static void mostrarMayor(ArrayList<Integer> lista){
        int pos = 0;
        for (int i = 1; i < lista.size(); i++) {
            if (lista.get(pos) < lista.get(i)) {
                pos = i;
            }
        }
        System.out.println("El mayor número en la lista es " + lista.get(pos));
    }
    
    public static void mostrarMenor(ArrayList<Integer> lista){
        int pos = 0;
        for (int i = 1; i < lista.size(); i++) {
            if (lista.get(pos) > lista.get(i)) {
                pos = i;
            }
        }
        System.out.println("El menor número en la lista es " + lista.get(pos));
    }
    
    public static void mostrarSuma(ArrayList<Integer> lista){
        int suma = 0;

        for (int i = 0; i < lista.size(); i++) {
            suma += lista.get(i);
        }

        System.out.println("La suma de todos los números de la lista da como resultado " + suma);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        rellenarLista(lista);
        mostrarLista(lista);
        mostrarMayor(lista);
        mostrarMenor(lista);
        mostrarSuma(lista);
    }
    
}
