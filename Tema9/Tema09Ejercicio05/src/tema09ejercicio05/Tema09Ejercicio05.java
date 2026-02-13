/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema09ejercicio05;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Tema09Ejercicio05 {

    public static String pedirString() {
        Scanner entrada = new Scanner(System.in);
        return entrada.nextLine();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        String[] diasNoTilde = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        String dia;
        boolean encontrado = false;
        
        System.out.print("Por favor introduzca un día de la semana: ");
        dia = pedirString();
        
        for(int i = 0; i < dias.length; i++){
            if(dias[i].equalsIgnoreCase(dia) || diasNoTilde[i].equalsIgnoreCase(dia)){
                System.out.println("Es el " + (i+1) + " día de la semana");
                encontrado = true;
            }
        }
        if(!encontrado){
            System.out.println("No es un día de la semana");
        }
    }
    
}
