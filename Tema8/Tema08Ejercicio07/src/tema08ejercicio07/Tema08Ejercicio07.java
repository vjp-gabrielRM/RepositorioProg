/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema08ejercicio07;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Tema08Ejercicio07 {
    
    public static void mostrarMenu(){
        System.out.println("---- MENÚ ----");
        System.out.println("1. Rellenar temperaturas");
        System.out.println("2. Mostrar temperaturas");
        System.out.println("3. Visualizar temperatura media");
        System.out.println("4. Días más calurosos");
        System.out.println("5. Salir");
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
    
    public static void rellenarArray(Dia[] mes, String[] dias){
        System.out.println("Rellenando array...");
        int diaSemana = (int) (Math.random() * 6);
        mes[0].setNombre(dias[diaSemana]);
        for(int i = 1; i < mes.length; i ++){
            mes[i].setNombre(dias[(diaSemana + 1) % 7]);
            diaSemana++;
        }
        for(int j = 0; j < mes.length; j++){
            mes[j].setTemperatura((int) (Math.random() * 40));
        }
        System.out.println("");
    }
    
    public static void mostrarArray(Dia[] mes){
        System.out.println("Se han generado los siguientes números: ");
        for(int i = 0; i < mes.length; i++){
            System.out.println(mes[i].getNombre() + ", día " + (i+1) + ": " + mes[i].getTemperatura() + " grados");
        }
        System.out.println("");
    }
    
    public static void mostrarMedia(Dia[] mes){
        float suma = 0;
        float media;
        for(int i = 0; i < mes.length; i++){
            suma += mes[i].getTemperatura();
        }
        media = (suma / (float) (mes.length));
        System.out.printf("La temperatura media del mes es de %.1f grados\n", media);
        System.out.println("");
    }
    
    public static void mostrarMayorTemp(Dia[] mes){
        int posi = 0, mayor;
        for(int i = 0; i < mes.length; i++){
            if(mes[posi].getTemperatura() < mes[i].getTemperatura()){
                posi = i;
            }
        }
        mayor = mes[posi].getTemperatura();
        System.out.println("Los días más calurosos del año han sido: ");
        for(int i = 0; i < mes.length; i++){
            if(mayor == mes[i].getTemperatura()){
            System.out.println("El " + mes[i].getNombre() + " " + (i+1) + " con " + mayor + " grados");
            }
        }
        System.out.println("");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;
        Dia[] mes = new Dia[30];
        for(int i = 0; i < mes.length; i++){
            mes[i] = new Dia();
        }
        String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        
        do{
            mostrarMenu();
            opcion = pedirOpcion();
            System.out.println("");
            switch(opcion){
            case 1:
                rellenarArray(mes, dias);
                break;
            case 2:
                mostrarArray(mes);
                break;
            case 3:
                mostrarMedia(mes);
                break;
            case 4:
                mostrarMayorTemp(mes);
                break;
            case 5:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Por favor introduzca una opción válida");
                System.out.println("");
            }
        }while(opcion != 5);
    }
}
