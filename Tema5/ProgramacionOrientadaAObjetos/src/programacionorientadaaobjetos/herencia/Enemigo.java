/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionorientadaaobjetos.herencia;

/**
 *
 * @author alumno
 */
public class Enemigo extends Personaje{
    private String arma;
    
    public Enemigo(){
        super();
        this.arma = "";
    }
    
    public Enemigo(int vida, String arma){
        super(vida);
        this.arma = arma;
    }
    
    public String getArma(){
        return this.arma;
    }
    
    public void setArma(String arma){
        this.arma = arma;
    }
    
    public void crearSoldados(){
        System.out.println("Creando esclavos...");
    }
    
    @Override
    public String toString(){
        return "El ENEMIGO tiene " + /*super.*/getVida() + "% de vida y el arma " + this.arma;
    }
}
