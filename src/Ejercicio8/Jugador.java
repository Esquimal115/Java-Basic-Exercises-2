package Ejercicio8;

public class Jugador {

    private static Jugada jugada1;
    private String j1;

    public String getJ1 (){
        return this.j1;
    }


    public void jugar (){

        jugada1 = Jugada.generarJugada();

    }

    public String consultarJugada (){

        j1 = jugada1.getTipoJugada();
        return j1;

    }

    public String imprimirJugada (){

        return j1;
    }

}
