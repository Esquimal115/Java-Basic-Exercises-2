package Ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void analizaString (String str){

        int tam = 0;
        int contA = 0, contE = 0, contI = 0, contO = 0, contU = 0, contVocales = 0;


        // Longitud del string incluido espacios
        if (str.isEmpty()){
            System.out.println("La longitud de la cadena es 0");
        }else{
            tam = str.length();
            System.out.println("El tamaño de la cadena es " + tam);
        }

        //Convertimos la cadena a minusculas
        String auxstr = str.toLowerCase();

        //Recorremos el string y comparamos cada caracter para ver
        //si corresponde con una vocal
        for (int i =0; i<tam; i++){
            if (auxstr.charAt(i) == 'a'){
                contA++;
            }
            else if (auxstr.charAt(i) == 'e'){
                contE++;
            }
            else if (auxstr.charAt(i) == 'i'){
                contI++;
            }
            else if (auxstr.charAt(i) == 'o'){
                contO++;
            }
            else if (auxstr.charAt(i) == 'u') {
                contU++;
            }
        }

        //El numero de vocales es la suma de cada contador
        contVocales = contA + contE + contI + contO + contU;
        System.out.println("El numero total de vocales usadas es: " + contVocales);
        System.out.println("");
        //Imprimimos por pantalla el numero de cada vocal
        System.out.println("El numero total de 'a' es: " + contA);
        System.out.println("El numero total de 'e' es: " + contE);
        System.out.println("El numero total de 'i' es: " + contI);
        System.out.println("El numero total de 'o' es: " + contO);
        System.out.println("El numero total de 'u' es: " + contU);

    }

    public static void main (String [] args){

        System.out.println("Introduzca una cadena de caracteres:");
        Scanner sc = new Scanner(System.in);
        String cadena = sc.next();

        analizaString(cadena);
    }


}
