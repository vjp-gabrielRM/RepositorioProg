/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio26;

public class Ejercicio26 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
    int i,j=0;          //declaro una variable i para hacer de contador
    
    for(i=111;i<=222;i++){
        if(i%2==1){
            j+=i;
        }
    }
    System.out.println("La suma total de los números pares entre 111 y 222 es " +j);
    }
    
}