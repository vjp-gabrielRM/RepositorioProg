/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema06ejercicio01;

/**
 *
 * @author alumno
 */
public abstract class Multiplicacion extends Calculadora{
    private int multiplicador;
    
    public Multiplicacion(){
        super();
        this.multiplicador = 0;
    }
    
    public Multiplicacion(int numero, int multiplicador){
        super(numero);
        this.multiplicador = multiplicador;
    }
    
    public int getMultiplicador(){
        return this.multiplicador;
    }
    
    public void setMultiplicador(int multiplicador){
        this.multiplicador = multiplicador;
    }
    
    @Override
    public void realizarOperacion(){
        System.out.println("El resultado de la multiplicación " + getNumero() + " + " + this.multiplicador + " es " + (getNumero() * this.multiplicador));
    }
}
