/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema12ejercicio26;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alumno
 */
public class Tema12Ejercicio26 {

    public static int pedirInt(){
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }
    
    public static String pedirString(){
        Scanner entrada = new Scanner(System.in);
        return entrada.nextLine();
    }
    
    public static float pedirFloat(){
        Scanner entrada = new Scanner(System.in);
        return entrada.nextFloat();
    }
    
    public static void mostrarMenu(){
        System.out.println("1. Introducción de bebidas");
        System.out.println("2. Comprar productos");
        System.out.println("3. Salir");
        System.out.print("Elija una opción: ");
    }
    
    public static void introducirBebidas(){
        char opcion;
        String nombre;
        int stock;
        float precio;
        Bebida bebida;
        
        try(
            FileOutputStream fos = new FileOutputStream("bebidas.txt", true); 
            ObjectOutputStream oos = new ObjectOutputStream(fos);
        ){
            do{
                System.out.print("\nIntroduzca el nombre del producto: ");
                nombre = pedirString();
                System.out.print("Introduzca el precio del producto: ");
                precio = pedirFloat();
                System.out.print("Introduzca la cantidad disponible del producto: ");
                stock = pedirInt();
                
                bebida = new Bebida(nombre, precio, stock);
            
                oos.writeObject(bebida);
                
                System.out.print("\n¿Desea introducir otro producto? (S: Sí, Otro: No) ");
                opcion = pedirString().charAt(0);
            }while(opcion == 's' || opcion == 'S');
        } catch (FileNotFoundException ex) {
            System.out.println("Archivo no encontrado");
        } catch (IOException ex) {
            System.out.println("Ha habido un error");
        }
    }
    
    public static void mostrarProductos(){
        int i = 1;
        try(
                FileInputStream fis = new FileInputStream("bebidas.txt");
                ObjectInputStream ois = new ObjectInputStream(fis);
        ) {
            Bebida bebida;
            
            while(true) {   // Leemos mientras haya objetos
                bebida = (Bebida) ois.readObject();
                System.out.println(i + ": " + bebida + "\n");
                i++;
            }
        } catch(EOFException e) {   // Salta cuando llegamos al final del fichero.
            System.out.println("Fin de lectura.");
        } catch (FileNotFoundException ex) {
            System.out.println("Archivo no encontrado");
        } catch (IOException ex) {
            System.out.println("Ha habido un error");
        } catch (ClassNotFoundException ex) {
            System.out.println("Clase no encontrada");
        }
    }
    
    public static void comprarProductos(){
        mostrarProductos();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;
        
        do{
            try{
                mostrarMenu();
                opcion = pedirInt();
                switch(opcion){
                    case 1:
                        introducirBebidas();
                        break;
                    case 2:
                        System.out.println("");
                        comprarProductos();
                        break;
                    case 3:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opción no válida, inténtelo de nuevo\n");
                }
            }catch(InputMismatchException e){
                opcion = -1;
                System.out.println("Opción no válida, inténtelo de nuevo\n");
            }
        }while(opcion != 3);
    }
    
}
