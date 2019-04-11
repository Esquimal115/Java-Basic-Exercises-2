package Ejercicio8;

import static Ejercicio8.Arbitro.*;

public class Simulador {

    public static void main(String[] args) {

        for(int i = 0; i<5; i++){
            System.out.println("==================================");

            jugador1 = new Jugador();
            cpu = new Jugador();
            jugador1.jugar();
            cpu.jugar();

            jugador1.consultarJugada();
            jugador1.imprimirJugada();
            cpu.consultarJugadaAleatoria();
            cpu.imprimirJugadaAleatoria();
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
