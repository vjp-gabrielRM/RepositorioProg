/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio25tema5;

/**
 *
 * @author alumno
 */
public class Portatil extends Ordenador{
    private String marca;
    private int tamannoPantalla;
    private int peso;
    
    public Portatil(){
        super();
        this.marca = "";
        this.tamannoPantalla = 0;
        this.peso = 0;
    }
    
    public Portatil(int memoriaRAM, int capacidadHDD, String modeloCPU, String modeloGPU, int precio, String marca, 
            int tamannoPantalla, int peso){
        super(memoriaRAM, capacidadHDD, modeloCPU, modeloGPU, precio);
        this.marca = marca;
        this.tamannoPantalla = tamannoPantalla;
        this.peso = peso;
    }
    
    public int getTamannoPantalla(){
        return this.tamannoPantalla;
    }
    
    public void setTamannoPantalla(int tamannoPantalla){
        this.tamannoPantalla = tamannoPantalla;
    }
    
    public String getMarca(){
        return this.marca;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public int getPeso(){
        return this.peso;
    }
    
    public void setPeso(int peso){
        this.peso = peso;
    }
    
    @Override
    public String toString(){
        return "Portátil con las características: " + super.toString() + ", marca: " + this.marca + ", tamaño de pantalla: " + this.tamannoPantalla + " y peso: " + this.peso + " kilos";
    }
}
