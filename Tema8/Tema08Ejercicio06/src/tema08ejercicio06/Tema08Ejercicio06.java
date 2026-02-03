/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema08ejercicio06;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Tema08Ejercicio06 {

    public static int pedirNum(){
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }
    
    public static String pedirString(){
        Scanner entrada = new Scanner(System.in);
        return entrada.next();
    }
    
    public static void inicializarArray(Empleado[] empleados){
        for(int i = 0;i < empleados.length; i++){
            empleados[i] = new Empleado();
        }
    }
    
    public static void infoEmpleado(Empleado[] empleados){
        for(int i = 0;i < empleados.length; i++){
            System.out.println("------ EMPLEADO " + (i+1) + " ------");
            
            System.out.print("Por favor introduzca el nombre del empleado: ");
            empleados[i].setNombre(pedirString());
            
            System.out.print("¿Cuántas horas trabajó este mes? ");
            empleados[i].setHoras(pedirNum());
            
            System.out.print("¿Cuál es su tarifa por hora de trabajo? ");
            empleados[i].setTarifa(pedirNum());
            
            System.out.println("EMPLEADO " + (i+1) + " ALMACENADO EXITOSAMENTE\n");
        }
    }
    
    public static void sueldoBruto(Empleado[] empleados){
        for(int i = 0;i < empleados.length; i++){
            empleados[i].sueldoBruto();
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Por favor introduzca el número de empleados: ");
        Empleado[] empleados = new Empleado[pedirNum()];
        inicializarArray(empleados);
        infoEmpleado(empleados);
        sueldoBruto(empleados);
    }
    
}
