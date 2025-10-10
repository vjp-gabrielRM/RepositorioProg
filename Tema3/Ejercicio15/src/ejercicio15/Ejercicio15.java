/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;

    import java.util.Scanner;

public class Ejercicio15 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
    int num, i;
    Scanner entrada = new Scanner(System.in);
    
    System.out.println("Introduce un número para obtener su tabla de multiplicar: ");
        
    num = entrada.nextInt();          //pido al usuario el número
    
    for(i=1;i<11;i++){
        System.out.println(num + " x " + i + " = " + (num*i));
    // TODO code application logic here
    }
    }
}
