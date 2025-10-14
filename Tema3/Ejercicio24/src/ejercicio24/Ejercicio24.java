/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio24;

    import java.util.Scanner;

public class Ejercicio24 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num, cont=1, numImpresos=0;
        Scanner entrada = new Scanner(System.in);
    
    do{                                             //pido un número positivo, si no lo es, digo que es incorrecto y lo vuelvo a pedir hasta que me lo den
        System.out.println("Introduce un número mayor que 1: ");
        
        num = entrada.nextInt();
        
        if(num<=1){ 
            System.out.println("Error, introduce un número mayor que 1.");
        }
    } while (num<=1);
    
    do{                                            //pido un número positivo, si no lo es, digo que es incorrecto y lo vuelvo a pedir hasta que me lo den
        if ((cont%3)==0){
        System.out.println(cont);
        numImpresos++;
        }
        cont++;
    } while (cont<=num);
    System.out.println("Se han impreso " + numImpresos + " números");      // TODO code application logic here
    }
    
}
