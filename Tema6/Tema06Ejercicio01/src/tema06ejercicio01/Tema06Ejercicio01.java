/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema06ejercicio01;

/**
 *
 * @author alumno
 */
public class Tema06Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Suma suma = new Suma(16, 17) {};
        Multiplicacion multiplicacion = new Multiplicacion(11, 3) {};
        Potencia potencia = new Potencia(2, 5) {};
        
        suma.realizarOperacion();
        multiplicacion.realizarOperacion();
        potencia.realizarOperacion();
        System.out.println("");
        
        System.out.println("oºoºoºo POLIMORFISMO oºoºoºo");
        Calculadora operacion;
        System.out.println("");
        operacion = new Suma(1, 2) {};
        System.out.println("Los sumandos de la suma son " + operacion.getNumero() +  " y otro que no se puede visualizar al ser polimórfica");

        operacion = new Multiplicacion(1, 2) {};
        System.out.println("Los factores de la multiplicación son " + operacion.getNumero() +  " y otro que no se puede visualizar al ser polimórfica");

        operacion = new Potencia(1, 2) {};
        System.out.println("La base de la potencia es " + operacion.getNumero() +  " y el exponente no se puede visualizar al ser polimórfica");
    }
    
}
