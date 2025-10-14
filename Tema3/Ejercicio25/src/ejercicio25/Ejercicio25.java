/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio25;

public class Ejercicio25 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
    int i,j=0;          //declaro una variable i para hacer de contador
    
    for(i=17;i<=139;i++){
        if(i%2==0){
            j+=i;
        }
    }
    System.out.println("La suma total de los números pares entre 17 y 139 es " +j);
    }
    
}