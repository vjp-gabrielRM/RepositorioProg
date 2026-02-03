/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema08ejercicio09;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Tema08Ejercicio09 {
    
    public static String pedirString(){
        Scanner entrada = new Scanner(System.in);
        return entrada.next();
    }

    public static void mostrarMenu(){
        System.out.println("---- MENÚ ----");
        System.out.println("1. Rellenar notas");
        System.out.println("2. Mostrar notas");
        System.out.println("3. Mejor alumno");
        System.out.println("4. Alumno con más suspensos");
        System.out.println("5. Asignatura más difícil");
        System.out.println("6. Salir");
    }
    
    public static int pedirOpcion(){
        int opcion;
        Scanner entrada = new Scanner(System.in);
        
        try{
            opcion = entrada.nextInt();
        }catch(InputMismatchException e){
            opcion = -1;
            entrada.nextLine();
        }
        return opcion;
    }
    
    public static void rellenarNotas(Alumno[] alumnos){
        for(int i = 0;i < alumnos.length; i++){
            System.out.println("------ ALUMNO " + (i+1) + " ------");
            alumnos[i].ponerNotas();
            System.out.println("NOTAS DE " + alumnos[i].getNombre() + " ALMACENADAS EXITOSAMENTE\n");
        }
        System.out.println("");
    }
    
    public static void mostrarNotas(Alumno[] alumnos){
        System.out.println("Estos son todos los alumnos con sus notas: ");
        for(int i = 0; i < alumnos.length; i++){
            System.out.println(alumnos[i].toString());
        }
        System.out.println("");
    }
    
    public static void mejorAlumno(Alumno[] alumnos, String[] nombres){
        int pos = 0;
        float suma = 0;
        float media = alumnos[0].calcularMedia();
        for(int i = 1; i < alumnos.length; i++){
            if(media <= alumnos[i].calcularMedia()){
                media = alumnos[i].calcularMedia();
                pos = i;
            }
        }
        System.out.println("El mejor alumno es " + nombres[pos] + " con una media de " + media);
        System.out.println("");
    }
    
    public static void masSuspensos(Alumno[] alumnos, String[] nombres){
        int[] suspensos = new int[3];
        int pos = 0;
        for(int i = 0; i < alumnos.length; i++){
            for(int j = 0; j < alumnos[i].getNotas().length; j++){
                if(alumnos[i].getNotas()[j].getNota() < 5){
                    suspensos[i]++;
                }
            }
        }
        
        for (int i = 1; i < suspensos.length; i++) {
            if (suspensos[pos] < suspensos[i]) {
                pos = i;
            }
        }
        System.out.println("El alumno con más suspensos es " + nombres[pos] + " con " + suspensos[pos] + " suspensos");
        System.out.println("");
    }
    
    public static void asignaturaDificil(Alumno[] alumnos){
        float[] notasAsignaturas = new float[4];
        String[] nombresAsignaturas = {"Lengua", "Mates", "Historia", "Física"};
        int pos = 0;
        
        for(int i = 0; i < alumnos.length; i++){
            for(int j = 0; j < notasAsignaturas.length; j++){
                notasAsignaturas[j] += alumnos[i].getNotas()[j].getNota();
            }
        }
        
        for (int i = 1; i < notasAsignaturas.length; i++) {
            if (notasAsignaturas[pos] > notasAsignaturas[i]) {
                pos = i;
            }
        }
        
        System.out.println("La asignatura más difícil es " + nombresAsignaturas[pos] + " con una nota media de " + (notasAsignaturas[pos] / alumnos.length));
        System.out.println("");
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;
        String[] nombres = {"Pepe", "Juan", "Marta"};
        Alumno[] alumnos = new Alumno[3];
        for(int i = 0; i < alumnos.length; i++){
            alumnos[i] = new Alumno(nombres[i]);
        }
        
        do{
            mostrarMenu();
            opcion = pedirOpcion();
            System.out.println("");
            switch(opcion){
            case 1:
                rellenarNotas(alumnos);
                break;
            case 2:
                mostrarNotas(alumnos);
                break;
            case 3:
                mejorAlumno(alumnos, nombres);
                break;
            case 4:
                masSuspensos(alumnos, nombres);
                break;
            case 5:
                asignaturaDificil(alumnos);
                break;
            case 6:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Por favor introduzca una opción válida");
                System.out.println("");
            }
        }while(opcion != 6);
    }
    
}
