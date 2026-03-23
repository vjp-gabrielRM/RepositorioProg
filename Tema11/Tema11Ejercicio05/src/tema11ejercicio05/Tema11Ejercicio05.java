/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema11ejercicio05;

import java.util.LinkedHashMap;
import java.util.TreeMap;

/**
 *
 * @author alumno
 */
public class Tema11Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMeses = new TreeMap<>();
        LinkedHashMap<Integer, String> linkedMeses = new LinkedHashMap<>();
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

        for (int i = (meses.length - 1); i >= 0; i--) {
            treeMeses.put((i + 1), meses[i]);
            linkedMeses.put((i + 1), meses[i]);
        }

        treeMeses.forEach((clave, valor)
                -> System.out.println(clave + " - " + valor)
        );

        System.out.println("");
        
        linkedMeses.forEach((clave, valor)
                -> System.out.println(clave + " - " + valor)
        );
    }
}

