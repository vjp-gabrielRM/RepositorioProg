/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17tema5;

/**
 *
 * @author alumno
 */
public class Ejercicio17Tema5 {
    
    public static final double ACIERTO = 2.5;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double puntuacion = 0;
        Enunciado enunciado1 = new Enunciado("¿De qué color es el caballo blanco de Santiago?", "Blanco");
        Enunciado enunciado2 = new Enunciado("¿Cuál es la capital de España?", "Madrid");
        Enunciado enunciado3 = new Enunciado("¿Cuál es la capital de Portugal?", "Lisboa");
        Enunciado enunciado4 = new Enunciado("¿Cuál es la capital de Italia?", "Roma");
        
        if(enunciado1.preguntar()){
            puntuacion += ACIERTO; //puntuacion = puntuacion + ACIERTO;
        }
        if(enunciado2.preguntar()){
            puntuacion += ACIERTO;
        }
        if(enunciado3.preguntar()){
            puntuacion += ACIERTO;
        }
        if(enunciado4.preguntar()){
            puntuacion += ACIERTO;
        }
        
        System.out.println("Tu puntuación es de " + puntuacion);
    }
    
}
