package Ejercicio5;

public class Cancion {

    String titulo;
    String autor;

    // Constructores

    public Cancion (){
    }

    public Cancion (String tit, String aut){
        this.titulo = tit;
        this.autor = aut;
    }

    //Setters y getters

    public String getTitulo (){
        return this.titulo;
    }

    public String getAutor (){
        return this.autor;
    }

    public void setTitulo(String tit){
        this.titulo = tit;
    }

    public void setAutor (String aut){
        this.autor = aut;
    }

    // Clase main, con un pequeño ejemplo de ejecucion

    public static void main (String [] args){

        Cancion cancion1 = new Cancion("Master of Puppets", "Metallica");
        Cancion cancion2 = new Cancion("Second Heartbeat", "Avenged Sevenfold");
        Cancion cancion3 = new Cancion("Famous Last Words", "My Chemical Romance");
        Cancion cancion4 = new Cancion ();

        String titulo1 = cancion1.getTitulo();
        String artista1 = cancion1.getAutor();

        String titulo3 = cancion3.getTitulo();
        String artista3 = cancion3.getAutor();

        cancion4.setTitulo("Zombie");
        cancion4.setAutor("The Cramberries");

        String titulo4 = cancion4.getTitulo();
        String artista4 = cancion4.getAutor();

        System.out.println("La cancion 1 es: " + titulo1 + " del artista " + artista1 );
        System.out.println("La cancion 2 es: " + cancion2.getTitulo() + " del artista " + cancion2.getAutor() );
        System.out.println("La cancion 3 es: " + titulo3 + " del artista " + artista3 );
        System.out.println("La cancion 4 es: " + titulo4 + " del artista " + artista4);

    }
}
