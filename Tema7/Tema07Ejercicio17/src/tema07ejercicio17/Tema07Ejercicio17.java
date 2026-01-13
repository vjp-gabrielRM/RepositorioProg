/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema07ejercicio17;
/**
 *
 * @author alumno
 */
public class Tema07Ejercicio17 {
    
    /**
     * Método que ordena los elementos de un array de mayor a menor y los imprime en pantalla
     * @param array 
     */
    public static void mayorAMenor(int array[]){
        int aux;
        for(int i = 0; i <= 9; i++){
            for(int j = 0; j < array.length; j++){
                if(array[i] < array[j]){
                    aux = array[i];
                    array[i] = array[j];
                    array[j] = aux;
                }
            }
        }
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
     * Método que llena un array con números aleatorios del 0 al 9
     * @param array 
     */
    public static void rellenarArray(int array[]){
        for(int i = 0; i < array.length; i++){
            array[i] = (int) (Math.random() * 10);
        }
    }
    
    public static void main(String[] args) {
        int[] array = new int[10];
        rellenarArray(array);
        mostrarArray(array);
        mayorAMenor(array);
        mostrarArray(array);
    }
    
}
