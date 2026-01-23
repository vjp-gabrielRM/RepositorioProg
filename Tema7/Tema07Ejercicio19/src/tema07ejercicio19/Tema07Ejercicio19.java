/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema07ejercicio19;

/**
 *
 * @author alumno
 */
public class Tema07Ejercicio19 {
    
    public static final int MIN = 10;
    public static final int MAX = 80;
    /**
     * Método que rellena un array con números aleatorios de 10 a 80
     * @param array 
     */
    public static void rellenarArray(int array[]){
        for(int i = 0; i < array.length; i++){
            array[i] = (int) (Math.random() * ((MAX+1) - MIN) + MIN);
        }
    }
    
    /**
     * Método que compara todos los elementos de un array y muestra el mayor de todos
     * @param array 
     */
    public static void mostrarMayor(int array[]) {
        int pos = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[pos] < array[i]) {
                pos = i;
            }
        }
        System.out.println("El mayor número del vector es " + array[pos]);
    }
    
    /**
     * Método que compara todos los elementos de un array y muestra el menor de todos
     * @param array 
     */
    public static void mostrarMenor(int array[]) {
        int pos = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[pos] > array[i]) {
                pos = i;
            }
        }
        System.out.println("El menor número del vector es " + array[pos]);
    }
    
    /**
     * Método que cuenta cuántas veces se repite un número en un array e imprime el más repetido
     * @param array 
     */
    public static void masRepetido(int array[]){
        int[] repetidos = new int[MAX - MIN];
        int referencia = 10;
        int pos = 0;
        
        for(int i = 0; i < repetidos.length; i++){
            for(int j = 0; j < array.length; j++){
                if(array[j] == referencia){
                    repetidos[i]++;
                }
            }
            referencia++;
        }
        
        for (int i = 1; i < repetidos.length; i++) {
            if (array[pos] < array[i]) {
                pos = i;
            }
        }
        System.out.println("El número más repetido en el array es " + (pos+10));
    }
    
    /**
     * Método que calcula la media de todos los números de un array
     * @param array 
     */
    public static void mostrarMedia(int array[]){
        float suma = 0;
        float media;
        for(int i = 0; i < array.length; i++){
            suma += array[i];
        }
        media = (suma / (float) array.length);
        System.out.printf("La media de los números generados es %.1f\n", media);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array = new int[100];
        
        rellenarArray(array);
        
        mostrarMayor(array);
        System.out.println("");
        
        mostrarMenor(array);
        System.out.println("");
        
        masRepetido(array);
        System.out.println("");
        
        mostrarMedia(array);
    }
    
}
