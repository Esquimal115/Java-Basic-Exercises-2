package Ejercicio8;

public class Jugador {

    private static Jugada jugada1;
    private static Jugada jugadaAleatoria;
    private String j1;
    private String al1;

    public void jugar (){

        jugada1 = jugada1.generarJugada();
        jugadaAleatoria =  jugadaAleatoria.generarJugada();

    }


    public String consultarJugada (){

        j1 = jugada1.getTipoJugada();
        return j1;

    }

    public String consultarJugadaAleatoria (){
        al1 = jugadaAleatoria.getTipoJugada();
        return al1;
    }

    public  void imprimirJugada (){

        System.out.println("Jugador 1: " + j1);
    }

    public void imprimirJugadaAleatoria (){

        System.out.println("Jugador 2: " + al1);
    }
}
