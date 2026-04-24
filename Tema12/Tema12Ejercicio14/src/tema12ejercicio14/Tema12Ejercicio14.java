/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema12ejercicio14;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author alumno
 */
public class Tema12Ejercicio14 {

    public static void calcularBeca(ArrayList<String> concedidas, ArrayList<Integer> cantidades){
        String linea;
        String[] datos = new String[6];
        int recorrer = 0, beca;
        try (
            FileReader fr = new FileReader("DatosBeca.txt");
            BufferedReader br = new BufferedReader(fr);
        ) {
            linea = br.readLine();
            while (linea != null) {
                beca = 1500;
                datos = linea.split("#");
                if (!(Integer.parseInt(datos[3]) >= 2)) {
                    concedidas.add(datos[0]);
                    if (Integer.parseInt(datos[5]) <= 12000) {
                        beca += 500;
                    }
                    if (Integer.parseInt(datos[2]) < 23) {
                        beca += 200;
                    }
                    if (Integer.parseInt(datos[3]) == 0) {
                        beca += 500;
                    } else {
                        beca += 200;
                    }
                    if (datos[4].equalsIgnoreCase("SI")) {
                        beca += 1000;
                    }
                    cantidades.add(beca);
                    recorrer++;
                }
                linea = br.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        } catch (IOException e) {
            System.out.println("Error en la lectura del archivo");
        }
    }
    
    public static void mostrarConcedidas(ArrayList<String> concedidas, ArrayList<Integer> cantidades){
        for (int i = 0; i < concedidas.size(); i++) {
            System.out.println(concedidas.get(i) + ": " + cantidades.get(i) + " euros");
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> concedidas = new ArrayList<>();
        ArrayList<Integer> cantidades = new ArrayList<>();
        
        calcularBeca(concedidas, cantidades);
        mostrarConcedidas(concedidas, cantidades);
    }
    
}
