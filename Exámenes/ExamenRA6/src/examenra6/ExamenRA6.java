/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenra6;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class ExamenRA6 {

    /**
     * Método estático que pide por teclado un número entero
     *
     * @return el número introducido
     */
    public static int pedirNum() {
        int num;
        Scanner entrada = new Scanner(System.in);

        //Controlo la excepción por si el usuario introduce algo que no sea un entero
        try {
            num = entrada.nextInt();
        } catch (InputMismatchException e) {
            num = -1;
        }
        return num;
    }

    /**
     * Método estático que pide por teclado un String
     *
     * @return el String introducido
     */
    public static String pedirString() {
        Scanner entrada = new Scanner(System.in);
        return entrada.next();
    }

    /**
     * Método estático que muestra un menú al usuario
     */
    public static void mostrarMenu() {
        System.out.println("1. Aparcar coche");
        System.out.println("2. Mostrar plazas libres");
        System.out.println("3. Mostrar todos los coches");
        System.out.println("4. Titulares que empiezan por un texto");
        System.out.println("5. Buscar por matrícula");
        System.out.println("6. Mostrar mapa");
        System.out.println("7. Salir\n");
        System.out.print("Elija una opción: ");
    }

    /**
     * Método estático que crea un objeto de la clase Coche y lo mete en la
     * posición del array garaje que elija el usuario
     *
     * @param garaje
     */
    public static void aparcarCoche(Coche[][] garaje) {
        String titular, matricula;
        int posicion, posi, posj;
        boolean ocupada = false;

        System.out.print("Introduzca el nombre del titular del coche: ");
        titular = pedirString();

        System.out.print("Introduzca la matrícula del coche: ");
        matricula = pedirString();

        do {
            System.out.print("\n[1] [2] [3]\n[4] [5] [6]\n[7] [8] [9]\n"
                    + "Introduzca la plaza en la que quiere aparcar el coche según el mapa superior: ");
            posicion = pedirNum();
            posi = (posicion - 1) / 3;
            posj = (posicion - 1) % 3;        //Convierto la posición a 2 coordenadas para trabajar con el array

            if (garaje[posi][posj] != null) {
                ocupada = true;
                System.out.println("Esta plaza está ocupada, por favor pruebe con otra");
            } else {
                ocupada = false;
            }
        } while (ocupada);
        garaje[posi][posj] = new Coche(titular, matricula);
        System.out.println("Coche aparcado\n");
    }

    /**
     * Método estático que muestra todas las plazas libres del garaje
     *
     * @param garaje
     */
    public static void mostrarPlazasLibres(Coche[][] garaje) {
        int posicion;
        System.out.println("Las plazas libres del garaje son:");

        for (int i = 0; i < garaje.length; i++) {
            for (int j = 0; j < garaje[i].length; j++) {
                posicion = (i * 3 + j) + 1;
                if (garaje[i][j] == null) {
                    System.out.print("[" + posicion + "] ");
                }
            }
        }
        System.out.println("");
    }

    /**
     * Método estático que muestra los datos de todos los coches aparcados en el garaje
     * @param garaje
     */
    public static void mostrarCoches(Coche[][] garaje) {
        int posicion;
        System.out.println("Los coches aparcados son:");

        for (int i = 0; i < garaje.length; i++) {
            for (int j = 0; j < garaje[i].length; j++) {
                posicion = (i * 3 + j) + 1;         //Convierto las 2 coordenadas a un solo número para imprimir
                if (garaje[i][j] != null) {
                    System.out.println("Plaza " + posicion + ": " + garaje[i][j].toString());
                }
            }
        }
        System.out.println("");
    }

    /**
     * Método estático que busca todos los titulares cuyo nombre comience por una cadena dada por el usuario
     * y los concatena separados por #
     * @param garaje 
     */
    public static void titulares(Coche[][] garaje) {
        System.out.print("Por favor introduzca el texto a buscar: ");
        String texto = pedirString();
        String resultado = "";

        System.out.println("Los titulares que empiezan por " + texto + "son: ");
        for (int i = 0; i < garaje.length; i++) {
            for (int j = 0; j < garaje[i].length; j++) {
                if (garaje[i][j] != null) {
                    if (garaje[i][j].getTitular().startsWith(texto)) {
                        resultado = resultado.concat(garaje[i][j].getTitular());
                        resultado = resultado.concat("#");
                    }
                }
            }
        }
        if(resultado != ""){
            resultado = resultado.substring(0, resultado.lastIndexOf('#'));     //Le quito el último # a la cadena
            System.out.println(resultado + "\n");
        }else{
            System.out.println("No se ha encontrado ningún titular cuyo nombre empiece así\n");
        }
    }
    
    /**
     * Método estático que busca la posición de un coche en base a la matrícula introducida por el usuario
     * @param garaje
     * @return la posición si está en el garaje, si no, -1
     */
    public static int buscarPorMatricula(Coche[][] garaje){
        int posicion = - 1;
        int posi = 0, posj = 0;
        boolean encontrado = false;
        System.out.print("Por favor introduzca la matrícula a buscar: ");
        String matricula = pedirString();

        for (int i = 0; i < garaje.length; i++) {
            for (int j = 0; j < garaje[i].length; j++) {
                if (garaje[i][j] != null) {
                    if (garaje[i][j].getMatricula().equalsIgnoreCase(matricula)) {
                        encontrado = true;
                        posi = i;
                        posj = j;
                    }
                }
            }
        }
        
        if(encontrado){
            posicion = (posi * 3 + posj) + 1;
        }
        
        return posicion;
    }
    
    /**
     * Método estático que recorre el array garaje y muestra si sus plazas están libres (L) u ocupadas (X)
     * @param garaje 
     */
    public static void mostrarPlazas(Coche[][] garaje){
        System.out.println("El estado de las plazas del garaje es:");
        for (int i = 0; i < garaje.length; i++) {
            for (int j = 0; j < garaje[i].length; j++) {
                if (garaje[i][j] == null) {
                    System.out.print("[L] ");
                }else{
                    System.out.print("[X] ");
                }
                if(j == garaje[i].length - 1){
                    System.out.println("");
                }
            }
        }
        System.out.println("");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Coche[][] garaje = new Coche[3][3];
        int opcion;
        int posicion;

        do {
            mostrarMenu();
            opcion = pedirNum();
            switch (opcion) {
                case 1:
                    aparcarCoche(garaje);
                    break;
                case 2:
                    mostrarPlazasLibres(garaje);
                    break;
                case 3:
                    mostrarCoches(garaje);
                    break;
                case 4:
                    titulares(garaje);
                    break;
                case 5:
                    posicion = buscarPorMatricula(garaje);
                    if(posicion >= 1 && posicion <= 9){
                        System.out.println("El coche con esa matrícula se ubica en la plaza " + posicion + "\n");
                    }else{
                        System.out.println("No hay ningún coche aparcado que tenga esa matrícula\n");
                    }
                    break;
                case 6:
                    mostrarPlazas(garaje);
                    break;
                case 7:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Entrada no válida, inténtelo de nuevo");
            }
        } while (opcion != 7);
    }

}
