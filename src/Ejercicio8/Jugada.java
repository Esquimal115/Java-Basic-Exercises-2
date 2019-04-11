package Ejercicio8;

public class Jugada {


    private String piedra;
    private String papel;
    private String tijeras;

    private String piedraCPU;
    private String papelCPU;
    private String tijerasCPU;


    public Jugada (String jugada){

        if (jugada.equalsIgnoreCase("piedra")){
            this.piedra = jugada;
        }else if (jugada.equalsIgnoreCase("papel")){
            this.papel = jugada;
        }else if (jugada.equalsIgnoreCase("tijeras")){
            this.tijeras = jugada;
        }else{
            System.out.println("Elige un arma correcta: piedra, papel o tijeras");
        }
    }


    public String getTipoJugada (){
        if (piedra != null){
            return piedra;
        }else if (papel != null){
            return papel;
        }else{
            return tijeras;
        }
    }

    public static Jugada generarJugada(){

        int random = Math.round((float) Math.random() * 2);

        if (random == 0){
            Jugada piedra = new Jugada("piedra");
           // this.piedra = "piedra";
            return piedra;
        }else if (random == 1){
            Jugada papel = new Jugada("papel");
          //  this.papel = "papel";
            return papel;
        }else{
            Jugada tijeras = new Jugada("tijeras");
          //  this.tijeras = "tijeras";
            return tijeras;
        }

    }

}
