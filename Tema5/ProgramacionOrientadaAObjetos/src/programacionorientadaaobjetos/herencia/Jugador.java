/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionorientadaaobjetos.herencia;

/**
 *
 * @author alumno
 */
public class Jugador extends Personaje{
    public String inventario;
    
    public Jugador(){
        //Llamar al constructor por defecto de Personaje
        super();
        this.inventario = "";
    }
    
    public Jugador(int vida, String inventario){
        //Llamar al constructor por defecto de Personaje
        super(vida);
        this.inventario = inventario;
    }
    
    public String getInventario(){
        return this.inventario;
    }
    
    public void setInventario(String inventario){
        this.inventario = inventario;
    }
    
    public void recoger(String objeto){
        System.out.println("Recogiendo " + objeto + "...");
    }
    
    @Override
    public String toString(){
        return super.toString() + " y es un JUGADOR con " + this.inventario;
    }
}
