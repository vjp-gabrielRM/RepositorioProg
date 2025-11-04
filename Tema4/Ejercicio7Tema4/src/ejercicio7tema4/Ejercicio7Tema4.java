/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7tema4;
    
    import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio7Tema4 {
    
    /**
     * Método que ordena los números usando el método burbuja
     * @param num1
     * @param num2
     * @param num3
     * @param num4 
     */
    public static void ordenar(int num1, int num2, int num3, int num4){      //en el método compruebo si el número introducido es positivo o negativo comparando con 0
        int temp;
        while (!(num1<num2 && num1<num3 && num1<num4 && num2<num3 && num2<num4 && num3<num4)){
            if (num1>num2){
                temp = num1;
                num1 = num2;
                num2 = temp;
            }
            if (num2>num3){
                temp = num2;
                num2 = num3;
                num3 = temp;
            }
            if (num3>num4){
                temp = num3;
                num3 = num4;
                num4 = temp;
            }
        }
        System.out.println(num1 + " - " + num2 + " - " + num3 + " - " + num4);
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);              //declaro las variables entrada y num
        int num1, num2, num3, num4;
        System.out.println("Por favor introduzca un número: ");
        num1 = entrada.nextInt();
        System.out.println("Por favor introduzca un número: ");
        num2 = entrada.nextInt();
        System.out.println("Por favor introduzca un número: ");
        num3 = entrada.nextInt();
        System.out.println("Por favor introduzca un número: ");
        num4 = entrada.nextInt();
        
        ordenar(num1, num2, num3, num4);                                 //llamo al método para que se ejecute
        // TODO code application logic here
    }
    
}
