/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema07ejercicio06;

/**
 *
 * @author alumno
 */
public class Tema07Ejercicio06 {

    /**
     * Método que muestra todos los datos de un array
     *
     * @param array
     */
    public static void mostrarArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("El " + (i + 1) + "º número del array es " + array[i]);
        }
    }

    /**
     * Método que rellena un array con números primos
     *
     * @param array
     */
    public static void rellenarPrimos(int array[]) {
        boolean primo;
        int i = 0;
        int num = 1;

        while (i < array.length) {
            primo = true;
            for (int j = 2; j < num && primo; j++) {
                if (num % j == 0) {
                    primo = false;
                }
            }
            if (primo) {
                array[i] = num;
                i++;
            }
            num++;
        }
    }

    public static void main(String[] args) {
        int[] array = new int[80];
        rellenarPrimos(array);
        mostrarArray(array);
    }

}
