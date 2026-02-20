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
        int cont = 0;
        
        System.out.print("Por favor introduzca el usuario: ");
        usuario = pedirString();
        
        do{
            System.out.print("Por favor introduzca la contraseña: ");
            contrasenna = pedirString();
            for (int i = 0; i < contrasenna.length(); i++) {
                if(contrasenna.charAt(i) > 48 && contrasenna.charAt(i) < 57){
                    cont++;
                }
            }
            if(contrasenna.length() < 6 || cont < 2 || contrasenna.contains(usuario)){
                System.out.print("\nContraseña no válida");
                cont = 0;
            }
            if(contrasenna.length() < 6){
                System.out.print(", debe tener una longitud de al menos 6 caracteres");
            }
            if(cont < 2){
                System.out.print(", debe tener al menos 2 dígitos");
            }
            if(contrasenna.contains(usuario)){
                System.out.print(", no debe contener el usuario");
            }
            if(contrasenna.length() < 6 || cont < 2 || contrasenna.contains(usuario)){
                System.out.println("\n");
            }
        }while(contrasenna.length() < 6 || cont < 2 || contrasenna.contains(usuario));
    }
    
}
