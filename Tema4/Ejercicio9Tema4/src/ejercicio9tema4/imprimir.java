/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio9tema4;

/**
 *
 * @author alumno
 */
public class imprimir {
    public static void menor(int num1, int num2, int num3){
        if (num1<=num2 && num1<=num3){
            System.out.println("El menor de los 3 números es " + num1);
        } else if (num2<=num1 && num2<=num3){
            System.out.println("El menor de los 3 números es " + num2);
        } else {
            System.out.println("El menor de los 3 números es " + num3);
        }
    }
}
