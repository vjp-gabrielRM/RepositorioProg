/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema06ejercicio05;

/**
 *
 * @author alumno
 */
public class Murcielago extends Mamifero implements Volador {
    private int alturaVuelo;
    
    public Murcielago(){
        super();
        this.alturaVuelo = 0;
    }
    
    public Murcielago(String nombre, String sexo, String color, int edad, int alturaVuelo){
        super(nombre, sexo, color, edad);
        this.alturaVuelo = alturaVuelo;
    }
    
    public int getAlturaVuelo(){
        return this.alturaVuelo;
    }
    
    public void setAlturaVuelo(int alturaVuelo){
        this.alturaVuelo = alturaVuelo;
    }
    
    @Override
    public String obtenerMensajeVolador(){
        return "El murciélago es un mamífero volador";
    }
    
    @Override
    public void aumentarAlturaVuelo(){
        System.out.println(getNombre() + " ha aumentado su altura de vuelo");
        this.alturaVuelo += 5;
    }
    
    @Override
    public void bajarAlturaVuelo(){
        System.out.println(getNombre() + " ha bajado su altura de vuelo");
        this.alturaVuelo -= 5;
    }
    
    @Override
    public void mostrarAlturaVuelo(){
        System.out.println("El murciélago " + getNombre() + " está volando a " + this.alturaVuelo + " metros de altura");
    }
}
