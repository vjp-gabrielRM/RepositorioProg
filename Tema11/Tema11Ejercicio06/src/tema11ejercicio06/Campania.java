/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema11ejercicio06;

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
        return "";
    }

    public void nuevaDonacion() {
        System.out.print("Nombre del donante: ");
        String nombreDonante = pedirString();
        
        System.out.print("Cantidad donada: ");
        float cantidad = pedirFloat();
        
        Donacion donacion = new Donacion(nombreDonante, cantidad);
        donaciones.add(donacion);
    }

    public void mostrarDonaciones() {
        for (Donacion donacion : donaciones) {
            System.out.println(donacion);
        }
    }
    
    public static String pedirString(){
        Scanner entrada = new Scanner(System.in);
        return entrada.nextLine();
    }
    
    public static float pedirFloat(){
        Scanner entrada = new Scanner(System.in);
        return entrada.nextFloat();
    }

    public void mostrarPorDonante() {
        boolean encontrado = false;
        
        System.out.print("Nombre del donante: ");
        String nombreDonante = pedirString();
        for (Donacion donacion : donaciones) {
            if (donacion.getNombre().equalsIgnoreCase(nombreDonante)) {
                System.out.println(donacion);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No encontrado");
        }
    }

    public void mostrarNumDonaciones() {
        System.out.println("El número de donaciones de esta campaña es de " + donaciones.size());
    }

    public void mostrarTotal() {
        float total = 0;
        for (Donacion donacion : donaciones) {
            total += donacion.getCantidad();
        }
        System.out.printf("El total de todas las donaciones es de %.2f euros", total);
    }

    public void ordenarDonaciones() {
        ArrayList<Donacion> lista = new ArrayList<>(donaciones);

        lista.sort((d1, d2) -> Float.compare(d1.getCantidad(), d2.getCantidad()));

        for (Donacion d : lista) {
            System.out.println(d);
        }
    }
}
