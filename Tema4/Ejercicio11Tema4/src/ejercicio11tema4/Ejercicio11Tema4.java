/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11tema4;
    
    import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio11Tema4 {
    
    public static int entradaNum(){
        int num;
        do{
        Scanner entrada = new Scanner (System.in);
        System.out.println("Por favor introduzca un número positivo: ");   //pido un número al usuario
        num = entrada.nextInt();
        if (!(num>=0)){
            System.out.println("No válido, debe ser un número positivo");
        }
        } while (!(num>=0));
        return num;
    }
    
    public static double raiz(int num){      //creo un método para hacer las veces de contador
        double raiz =  Math.sqrt(num);
        return raiz;
    }
    
    public static void imprimir(double raiz){

        System.out.println("La raíz cuadrada del número introducido es " + raiz);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        double raiz = 0;
        
        num = entradaNum();
        raiz = raiz(num);
        imprimir(raiz);
        
         // TODO code application logic here
    }
    
}
