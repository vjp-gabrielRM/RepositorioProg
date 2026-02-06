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
    
    public static String pedirString(){
        Scanner entrada = new Scanner(System.in);
        return entrada.next();
    }
    
    public static float pedirFloat(){
        Scanner entrada = new Scanner(System.in);
        return entrada.nextFloat();
    }

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
        for(int i = 0; i < pelis.length; i++){
            System.out.println("--- PELÍCULA " + (i+1) + " ---");
            
            System.out.print("Por favor introduzca el título de la película: ");
            pelis[i].setTitulo(pedirString());
            System.out.print("Por favor introduzca el coste de la licencia: ");
            pelis[i].setLicencia(pedirFloat());
            System.out.println("");
            pelis[i].rellenarSocios();
        }
    }
    
    public static void mostrarPeliculas(Pelicula[] pelis){
        for(int i = 0; i < pelis.length; i++){
            System.out.println(pelis[i].toString());
        }
    }
    
    public static void masRentable(Pelicula[] pelis){
        float[] beneficio = new float[3];
        int pos = 0;
        for(int i = 0; i < pelis.length; i++){
            beneficio[i] = pelis[i].ventas() - pelis[i].getLicencia();
        }
        
        for(int i = 1; i < beneficio.length; i++){
            if(beneficio[pos] < beneficio[i]){
                pos = i;
            }
        }
        
        System.out.println("La película más rentable es " + pelis[pos].getTitulo() + " con un beneficio neto de " + beneficio[pos]);
        System.out.println("");
    }
    
    public static void menosRentable(Pelicula[] pelis){
        float[] beneficio = new float[3];
        int pos = 0;
        for(int i = 0; i < pelis.length; i++){
            beneficio[i] = pelis[i].ventas() - pelis[i].getLicencia();
        }
        
        for(int i = 1; i < beneficio.length; i++){
            if(beneficio[pos] > beneficio[i]){
                pos = i;
            }
        }
        
        System.out.println("La película más rentable es " + pelis[pos].getTitulo() + " con un beneficio neto de " + beneficio[pos]);
        System.out.println("");
    }
    
    public static void beneficioNeto(Pelicula[] pelis){
        String nombre;
        System.out.print("Por favor introduzca el nombre que quiere buscar: ");
        nombre = pedirString();
        
        for(int i = 0; i < pelis.length; i++){
            if(pelis[i].getTitulo().equalsIgnoreCase(nombre)){
                System.out.println("La película " + pelis[i].getTitulo() + " ha tenido un beneficio neto de "
                        + (pelis[i].ventas() - pelis[i].getLicencia()) + " y sus socios son:");
                pelis[i].mostrarSocios();
            }
        }
        System.out.println("");
    }
    
    public static void contarAbonosExtra(Pelicula[] pelis){
        float cantidad;
        int num = 0;
        System.out.print("Por favor introduzca el precio de referencia: ");
        cantidad = pedirFloat();
        
        for(int i = 0; i < pelis.length; i++){
            for(int j = 0; j < pelis[i].getSocios().length; j++){
                if(pelis[i].getSocios()[j].getAbono() > cantidad){
                    num++;
                }
            }
        }
        System.out.println("Ha pagado más de " + cantidad + " un total de " + num + " socios");
        System.out.println("");
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
