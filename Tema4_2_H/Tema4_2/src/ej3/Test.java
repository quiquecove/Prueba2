package ej3;

import java.util.Scanner;
/**
 * 
 * 
 * @author Quique y Oscar
 * @Revisor Sergio Pavon
 * 
 * 
 */
public class Test {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        Scanner on = new Scanner(System.in);
        
        Pelicula pelicula = new Pelicula();
        
        System.out.println("Ingrese el título de la película:");
        String titulo = in.nextLine();
        pelicula.setTitulo(titulo);
        

        System.out.println("Ingrese el nombre del director:");
        String director = in.nextLine();
        pelicula.setDirector(director);

        System.out.println("Ingrese la duración de la película en minutos:");
        int duracion = on.nextInt();
        pelicula.setDuracion(duracion);
        System.out.println(); 
        
        boolean condicion = true;
        while (condicion) {
            System.out.println("Ingrese el nombre del actor (o 'fin' para terminar):");
            String nombre = in.nextLine();
            if (nombre.equalsIgnoreCase("fin")) {
                condicion = false;
            } else {

                System.out.println("Ingrese el año de nacimiento del actor:");
                int nacimiento = on.nextInt();
                System.out.println(); 

                Actor actor = new Actor(nombre, nacimiento);
                pelicula.agregarActor(actor);
            }
        }

        pelicula.mostarPelicula();

        in.close();
        on.close();
    }

}


