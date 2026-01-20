/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema07ejercicio16;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author alumno
 */
public class Tema07Ejercicio16 {
    
    /**
     * Método que muestra un menú al usuario
     */
    public static void mostrarMenu(){
        System.out.println("---- Menú ----\n");
        System.out.println("1. Rellenar las notas de los alumnos");
        System.out.println("2. Mostrar las notas de los alumnos");
        System.out.println("3. Mostrar al alumno con mejor media");
        System.out.println("4. Mostrar al alumno con más suspensos");
        System.out.println("5. Mostrar la asignatura más difícil");
        System.out.println("6. Salir\n");
    }
    
    /**
     * Método que pide un dato al usuario con control de excepciones
     * @return el dato introducido por el usuario
     */
    public static int pedirOpcion(){
        int opcion;
        Scanner entrada = new Scanner(System.in);
        
        try{
            opcion = entrada.nextInt();
        }catch(InputMismatchException e){
            opcion = 0;
            entrada.nextLine();
        }
        
        return opcion;
    }
    
    /**
     * Método que rellena el array con datos introducidos por el usuario
     * @param notas
     * @param alumnos
     * @param asignaturas 
     */
    public static void rellenarArray(int notas[][], String alumnos[], String asignaturas[]){
        for(int i = 0; i < notas.length; i++){
            for(int j = 0; j < notas[i].length; j++){
                System.out.println("Por favor introduzca la nota de " + asignaturas[j]
                        + " de " + alumnos[i]);
                notas[i][j] = pedirOpcion();
            }
        }
        /*for(int i = 0; i < notas.length; i++){
            for(int j = 0; j < notas[i].length; j++){
                notas[i][j] = (int) (Math.random() * (11 - 0) + 0);
            }
        }*/
    }
    
    /**
     * Método que muestra todos los datos del array
     * @param notas
     * @param alumnos
     * @param asignaturas 
     */
    public static void mostrarNotas(int notas[][], String alumnos[], String asignaturas[]){
        System.out.println("Las notas de los alumnos son:\n");
        for(int i = 0; i < notas.length; i++){
            System.out.println("--- " + alumnos[i] + " ---");
            for(int j = 0; j < notas[i].length; j++){
                System.out.println(asignaturas[j] + ": " + notas[i][j]);
            }
            System.out.println("");
        }
    }
    
    /**
     * Método que hace la media de cada alumno y luego las compara para sacar la más alta
     * @param notas
     * @param alumnos 
     */
    public static void mostrarMejor(int notas[][], String alumnos[]){
        float suma = 0;
        int pos = 0;
        float[] medias = new float[6];
        for(int i = 0; i < notas.length; i++){
            suma = 0;
            for(int j = 0; j < notas[i].length; j++){
                suma += notas[i][j];
            }
            medias[i] = suma / notas[0].length;
        }
        for (int i = 1; i < medias.length; i++) {
            if (i < medias.length) {
                if (medias[pos] < medias[i]) {
                    pos = i;
                }
            }
        }
        System.out.println("El alumno con mejor media es " + alumnos[pos] + " con una media de " + medias[pos]);
    }
    
    /**
     * Método que compara el número de suspensos de cada alumno y muestra al que más tiene
     * @param notas
     * @param alumnos 
     */
    public static void mostrarMasSuspensos(int notas[][], String alumnos[]){
        int[] suspensos = {0, 0, 0, 0, 0, 0};
        int pos = 0;
        for(int i = 0; i < notas.length; i++){
            for(int j = 0; j < notas[0].length; j++){
                if(notas[i][j] < 5){
                    suspensos[i]++;
                }
            }
        }
        for (int i = 1; i < suspensos.length; i++) {
            if (i < suspensos.length) {
                if (suspensos[pos] < suspensos[i]) {
                    pos = i;
                }
            }
        }
        System.out.println("El alumno con más suspensos ha sido " + alumnos[pos] + " con " + suspensos[pos] + " suspensos");
    }
    
    /**
     * Método que calcula la media de cada asignatura y muestra la menor de todas
     * @param notas
     * @param asignaturas 
     */
    public static void mostrarMasDificil(int notas[][], String asignaturas[]){
        float suma = 0;
        int pos = 0;
        float[] medias = new float[4];
        for(int i = 0; i < notas[0].length; i++){
            suma = 0;
            for(int j = 0; j < notas.length; j++){
                suma += notas[j][i];
            }
            medias[i] = suma / notas.length;
        }
        for (int i = 1; i < medias.length; i++) {
            if (medias[pos] > medias[i]) {
                pos = i;
            }
        }
        System.out.println("La asignatura más difícil es " + asignaturas[pos] + " con una media de " + medias[pos]);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;
        int[][] notas = new int[6][4];
        String[] alumnos = {"Pepe", "Juan", "Ana", "Marta", "Pedro", "María"};
        String[] asignaturas = {"Lengua", "Matemáticas", "Historia", "Física"};
        
        do{
            mostrarMenu();
            opcion = pedirOpcion();
            switch(opcion){
                case 1:
                    rellenarArray(notas, alumnos, asignaturas);
                    break;
                    
                case 2:
                    mostrarNotas(notas, alumnos, asignaturas);
                    break;
                
                case 3:
                    mostrarMejor(notas, alumnos);
                    break;
                    
                case 4:
                    mostrarMasSuspensos(notas, alumnos);
                    break;
                    
                case 5:
                    mostrarMasDificil(notas, asignaturas);
                    break;
                
                case 6:
                    break;
                    
                default:
                    System.out.println("Opción no válida, por favor inténtelo de nuevo");
            }
        }while(opcion!=6);
        
    }
    
}
