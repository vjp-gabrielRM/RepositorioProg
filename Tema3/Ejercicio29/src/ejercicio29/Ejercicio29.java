/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio29;

    import java.util.Scanner;

public class Ejercicio29 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Scanner entrada = new Scanner(System.in);
    int num = (int) (Math.random()*100+1);          //declaro una variable i para hacer de contador
    int intento;
    do{                                         //hago un bucle pidiendo que el usuario introduzca la contraseña, si es incorrecta repito y pierde un intento
        System.out.println("Acierta el número de 1 a 100: ");
        
        intento = entrada.nextInt();
        
        if (intento!=num){         //si el usuario falla, le aviso y le digo los intentos que le quedan
            System.out.print("No has acertado");
            
            if (intento<num){
               System.out.println(", el número es mayor que " +intento); 
            } else {
                System.out.println(", el número es menor que " +intento);
            }
        }
    } while (intento!=num);
    
    if (intento==num){                  //al salir del bucle, si ha acertado se lo digo, si ha fallado 3 veces le digo "acceso bloqueado"
        System.out.println("Has acertado");
    }    
        // TODO code application logic here
    }
    
}
