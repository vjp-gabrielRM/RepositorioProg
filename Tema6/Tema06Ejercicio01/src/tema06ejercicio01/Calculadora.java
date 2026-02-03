/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema06ejercicio01;

/**
 *
 * @author alumno
 */
public abstract class Calculadora {
    private int numero;
    
    public Calculadora(){
        this.numero = 0;
    }
    
    public Calculadora (int numero){
        this.numero = numero;
    }
    
    public int getNumero(){
        return this.numero;
    }
    
    public void setNumero(int numero){
        this.numero = numero;
    }
    
    public abstract void realizarOperacion();
}
