/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema07ejercicio10;
/**
 *
 * @author alumno
 */
public class Tema07Ejercicio10 {
    
    /**
     * Método que sustituye los datos repetidos de un array por 0
     * @param array 
     */
    public static void sustituirRepetidos(int array[]){
        int aux;
        boolean repetido = false;
        for(int i = 1; i < array.length; i++){
            aux = array[i];
            for(int j = 0; j < array.length; j++){
                if(i != j){
                    if(aux == array[j]){
                        array[j] = 0;
                        repetido = true;
                    }
                }
                if(repetido){
                    array[i] = 0;
                    repetido = false;
                }
            }
        }
        System.out.print("Sustituimos los elementos repetidos por un 0: ");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]);
        }
        System.out.println("");
    }
    
    /**
     * Método que muestra todos los datos de un array
     * @param array 
     */
    public static void mostrarArray(int array[]){
        System.out.print("Se han generado los siguientes números: ");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]);
        }
        System.out.println("");
    }
    
    /**
     * Método que rellena un array con números del 1 al 8
     * @param array 
     */
    public static void rellenarArray(int array[]){
        for(int i = 0; i < array.length; i++){
            array[i] = (int) (Math.random() * (9 - 1) + 1);
        }
    }
    
    public static void main(String[] args) {
        int[] array = new int[10];
        rellenarArray(array);
        mostrarArray(array);
        sustituirRepetidos(array);
    }
    
}
