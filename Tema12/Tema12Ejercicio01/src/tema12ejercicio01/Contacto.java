/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema12ejercicio01;

/**
 *
 * @author alumno
 */
public class Contacto {
    private String nombre;
    private int edad;
    private String telefono;

    public Contacto() {
        this.nombre = "";
        this.edad = 0;
        this.telefono = "";
    }
    
    public Contacto(String nombre, int edad, String telefono) {
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    @Override
    public String toString(){
        return "Nombre: " + this.nombre +
                "\n Edad: " + this.edad +
                "\n Número de teléfono: " + this.telefono;
    }
}
