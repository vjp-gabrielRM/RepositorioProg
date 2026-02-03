/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema08ejercicio15;

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
        return "";
    }
}
