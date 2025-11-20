/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio15tema5;

/**
 *
 * @author alumno
 */
public class Empleado {
    private String nombre;
    private int salario;
    private Direccion direccion;
    
    public Empleado(){
        this.nombre = "";
        this.salario = 0;
        this.direccion = new Direccion();
    }
    
    public Empleado(String nombre, int salario, String calle, int numero, int piso, String ciudad){
        this.nombre = nombre;
        this.salario = salario;
        this.direccion = new Direccion(calle, numero, piso, ciudad);
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public int getSalario(){
        return this.salario;
    }
    
    public void setSalario(int salario){
        this.salario = salario;
    }
    
    @Override
    public String toString(){
    return "El empleado se llama " + this.nombre + ", su salario es de " + this.salario + " euros y " + direccion.toString();
    }
}
