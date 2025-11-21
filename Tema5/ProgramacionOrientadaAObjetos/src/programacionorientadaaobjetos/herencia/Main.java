/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionorientadaaobjetos.herencia;

/**
 * 
 * @author alumno
 */
public class Main {
    
    public static void main(String[] args){
        Personaje personaje = new Personaje();
        System.out.println(personaje);
        
        Jugador jugador = new Jugador(50, "un palitroque");
        System.out.println(jugador);
        
        Enemigo enemigo = new Enemigo(30, "palitroque más grande");
        System.out.println(enemigo);
        
        personaje.atacar();
        jugador.atacar();
        enemigo.atacar();
        
        jugador.recoger("objeto");
        //personaje.recoger("objeto");  //Personaje no tiene el método recoger
        //enemigo.recoger("objeto");    //Enemigo no tiene el método recoger
        
        enemigo.crearSoldados();
        //personaje.crearSoldados();  //Personaje no tiene el método crearSoldados
        //jugador.crearSoldados();    //Jugador no tiene el método crearSoldados
        
        System.out.println(jugador.getInventario());
        System.out.println(jugador.getVida());
        
        System.out.println(personaje.getVida());
        
        System.out.println(enemigo.getVida());
    }
}
