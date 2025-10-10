/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;

    import java.util.Scanner;

public class Ejercicio7 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
    int diasemana;
    boolean laborable = false;
    Scanner entrada = new Scanner(System.in);
    
    System.out.println("Introduce un día de la semana como número (lunes = 1, martes = 2, ... , domingo = 7: ");
        
    diasemana = entrada.nextInt();
    
    switch (diasemana) {
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
            laborable = true;
            break;
        case 6:
        case 7:
            laborable = false;
            break;
        default:
            System.out.println("Por favor, introduce un número válido");
            break;
    }
    if (diasemana >= 1 && diasemana <= 7 && laborable == true){
            System.out.println("El día que has introducido es laborable");
    } else if (diasemana >= 1 && diasemana <= 7 && laborable == false){
            System.out.println("El día que has introducido no es laborable");
        // TODO code application logic here
    }
    
}
}