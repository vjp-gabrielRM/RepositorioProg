/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examprog2;

/**
 *
 * @author alumno
 */
public abstract class Ciclista {
    private String nombre;
    private int energia;
    private boolean estaEscapado;
    private float kmAMeta;
    private int numBidones;
    private float velocidad;
    private int nivelHidratacion;
    
    public static int numCiclistas = 0;
    
    /**
     * Constructor por defecto de Ciclista
     */
    public Ciclista(){
        this.nombre = "";
        this.energia = 50;
        this.estaEscapado = false;
        this.kmAMeta = 120;
        this.numBidones = 2;
        this.velocidad = 0;
        this.nivelHidratacion = 50;
        
        aumentarNumCiclistas();     //Utilizo el método creado para aumentar el número de ciclistas cada vez que creo uno
    }
    
    /**
     * Constructor parametrizado de Ciclista
     * @param nombre
     * @param estaEscapado
     * @param kmAMeta
     * @param velocidad 
     */
    public Ciclista(String nombre, boolean estaEscapado, float kmAMeta, float velocidad){
        //Las 3 que SIEMPRE se inicializan con un valor establecido también tienen ese valor en el constructor parametrizado, por lo que el constructor no necesita recibirlas
        this.nombre = nombre;
        this.energia = 50;
        this.estaEscapado = estaEscapado;
        this.kmAMeta = kmAMeta;
        this.numBidones = 2;
        this.velocidad = velocidad;
        this.nivelHidratacion = 50;
        
        aumentarNumCiclistas();     //Utilizo el método creado para aumentar el número de ciclistas cada vez que creo uno
    }
    
    //Getters y Setters de cada atributo
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public int getEnergia(){
        return this.energia;
    }
    
    public void setEnergia(int energia){
        this.energia = energia;
    }
    
    public boolean getEstaEscapado(){
        return this.estaEscapado;
    }
    
    public void setEstaEscapado(boolean estaEscapado){
        this.estaEscapado = estaEscapado;
    }
    
    public float getKmAMeta(){
        return this.kmAMeta;
    }
    
    public void setKmAMeta(float kmAMeta){
        this.kmAMeta = kmAMeta;
    }
    
    public int getNumBidones(){
        return this.numBidones;
    }
    
    public void setNumBidones(int numBidones){
        this.numBidones = numBidones;
    }
    
    public float getVelocidad(){
        return this.velocidad;
    }
    
    public void setVelocidad(float velocidad){
        this.velocidad = velocidad;
    }
    
    public int getNivelHidratacion(){
        return this.nivelHidratacion;
    }
    
    public void setNivelHidratacion(int nivelHidratacion){
        this.nivelHidratacion = nivelHidratacion;
    }
    
    /**
     * Método que aumenta en 2 los bidones si la distancia a la meta es mayor a 10 y da un mensaje de error si no lo es
     */
    public final void cogerBidones(){
        if(this.kmAMeta > 10){
            System.out.println("Cogiendo bidones...");
            this.numBidones += 2;
        }else{
            System.out.println("No puedes coger bidones a menos de 10 km de meta");
        }
    }
    
    /**
     * Método que disminuye la cantidad de bidones en 1
     */
    public final void tirarBidon(){
        if(this.numBidones > 0){        //Pongo este if porque no tendría sentido tirar un bidón no teniendo ninguno
            System.out.println("Tirando bidón...");
            this.numBidones --;
        }
    }
    
    //Métodos abstractos para las clases que heredan Ciclista
    public abstract void comer();
    
    public abstract void beber();
    
    /**
     * Método estático que aumenta el contador de ciclistas creados
     */
    private static void aumentarNumCiclistas(){
        numCiclistas ++;
    }
    
    /**
     * Método estático que imprime en pantalla el número de ciclistas creados
     */
    public static void verNumCiclistas(){
        System.out.println("El número de ciclistas es " + numCiclistas);
    }
    
    /**
     * Método que genera un String con todos los atributos del ciclista
     * @return el String generado
     */
    @Override
    public String toString(){
        return "Nombre: " + this.nombre + "\n"
                + "Energía: " + this.energia + "\n"
                + "Está escapado: " + this.estaEscapado + "\n"
                + "Km a meta: " + this.kmAMeta + "\n"
                + "Número de bidones: " + this.numBidones + "\n"
                + "Velocidad: " + this.velocidad + " km/h\n"
                + "Nivel de hidratación: " + this.nivelHidratacion + "\n";
    }
}
