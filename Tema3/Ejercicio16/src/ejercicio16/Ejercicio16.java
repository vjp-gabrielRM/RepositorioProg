/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16;

public class Ejercicio16 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
    int i,j=0;          //declaro una variable i para hacer de contador para el bucle y j como contador de números impares
    
    for(i=20;i<=160;i++){
        if(i%2==1){
            System.out.println(i);
            j++;
        }
    }                   //imprimo los resultados
    System.out.println("Se han impreso " + j + " números impares.");
    }
    
}
