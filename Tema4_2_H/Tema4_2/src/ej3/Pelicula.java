package ej3;

/**
 * 
 * 
 * @author Quique y Oscar
 * @Revisor Sergio Pavon
 * 
 * 
 */

public class Pelicula {

    private String titulo;
    private String director;
    private int duracion;
    private int numeroActores=0;
    private Actor[] Actores= new Actor[15];

    public Pelicula() {

        this.titulo = "sin definir";
        this.director = "Sin definir";
        this.duracion = 0;

    }

    public Pelicula(String titulo, String director, int duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;


    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {

        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void mostarPelicula() {
        System.out.println();
        System.out.println("------------------------");
        System.out.println("Titulo: " + titulo);
        System.out.println("Director: " + director);
        System.out.println("Duracion: " + duracion);
        System.out.println();
        System.out.println("------ACTORES/REPARTO-----");
        for (int i = 0; i < numeroActores; i++) {
            Actores[i].mostrarActor();
        }
    }

    public void agregarActor(Actor actor) {
        if (numeroActores < 15) {
            Actores[numeroActores] = actor;
            numeroActores++;
        } else {
            System.out.println("Error: no se pueden añadir más actores, solo se admiten 15.");
        }
    }

}
