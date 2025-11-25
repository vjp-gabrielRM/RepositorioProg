/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema06ejercicio01;

/**
 *
 * @author alumno
 */
public abstract class Potencia extends Calculadora{
    private int exponente;
    
    public Potencia(){
        super();
        this.exponente = 0;
    }
    
    public Potencia(int numero, int exponente){
        super(numero);
        this.exponente = exponente;
    }
    
    public int getExponente(){
        return this.exponente;
    }
    
    public void setExponente(int exponente){
        this.exponente = exponente;
    }
    
    @Override
    public void realizarOperacion(){
        System.out.println("El resultado de la potencia " + getNumero() + " ^ " + this.exponente + " es " + Math.pow(getNumero(), this.exponente));
    }
}
