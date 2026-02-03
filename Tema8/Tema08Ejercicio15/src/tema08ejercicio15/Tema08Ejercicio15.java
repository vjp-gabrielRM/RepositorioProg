/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema08ejercicio15;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Tema08Ejercicio15 {

    public static void mostrarMenu(){
        System.out.println("----- MENÚ -----");
        System.out.println("1. Rellenar películas y socios");
        System.out.println("2. Mostrar películas y socios");
        System.out.println("3. Mostrar película más rentable");
        System.out.println("4. Mostrar película menos rentable");
        System.out.println("5. Beneficio neto y socios de una película por nombre");
        System.out.println("6. Número de socios que han abonado más de lo que se pide");
        System.out.println("7. Salir");
    }
    
    public static int pedirOpcion(){
        int opcion;
        Scanner entrada = new Scanner(System.in);
        
        try{
            opcion = entrada.nextInt();
        }catch(InputMismatchException e){
            opcion = 0;
            entrada.nextLine();
        }
        return opcion;
    }
    
    public static void rellenarPeliculas(Pelicula[] pelis){
        
    }
    
    public static void mostrarPeliculas(Pelicula[] pelis){
        
    }
    
    public static void masRentable(Pelicula[] pelis){
        
    }
    
    public static void menosRentable(Pelicula[] pelis){
        
    }
    
    public static void beneficioNeto(Pelicula[] pelis){
        
    }
    
    public static void contarAbonosExtra(Pelicula[] pelis){
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;
        Pelicula[] pelis = new Pelicula[3];
        for(int i = 0; i< pelis.length; i++){
            pelis[i] = new Pelicula();
        }
        
        do{
            mostrarMenu();
            opcion = pedirOpcion();
            System.out.println("");
            switch(opcion){
            case 1:
                rellenarPeliculas(pelis);
                break;
            case 2:
                mostrarPeliculas(pelis);
                break;
            case 3:
                masRentable(pelis);
                break;
            case 4:
                menosRentable(pelis);
                break;
            case 5:
                beneficioNeto(pelis);
                break;
            case 6:  
                contarAbonosExtra(pelis);
                break;
            case 7:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Por favor introduzca una opción válida");
                System.out.println("");
            }
        }while(opcion != 7);
    }
    
}
