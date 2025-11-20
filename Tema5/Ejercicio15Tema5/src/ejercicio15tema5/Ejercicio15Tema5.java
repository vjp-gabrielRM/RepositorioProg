/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15tema5;

/**
 *
 * @author alumno
 */
public class Ejercicio15Tema5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Direccion direccion1 = new Direccion("Calle de los dolores", 37, 2, "Pepino");
        Direccion direccion2 = new Direccion("Calle Antigua", 24, 3, "Cebolla");
        Direccion direccion3 = new Direccion("Plaza Pato", 11, 1, "Guarromán");
        
        Empleado empleado1 = new Empleado("Fran", 500, direccion1.getCalle(), direccion1.getNumero(), direccion1.getPiso(), direccion1.getCiudad());
        Empleado empleado2 = new Empleado("Daniel", 20, direccion2.getCalle(), direccion2.getNumero(), direccion2.getPiso(), direccion2.getCiudad());
        Empleado empleado3 = new Empleado("Rober", 3400, direccion3.getCalle(), direccion3.getNumero(), direccion3.getPiso(), direccion3.getCiudad());
        
        System.out.println(empleado1.toString());
        System.out.println(empleado2.toString());
        System.out.println(empleado3.toString());
    }
    
}
