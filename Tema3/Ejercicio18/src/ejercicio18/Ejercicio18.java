/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio18;

    import java.util.Scanner;

public class Ejercicio18 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int contrasenna = 12345678;             //declaro la contraseña, una variable para la entrada del usuario y otra como contador de intentos
        int intento, numIntentos = 0;
        Scanner entrada = new Scanner(System.in);
    
    do{                                         //hago un bucle pidiendo que el usuario introduzca la contraseña, si es incorrecta repito y pierde un intento
        System.out.println("Introduce la contraseña: ");
        
        intento = entrada.nextInt();
        
        numIntentos++;
        
        if (intento!=contrasenna && numIntentos<3){         //si el usuario falla, le aviso y le digo los intentos que le quedan
            System.out.println("Contraseña incorrecta, quedan " +(3-numIntentos) + " intentos");
        }
    } while (numIntentos<3 && intento!=contrasenna);
    
    if (intento==contrasenna){                  //al salir del bucle, si ha acertado se lo digo, si ha fallado 3 veces le digo "acceso bloqueado"
        System.out.println("Contraseña correcta");
    } else {
        System.out.println("Contraseña incorrecta, acceso bloqueado");
    }
    
        // TODO code application logic here
    }
    
}
