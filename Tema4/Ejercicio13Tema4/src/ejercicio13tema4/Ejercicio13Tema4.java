/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13tema4;
    
    import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio13Tema4 {
    
    public static int entradaNum(){
        Scanner entrada = new Scanner (System.in);
        System.out.println("Por favor introduzca un número mayor que 1: ");   //pido un número al usuario
        return entrada.nextInt();
    }
    
    public static void contador(int num){      //creo un método para hacer las veces de contador
        int i;
        for (i=1; i<=num; i++){
            System.out.println(i);
        }
    }
    
    public static boolean mayorQue1(int num){

        boolean mayor = num>1;
        return mayor;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        boolean esMayor;
        do{
            num = entradaNum();
            esMayor = mayorQue1(num);
            if (!esMayor){
                System.out.println("No válido, introduzca un número mayor que 1");
            }
        } while (!esMayor);
        
        if(esMayor){
            contador(num);
        }
        // TODO code application logic here
    }
    
}
