/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio23;

    import java.util.Scanner;

public class Ejercicio23 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num, cont=1;
        Scanner entrada = new Scanner(System.in);
    
    do{                                             //pido un número positivo, si no lo es, digo que es incorrecto y lo vuelvo a pedir hasta que me lo den
        System.out.println("Introduce un número mayor que 1: ");
        
        num = entrada.nextInt();
        
        if(num<=1){ 
            System.out.println("Error, introduce un número mayor que 1.");
        }
    } while (num<=1);
    
    do{                                             //pido un número positivo, si no lo es, digo que es incorrecto y lo vuelvo a pedir hasta que me lo den
        System.out.println(cont);
        
        cont++;
        
    } while (cont<=num);
        // TODO code application logic here
    }
    
}
