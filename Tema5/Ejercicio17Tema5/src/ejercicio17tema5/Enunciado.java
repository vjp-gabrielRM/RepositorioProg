/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio17tema5;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Enunciado {
    private String pregunta;
    private String respuesta;
    
    
    public Enunciado(){
        this.pregunta = "";
        this.respuesta = "";
    }
    public Enunciado(String pregunta, String respuesta){
        this.pregunta = pregunta;
        this.respuesta = respuesta;
    }
    
    public String getPregunta(){
        return this.pregunta;
    }
    
    public void setPregunta(String pregunta){
        this.pregunta = pregunta;
    }
    
    public String getRespuesta(){
        return this.respuesta;
    }
    
    public void setRespuesta(String respuesta){
        this.respuesta = respuesta;
    }
    
    public boolean preguntar(){
        String respuestaUsuario;
        Scanner entrada = new Scanner(System.in);
        System.out.println(this.pregunta);
        respuestaUsuario = entrada.nextLine();
        return(this.respuesta.equalsIgnoreCase(respuestaUsuario));
    }
}
