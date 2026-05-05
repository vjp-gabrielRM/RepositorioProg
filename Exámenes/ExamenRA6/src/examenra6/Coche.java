/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenra6;

/**
 *
 * @author alumno
 */
public class Coche {
    private String titular;
    private String matricula;

    public Coche() {
        this.titular = "";
        this.matricula = "";
    }
    
    public Coche(String titular, String matricula) {
        this.titular = titular;
        this.matricula = matricula;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    @Override
    public String toString(){
        return "Coche con la matrícula " + this.matricula + ", le pertenece a " + this.titular;
    }
}
