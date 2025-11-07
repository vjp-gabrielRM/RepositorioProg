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
    private String ruedas;
    private String suspension;
    private int espejos;
    
    //Constructores
    //Constructor por defecto
    public Coche(){
        this.ruedas = "";
        this.suspension = "";
        this.espejos = 0;
    }
    
    //Constructor parametrizado
    public Coche(String ruedas, String suspension, int espejos){
        this.ruedas = ruedas;
        this.suspension = suspension;
        this.espejos = espejos;
    }
    
    //Getters y setters
    public String getRuedas(){
        return this.ruedas;
    }
    
    public void setRuedas(String ruedas){
        this.ruedas = ruedas;
    }
    
    public String getSuspension(){
        return this.suspension;
    }
    
    public void setSuspension(String suspension){
        this.suspension = suspension;
    }
    
    public int getEspejos(){
        return this.espejos;
    }
    
    public void setEspejos(int espejos){
        this.espejos = espejos;
    }
    
    //Otros métodos
    public void acelerar(){
        System.out.println("Acelerando");
    }
    
    public void frenar(){
        System.out.println("Frenando");
    }
    
    public void girar(){
        System.out.println("Girando");
    }
    
    //To String
    @Override
    public String toString(){
        return "Mi coche tiene ruedas " + this.ruedas + " suspensión " + this.suspension + " y " + this.espejos + " espejos";
    }
}
