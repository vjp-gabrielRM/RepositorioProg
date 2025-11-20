/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programacionorientadaaobjetos;

/**
 *
 * @author alumno
 */
public class ProgramacionOrientadaAObjetos {

    /**
     * @param args the command line arguments
     */
    public static void mondongo(String[] args) {
    //    Coche miCoche = new Coche();
    //    System.out.println(miCoche.toString());
        
    //    miCoche.setEspejos(5);
    //    System.out.println(miCoche.toString());
        
    //    System.out.println(miCoche.getEspejos());
        
    //    miCoche.acelerar();
    //    Coche tuCoche = new Coche("Michelin", "Baja", 3);
    //    System.out.println(tuCoche.toString());
    //    System.out.println(tuCoche);
        
    //    System.out.println(tuCoche.getRuedas());
    
    //MODIFICADORES DE ACCESO
    Ciclista federico = new Ciclista("Federico", 1, "Líder");
    
    Bicicleta biciFede = new Bicicleta(2, "recto", "de carretera", "de disco", true, federico);
    
        System.out.println(biciFede);
        
        System.out.println(biciFede.getCiclista().getNombre());
    }
    
}
