package ej3Composicion;

import java.util.*;
/**
 * @Autor Quique y Oscar
 */
public class Libro {

    private String Titulo;
    private long Isbn;
    private String Autor;
    private int AñoPublicacion;

    private ArrayList<Pagina> Paginas;

    private int NumPags;
    private String Edicion;

    public String getEdicion() {
        return Edicion;
    }

    public void setEdicion(String Edicion) {
        this.Edicion = Edicion;
    }

    public Libro(String Titulo, long Isbn, String Autor, int AñoPublicacion, int NumPags) {
        this.Titulo = Titulo;
        this.Isbn = Isbn;
        this.Autor = Autor;
        this.AñoPublicacion = AñoPublicacion;
        this.Paginas = new ArrayList<Pagina>();
        this.Edicion = "1";
        this.NumPags = NumPags;
    }

    public void añadirPags(String contenido, int num) {

        // Pagina PaginasQuijote=new Pagina("en un lugar de la mancha",1);
        // new ArrayList<Pagina>();

        Paginas.add(new Pagina(contenido, num));

    }

    public void mostrarLibro() {

        System.out.println("Descripcion del libro: ");
        System.out.println("Autor: " + this.Autor);
        System.out.println("Isbn: " + this.Isbn);
        System.out.println("Numero de Paginas: " + this.NumPags);
        System.out.println("Contenido: ");
        int nump = 1;

        for (Pagina pag : Paginas) {

            System.out.println("Pagina " + nump + ": ");
            System.out.println(pag.toString());
            System.out.println();// espacio en blanco para separar
            nump++;
        }

    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public long getIsbn() {
        return Isbn;
    }

    public void setIsbn(long Isbn) {
        this.Isbn = Isbn;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getAñoPublicacion() {
        return AñoPublicacion;
    }

    public void setAñoPublicacion(int AñoPublicacion) {
        this.AñoPublicacion = AñoPublicacion;
    }

    public int getNumpags() {
        return NumPags;
    }

    public void setNumpags(int NumPags) {
        this.NumPags = NumPags;
    }

}
