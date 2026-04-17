/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectocorelink;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author alumno
 */
public class ProyectoCorelink {

    public static String leerEmpleados() {
        String resultado = "";
        String linea;
        int contador = 0;

        try (
            FileReader fr = new FileReader("datos_empleados.txt");
            BufferedReader br = new BufferedReader(fr);
        ) {
            linea = br.readLine();
            while (linea != null) {
                if (linea.contains("Zona Cero")) {
                    resultado = resultado.concat(linea);
                    resultado = resultado.concat("\n");
                    contador++;
                }
                linea = br.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        } catch (IOException e) {
            System.out.println("Error en la lectura del archivo");
        }

        resultado = resultado.substring(0, resultado.lastIndexOf("\n"));
        System.out.println("El número total de sospechosos de la Zona Cero es " + contador);
        return resultado;
    }

    public static void escribirSospechosos(String resultado) {
        try (
            FileWriter fw = new FileWriter("sospechosos_zona_cero.txt", true);
            PrintWriter pw = new PrintWriter(fw);
        ) {
            pw.print(resultado);
        } catch (IOException e) {
            System.out.println("Error en la escritura del archivo");
        }
    }

    public static void leerClaves() {
        String linea;
        int contador = 0;
        int digitos = 0;
        int recorrer = 0;
        boolean encontradas = false;
        String posibleClave;

        try (
            FileReader fr = new FileReader("04dedf8afeb8a4177a009f41bb78018af601e341ed4322d4073911c9ac879726.txt");
            BufferedReader br = new BufferedReader(fr);
        ) {
            linea = br.readLine();
            while (!encontradas && recorrer < linea.length()){
                for (int i = 0; i < (linea.length() - 8); i++) {
                    if (Character.isDigit(linea.charAt(i))) {
                        posibleClave = linea.substring(i, (i+8));
                        digitos = 0;
                        for (int j = 0; j < posibleClave.length(); j++) {
                            if (Character.isDigit(posibleClave.charAt(j))) {
                                digitos++;
                            }
                        }
                        if (digitos == 8) {
                            escribirClaves(posibleClave);
                            contador++;
                        }
                    }
                    if (contador == 3) {
                        encontradas = true;
                    }
                }
                recorrer ++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        } catch (IOException e) {
            System.out.println("Error en la lectura del archivo");
        }
    }

    public static void escribirClaves(String clave) {
        try (
            FileWriter fw = new FileWriter("claves.txt", true);
            PrintWriter pw = new PrintWriter(fw);
        ) {
            pw.println(clave);
        } catch (IOException e) {
            System.out.println("Error en la escritura del archivo");
        }
    }
    
    public static void contrasena(){
        try (
            FileReader fr = new FileReader("04dedf8afeb8a4177a009f41bb78018af601e341ed4322d4073911c9ac879726.txt");
            BufferedReader br = new BufferedReader(fr);
        ) {
            String linea = br.readLine();
            System.out.println(linea.hashCode());
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        } catch (IOException e) {
            System.out.println("Error en la lectura del archivo");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        escribirSospechosos(leerEmpleados());
        leerClaves();
        contrasena();
    }

}
