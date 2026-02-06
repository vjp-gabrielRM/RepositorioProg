/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema08ejercicio15;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Pelicula {
    private String titulo;
    private float licencia;
    private Socio[] socios;

    public Pelicula() {
        this.titulo = "";
        this.licencia = 0;
        this.socios = new Socio[4];
        
        for(int i = 0; i < socios.length; i++){
            this.socios[i] = new Socio();
        }
    }
    
    public Pelicula(String titulo, float licencia, Socio[] socios) {
        this.titulo = titulo;
        this.licencia = licencia;
        this.socios = socios;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float getLicencia() {
        return licencia;
    }

    public void setLicencia(float licencia) {
        this.licencia = licencia;
    }

    public Socio[] getSocios() {
        return socios;
    }

    public void setSocios(Socio[] socios) {
        this.socios = socios;
    }
    
    @Override
    public String toString(){
        return this.titulo + ", con un coste de licencia de " + this.licencia + " euros"
                + " y los socios:\n"
                + this.socios[0].toString() + "\n"
                + this.socios[1].toString() + "\n"
                + this.socios[2].toString() + "\n"
                + this.socios[3].toString() + "\n";
    }
    
    public static String pedirString(){
        Scanner entrada = new Scanner(System.in);
        return entrada.next();
    }
    
    public static float pedirFloat(){
        Scanner entrada = new Scanner(System.in);
        return entrada.nextFloat();
    }
    
    public void rellenarSocios(){
        String[] nombres = {"Juan", "Marta", "Pedro", "Ana", "Rubén", "Paula"};
        String[] apellidos = {"Ramírez", "Gómez", "García", "López", "Ramos", "Macías"};
        for(int i = 0; i < this.socios.length; i++){
            /*System.out.println("--- SOCIO " + (i+1) +  " ---");
            System.out.print("Nombre: ");
            socios[i].setNombre(pedirString());
            System.out.print("Cantidad abonada (euros): ");
            socios[i].setAbono(pedirFloat());
            System.out.println("");*/
            
            this.socios[i].setNombre(nombres[(int) (Math.random() * 6)] + " " + apellidos[(int) (Math.random() * 6)]);
            this.socios[i].setAbono((float) Math.random() * (20 - 5) + 5);
        }
    }
    
    public float ventas(){
        float suma = 0;
        for(int i = 0; i < this.socios.length; i++){
            suma += this.socios[i].getAbono();
        }
        return suma;
    }
    
    public void mostrarSocios(){
        for(int i = 0; i < this.socios.length; i++){
            System.out.println(this.socios[i].toString());
        }
    }
}
