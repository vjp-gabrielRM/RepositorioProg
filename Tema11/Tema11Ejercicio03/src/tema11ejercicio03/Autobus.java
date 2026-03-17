/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema11ejercicio03;

import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author alumno
 */
public class Autobus {
    private String matricula;
    private HashMap<String, String> conductores = new HashMap<>();

    public Autobus() {
        this.matricula = "";
    }
    
    public Autobus(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public HashMap<String, String> getConductores() {
        return conductores;
    }

    public void setConductores(HashMap<String, String> conductores) {
        this.conductores = conductores;
    }
    
    @Override
    public String toString(){
        return "";
    }
    
    public void nuevoConductor(String dni, String nombre){
        this.conductores.put(dni, nombre);
    }
    
    public int buscarConductor(String nombre){
        Iterator<String> it = conductores.keySet().iterator();
        while(it.hasNext()){
            String clave = it.next();
            if(clave == nombre){
                
            }
        }
        
        return 0;
    }
}
