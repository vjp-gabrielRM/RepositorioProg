/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema12ejercicio21;

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
public class Tema12Ejercicio21 {
    
    public static float pedirFloat() throws InputMismatchException{
        Scanner entrada = new Scanner(System.in);
        return entrada.nextFloat();
    }
    
    public static void asignarNotas(Asignatura[] asignaturas){
        float nota;
        for (int i = 0; i < asignaturas.length; i++) {
            do {
                System.out.print("Introduzca la nota de " + asignaturas[i].getNombre() + ": ");
                nota = pedirFloat();
                if (nota < 0 || nota > 10) {
                    System.out.println("Nota no válida, introduzca un valor de 0 a 10");
                }
            } while (nota < 0 || nota > 10);
            asignaturas[i].setNota(nota);
            nota = -1;
        }
    }
    
    public static void escribirNotas(Asignatura[] asignaturas) throws FileNotFoundException, ClassNotFoundException, IOException {
        try(
                FileOutputStream fos = new FileOutputStream("notas.txt"); 
                ObjectOutputStream oos = new ObjectOutputStream(fos);
        ) {
            for (int i = 0; i < asignaturas.length; i++) {
                oos.writeObject(asignaturas[i]);
            }
        }
        System.out.println("NOTAS ALMACENADAS EN EL FICHERO");
    }
    
    public static void leerNotas() throws FileNotFoundException, ClassNotFoundException, IOException {
        float media = 0;
        System.out.println("LEYENDO EL FICHERO Y CALCULANDO MEDIA");
        try(
                FileInputStream fis = new FileInputStream("notas.txt");
                ObjectInputStream ois = new ObjectInputStream(fis);
        ) {
            Asignatura asignatura;
            
            while(true) {   // Leemos mientras haya objetos
                asignatura = (Asignatura) ois.readObject();
                media += asignatura.getNota();
            }
        } catch(EOFException e) {   // Salta cuando llegamos al final del fichero.
            System.out.println("Fin de lectura.");
        }
        
        media /= 6;
        
        System.out.println("Su nota media del curso es de: " + media);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Asignatura[] asignaturas = new Asignatura[6];
        String[] nombres = {"Programación", "Lenguajes de Marcas", "Bases de Datos", "Entornos de Desarrollo", "Sistemas informáticos", "FOL"};
        
        for (int i = 0; i < nombres.length; i++) {
            asignaturas[i] = new Asignatura(nombres[i]);
        }
        
        asignarNotas(asignaturas);
        try {
            escribirNotas(asignaturas);
            leerNotas();
        } catch (ClassNotFoundException e) {
            System.out.println("Clase no encontrada");
        } catch (IOException e) {
            System.out.println("Excepción genérica");
        }
    }
    
}
