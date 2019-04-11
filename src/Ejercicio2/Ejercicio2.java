package Ejercicio2;

//Ejercicio sobre la media y la desviación típica

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;

public class Ejercicio2 {

    /* Variables privadas para el numero de numeros en la lista
    y para el rango de los numeros aleatorios */
    private static final int NUMS = 30;
    private static final int RANGO = 100;

    /* creaNumeros nos devuelve un array list de numeros enteros
    comprendidos entre el 0 y el 100 y hasta 3 decimales.*/

    public static ArrayList<Double> creaNumeros (){

        double n;
        ArrayList <Double> numeros = new ArrayList<>();

        for (int i = 0; i< NUMS; i++){

             n =  (Math.random()*RANGO);
             double aux = Math.round(n * 1000d)/1000d;
             numeros.add(aux);
        }
        return numeros;
    }

    /* En la función de media ponderada le pasamos un array de numeros
    como argumento y la función nos devolvera un double, que sera el resultado
     */

    public static double mediaPonderada (ArrayList <Double> nums){

        double res = 0;
        double resultado;

        for (int i = 0; i< nums.size(); i++){
            res += nums.get(i);
        }
        resultado = Math.round(res / nums.size() *1000d)/1000d;

        return resultado;
    }

    /* En la funcion para calcular la desviación tipica, recibe tambien
    un argumento que sera una lista de numeros y nos devolvera un double
    que será el resultado */

    public static double desviacion (ArrayList <Double> nums){

        double media = mediaPonderada(nums);
        double sumatorio = 0;

        for (int i = 0; i< nums.size(); i++){
            double aux = Math.pow((nums.get(i) - media), 2);
            sumatorio += aux;
        }
        double res = Math.sqrt(sumatorio/nums.size());
        double resultado = Math.round(res * 1000d) / 1000d;
        return resultado;
    }


    public static void main (String [] args){

        //Creamos una lista de numeros aleatorios
        System.out.println();
        ArrayList <Double> numeros;
        numeros = creaNumeros();
        System.out.println(numeros);

        /* La lista creada la pasamos como argumento a las funciones de mediaPonderada
        y a la de desviación típica para obtener los pertinentes resultados */

        double resMedia = mediaPonderada(numeros);
        System.out.println("La media ponderada es: " + resMedia);

        double resDesviacion = desviacion(numeros);
        System.out.println("La desviación típica es: " + resDesviacion);
    }
}
