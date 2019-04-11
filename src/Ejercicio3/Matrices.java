package Ejercicio3;

import java.util.Scanner;

public class Matrices {

    //Ejercicio que realiza la multiplicación de 2 matrices

    private static Scanner sc = new Scanner(System.in);
   // private static int num;

    public static void multMatriz (){

        System.out.print("Numero filas 1ª matriz -> ");
        int f1 = sc.nextInt();
        System.out.print("Numero columnas 1ª matriz -> ");
        int c1 = sc.nextInt();
        System.out.print("Numero filas 2ª matriz -> ");
        int f2 = sc.nextInt();
        System.out.print("Numero columnas 2ª matriz -> ");
        int c2 = sc.nextInt();

        //Si el numero de columnas de la primera matriz no es igual
        //que el numero de filas de las segunda matriz no se puede hacer la operacion
        if (c1 != f2){
            System.out.println("No se puede realizar la multiplicación");
            System.exit(0);
        }else{


            //Creamos las matrices
            int matrix1 [][] = new int[f1][c1];
            int matrix2 [][] = new int[f2][c2];
            int matrixRes [][] = new int[f1][c2];

            //Datos 1ª matriz
            System.out.println("Datos para la primera matriz");
            System.out.println("========================");
            for (int i = 0; i<f1; i++){
                for (int j = 0; j<c1; j++){
                    System.out.print("Posicion " + "[" + i + "]" + "[" + j + "] -> ");
                    int num = sc.nextInt();
                    matrix1 [i][j] = num;

                }
            }

            System.out.println();
            //Datos 2ª matriz
            System.out.println("Datos para la segunda matriz");
            System.out.println("========================");
            for (int k = 0; k<f2; k++){
                for (int l = 0; l<c2; l++){
                    System.out.print("Posicion " + "[" + k + "]" + "[" + (l) + "] -> ");
                    int num = sc.nextInt();
                    matrix2 [k][l] = num;
                }
            }

            //Algoritmo multiplicación de matrices
            System.out.println();
            System.out.println("Solucion: ");
            System.out.println();
            for (int i = 0; i< f1; i++){
                for (int j = 0; j< c2; j++ ){
                    for (int k = 0; k< c1; k++){
                        matrixRes[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                    System.out.print(matrixRes[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    // Metodo main ()
    public static void main (String [] args){

        //Llamada al metodo de multiplicar matriz
        multMatriz();
    }
}
