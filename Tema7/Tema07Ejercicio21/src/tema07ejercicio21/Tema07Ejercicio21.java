/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema07ejercicio21;

/**
 *
 * @author alumno
 */
public class Tema07Ejercicio21 {

    public static void mostrarTabla(int[][] tabla){
        int columna = 1;
        int fila = 1;
        for(int i = 0; i < tabla.length; i++){
            for(int j = 0; j < tabla[i].length; j++){
                System.out.print(tabla[i][j] + " ");
                if(columna % 3 == 0 && columna % 9 != 0){
                    System.out.print("| ");
                }
                columna++;
            }
            System.out.println("");
            if(fila % 3 == 0 && fila % 9 != 0){
                for(int k = 0; k < 21; k++){
                    System.out.print("-");
                }
                System.out.println("");
            }
            fila++;
        }
        System.out.println("");
    }
    
    public static void rellenarTabla(int[][] tabla){
        for(int i = 0; i < tabla.length; i++){
            for(int j = 0; j < tabla[i].length; j++){
                tabla[i][j] = (int) (Math.random() * 9 + 1);
            }
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] tabla = new int[9][9];
        rellenarTabla(tabla);
        mostrarTabla(tabla);
    }
    
}
