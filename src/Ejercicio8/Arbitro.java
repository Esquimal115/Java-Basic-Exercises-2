package Ejercicio8;

import java.util.Scanner;

public class Arbitro {

    static Jugador jugador1;
    static Jugador cpu;

    static int marcadorJugador = 0;
   static int marcadorCPU = 0;


    public static void resultado (){

        String jugadaAl = cpu.consultarJugadaAleatoria();

       switch (jugador1.consultarJugada()){
           case "piedra":
               if (jugadaAl.equalsIgnoreCase("tijeras") ){
                   System.out.println("Gana el jugador 1");
                   marcadorJugador++;
               }else if (jugadaAl.equalsIgnoreCase("papel")){
                   System.out.println("Gana el jugador 2");
                   marcadorCPU++;
               }else{
                   System.out.println("Empate");
               }

               break;

           case "papel":
               if (jugadaAl.equalsIgnoreCase("piedra")){
                   System.out.println("Gana el jugador 1");
                   marcadorJugador++;
               }else if (jugadaAl.equalsIgnoreCase("tijeras")) {
                   System.out.println("Gana el jugador 2");
                   marcadorCPU++;
               }else{
                   System.out.println("Empate");
               }

               break;

           case "tijeras":
               if (jugadaAl.equalsIgnoreCase("papel")){
                   System.out.println("Gana el jugador 1");
                   marcadorJugador++;
               }else if (jugadaAl.equalsIgnoreCase("piedra")) {
                   System.out.println("Gana el jugador 2");
                   marcadorCPU++;
               }else{
                   System.out.println("Empate");
               }

               break;
       }

    }
}
