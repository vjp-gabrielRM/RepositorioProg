/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio32;

    import java.util.Scanner;

public class Ejercicio32 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int annoActual, mesActual, diaActual, annoNacimiento, mesNacimiento, diaNacimiento, annosEdad, mesesEdad, diasEdad;
        Scanner entrada = new Scanner(System.in);
        do{                                        
            System.out.println("Introduce el año actual: ");
        
            annoActual = entrada.nextInt();
            if(annoActual<=0){
                System.out.println("Error, introduce un año válido");
            }
        }while (annoActual<=0);
        do{                                        
            System.out.println("Introduce el mes actual: ");
        
            mesActual = entrada.nextInt();
            if(mesActual<=0 || mesActual >12){
                System.out.println("Error, introduce un mes válido");
            }
        }while (mesActual<=0 || mesActual>12);
        do{                                        
            System.out.println("Introduce el día actual: ");
        
            diaActual = entrada.nextInt();
            if(diaActual<=0 || diaActual >30){
                System.out.println("Error, introduce un dia válido");
            }
        }while (diaActual<=0 || diaActual>30);
        do{                                        
            System.out.println("Introduce tu año de nacimiento: ");
        
            annoNacimiento = entrada.nextInt();
            if(annoNacimiento<=0 || annoNacimiento>=annoActual){
                System.out.println("Error, introduce un año válido");
            }
        }while (annoNacimiento<=0 || annoNacimiento>=annoActual);
        do{                                        
            System.out.println("Introduce tu mes de nacimiento: ");
        
            mesNacimiento = entrada.nextInt();
            if(mesNacimiento<=0 || mesNacimiento >12){
                System.out.println("Error, introduce un mes válido");
            }
        }while (mesNacimiento<=0 || mesNacimiento>12);
        do{                                        
            System.out.println("Introduce tu día de nacimiento: ");
        
            diaNacimiento = entrada.nextInt();
            if(diaNacimiento<=0 || diaNacimiento >30){
                System.out.println("Error, introduce un dia válido");
            }
        }while (diaNacimiento<=0 || diaNacimiento>30);
        
        annosEdad=annoActual-annoNacimiento;
        // TODO code application logic here
    }
    
}
