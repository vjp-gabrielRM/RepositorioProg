/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio31;

public class Ejercicio31 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
    int aleatorio = (int) (Math.random()*100+1);          //declaro una variable i para hacer de contador
    int num1=0, num2=0, num3=0, intentos=0;
    
    do{
        do{
            intentos++;
            if(aleatorio%2==1){
                num1=aleatorio;
            } else{
                aleatorio = (int) (Math.random()*100+1);          //declaro una variable i para hacer de contador
            }
        } while (num1==0);
        do{
            intentos++;
            if(aleatorio%2==1){
                num2=aleatorio;
            } else{
                aleatorio = (int) (Math.random()*100+1);          //declaro una variable i para hacer de contador
            }
        } while (num2==0);
        do{
            intentos++;
            if(aleatorio%2==1){
                num3=aleatorio;
            } else{
                aleatorio = (int) (Math.random()*100+1);          //declaro una variable i para hacer de contador
            }
        } while (num3==0);
    } while(num1==0 || num2==0 || num3==0);
    
    System.out.println("Los 3 números impares generados aleatoriamente son " + num1 + " " + num2 + " y " + num3);
    
    System.out.println("Se ha necesitado generar un total de " + intentos + " números para generar los 3");
    
}
}