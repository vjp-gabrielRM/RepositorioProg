/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema10ejercicio05;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Tema10Ejercicio05 {

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
                System.out.print(", ");
            }
        }
        System.out.println("");
    }
    
    public static void intercambio(ArrayList<Integer> lista, int pos1, int pos2){
        int aux;
        aux = lista.get(pos1);
        lista.set(pos1, lista.get(pos2));
        lista.set(pos2, aux);
        System.out.println("Intercambiando elementos " + (pos1 + 1) + " y " + (pos2 + 1) + "...");
    }
    
    public static int mayorPar(ArrayList<Integer> lista) {
        int resultado;
        int pos = 0;
        for (int i = 1; i < lista.size(); i++) {
            if ((lista.get(pos) < lista.get(i)) && (lista.get(i) % 2 == 0)) {
                pos = i;
            }
        }
        resultado = lista.get(pos);
        System.out.println("El mayor par es " + resultado + " en la posición " + (lista.indexOf(resultado) + 1));
        return pos;
    }
    
    public static int menorImpar(ArrayList<Integer> lista) {
        int resultado;
        int pos = 0;
        for (int i = 1; i < lista.size(); i++) {
            if ((lista.get(pos) > lista.get(i)) && (lista.get(i) % 2 != 0)) {
                pos = i;
            }
        }
        resultado = lista.get(pos);
        System.out.println("El menor impar es " + resultado + " en la posición " + (lista.indexOf(resultado) + 1));
        return pos;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        rellenarLista(lista);
        mostrarLista(lista);
        intercambio(lista, mayorPar(lista), menorImpar(lista));
        mostrarLista(lista);
    }
    
}
