/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema06ejercicio04;

/**
 *
 * @author alumno
 */
public abstract class Gato extends Felinos{
    
    public Gato(){
        super();
    }
    
    public Gato(String nombre, int edad, int peso){
        super(nombre, edad, peso);
    }
    
    @Override
    public void mostrarSonido(){
        System.out.println("Sonido: Maullido");
    }
    
    @Override
    public void mostrarAlimentacion(){
        System.out.println("Alimentación: Ratones");
    }
    
    @Override
    public void mostrarHabitat(){
        System.out.println("Hábitat: Doméstico");
    }
    
    @Override
    public void nombreCientifico(){
        System.out.println("Nombre científico: Felis silvestrus catus");
    }
}
