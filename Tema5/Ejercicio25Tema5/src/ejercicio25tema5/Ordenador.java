/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio25tema5;

/**
 *
 * @author alumno
 */
public class Ordenador {
    private int memoriaRAM;
    private int capacidadHDD;
    private String modeloCPU;
    private String modeloGPU;
    private int precio;
    
    public Ordenador(){
        this.memoriaRAM = 0;
        this.capacidadHDD = 0;
        this.modeloCPU = "";
        this.modeloGPU = "";
        this.precio = 0;        
    }
    
    public Ordenador(int memoriaRAM, int capacidadHDD, String modeloCPU, String modeloGPU, int precio){
        this.memoriaRAM = memoriaRAM;
        this.capacidadHDD = capacidadHDD;
        this.modeloCPU = modeloCPU;
        this.modeloGPU = modeloGPU;
        this.precio = precio;        
    }
    
    public int getMemoriaRAM(){
        return this.memoriaRAM;
    }
    
    public void setMemoriaRAM(int memoriaRAM){
        this.memoriaRAM = memoriaRAM;
    }
    
    public int getCapacidadHDD(){
        return this.capacidadHDD;
    }
    
    public void setCapacidadHDD(int capacidadHDD){
        this.capacidadHDD = capacidadHDD;
    }
    
    public String getModeloCPU(){
        return this.modeloCPU;
    }
    
    public void setModeloCPU(String modeloCPU){
        this.modeloCPU = modeloCPU;
    }
    
    public String getModeloGPU(){
        return this.modeloGPU;
    }
    
    public void setModeloGPU(String modeloGPU){
        this.modeloGPU = modeloGPU;
    }
    
    public int getPrecio(){
        return this.precio;
    }
    
    public void setPrecio(int precio){
        this.precio = precio;
    }
    
    @Override
    public String toString(){
        return "RAM: " + this.memoriaRAM + ", capacidad disco duro: " + this.capacidadHDD +
                ", modelo de procesador: " + this.modeloCPU + ", modelo de gráfica: " + this.modeloGPU +
                ", precio: " + this.precio + " euros";
    }
}
