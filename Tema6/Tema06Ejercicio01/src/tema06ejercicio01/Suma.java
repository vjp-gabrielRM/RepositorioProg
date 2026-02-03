/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema06ejercicio01;

/**
 *
 * @author alumno
 */
public abstract class Suma extends Calculadora{
    private int sumando;
    
    public Suma(){
        super();
        this.sumando = 0;
    }
    
    public Suma(int numero, int sumando){
        super(numero);
        this.sumando = sumando;
    }
    
    public int getSumando(){
        return this.sumando;
    }
    
    public void setSumando(int sumando){
        this.sumando = sumando;
    }
    
    @Override
    public void realizarOperacion(){
        System.out.println("El resultado de la suma " + getNumero() + " + " + this.sumando + " es " + (getNumero() + this.sumando));
    }
}
