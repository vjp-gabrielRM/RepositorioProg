/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema10ejercicio01;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Tema10Ejercicio01 {
    
    public static void rellenarLista(ArrayList<String> lista){
        Scanner entrada = new Scanner(System.in);
        boolean seguir = true;
        do{
            System.out.print("Introduzca un nombre: ");
            lista.add(entrada.nextLine());
            System.out.print("¿Desea introducir otro nombre? (S/N) ");
            if(entrada.next().equalsIgnoreCase("N")){
                seguir = false;
            }
            entrada.nextLine();
        }while(seguir);
    }
    
    public static void mostrarLista(ArrayList<String> lista){        
        for(int i = 0; i < lista.size(); i++){
            System.out.print(lista.get(i));
            if(i < lista.size() - 1){
                System.out.print(", ");
            }
        }
        System.out.println("");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<String>();
        rellenarLista(lista);
        mostrarLista(lista);
    }
    
}
