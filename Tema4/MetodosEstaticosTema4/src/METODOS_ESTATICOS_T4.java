/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author alumno
 */
public class METODOS_ESTATICOS_T4 {
    //metodo que imprime un saludo tipo void
    public static void saludo(){
        System.out.println("Hola universo");
    } 
    
//metodo que imprime un mensaje con un dato que recibe por parametro tipo void
    public static void  saludoConParametro(int num){
            System.out.println("Hola neox " + num);
           // saludo();
    }
    
    //metodo que muestra la suma de dos numeros que recibe por parametro tipo void 
    public static void suma(int num1, int num2){
            System.out.println(" la suma de " + num1 + " y " + num2 + " es igual a " + (num1 + num2));
    }
           
    //metodo que devuelve la suma de dos numeros que recibe por parametros tipo int
    public static int  sumaDevuelve(int num1, int num2){
     System.out.println(" ");
     return num1 + num2; 
    }
            
    
    //metodo que devuelve true si la contraseña 
    //que pasamos por parametro es correcta tipo boolean
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void noMuyMain(String[] args) {
        //int num1= 3;
        //int num2= 2;
        // int resultado;
        //llamamos a los metodos para que se ejecuten en el programa
        //saludo();
        //saludoConParametro(1);
        //suma(num1, num2);
        //  resultado = sumaDevuelve(num1, num2);
        //  System.out.println(resultado);
        //System.out.println(sumaDevuelve(num1,num2));
        tema4.ClaseString.main();
    }}