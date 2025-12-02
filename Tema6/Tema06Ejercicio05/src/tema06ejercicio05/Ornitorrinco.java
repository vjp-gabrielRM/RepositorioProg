/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema06ejercicio05;

/**
 *
 * @author alumno
 */
public class Ornitorrinco extends Mamifero implements Oviparo {
    private int huevos;
    
    public Ornitorrinco(){
        super();
        this.huevos = 0;
    }
    
    public Ornitorrinco(String nombre, String sexo, String color, int edad, int huevos){
        super(nombre, sexo, color, edad);
        this.huevos = huevos;
    }
    
    public int getHuevos(){
        return this.huevos;
    }
    
    public void setHuevos(int huevos){
        this.huevos = huevos;
    }
    
    @Override
    public String obtenerMensajeOviparo(){
        return "El ornitorrinco es un mamífero ovíparo";
    }
    
    @Override
    public void ponerHuevo(){
        System.out.println(getNombre() + " ha puesto un huevo");
        this.huevos++;
    }
    
    @Override
    public void incubarHuevo(){
        System.out.println(getNombre() + " ha incubado un huevo");
        this.huevos--;
    }
    
    @Override
    public void mostrarNumHuevos(){
        System.out.println("El ornitorrinco " + getNombre() + " tiene " + this.huevos + " huevos");
    }
}
