/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio28;

public class Ejercicio28 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
    int num = (int) (Math.random()*100+1);          //declaro una variable i para hacer de contador
    
    System.out.print("El número aleatorio generado es " +num);
    
        if(num%2==0){
            System.out.println(", que es un número par");
        } else{
            System.out.println(", que es un número impar");
        }
    }
    
}