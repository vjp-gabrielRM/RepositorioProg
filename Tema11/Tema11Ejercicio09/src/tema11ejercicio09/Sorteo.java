/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema11ejercicio09;

import java.time.LocalDate;
import java.util.Arrays;

/**
 *
 * @author alumno
 */
public class Sorteo {
    private LocalDate fecha;
    private int[] ganadores;

    public Sorteo() {
        this.fecha = LocalDate.now();
        this.ganadores = new int[4];
        for (int i = 0; i < this.ganadores.length; i++) {
            this.ganadores[i] = (int) (Math.random() * 99 + 1);
        }
        
    }
    
    public Sorteo(LocalDate fecha) {
        this.fecha = fecha;
        this.ganadores = new int[4];
        for (int i = 0; i < this.ganadores.length; i++) {
            this.ganadores[i] = (int) (Math.random() * 99 + 1);
        }
    }
    
    public Sorteo(LocalDate fecha, int[] ganadores) {
        this.fecha = fecha;
        this.ganadores = ganadores;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int[] getGanadores() {
        return ganadores;
    }

    public void setGanadores(int[] ganadores) {
        this.ganadores = ganadores;
    }
    
    @Override
    public String toString(){
        String resultado = Arrays.toString(this.ganadores);
        return "Fecha: " + this.fecha + "\nNúmeros ganadores: " + resultado;
    }
}
