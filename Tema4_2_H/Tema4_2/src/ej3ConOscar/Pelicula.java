package ej3ConOscar;
public class Pelicula {
	private String titulo;
	private String director;
	private int duracion;
	private Actor[] actores;
	private int numeroActor;

	public Pelicula() {
		actores = new Actor[15];
		numeroActor = 0;
	}
	
	public Pelicula(String titulo, String director, int duracion) {
		this.titulo = titulo;
		this.director = director;
		this.duracion = duracion;
		actores = new Actor[15];
		numeroActor = 0;
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
		System.out.println("Titulo: " + titulo + ", Director: " + director + ", Duracion: " + duracion);
		System.out.println("------ACTORES-----");
		for (int i = 0; i < numeroActor; i++) {
			actores[i].mostrarActor();
		}
	}

	public void agregarActor(Actor actor) {
		if (numeroActor < 15) {
			actores[numeroActor] = actor;
			numeroActor++;
		} else {
			System.out.println("Error: no se pueden agregar más actores.");
		}
	}
}
