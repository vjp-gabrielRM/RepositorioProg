/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema11ejercicio04;

import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 *
 * @author alumno
 */
public class Tema11Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashSet<String> hashMeses = new HashSet<>();
        LinkedHashSet<String> linkedMeses = new LinkedHashSet<>();
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        
        for (int i = 0; i < meses.length; i++) {
            hashMeses.add(meses[i]);
            linkedMeses.add(meses[i]);
        }
        
        for(String elem : hashMeses){
            System.out.println(elem);
        }
        System.out.println("");
        for(String elem : linkedMeses){
            System.out.println(elem);
        }
    }
    
}
