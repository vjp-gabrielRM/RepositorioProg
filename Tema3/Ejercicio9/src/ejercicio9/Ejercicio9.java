/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9;

    import java.util.Scanner;

public class Ejercicio9 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
    int num1, num2, num3, num4;
    int ord1 = 0 , ord2 = 0 , ord3 = 0 , ord4 = 0;
    Scanner entrada = new Scanner(System.in);
    
    System.out.println("Introduce el primer número: ");
        
    num1 = entrada.nextInt();
    
    System.out.println("Introduce el segundo número: ");
        
    num2 = entrada.nextInt();
    
    System.out.println("Introduce el tercer número: ");
        
    num3 = entrada.nextInt();
    
    System.out.println("Introduce el cuarto número: ");
        
    num4 = entrada.nextInt();
    
    if (num1<num2 && num1<num3 && num1<num4){
        ord1 = num1;
        if (num2<num3 && num2<num4){
        ord2 = num2;
            if (num3<num4){
            ord3 = num3;
            ord4 = num4;
            } else {
            ord3 = num4;
            ord4 = num3;
            }
        }
    }
    System.out.println("El orden de los números introducidos es: " + ord1 +" - " + ord2 + " - " + ord3 + " - " + ord4 );
        // TODO code application logic here
    }
    
}
