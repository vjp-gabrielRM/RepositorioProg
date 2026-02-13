/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema09ejercicio09;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Tema09Ejercicio09 {

    public static String pedirString() {
        Scanner entrada = new Scanner(System.in);
        return entrada.nextLine();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String usuario, contrasenna;
        
        System.out.print("Por favor introduzca el usuario: ");
        usuario = pedirString();
        
        do{
            System.out.print("Por favor introduzca la contraseña: ");
            contrasenna = pedirString();
            if(contrasenna.length() < 6){
                System.out.println("\nContraseña no válida, inténtelo de nuevo");
            }
        }while(contrasenna.length() < 6);
    }
    
}
