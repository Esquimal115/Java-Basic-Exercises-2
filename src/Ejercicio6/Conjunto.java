package Ejercicio6;

import java.util.ArrayList;
import java.util.Scanner;

public class Conjunto {

    static ArrayList <Object> listaInicial = new ArrayList<>();

    public Conjunto (ArrayList<Object> lista){
        listaInicial = lista;
    }

    public ArrayList<Object> interseccion (ArrayList<Object> lista){
        ArrayList <Object> resultado = new ArrayList<>();

        for (int i = 0; i< listaInicial.size(); i++){
            for (int j = 0; j< lista.size(); j++){

                if (listaInicial.get(i).equals(lista.get(j))){
                    resultado.add(listaInicial.get(i));
                }
            }
        }

        return resultado;
    }

    public ArrayList <Object> union (ArrayList<Object> lista){
        ArrayList <Object> resultado = new ArrayList<>();

        for (int i = 0; i< listaInicial.size(); i++){
            resultado.add(listaInicial.get(i));
        }

        for (int i = 0; i<listaInicial.size(); i++){
            for (int j = 0; j< lista.size(); j++){

                if (!resultado.contains(lista.get(j))){
                    resultado.add(lista.get(j));
                }
            }
        }
        return resultado;
    }

    public ArrayList <Object> diferencia (ArrayList <Object> lista){
        ArrayList <Object> resultado = new ArrayList<>();

        for (int i = 0; i< listaInicial.size(); i++){
            if (!lista.contains(listaInicial.get(i))){
                resultado.add(listaInicial.get(i));

            }
        }

       /* for (int i = 0; i< listaInicial.size(); i++){
            for (int j = 0; j< lista.size(); j++){

                if (!lista.contains(listaInicial.get(i))){
                    resultado.add(listaInicial.get(i));
                    break;
                }
            }
        }*/

        return resultado;

    }

    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);
        ArrayList<Object> conjuntoB = new ArrayList<>();
        ArrayList<Object> conjuntoA = new ArrayList<>();
        Conjunto conjunto = new Conjunto(conjuntoA);
        ArrayList<Object> res;

        System.out.println("Introduzca el conjunto A, exit para acabar");
        Object a = sc.next();

        while (!a.equals("exit")){
            conjuntoA.add(a);
            a = sc.next();
        }

        System.out.println("Introduzca el conjunto B. exit para acabar");

        a = sc.next();
        while (!a.equals("exit")){
            conjuntoB.add(a);
            a = sc.next();
        }

        res = conjunto.diferencia(conjuntoB);


        System.out.println("\nDiferencia");

       for (int i = 0; i<res.size(); i++){
           System.out.print(res.get(i)+ " ");
       }

        System.out.println("\n\nUnion");
        res = conjunto.union(conjuntoB);
        for (int i = 0; i<res.size(); i++){
            System.out.print(res.get(i)+ " ");
        }

        System.out.println("\n\nInterseccion");

        res = conjunto.interseccion(conjuntoB);
        for (int i = 0; i<res.size(); i++){
            System.out.print(res.get(i)+ " ");
        }
        System.out.println();
    }
}
