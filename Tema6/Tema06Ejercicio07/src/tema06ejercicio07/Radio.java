/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema06ejercicio07;

/**
 *
 * @author alumno
 */
public class Radio implements ControlRemoto{
    private boolean encendido;
    private float emisora;
    private int volumen;
    
    public Radio(){
        this.encendido = false;
        this.emisora = 80;
        this.volumen = 15;
    }
    
    public Radio(boolean encendido, int emisora, int volumen){
        this.encendido = encendido;
        this.emisora = emisora;
        this.volumen = volumen;
    }
    
    public float getEmisora(){
        return this.emisora;
    }
    
    public void setEmisora(float emisora){
        this.emisora = emisora;
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
        System.out.println("Radio encendida");
    }
    
    @Override
    public void apagar(){
        this.encendido = false;
        System.out.println("Radio apagada");
    }
    
    @Override
    public void bajarVolumen(){
        this.volumen -= 5;
        System.out.println("El volumen actual es " + this.volumen);
    }
    
    @Override
    public void subirVolumen(){
        this.volumen += 5;
        System.out.println("El volumen actual es " + this.volumen);
    }
    
    @Override
    public void cambiarCanal(float canal){
        this.emisora = canal;
        System.out.println("La emisora actual es " + this.emisora);
    }
    
    @Override
    public String toString(){
        return "Encendido: " + this.encendido + "\nEmisora: " + this.emisora + "\nVolumen: " + this.volumen;
    }
}
