package ej3Composicion;

/**
 * @Autor Quique y Oscar
 */

public class Pagina {
    private String contenido;
    private int numero;

    public Pagina(String contenido, int numero) {
        this.contenido = contenido;
        this.numero = numero;
    }

    public String toString() {
        return this.contenido;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }


    
}
