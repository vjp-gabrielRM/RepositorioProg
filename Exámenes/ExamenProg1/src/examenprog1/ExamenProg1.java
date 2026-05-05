/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenprog1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class ExamenProg1 {
    
    /**
     * Método estático que imprime el menú en pantalla para que el usuario elija una de las opciones
     */
    public static void mostrarMenu(){
        System.out.println("Por favor, elija una opción: ");
        System.out.println("1. Analizar señal recibida del espacio");
        System.out.println("2. Ajustar las potencias de los motores");
        System.out.println("3. Calcular el volumen de un planeta");
        System.out.println("4. Salir");
    }
    
    /**
     * Método estático que pide un número al usuario
     * @return el número introducido por el usuario
     */
    public static int pedirNumero(){
        int num;
        Scanner entrada = new Scanner(System.in);
        num = entrada.nextInt();
        entrada.nextLine();         //Limpio el buffer en caso de que haya una excepción
        return num;
    }
    
    /**
     * Método estático que busca el primer divisor excluyendo el 1 de un número introducido por el usuario y lo muestra por pantalla
     */
    public static void analizarSennal(){
        int i = 2;          //inicializo i en 2 dado que no me interesa el 1 puesto que todos los enteros son divisibles por él
        int frecuencia;
        do{
            System.out.println("");
            System.out.println("Introduzca la frecuencia de la señal:");
            try{
                frecuencia = pedirNumero();
            } catch (InputMismatchException e){
                frecuencia = -1;            //Control de excepciones evitando que se introduzcan caracteres no válidos y dándole un valor no válido a frecuencia para que el programa pueda continuar
            }
            if (frecuencia <= 1){
                System.out.println("Introduzca una frecuencia de valor mayor que 1");
            }
        } while(frecuencia <= 1);
        
        do{             //Bucle do while para encontrar el primer divisor de la frecuencia y dejar de buscar una vez se haga
            if(frecuencia % i != 0){
                i++;
            }
        } while(frecuencia % i != 0);
        
        if (frecuencia % i == 0){
            System.out.println("");
            System.out.println("El primer patrón detectable de la frecuencia es " + i);
            System.out.println("");
        }
    }
    
    /**
     * Método estático que pide 3 valores al usuario y los ordena de menor a mayor
     */
    public static void ajustarMotores(){
        int motor1, motor2, motor3;
        int temp;
        
        do{
            System.out.println("");
            System.out.println("Introduzca la potencia del primer motor:");
            try{
                motor1 = pedirNumero();
            } catch (InputMismatchException e){
                motor1 = -1;            //Control de excepciones evitando que se introduzcan caracteres no válidos y dándole un valor no válido a motor1 para que el programa pueda continuar
            }
            if (motor1 < 0){
                System.out.println("Error, introduzca un número entero positivo");
            }
        } while(motor1 < 0);
        
        do{
            System.out.println("");
            System.out.println("Introduzca la potencia del segundo motor:");
            try{
                motor2 = pedirNumero();
            } catch (InputMismatchException e){
                motor2 = -1;            //Control de excepciones evitando que se introduzcan caracteres no válidos y dándole un valor no válido a motor2 para que el programa pueda continuar
            }
            if (motor2 < 0){
                System.out.println("Error, introduzca un número entero positivo");
            }
        } while(motor2 < 0);
        
        do{
            System.out.println("");
            System.out.println("Introduzca la potencia del tercer motor:");
            try{
                motor3 = pedirNumero();
            } catch (InputMismatchException e){
                motor3 = -1;            //Control de excepciones evitando que se introduzcan caracteres no válidos y dándole un valor no válido a motor3 para que el programa pueda continuar
            }
            if (motor3 < 0){
                System.out.println("Error, introduzca un número entero positivo");
            }
        } while(motor3 < 0);
        
        while(!(motor1 <= motor2 && motor2 <= motor3)){     //Ordeno los números por método burbuja
            if(motor1 >= motor2){
                temp = motor1;
                motor1 = motor2;
                motor2 = temp;
            }
            
            if(motor2 >= motor3){
                temp = motor2;
                motor2 = motor3;
                motor3 = temp;
            }
        }
        
        System.out.println("");
        System.out.println("El orden correcto de encendido de los motores es:");
        System.out.println("Primero, el de potencia " + motor1);
        System.out.println("Segundo, el de potencia " + motor2);
        System.out.println("Tercero, el de potencia " + motor3);
        System.out.println("");
    }
    
    /**
     * Método estático que calcula el volumen de un planeta en base al radio introducido por el usuario
     * @return el volumen calculado
     */
    public static float volumenPlaneta(){
        float volumen;
        int radio;
        do{
            System.out.println("");
            System.out.println("Introduzca el radio del planeta en km:");
            try{
                radio = pedirNumero();
            } catch (InputMismatchException e){
                radio = -1;         //Control de excepciones evitando que se introduzcan caracteres no válidos y dándole un valor no válido a radio para que el programa pueda continuar
            }
            if (radio < 1){
                System.out.println("Error, introduzca un número entero positivo");
            }
        } while(radio < 1);
        System.out.println("");
        volumen = (float) (4/3 * Math.PI * Math.pow(radio, 3));     //Calculo el volumen y lo devuelvo
        return volumen;
    }
    
    public static void main(String[] args) {
        int opcion;
        do{
            mostrarMenu();
            try{
                opcion = pedirNumero();
            } catch (InputMismatchException e){
                opcion = -1;        //Control de excepciones limpiando opcion para que no cuente introducir 1 y luego algo no válido como introducir dos veces 1
            }
            switch (opcion){
                case 1:
                    analizarSennal();
                    break;
                case 2:
                    ajustarMotores();
                    break;
                case 3:
                    System.out.println("El volumen del planeta es " + volumenPlaneta() + " kilómetros cúbicos");
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("");
                    System.out.println("Opción no válida, inténtelo de nuevo");
                    System.out.println("");
            }
        } while(opcion != 4);       //Siempre que el usuario no elija la opción 4 el bucle se repetirá
    }
}

