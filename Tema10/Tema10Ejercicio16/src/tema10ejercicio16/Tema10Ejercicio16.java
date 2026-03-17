/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema10ejercicio16;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Tema10Ejercicio16 {

    public static void mostrarMenu() {
        System.out.println("1. Menú de administración");
        System.out.println("2. Menú de compra");
        System.out.println("3. Salir\n");
        System.out.print("Por favor elija una opción: ");
    }

    public static void menuAdmin() {
        System.out.println("1. Introducir productos en la lista");
        System.out.println("2. Visualizar la lista de productos");
        System.out.println("3. Eliminar productos de la lista");
        System.out.println("4. Volver al menú principal\n");
        System.out.print("Por favor elija una opción: ");
    }

    public static void menuCompra() {
        System.out.println("1. Comprar productos");
        System.out.println("2. Volver al menú principal\n");
        System.out.print("Por favor elija una opción: ");
    }

    public static int pedirInt() {
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }

    public static float pedirFloat() {
        Scanner entrada = new Scanner(System.in);
        return entrada.nextFloat();
    }

    public static String pedirString() {
        Scanner entrada = new Scanner(System.in);
        return entrada.nextLine();
    }

    public static void introducirProducto(ArrayList<Producto> productos) {
        System.out.print("Por favor introduzca el nombre del producto: ");
        String nombre = pedirString();

        System.out.print("Por favor introduzca el precio del producto: ");
        float precio = pedirFloat();

        System.out.print("Por favor introduzca el stock que hay del producto: ");
        int stock = pedirInt();

        productos.add(new Producto(nombre, precio, stock));
    }

    public static void mostrarProductos(ArrayList<Producto> productos) {
        for (int i = 0; i < productos.size(); i++) {
            System.out.println(productos.get(i).toString());
        }
    }

    public static void eliminarProducto(ArrayList<Producto> productos) {
        System.out.print("Por favor introduzca el nombre del producto que quiere eliminar: ");
        String nombre = pedirString();
        boolean encontrado = false;
        int i = 0;

        while (!encontrado && i < productos.size()) {
            if (productos.get(i).getNombre().equalsIgnoreCase(nombre)) {
                productos.remove(i);
                encontrado = true;
            }
            i++;
        }
        if (encontrado) {
            System.out.println("Producto eliminado\n");
        } else {
            System.out.println("Producto no encontrado\n");
        }
    }

    public static void comprar(ArrayList<Producto> productos) {
        int indice, cantidad;
        char respuesta;
        boolean seguir = true;
        float total = 0;

        do {
            mostrarProductos(productos);
            indice = buscarProducto(productos);

            if (indice == -1) {
                System.out.println("Producto no encontrado, inténtelo de nuevo\n");
            } else {
                cantidad = pedirCantidad(productos, indice);
                total += productos.get(indice).getPrecio() * cantidad;
                System.out.print("\n¿Desea seguir comprando? (N = No) ");
                respuesta = pedirString().charAt(0);
                if (respuesta == 'n' || respuesta == 'N') {
                    seguir = false;
                    System.out.println("Saliendo...\n");
                }
            }
        } while (seguir);
        
        System.out.println("El total a pagar es de " + total + " euros");
    }

    public static int buscarProducto(ArrayList<Producto> productos) {
        System.out.print("Por favor introduzca el nombre del producto que quiere comprar: ");
        String nombre = pedirString();
        boolean encontrado = false;
        int i = 0, indice = -1;

        while (!encontrado && i < productos.size()) {
            if (productos.get(i).getNombre().equalsIgnoreCase(nombre)) {
                encontrado = true;
                indice = i;
            }
            i++;
        }
        return indice;
    }

    public static int pedirCantidad(ArrayList<Producto> productos, int indice){
        int cantidad = -1;
        do{
            System.out.println("¿Cuántas unidades de " + productos.get(indice).getNombre() + " desea comprar? ");
            cantidad = pedirInt();
            if(cantidad < 1 || cantidad > productos.get(indice).getStock()){
                System.out.println("Por favor introduzca una cantidad válida, el stock disponible es de " + productos.get(indice).getStock());
                cantidad = -1;
            }
        }while(cantidad > 0 && cantidad <= productos.get(indice).getStock());
        
        productos.get(indice).setStock(productos.get(indice).getStock() - cantidad);
        
        return cantidad;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList<>();
        int opcion, subOpcion;

        do {
            try {
                mostrarMenu();
                opcion = pedirInt();

                switch (opcion) {
                    case 1:
                        do {
                            menuAdmin();
                            subOpcion = pedirInt();
                            switch (subOpcion) {
                                case 1:
                                    introducirProducto(productos);
                                    break;
                                case 2:
                                    mostrarProductos(productos);
                                    break;
                                case 3:
                                    eliminarProducto(productos);
                                    break;
                                case 4:
                                    System.out.println("Volviendo al menú principal...\n");
                                    break;
                                default:
                                    System.out.println("Opción no válida\n");
                            }
                        } while (subOpcion != 4);
                        break;
                    case 2:
                        do {
                            menuCompra();
                            subOpcion = pedirInt();
                            switch (subOpcion) {
                                case 1:
                                    comprar(productos);
                                    break;
                                case 2:
                                    System.out.println("Volviendo al menú principal...\n");
                                    break;
                                default:
                                    System.out.println("Opción no válida\n");
                            }
                        } while (subOpcion != 2);
                        break;
                    case 3:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opción no válida\n");
                }
            } catch (InputMismatchException e) {
                opcion = -1;
                subOpcion = -1;
                System.out.println("Opción no válida\n");
            }
        } while (opcion != 3);
    }

}
