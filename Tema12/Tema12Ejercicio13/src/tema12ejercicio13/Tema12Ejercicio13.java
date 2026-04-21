/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema12ejercicio13;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Tema12Ejercicio13 {

    public static int pedirNum(){
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }
    
    public static String pedirString(){
        Scanner entrada = new Scanner(System.in);
        return entrada.nextLine();
    }
    
    public static void rellenarBecario(){
        String resultado = "";
        String entrada = "a";
        int num = 0;
        try (
            FileWriter fw = new FileWriter("DatosBeca.txt", true);
            PrintWriter pw = new PrintWriter(fw);
        ) {
            System.out.print("Introduzca el nombre y apellido(s) del becario: ");
            resultado = resultado.concat("Nombre y apellido(s): ").concat(pedirString());
            
            while(!(entrada.equals("H") || entrada.equals("M"))){
                System.out.println("Introduzca el sexo del becario (H: Hombre, M: Mujer): ");
                entrada = pedirString().toUpperCase();
                if (!(entrada.equals("H") || entrada.equals("M"))) {
                    System.out.println("Entrada no válida, inténtelo de nuevo");
                }
            }
            resultado = resultado.concat("\nSexo: ").concat(entrada);
            
            while(!(num >= 20 && num <= 60)){
                System.out.println("Introduzca la edad del becario (20 - 60): ");
                num = pedirNum();
                if (!(num >= 20 && num <= 60)) {
                    System.out.println("Entrada no válida, inténtelo de nuevo");
                }
            }
            resultado = resultado.concat("\nEdad: ").concat(Integer.toString(num));
            
            while(!(num >= 0 && num <= 4)){
                System.out.println("Introduzca el número de suspensos del año anterior (0 - 4): ");
                num = pedirNum();
                if (!(num >= 0 && num <= 4)) {
                    System.out.println("Entrada no válida, inténtelo de nuevo");
                }
            }
            resultado = resultado.concat("\nNúmero de suspensos del curso anterior: ").concat(Integer.toString(num));
            
            while(!(entrada.equals("SI") || entrada.equals("NO"))){
                System.out.println("¿Vive el becario en residencia familiar? (S: Sí, N: No): ");
                entrada = pedirString().toUpperCase();
                if (entrada.equals("S")) {
                    entrada = "SI";
                } else if (entrada.equals("N")){
                    entrada = "NO";
                } else{
                    System.out.println("Entrada no válida, inténtelo de nuevo");
                }
            }
            resultado = resultado.concat("\nResidencia familiar: ").concat(entrada);
            
            System.out.print("Cantidad de ingresos anuales de la familia del becario: ");
            num = pedirNum();
            resultado = resultado.concat("\nIngresos anuales de la familia: ").concat(Integer.toString(num)).concat(" euros");
            pw.print(resultado + "\n\n");
        } catch (IOException e) {
            System.out.println("Error en la escritura del archivo");
        } catch (InputMismatchException e){
            System.out.println("Entrada no válida");
            num = -1;
        }
    }
    
    public static void mostrarFichero() {
        String linea;
        System.out.println("El contenido del fichero es:\n");
        try (
            FileReader fr = new FileReader("DatosBeca.txt");
            BufferedReader br = new BufferedReader(fr);
        ) {
            linea = br.readLine();
            while (linea != null) {
                System.out.println(linea);
                linea = br.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        } catch (IOException e) {
            System.out.println("Error en la lectura del archivo");
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        rellenarBecario();
        mostrarFichero();
    }
    
}
