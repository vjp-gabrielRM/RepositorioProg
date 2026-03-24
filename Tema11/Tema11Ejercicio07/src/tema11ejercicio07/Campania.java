/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema11ejercicio07   ;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Campania {

    private HashSet<Donacion> donaciones;
    private String nombre;

    public Campania() {
        this.donaciones = new HashSet<>();
        this.nombre = "";
    }

    public Campania(HashSet<Donacion> donaciones, String nombre) {
        this.donaciones = donaciones;
        this.nombre = nombre;
    }
    
    public Campania(String nombre) {
        this.donaciones = new HashSet<>();
        this.nombre = nombre;
    }

    public HashSet<Donacion> getDonaciones() {
        return donaciones;
    }

    public void setDonaciones(HashSet<Donacion> donaciones) {
        this.donaciones = donaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        String resultado = "Campaña " + this.nombre + ":\n";
        for (Donacion donacion : donaciones) {
            resultado = resultado.concat(donacion.toString());
        }
        return resultado;
    }

    public void nuevaDonacion() {
        System.out.print("Nombre del donante: ");
        String nombreDonante = pedirString();
        
        System.out.print("Cantidad donada: ");
        float cantidad = pedirFloat();
        
        Donacion donacion = new Donacion(nombreDonante, cantidad);
        donaciones.add(donacion);
    }
    
    public static String pedirString(){
        Scanner entrada = new Scanner(System.in);
        return entrada.nextLine();
    }
    
    public static float pedirFloat(){
        Scanner entrada = new Scanner(System.in);
        return entrada.nextFloat();
    }

    public float calcularTotal() {
        float total = 0;
        for (Donacion donacion : donaciones) {
            total += donacion.getCantidad();
        }
        return total;
    }

    public float mayorDonacion() {
        float mayor = 0;

        for (Donacion donacion : donaciones) {
            if (donacion.getCantidad() > mayor) {
                mayor = donacion.getCantidad();
            }
        }
        return mayor;
    }
}
