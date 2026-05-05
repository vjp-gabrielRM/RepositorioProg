/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examprog2;

/**
 *
 * @author alumno
 */
public class CiclistaSprinter extends Ciclista implements Pedaleable{
    private float aceleracion;
    
    /**
     * Constructor por defecto de CiclistaSprinter
     */
    public CiclistaSprinter(){
        super();    //Constructor por defecto de la superclase
        this.aceleracion = 0;
    }
    
    /**
     * Constructor parametrizado de CiclistaSprinter
     * @param nombre
     * @param estaEscapado
     * @param kmAMeta
     * @param velocidad
     * @param aceleracion 
     */
    public CiclistaSprinter(String nombre, boolean estaEscapado, float kmAMeta, float velocidad, float aceleracion){
        super(nombre, estaEscapado, kmAMeta, velocidad);    //Constructor parametrizado de la superclase
        this.aceleracion = aceleracion;
    }
    
    //Getter y Setter del atributo de la clase
    public float getAceleracion(){
        return this.aceleracion;
    }
    
    public void setAceleracion(float aceleracion){
        this.aceleracion = aceleracion;
    }
    
    //Métodos abstractos heredados
    /**
     * Método que aumenta la energía del sprinter en 25 si está a más de 10 km de la meta
     */
    @Override
    public void comer(){
        if(getKmAMeta() > 10){
            setEnergia((getEnergia() + 25));
            System.out.println("El sprinter " + getNombre() + " acaba de tomar un gel. Su energía ahora es de " + getEnergia());
        }
    }
    
    /**
     * Método que coge bidones si el sprinter no tiene, posteriormente aumenta su hidratación en 5, tira un bidón
     * y muestra un mensaje en pantalla
     */
    @Override
    public void beber(){
        if(getNumBidones() < 1){
            cogerBidones();
        }
        if(getNumBidones() >= 1){
            System.out.println("Bebiendo...");
            setNivelHidratacion((getNivelHidratacion() + 5));
            tirarBidon();
            System.out.println("El sprinter " + getNombre() + " se ha hidratado. Su nivel de hidratación ahora es de " + getNivelHidratacion());
        }
    }
    
    /**
     * Método que aumenta la velocidad del sprinter sumándole su aceleración si está suficientemente cerca de la meta y tiene suficiente energía
     * Muestra un mensaje de eéxito si lo logra y uno de error si no es posible
     */
    @Override
    public void sprintar(){
        if(getKmAMeta() < 1 && getEnergia() >= 50){
            setVelocidad((getVelocidad() + this.aceleracion));
            setEnergia((getEnergia() - 50));
            System.out.println("El sprinter " + getNombre() + " está esprintando a " + getVelocidad() + " km/h");
        }else{
            System.out.println("Aún no puedes esprintar");
        }
    }
    
    /**
     * Método que cambia el valor de estaEscapado a true y reduce la hidratación del sprinter en 10% si estaEscapado es false
     */
    @Override
    public void atacar(){
        if(!getEstaEscapado()){
            setEstaEscapado(true);
            setNivelHidratacion((getNivelHidratacion() - (getNivelHidratacion() / 10)));
            System.out.println("El escalador " + getNombre() + " está atacando");
        }
    }
    
    /**
     * Método que aumenta la energía del sprinter en base a los km de recuperación si está suficientemente lejos de la meta
     * @param kmRecuperacion
     * @return la energía tras recuperar
     */
    @Override
    public float recuperar(float kmRecuperacion){
        if(getKmAMeta() > 5){
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
        return super.toString() + "Tipo: Sprinter\n"
                + "Aceleración: " + this.aceleracion + "\n";
    }
}
