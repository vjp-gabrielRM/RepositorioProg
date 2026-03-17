/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema11ejercicio03;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Tema11Ejercicio03 {

    public static void mostrarMenu(){
        System.out.println("1. Aparcar");
        System.out.println("2. Mostrar dársenas libres");
        System.out.println("3. Buscar autobús");
        System.out.println("4. Buscar conductor");
        System.out.println("5. Posición del autobús con más conductores");
        System.out.println("6. Salir");
    }
    
    public static int pedirNum(){
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }
    
    public static String pedirString(){
        Scanner entrada = new Scanner(System.in);
        return entrada.nextLine();
    }
    
    public static void aparcar(Autobus vector[]){
        char opcion = 'N';
        int posicion = 0;
        String dni, nombre;
        boolean ocupado = false;
        
        do{
            System.out.print("Por favor, introduzca la posición donde aparcar del 1 al 6: ");
            posicion = pedirNum() - 1;
            if(vector[posicion] != null || posicion < 0 || posicion > 5){
                ocupado = true;
                System.out.println("Esa posición está ocupada o no existe, inténtelo de nuevo");
            }else{
                ocupado = false;
            }
        }while(ocupado);
        
        
        System.out.print("Por favor introduzca la matrícula del autobús: ");
        String matricula = pedirString();
        
        do{
            System.out.print("Introduzca el DNI del conductor: ");
            dni = pedirString();
            System.out.print("Introduzca el nombre del conductor: ");
            nombre = pedirString();
            
            vector[posicion] = new Autobus(matricula);
            vector[posicion].nuevoConductor(dni, nombre);
            
            System.out.println("Conductor asignado");
            
            System.out.print("¿Quiere introducir otro conductor? (N = No) ");
            opcion = pedirString().charAt(0);
        }while(opcion != 'n' && opcion != 'N');
    }
    
    public static void mostrarLibres(Autobus vector[]){
        System.out.print("Las posiciones libres son: ");
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == null) {
                System.out.print((i+1) + " ");
            }
        }
    }
    
    public static void buscarAutobus(Autobus vector[]){
        boolean encontrado = false;
        int i = 0;
        System.out.print("Por favor introduzca la matrícula del autobús que busca: ");
        String matricula = pedirString();
        
        while(!encontrado && i < vector.length){
            if (vector[i].getMatricula().equalsIgnoreCase(matricula)) {
                encontrado = true;
            }else{
                i++;
            }
        }
        if(encontrado){
            System.out.println(vector[i].toString());
        }else{
            System.out.println("Autobús no encontrado");
        }
    }
    
    public static void buscarConductor(Autobus vector[]){
        boolean encontrado = false;
        int i = 0;
        System.out.print("Por favor introduzca el nombre del conductor que busca: ");
        String nombre = pedirString();
        
        while(!encontrado && i < vector.length){
            if (vector[i].getMatricula().equalsIgnoreCase(nombre)) {
                encontrado = true;
            }else{
                i++;
            }
        }
        if(encontrado){
            System.out.println(vector[i].getMatricula());
        }else{
            System.out.println("Conductor no encontrado");
        }
    }
    
    public static int masConductores(Autobus vector[]){
        int posicion = 0;
        
        return posicion;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Autobus vector[] = new Autobus[6];
        int opcion;
        
        do{
            mostrarMenu();
            try{
                opcion = pedirNum();
            }catch(InputMismatchException e){
                opcion = -1;
            }
            
            switch(opcion){
                case 1:
                    aparcar(vector);
                    break;
                case 2:
                    mostrarLibres(vector);
                    break;
                case 3:
                    buscarAutobus(vector);
                    break;
                case 4:
                    buscarConductor(vector);
                    break;
                case 5:
                    masConductores(vector);
                    break;
                case 6:
                    System.out.println("Saliendo...w");
                    break;
                default:
                    System.out.println("Opción no válida, inténtelo de nuevo");
            }
        }while(opcion != 6);
    }
    
}
