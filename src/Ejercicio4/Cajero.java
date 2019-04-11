package Ejercicio4;

import java.util.Scanner;

public class Cajero {

    /**
     * @return void
     * @param le pasamos como paramentro el numero de euros que queremos que nos devuelva el cajero
     *
     */

    private static final int INICIALES = 100;

    private static int  cantMonedas1 = INICIALES, cantMonedas2 = INICIALES, cantMonedas10 = INICIALES,
            cantMonedas20 = INICIALES, cantMonedas50 = INICIALES;

    private static int monedas10 = 10;
    private static int monedas20 = 20;
    private static int monedas50 = 50;
    private static int monedas1 = 100;
    private static int monedas2 = 200;

    private static int contadorMonedas10, contadorMonedas20, contadorMonedas50= 0;
    private static int contadorMonedas1, contadorMonedas2 = 0;

    public static void Devolucion (double cantidad){

        double cantidadCent = cantidad *100;

        if (cantidad <= (double)(monedas1+monedas2+monedas10+monedas20+monedas50)){

            while (cantidadCent >= monedas2 && cantMonedas2 >0){
                cantidadCent -= monedas2;
                contadorMonedas2++;
                cantMonedas2--;
            }
            while (cantidadCent >= monedas1 && cantMonedas1 > 0){
                cantidadCent -= monedas1;
                contadorMonedas1++;
                cantMonedas1--;
            }
            while (cantidadCent >= monedas50 && cantMonedas50 > 0){
                cantidadCent -= monedas50;
                contadorMonedas50++;
                cantMonedas50--;
            }
            while (cantidadCent >= monedas20 && cantMonedas20 > 0){
                cantidadCent -= monedas20;
                contadorMonedas20++;
                cantMonedas20--;
            }
            while (cantidadCent >= monedas10 && cantMonedas10 > 0){
                cantidadCent -= monedas10;
                contadorMonedas10++;
                cantMonedas10--;
            }

        }else{
            System.out.println("\n ****** Error: No hay suficientes monedas ****** \n");
        }

        if (contadorMonedas2 != 0){
            System.out.println("Se han utilizado " + contadorMonedas2 + " de 2€");
        }
        if (contadorMonedas1 != 0){
            System.out.println("Se han utilizado " + contadorMonedas1 + " de 1€");
        }
        if (contadorMonedas50 != 0){
            System.out.println("Se han utilizado " + contadorMonedas50 + " de 50 cent.");
        }
        if (contadorMonedas20 != 0){
            System.out.println("Se han utilizado " + contadorMonedas20 + " de 20 cent.");
        }
        if (contadorMonedas10 != 0){
            System.out.println("Se han utilizado " + contadorMonedas10 + " de 10 cent.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Indique la cantidad en euros (hasta 1 decimal) -> ");
        double cambio = sc.nextDouble();
        Devolucion(cambio);
    }

}
