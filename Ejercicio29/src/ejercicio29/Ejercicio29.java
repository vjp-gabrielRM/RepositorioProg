/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio29;

import static java.lang.Math.sqrt;
    import java.util.Scanner;

public class Ejercicio29 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
    double hipotenusa;
    Scanner entrada = new Scanner(System.in);
    
    System.out.println("Introduce la medida de un cateto: ");
        
    float cateto1 = entrada.nextFloat();
    
    System.out.println("Introduce la medida del otro cateto: ");
        
    float cateto2 = entrada.nextFloat();
    
    hipotenusa = sqrt(cateto1 * cateto1 + cateto2* cateto2);
    
    System.out.println("La hipotenusa del triangulo seria " + hipotenusa + ".");
        // TODO code application logic here
    }
    
}
