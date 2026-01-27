/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema08ejercicio01;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Tema08Ejercicio01 {

    public static void pedirNotas(Asignatura[] notas){
        Scanner entrada = new Scanner(System.in);
        for(int i = 0; i < notas.length; i++){
            System.out.print("Por favor introduzca la nota de " + notas[i].getNombre() + ": " );
            notas[i].setNota(entrada.nextFloat());
        }
    }
    
    public static void mostrarMedia(Asignatura[] notas){
        float suma = 0;
        float media;
        for(int i = 0; i < notas.length; i++){
            suma += notas[i].getNota();
        }
        media = (suma / (float) notas.length);
        System.out.printf("La nota media es de %.1f\n", media);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Asignatura[] notas = new Asignatura[6];
        notas[0] = new Asignatura("Programación");
        notas[1] = new Asignatura("Lenguajes de Marcas");
        notas[2] = new Asignatura("Bases de Datos");
        notas[3] = new Asignatura("Entornos de Desarrollo");
        notas[4] = new Asignatura("Sistemas Informáticos");
        notas[5] = new Asignatura("Formación y Orientación Laboral");
        
        pedirNotas(notas);
        
        mostrarMedia(notas);
    }
}
