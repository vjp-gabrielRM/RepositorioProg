/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema06ejercicio07;

/**
 *
 * @author alumno
 */
public class Televisor implements ControlRemoto{
    private boolean encendido;
    private int canal;
    private int volumen;
    
    public Televisor(){
        this.encendido = false;
        this.canal = 1;
        this.volumen = 10;
    }
    
    public Televisor(boolean encendido, int canal, int volumen){
        this.encendido = encendido;
        this.canal = canal;
        this.volumen = volumen;
    }
    
    public int getCanal(){
        return this.canal;
    }
    
    public void setCanal(int canal){
        this.canal = canal;
    }
    
    public int getVolumen(){
        return this.volumen;
    }
    
    public void setVolumen(int volumen){
        this.volumen = volumen;
    }
    
    @Override
    public void encender(){
        this.encendido = true;
        System.out.println("Televisión encendida, el canal actual es el " + this.canal);
    }
    
    @Override
    public void apagar(){
        System.out.println("La TV se apagará en 10s");
        this.encendido = false;
    }
    
    @Override
    public void bajarVolumen(){
        this.volumen--;
        System.out.println("El volumen actual es " + this.volumen);
    }
    
    @Override
    public void subirVolumen(){
        this.volumen++;
        System.out.println("El volumen actual es " + this.volumen);
    }
    
    @Override
    public void cambiarCanal(float canal){
        this.canal = (int) canal;
        System.out.println("El canal actual es " + this.canal);
    }
    
    @Override
    public String toString(){
        return "Encendido: " + this.encendido + "\nCanal: " + this.canal + "\nVolumen: " + this.volumen;
    }
}
