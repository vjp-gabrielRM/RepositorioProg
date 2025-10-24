/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4tema4;

/**
 *
 * @author alumno
 */
public class menor {
    public static int comparacion(int num1, int num2, int num3){
        int menor;
        
        if (num1<=num2 && num1<=num3){
            menor = num1;
        } else if (num2<=num1 && num2<=num3){
            menor = num2;
        } else {
            menor = num3;
        }
        
        return menor;
    }
}
