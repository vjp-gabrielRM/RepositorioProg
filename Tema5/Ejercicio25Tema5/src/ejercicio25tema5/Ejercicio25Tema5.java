/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio25tema5;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio25Tema5 {
    
    public static Servidor servidor3 = new Servidor();
    public static Portatil portatil3 = new Portatil();

    /**
     * Método estático que pide un número entero al usuario
     * @return el número introducido
     */
    public static int pedirNum(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor introduzca un número:");
        return entrada.nextInt();
    }
    
    /**
     * Método estático que pide un String al usuario
     * @return el String introducido
     */
    public static String pedirString(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor introduzca el texto:");
        return entrada.nextLine();
    }
    
    /**
     * Método estático que permite al usuario elegir el procesador de una lista predeterminada
     * @return el modelo elegido
     */
    public static String modeloProcesador(){
        String procesador = "";
        int opcion;
        System.out.println("Elija uno de estos 4 procesadores");
        System.out.println("1. Modelo 1");
        System.out.println("2. Modelo 2");
        System.out.println("3. Modelo 3");
        System.out.println("4. Modelo 4");
        do{
            opcion = pedirNum();
            switch(opcion){
                case 1:
                    procesador = "Modelo 1";
                    break;
                case 2:
                    procesador = "Modelo 2";
                    break;
                case 3:
                    procesador = "Modelo 3";
                    break;
                case 4:
                    procesador = "Modelo 4";
                    break;
                default:
                    System.out.println("Error, introduzca un número del 1 al 4");
            }
        }while (opcion < 1 && opcion > 4);
        return procesador;
    }
    
    /**
     * Método estático que crea el tercer servidor
     */
    public static void crearServidor(){
        int capacidadHDD = -1, precio;
        System.out.println("------------------------------");
        System.out.println("Tercer servidor");
        System.out.println("------------------------------");
        System.out.println("Introduzca la memoria RAM del servidor");
        servidor3.setMemoriaRAM(pedirNum());
        System.out.println("Introduzca la capacidad del disco duro del servidor");
        while((capacidadHDD % 5) != 0){
            capacidadHDD = pedirNum();
        }
        servidor3.setCapacidadHDD(capacidadHDD);
        servidor3.setModeloCPU(modeloProcesador());
        System.out.println("Por favor introduzca el modelo de la tarjeta gráfica");
        servidor3.setModeloGPU(pedirString());
        do{
            System.out.println("Por favor introduzca el precio del servidor");
            precio = pedirNum();
            if(precio <= 0){
                System.out.println("Error, introduzca un número mayor que 0");
            }
        } while (precio <= 0);
        servidor3.setPrecio(precio);
        System.out.println("Por favor introduzca el tamaño del monitor");
        servidor3.setTamannoMonitor(pedirNum());
        System.out.println("Por favor introduzca el modelo del teclado");
        servidor3.setModeloTeclado(pedirString());
        System.out.println("Por favor introduzca el modelo del ratón");
        servidor3.setModeloRaton(pedirString());
    }
    
    /**
     * Método estático que crea el tercer portátil
     */
    public static void crearPortatil(){
        int capacidadHDD = -1, precio;
        System.out.println("------------------------------");
        System.out.println("Tercer portátil");
        System.out.println("------------------------------");
        System.out.println("Introduzca la memoria RAM del portátil");
        portatil3.setMemoriaRAM(pedirNum());
        System.out.println("Introduzca la capacidad del disco duro del portátil");
        while((capacidadHDD % 5) != 0){
            capacidadHDD = pedirNum();
        }
        portatil3.setCapacidadHDD(capacidadHDD);
        portatil3.setModeloCPU(modeloProcesador());
        System.out.println("Por favor introduzca el modelo de la tarjeta gráfica");
        portatil3.setModeloGPU(pedirString());
        do{
            System.out.println("Por favor introduzca el precio del portátil");
            precio = pedirNum();
            if(precio <= 0){
                System.out.println("Error, introduzca un número mayor que 0");
            }
        } while (precio <= 0);
        portatil3.setPrecio(precio);
        System.out.println("Por favor introduzca la marca");
        portatil3.setMarca(pedirString());
        System.out.println("Por favor introduzca el tamaño de la pantalla");
        portatil3.setTamannoPantalla(pedirNum());
        System.out.println("Por favor introduzca el peso");
        portatil3.setPeso(pedirNum());
    }
    
    public static void main(String[] args) {
        int memoriaRAM, capacidadHDD = -1, precio, tamannoMonitor, tamannoPantalla, peso;
        String modeloCPU, modeloGPU, modeloTeclado, modeloRaton, marca;
        
        System.out.println("------------------------------");
        System.out.println("Primer servidor");
        System.out.println("------------------------------");
        System.out.println("Introduzca la memoria RAM del servidor");
        memoriaRAM = pedirNum();
        System.out.println("Introduzca la capacidad del disco duro del servidor");
        while((capacidadHDD % 5) != 0){
            capacidadHDD = pedirNum();
        }
        modeloCPU = modeloProcesador();
        System.out.println("Por favor introduzca el modelo de la tarjeta gráfica");
        modeloGPU = pedirString();
        do{
            System.out.println("Por favor introduzca el precio del servidor");
            precio = pedirNum();
            if(precio <= 0){
                System.out.println("Error, introduzca un número mayor que 0");
            }
        } while (precio <= 0);
        System.out.println("Por favor introduzca el tamaño del monitor");
        tamannoMonitor = pedirNum();
        System.out.println("Por favor introduzca el modelo del teclado");
        modeloTeclado = pedirString();
        System.out.println("Por favor introduzca el modelo del ratón");
        modeloRaton = pedirString();
        
        Servidor servidor1 = new Servidor(memoriaRAM, capacidadHDD, modeloCPU, modeloGPU, precio, tamannoMonitor, modeloTeclado, modeloRaton);
        
        System.out.println("------------------------------");
        System.out.println("Segundo servidor");
        System.out.println("------------------------------");
        System.out.println("Introduzca la memoria RAM del servidor");
        memoriaRAM = pedirNum();
        System.out.println("Introduzca la capacidad del disco duro del servidor");
        while((capacidadHDD % 5) != 0){
            capacidadHDD = pedirNum();
        }
        modeloCPU = modeloProcesador();
        System.out.println("Por favor introduzca el modelo de la tarjeta gráfica");
        modeloGPU = pedirString();
        do{
            System.out.println("Por favor introduzca el precio del servidor");
            precio = pedirNum();
            if(precio <= 0){
                System.out.println("Error, introduzca un número mayor que 0");
            }
        } while (precio <= 0);
        System.out.println("Por favor introduzca el tamaño del monitor");
        tamannoMonitor = pedirNum();
        System.out.println("Por favor introduzca el modelo del teclado");
        modeloTeclado = pedirString();
        System.out.println("Por favor introduzca el modelo del ratón");
        modeloRaton = pedirString();
        
        Servidor servidor2 = new Servidor(memoriaRAM, capacidadHDD, modeloCPU, modeloGPU, precio, tamannoMonitor, modeloTeclado, modeloRaton);

        System.out.println("------------------------------");
        System.out.println("Primer portátil");
        System.out.println("------------------------------");
        System.out.println("Introduzca la memoria RAM del portátil");
        memoriaRAM = pedirNum();
        System.out.println("Introduzca la capacidad del disco duro del portátil");
        while((capacidadHDD % 5) != 0){
            capacidadHDD = pedirNum();
        }
        modeloCPU = modeloProcesador();
        System.out.println("Por favor introduzca el modelo de la tarjeta gráfica");
        modeloGPU = pedirString();
        do{
            System.out.println("Por favor introduzca el precio del portátil");
            precio = pedirNum();
            if(precio <= 0){
                System.out.println("Error, introduzca un número mayor que 0");
            }
        } while (precio <= 0);
        System.out.println("Por favor introduzca la marca");
        marca = pedirString();
        System.out.println("Por favor introduzca el tamaño de la pantalla");
        tamannoPantalla = pedirNum();
        System.out.println("Por favor introduzca el peso");
        peso = pedirNum();
        
        Portatil portatil1 = new Portatil(memoriaRAM, capacidadHDD, modeloCPU, modeloGPU, precio, marca, tamannoPantalla, peso);

        System.out.println("------------------------------");
        System.out.println("Segundo portátil");
        System.out.println("------------------------------");
        System.out.println("Introduzca la memoria RAM del portátil");
        memoriaRAM = pedirNum();
        System.out.println("Introduzca la capacidad del disco duro del portátil");
        while((capacidadHDD % 5) != 0){
            capacidadHDD = pedirNum();
        }
        modeloCPU = modeloProcesador();
        System.out.println("Por favor introduzca el modelo de la tarjeta gráfica");
        modeloGPU = pedirString();
        do{
            System.out.println("Por favor introduzca el precio del portátil");
            precio = pedirNum();
            if(precio <= 0){
                System.out.println("Error, introduzca un número mayor que 0");
            }
        } while (precio <= 0);
        System.out.println("Por favor introduzca la marca");
        marca = pedirString();
        System.out.println("Por favor introduzca el tamaño de la pantalla");
        tamannoPantalla = pedirNum();
        System.out.println("Por favor introduzca el peso");
        peso = pedirNum();
        
        Portatil portatil2 = new Portatil(memoriaRAM, capacidadHDD, modeloCPU, modeloGPU, precio, marca, tamannoPantalla, peso);

        crearServidor();
        crearPortatil();
        
        System.out.println("Servidor 1: " + servidor1.toString());
        System.out.println("Servidor 2: " + servidor2.toString());
        System.out.println("Portátil 1: " + portatil1.toString());
        System.out.println("Portátil 2: " + portatil2.toString());
        System.out.println("Servidor 3: " + servidor3.toString());
        System.out.println("Portátil 3: " + portatil3.toString());
    }
    
}
