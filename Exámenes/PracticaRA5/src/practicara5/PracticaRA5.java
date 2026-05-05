/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicara5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class PracticaRA5 {

    /**
     * Método estático que muestra un menú en pantalla
     */
    public static void mostrarMenu(){
        System.out.println("---- MENÚ ----");
        System.out.println("1. Rellenar inventario");
        System.out.println("2. Guardar los datos del inventario en un fichero");
        System.out.println("3. Leer y procesar los datos del inventario");
        System.out.println("4. Salir");
        System.out.print("\nElija una opción: ");
    }
    
    /**
     * Método estático que recoge un número entero que introduce por teclado el usuario
     * @return el número introducido
     */
    public static int pedirInt(){
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }
    
    /**
     * Método estático que recoge un float que introduce por teclado el usuario
     * @return el número introducido
     */
    public static float pedirFloat(){
        Scanner entrada = new Scanner(System.in);
        return entrada.nextFloat();
    }
    
    /**
     * Método estático que recoge una cadena que introduce por teclado el usuario
     * @return la cadena introducida
     */
    public static String pedirString(){
        Scanner entrada = new Scanner(System.in);
        return entrada.nextLine();
    }
    
    /**
     * Método estático que introduce productos al inventario hasta que el usuario decida parar
     * @param inventario 
     */
    public static void rellenarInventario(ArrayList<Producto> inventario){
        char opcion;
        String nombre;
        int cantidad;
        float precio;
        
        do{
            System.out.print("\nIntroduzca el nombre del producto: ");
            nombre = pedirString();
            System.out.print("Introduzca la cantidad disponible del producto: ");
            cantidad = pedirInt();
            System.out.print("Introduzca el precio del producto: ");
            precio = pedirFloat();
            
            inventario.add(new Producto(nombre, cantidad, precio));
            
            System.out.print("\n¿Desea introducir otro producto? (S: Sí, Otro: No) ");
            opcion = pedirString().charAt(0);
        }while(opcion == 's' || opcion == 'S');
    }
    
    /**
     * Método estático que vuelca los datos del inventario a un fichero llamado "inventario.txt"
     * @param inventario 
     */
    public static void volcarAFichero(ArrayList<Producto> inventario){
        try(
            FileWriter fw = new FileWriter("inventario.txt");
            PrintWriter pw = new PrintWriter(fw);
        ){
            for (int i = 0; i < inventario.size(); i++) {
                pw.println(inventario.get(i).toString());
            }
            System.out.println("\nInventario guardado con éxito\n");
        }catch(IOException e){
            System.out.println("Error en la escritura del fichero");
        }
    }
       
    /**
     * Método estático que hace una lectura del fichero inventario y muestra sus datos por pantalla
     */
    public static void leerInventario(){
        String linea;
        float total = 0;
        String[] datos;
        try(
            FileReader fr = new FileReader("inventario.txt");
            BufferedReader br = new BufferedReader(fr);
        ){
            System.out.println("");
            linea = br.readLine();
            while(linea != null){
                datos = linea.split("#");
                System.out.println("Producto: " + datos[0]);
                System.out.println("Cantidad: " + datos[1]);
                System.out.println("Precio: " + datos[2] + "\n");
                total += Integer.parseInt(datos[1]) * Float.parseFloat(datos[2]);
                linea = br.readLine();
            }
            
            System.out.println("Precio total de los productos: " + total + " €\n");
            
        }catch(FileNotFoundException e){
            System.out.println("Archivo no encontrado");
        }catch(IOException e){
            System.out.println("Error en la escritura del fichero");
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Producto> inventario = new ArrayList<>();
        int opcion;
        
        do{
            try{
                mostrarMenu();
                opcion = pedirInt();
                switch(opcion){
                    case 1:
                        rellenarInventario(inventario);
                        break;
                    case 2:
                        volcarAFichero(inventario);
                        break;
                    case 3:
                        leerInventario();
                        break;
                    case 4:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opción no válida, inténtelo de nuevo\n");
                }
            }catch(InputMismatchException e){
                opcion = -1;
                System.out.println("Opción no válida, inténtelo de nuevo\n");
            }
        }while(opcion != 4);
    }
    
}
