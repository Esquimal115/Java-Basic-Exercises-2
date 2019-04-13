package Ejercicio8;

import java.util.Scanner;

public class Arbitro {

    static Jugador jugador1;
    static Jugador jugador2;

    static int marcadorJugador = 0;
   static int marcadorCPU = 0;


    public static void resultado (){

        String jugada1 = jugador1.getJ1();
        String jugada2 = jugador2.getJ1();

       switch (jugada1){
           case "piedra":
               if (jugada2.equalsIgnoreCase("tijeras") ){
                   System.out.println("Gana el jugador 1");
                   marcadorJugador++;
               }else if (jugada2.equalsIgnoreCase("papel")){
                   System.out.println("Gana el jugador 2");
                   marcadorCPU++;
               }else{
                   System.out.println("Empate");
               }

               break;

           case "papel":
               if (jugada2.equalsIgnoreCase("piedra")){
                   System.out.println("Gana el jugador 1");
                   marcadorJugador++;
               }else if (jugada2.equalsIgnoreCase("tijeras")) {
                   System.out.println("Gana el jugador 2");
                   marcadorCPU++;
               }else{
                   System.out.println("Empate");
               }

               break;

           case "tijeras":
               if (jugada2.equalsIgnoreCase("papel")){
                   System.out.println("Gana el jugador 1");
                   marcadorJugador++;
               }else if (jugada2.equalsIgnoreCase("piedra")) {
                   System.out.println("Gana el jugador 2");
                   marcadorCPU++;
               }else{
                   System.out.println("Empate");
               }

               break;
       }

    }
}
