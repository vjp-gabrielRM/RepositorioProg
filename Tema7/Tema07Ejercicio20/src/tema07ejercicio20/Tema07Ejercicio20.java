/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema07ejercicio20;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Tema07Ejercicio20 {

    /**
     * Método que muestra el tablero de 3 en raya
     * @param tablero 
     */
    public static void mostrarTablero(char[][] tablero){
        System.out.println(" | 1 | 2 | 3 |");
        System.out.println("-+---+---+---+");
        for(int i = 0; i < tablero.length; i++){
            System.out.print((i+1) + "| ");
            for(int j = 0; j < tablero[i].length; j++){
                System.out.print(tablero[i][j] + " | ");
            }
            System.out.println("");
        }
        System.out.println("");
    }
    
    /**
     * Método que le pide la posición en la que colocar la X al usuario
     * @param tablero 
     */
    public static void pedirPosicion(char[][] tablero){
        int posH, posV;
        Scanner entrada = new Scanner(System.in);
        do{
            System.out.println("¿En qué coordenada vertical quieres colocar la X?");
            posV = entrada.nextInt();
            System.out.println("¿En qué coordenada horizontal quieres colocar la X?");
            posH = entrada.nextInt();
        }while(tablero[(posV-1)][(posH-1)] != ' ');
        tablero[(posV-1)][(posH-1)] = 'X';
        System.out.println("");
    }
    
    /**
     * Método que coloca la O en una posición libre aleatoria
     * @param tablero 
     */
    public static void turnoMaquina(char[][] tablero){
        int posH, posV;
        Scanner entrada = new Scanner(System.in);
        do{
            posV = (int) (Math.random() * (4 - 1) + 1);
            posH = (int) (Math.random() * (4 - 1) + 1);
        }while(tablero[(posV-1)][(posH-1)] != ' ');
        System.out.println("Colocando...\n");
        tablero[(posV-1)][(posH-1)] = 'O';
    }
    
    /**
     * Método que comprueba si alguno de los dos ha ganado
     * @param tablero
     * @return true si sí, false si no
     */
    public static boolean comprobarVictoria(char[][] tablero){
        boolean fin = false;
        char ganador = ' ';
        for(int cont = 0; cont < 3; cont++){
            for(int i = 0; i < tablero.length; i++){
                if(tablero[i][0] != ' ' && tablero[i][0] == tablero[i][1] && tablero[i][0] == tablero[i][2]){
                    fin = true;
                    ganador = tablero[i][0];
                }
                if(tablero[0][i] != ' ' && tablero[0][i] == tablero[1][i] && tablero[0][i] == tablero[2][i]){
                    fin = true;
                    ganador = tablero[0][i];
                }
                if(tablero[i][0] != ' ' && i == 0 && tablero[i][0] == tablero[i+1][1] && tablero[i][0] == tablero[i+2][2]){
                    fin = true;
                    ganador = tablero[i][0];
                }
                if(tablero[i][0] != ' ' && i == 2 && tablero[i][0] == tablero[i-1][1] && tablero[i][0] == tablero[i-2][2]){
                    fin = true;
                    ganador = tablero[i][0];
                }
            }
        }
        if(fin){
            System.out.println("Fin de la partida, " + ganador + " gana\n");
        }
        return fin;
    }
    
    /**
     * Método que comprueba si ha habido un empate
     * @param tablero
     * @return true si sí, false si no
     */
    public static boolean comprobarEmpate(char[][] tablero){
        boolean fin = false;
        for(int cont = 0; cont < 3; cont++){
            for(int i = 0; i < tablero.length; i++){
                if(tablero[i][0] != ' ' && tablero[i][0] == tablero[i][1] && tablero[i][0] == tablero[i][2]){
                    fin = true;
                }
                if(tablero[0][i] != ' ' && tablero[0][i] == tablero[1][i] && tablero[0][i] == tablero[2][i]){
                    fin = true;
                }
                if(tablero[i][0] != ' ' && i == 0 && tablero[i][0] == tablero[i+1][1] && tablero[i][0] == tablero[i+2][2]){
                    fin = true;
                }
                if(tablero[i][0] != ' ' && i == 2 && tablero[i][0] == tablero[i-1][1] && tablero[i][0] == tablero[i-2][2]){
                    fin = true;
                }
            }
        }
        if(!fin){
            System.out.println("Fin de la partida, empate\n");
        }
        return !fin;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char[][] tablero = { {' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '} };
        int turnos = 0;
        boolean fin = false;
        
        while(!fin){
            mostrarTablero(tablero);
            pedirPosicion(tablero);
            turnos++;
            
            if(turnos >= 5){
                fin = comprobarVictoria(tablero);
            }
            
            if(turnos == 9 && !fin){
                fin = comprobarEmpate(tablero);
            }
            
            if(turnos < 8 && !fin){
                mostrarTablero(tablero);
                turnoMaquina(tablero);
                turnos++;
            }
        }
            mostrarTablero(tablero);
    }
    
}
