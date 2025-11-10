/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio01tema5;

/**
 *
 * @author alumno
 */
public class Coche {
    //Atributos, no se inicializan
    private String marca;
    private String modelo;
    private String color;
    private int velocidad;
    private boolean motorEncendido;
    
    //Constructores
    //Constructor por defecto
    public Coche(){
        this.marca = "";
        this.modelo = "";
        this.color = "";
        this.velocidad = 0;
        this.motorEncendido = false;
    }
    
    //Constructor parametrizado
    public Coche(String marca, String modelo, String color, int velocidad, boolean motorEncendido){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.velocidad = velocidad;
        this.motorEncendido = motorEncendido;
    }
    
    //Getters y setters
    
    public void establecerMarca(String marca){
        this.marca = marca;
    }
    
    public void establecerModelo(String modelo){
        this.modelo = modelo;
    }
    
    public void establecerColor(String color){
        this.color = color;
    }
    
    //Otros métodos
    public void arrancarCoche(){
        this.motorEncendido = true;
        this.velocidad = 10;
    }
    
    public void apagarCoche(){
        this.motorEncendido = false;
        this.velocidad = 0;
    }
    
    public void acelerarCoche(){
        this.velocidad = 20;
    }
    
    public void frenarCoche(){
        this.velocidad = 6;
    }
    
    //To String
    public String obtenerEstado(){
        return "Mi coche es de marca " + this.marca + " de modelo " + this.modelo + " y de color " + this.color + " motorEncendido está a " + this.motorEncendido + " va a una velocidad de " + this.velocidad;
    }
}
