package Ejercicio7;

import java.util.Scanner;

public class Calculadora {


    private static long Calcula (String signo, long operando1, long operando2){

        long resultado = 0;

        switch (signo){
            case "+":
                resultado = operando1 + operando2;
                break;

            case "-":
                resultado = operando1 - operando2;
                break;

            case "*":
                resultado = operando1 * operando2;
                break;

            case "/":
                try{
                    resultado = operando1 / operando2;
                }catch (Exception e){
                    System.out.println("\nFallo en la operacion: " + operando1 + signo + operando2);
                    System.out.println("El denominador NO puede ser 0");

                }
                break;

                default:
                    System.out.println(" \nSigno no válido");
                    System.exit(1);
                    break;
        }

        return resultado;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String op1, signo, op2;

        do {
            System.out.print("Iniserte el primer numero -> ");
            op1 = sc.next();


            System.out.print("Inserte el signo de la operacion -> ");
            signo = sc.next();


            System.out.print("Inserte el segundo numero -> ");
            op2 = sc.next();

            if(!op1.equalsIgnoreCase("Z") && !signo.equalsIgnoreCase("Z") && !op2.equalsIgnoreCase("Z")){

                try{
                    long resultado;
                    long operacion1 = Long.parseLong(op1);
                    long operacion2 = Long.parseLong(op2);

                    resultado = Calcula(signo, operacion1, operacion2);
                    System.out.println(resultado);
                    System.out.println("\n");
                }catch (Exception e){
                    System.out.println("\nValor no válido\n");
                }

            }

        }while (!op1.equals("Z") && !signo.equals("Z") && !op2.equals("Z"));

    }
}
