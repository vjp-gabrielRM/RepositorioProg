/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema08ejercicio09;

/**
 *
 * @author alumno
 */
public class Alumno {
    private String nombre;
    private Asignatura[] notas = new Asignatura[4];

    public Alumno() {
        this.nombre = "";
        for(int i = 0; i < 4; i++){
            this.notas[i] = new Asignatura();
        }
    }
    
    public Alumno(String nombre, Asignatura[] notas) {
        this.nombre = nombre;
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Asignatura[] getNotas() {
        return notas;
    }

    public void setNotas(Asignatura[] notas) {
        this.notas = notas;
    }
    
    public void nombrarAsignaturas(){
        this.notas[0].setNombre("Lengua");
        this.notas[1].setNombre("Mates");
        this.notas[2].setNombre("Historia");
        this.notas[3].setNombre("Física");
    }
    
    @Override
    public String toString(){
        return "Estas son las notas de " + this.nombre + ":\n"
                + this.notas[0].toString() + "\n"
                + this.notas[1].toString() + "\n"
                + this.notas[2].toString() + "\n"
                + this.notas[3].toString() + "\n";
    }
}
