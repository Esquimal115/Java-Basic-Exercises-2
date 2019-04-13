package Ejercicio8;

import static Ejercicio8.Arbitro.*;

public class Simulador {

    public static void main(String[] args) {

        for(int i = 0; i<5; i++){
            System.out.println("\n==================================");
            System.out.println("Partida " + (i+1));
            System.out.println("==================================");

            jugador1 = new Jugador();
            jugador2 = new Jugador();

            jugador1.jugar();
            String jug1 = jugador1.consultarJugada();
            System.out.println("Jugador 1: " + jug1);
            jugador1.imprimirJugada();

            jugador2.jugar();
            String jug2 = jugador2.consultarJugada();
            System.out.println("Jugador 2: " + jug2);
            jugador2.imprimirJugada();
            System.out.println();


            resultado();

        }

        if (marcadorJugador == marcadorCPU){
            System.out.println("\nEMPATE!!");

        }else if (marcadorJugador > marcadorCPU){
            System.out.println("\n¡¡¡ GANA EL JUGADOR 1 !!!");
        }else{
            System.out.println("\n¡¡¡ GANA EL JUGADOR 2 !!!");
        }

    }
}
