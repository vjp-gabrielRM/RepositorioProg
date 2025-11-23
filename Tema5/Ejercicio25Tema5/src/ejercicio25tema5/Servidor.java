/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio25tema5;

/**
 *
 * @author alumno
 */
public class Servidor extends Ordenador{
    private int tamannoMonitor;
    private String modeloTeclado;
    private String modeloRaton;
    
    public Servidor(){
        super();
        this.tamannoMonitor = 0;
        this.modeloTeclado = "";
        this.modeloRaton = "";
    }
    
    public Servidor(int memoriaRAM, int capacidadHDD, String modeloCPU, String modeloGPU, int precio, int tamannoMonitor,
            String modeloTeclado, String modeloRaton){
        super(memoriaRAM, capacidadHDD, modeloCPU, modeloGPU, precio);
        this.tamannoMonitor = tamannoMonitor;
        this.modeloTeclado = modeloTeclado;
        this.modeloRaton = modeloRaton;
    }
    
    public int getTamannoMonitor(){
        return this.tamannoMonitor;
    }
    
    public void setTamannoMonitor(int tamannoMonitor){
        this.tamannoMonitor = tamannoMonitor;
    }
    
    public String getModeloTeclado(){
        return this.modeloTeclado;
    }
    
    public void setModeloTeclado(String modeloTeclado){
        this.modeloTeclado = modeloTeclado;
    }
    
    public String getModeloRaton(){
        return this.modeloRaton;
    }
    
    public void setModeloRaton(String modeloRaton){
        this.modeloRaton = modeloRaton;
    }
    
    @Override
    public String toString(){
        return "Servidor con las características: " + super.toString() + ", tamaño de monitor: " + this.tamannoMonitor + ", modelo de teclado: " + this.modeloTeclado + " y modelo de ratón: " + this.modeloRaton;
    }
}
