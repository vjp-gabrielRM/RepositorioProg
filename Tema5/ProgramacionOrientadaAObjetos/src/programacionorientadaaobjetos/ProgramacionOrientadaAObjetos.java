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
    public static void main(String[] args) {
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
    Bicicleta bicicleta = new Bicicleta();
    System.out.println(bicicleta.ruedas);
    System.out.println(bicicleta.getEstaPedaleando());
    
    System.out.println("¿Cuántas bicis hemos creado?");
    System.out.println(bicicleta.getNumBicicletas());
    
    //PASO DE PARÁMETROS POR VALOR O POR REFERENCIA
    int num1 = 4;
        System.out.println(suma(num1));
    
    Bicicleta bici = new Bicicleta();
    empezarAPedalear(bici);
    }
    
    public static int suma(int num1){
        int num2 = 3;
        return num1 + num2;
    }
    
    public static void empezarAPedalear(){
        bici.setEstaPedaleando(true);
    }
    
}
