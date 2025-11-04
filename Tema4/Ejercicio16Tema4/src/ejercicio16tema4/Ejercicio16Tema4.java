/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16tema4;

/**
 *
 * @author alumno
 */
public class Ejercicio16Tema4 {
    
    public static void raizDe64(){
        System.out.println("La raíz cuadrada de 64 es " + Math.sqrt(64));
    }
    
    public static void cuboDe8(){
        System.out.println("El cubo de 8 es " + Math.pow(8, 3));
    }
    
    public static void exponencialDe2(){
        System.out.println("El exponencial de 2 es " + Math.exp(2));
    }
    
    public static void logaritmoDee(){
        System.out.println("El logaritmo de e es " + Math.log(2.71828));
    }
    
    public static void menorEntre2Y3(){
        System.out.println("El valor menor entre 2 y 3 es " + Math.min(2, 3));
    }
    
    public static void valorAbsolutoDeMenos4YMedio(){
        System.out.println("El valor absoluto de -4,5 es " + Math.abs(-4.5));
    }
    
    public static void redondeandoMenos4YMedio(){
        System.out.println("Si redondeamos -4,5 el resultado es " + Math.round(-4.5));
    }
    
    public static void senoDe45Grados(){
        System.out.println("El seno de 45º es " + Math.sin(45));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        raizDe64();
        cuboDe8();
        exponencialDe2();
        logaritmoDee();
        menorEntre2Y3();
        valorAbsolutoDeMenos4YMedio();
        redondeandoMenos4YMedio();
        senoDe45Grados();
        // TODO code application logic here
    }
    
}
