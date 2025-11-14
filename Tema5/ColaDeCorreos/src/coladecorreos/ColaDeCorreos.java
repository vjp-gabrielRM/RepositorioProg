package coladecorreos;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author alumno
 */
public class ColaDeCorreos {

    final public static char LETRAINICIAL = 'A';
    final public static char LETRAFINAL = 'F';
    public static int numEnvio = 1;
    public static int numRecogida = 1;
    
    /**
     * Método estático que muestra el menú al usuario
     */
    public static void mostrarMenu(){
        System.out.println("Por favor, escoja lo que desea hacer de las opciones siguientes:");
        System.out.println("1. Enviar");
        System.out.println("2. Recoger");
        System.out.println("3. Salir");
    }
    
    /**
     * Método estático que permite al usuario seleccionar la opción que desea
     * @return la opción elegida
     */
    public static int pedirOpcion(){
        int opcion;
        Scanner entrada = new Scanner(System.in);
        opcion = entrada.nextInt();             //Está hecho de esta manera para permitir limpiar el buffer
        entrada.nextLine();                     //dado que si no se limpia el bucle no funciona correctamente
        return opcion;
    }
    
    /**
     * Método estático que genera una letra aleatoria entre A - F utilizando Math.random
     * @param letraInicial
     * @param letraFinal
     * @return la letra generada
     */
    public static char generarLetraAleatoria(char letraInicial, char letraFinal){
        int letra = (int) (Math.random() * ((letraFinal+1)-letraInicial)+letraInicial);
        return (char) letra;
    }
    
    /**
     * Método estático que incrementa el número de envío
     */
    public static void incrementarNumeroEnvio(){
        numEnvio++;
    }
    
    /**
     * Método estático que incrementa el número de recogida
     */
    public static void incrementarNumeroRecogida(){
        numRecogida++;
    }
    
    /**
     * Método estático que genera un número de espera para el envío
     * utilizando el número de envío generado por el método encargado de ello
     */
    public static void generarNumeroEsperaEnvio(){
        System.out.println("Su número de espera para el envío es E-" + numEnvio);
        incrementarNumeroEnvio();
    }
    
    /**
     * Método estático que genera un número de espera para la recogida
     * utilizando el número de recogida generado por el método encargado de ello
     */
    public static void generarNumeroEsperaRecogida(){
        System.out.println("Su número de espera para la recogida es R-" + numRecogida);
        incrementarNumeroRecogida();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion = 0;
        do{
            mostrarMenu();
            System.out.println("");     //Todos los sout vacíos están simplemente por hacer que el resultado al ejecutar quede más limpio
            try{            //Control de excepciones para evitar que el programa finalice si no se le da un entero
                opcion = pedirOpcion();
            }
            catch(InputMismatchException e){
                opcion = 0;     //Igualo opcion a 0 dado que si primero se introduce una opción válida y luego una letra,
                                //el switch case no detecta la letra al no guardarse en la variable
                                //y vuelve a realizar la acción del número anterior, que es el que tiene guardado
                
                //System.out.println(e);  // <- Se puede poner para informar al usuario de la excepción
            }
            System.out.println("");
                switch (opcion) {
                    case 1:
                        generarNumeroEsperaEnvio();
                        System.out.println("Se le atenderá en la mesa " + generarLetraAleatoria(LETRAINICIAL, LETRAFINAL));
                        System.out.println("");
                        break;
                    case 2:
                        generarNumeroEsperaRecogida();
                        System.out.println("Se le atenderá en la mesa " + generarLetraAleatoria(LETRAINICIAL, LETRAFINAL));
                        System.out.println("");
                        break;
                    case 3:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opción no válida, por favor introduzca un número del 1 al 3");
                        System.out.println("");
                        break;
                }
        }while(opcion!=3);      //Mientras el usuario no introduzca la opción 3 (Salir) se seguirá ejecutando el bucle
    }
    
}
