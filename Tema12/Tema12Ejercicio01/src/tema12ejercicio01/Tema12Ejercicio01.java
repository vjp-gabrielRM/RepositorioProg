/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema12ejercicio01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Tema12Ejercicio01 {

    public static void mostrarMenu() {
        System.out.println("---- MENÚ ----\n");
        System.out.println("1. Añadir contactos a la agenda");
        System.out.println("2. Visualizar la lista de contactos");
        System.out.println("3. Eliminar contactos de la lista");
        System.out.println("4. Mostrar contactos por edad");
        System.out.println("5. Salir\n");
        System.out.print("Elija una opción: ");
    }

    public static int pedirNum() throws InputMismatchException{
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }
    
    public static String pedirString() throws InputMismatchException{
        Scanner entrada = new Scanner(System.in);
        return entrada.nextLine();
    }
    
    public static void nuevoContacto(ArrayList<Contacto> lista){
        System.out.print("Nombre del contacto: ");
        String nombre = pedirString();
        System.out.print("Edad del contacto: ");
        int edad = pedirNum();
        System.out.print("Número de teléfono del contacto: ");
        String telefono = pedirString();
        lista.add(new Contacto(nombre, edad, telefono));
    }
    
    public static void mostrarContactos(ArrayList<Contacto> lista) throws ArrayIndexOutOfBoundsException{
        System.out.println("Los contactos guardados en la lista son:\n");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).toString());
        }
        System.out.println("");
    }
    
    public static void borrarContacto(ArrayList<Contacto> lista){
        int i = 0;
        boolean encontrado = false;
        System.out.print("Número de teléfono del contacto a eliminar: ");
        String telefono = pedirString();
        while (i < lista.size() && !encontrado) {
            if (lista.get(i).getTelefono().equals(telefono)) {
                lista.remove(i);
                encontrado = true;
            }
            i++;
        }
        
        if (encontrado) {
            System.out.println("Contacto eliminado\n");
        }else{
            System.out.println("Contacto no encontrado\n");
        }
    }
    
    public static void mostrarPorEdad(ArrayList<Contacto> lista) throws ArrayIndexOutOfBoundsException{
        ArrayList<Contacto> listaOrdenada = lista;
        listaOrdenada.sort(Comparator.comparingInt(Contacto::getEdad));
        System.out.println("Los contactos guardados en la lista ordenados por edad son:\n");
        for (int i = 0; i < listaOrdenada.size(); i++) {
            System.out.println(listaOrdenada.get(i).toString());
        }
        System.out.println("");
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Contacto> lista = new ArrayList<>();
        int opcion;

        do {
            mostrarMenu();
            try {
                opcion = pedirNum();
            } catch (InputMismatchException e) {
                opcion = -1;
            }

            switch (opcion) {
                case 1:
                    nuevoContacto(lista);
                    break;
                case 2:
                    mostrarContactos(lista);
                    break;
                case 3:
                    borrarContacto(lista);
                    break;
                case 4:
                    mostrarPorEdad(lista);
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida, inténtelo de nuevo");
            }
        } while (opcion != 5);
    }
    
}
