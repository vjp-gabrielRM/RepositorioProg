/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio23tema5;

/**
 *
 * @author alumno
 */
public class Autobus extends Vehiculo{
    private int numeroPlazas;
    
    public Autobus(){
        super();
        this.numeroPlazas = 0;
    }
    
    public Autobus(String matricula, String modelo, int potenciaCV, int numeroPlazas){
        super(matricula, modelo, potenciaCV);
        this.numeroPlazas = numeroPlazas;
    }
    
    public int getNumeroPlazas(){
        return this.numeroPlazas;
    }
    
    public void setNumeroPlazas(int numeroPlazas){
        this.numeroPlazas = numeroPlazas;
    }
    
    @Override
    public String toString(){
        return super.toString() + "autobús con " + this.numeroPlazas + " plazas";
    }
}
