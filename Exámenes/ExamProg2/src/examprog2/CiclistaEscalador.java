/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examprog2;

/**
 *
 * @author alumno
 */
public class CiclistaEscalador extends Ciclista implements Pedaleable{
    private float potencia;
    private float fuerza;
    
    /**
     * Constructor por defecto de CiclistaEscalador
     */
    public CiclistaEscalador(){
        super();    //Constructor por defecto de la superclase
        this.potencia = 0;
        this.fuerza = 0;
    }
    
    /**
     * Constructor parametrizado de CiclistaEscalador
     * @param nombre
     * @param estaEscapado
     * @param kmAMeta
     * @param velocidad
     * @param potencia
     * @param fuerza 
     */
    public CiclistaEscalador(String nombre, boolean estaEscapado, float kmAMeta, float velocidad, float potencia, float fuerza){
        super(nombre, estaEscapado, kmAMeta, velocidad);    //Constructor parametrizado de la superclase
        this.potencia = potencia;
        this.fuerza = fuerza;
    }
    
    //Getters y Setters de todos los atributos
    public float getPotencia(){
        return this.potencia;
    }
    
    public void setPotencia(float potencia){
        this.potencia = potencia;
    }
    
    public float getFuerza(){
        return this.fuerza;
    }
    
    public void setFuerza(float fuerza){
        this.fuerza = fuerza;
    }
    
    //Métodos abstractos heredados
    
    /**
     * Método que aumenta la energía del escalador en 30 si está a más de 20 km de la meta y da un mensaje de error si no lo está
     */
    @Override
    public void comer(){
        if(getKmAMeta() > 20){
            setEnergia((getEnergia() + 30));
            System.out.println("El escalador " + getNombre() + " acaba de tomar un gel. Su energía ahora es de " + getEnergia());
        }else{
            System.out.println("El escalador " + getNombre() + " no puede comer a menos de 20km de la meta");
        }
    }
    
    /**
     * Método que coge bidones si el escalador tiene menos de 2
     * luego aumenta la hidratación en 10 y tira ambos bidones, además imprime un mensaje
     */
    @Override
    public void beber(){
        if(getNumBidones() < 2){
            cogerBidones();
        }
        if(getNumBidones() >= 2){
            System.out.println("Bebiendo...");
            setNivelHidratacion((getNivelHidratacion() + 10));
            for(int i = 0; i < 2; i++){
                tirarBidon();
            }
            System.out.println("El escalador " + getNombre() + " se ha hidratado. Su nivel de hidratación ahora es de " + getNivelHidratacion());
        }
    }
    
    /**
     * Método que cambia la velocidad a un valor basado en potencia y fuerza si está a menos de 0.3 km de la meta
     * y si tiene 20 o más de energía, imprime un mensaje de éxito si lo hace y de error si no es posible esprintar aún
     */
    @Override
    public void sprintar(){
        if(getKmAMeta() < 0.3 && getEnergia() >= 20){
            setVelocidad(this.potencia / this.fuerza);
            setEnergia((getEnergia() - 20));
            System.out.println("El escalador " + getNombre() + " está esprintando a " + getVelocidad() + " km/h");
        }else{
            System.out.println("Aún no puedes esprintar");
        }
    }
    
    /**
     * Método que cambia el valor de estaEscapado a true y reduce la hidratación del escalador en 20% si estaEscapado es false
     */
    @Override
    public void atacar(){
        if(!getEstaEscapado()){
            setEstaEscapado(true);
            setNivelHidratacion((getNivelHidratacion() - (getNivelHidratacion() / 5)));
            System.out.println("El escalador " + getNombre() + " está atacando");
        }
    }
    
    /**
     * Método que aumenta la energía del escalador en base a los km de recuperación si está suficientemente lejos de la meta
     * @param kmRecuperacion
     * @return la energía tras recuperar
     */
    @Override
    public float recuperar(float kmRecuperacion){
        if(getKmAMeta() > 15){
            setEnergia((getEnergia() + (int) kmRecuperacion * 5));
            System.out.println(getNombre() + " está recuperando");
        }
        return getEnergia();
    }
    
    /**
     * Método que genera un String con todos los atributos de la clase
     * @return el String generado
     */
    @Override
    public String toString(){
        return super.toString() + "Tipo: Escalador\n"
                + "Potencia: " + this.potencia + "\n"
                + "Fuerza: " + this.fuerza + "\n";
    }
}
