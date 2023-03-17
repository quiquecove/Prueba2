package ej3ConOscar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el título de la película:");
        String titulo = scanner.nextLine();
        
        System.out.println("Ingrese el nombre del director:");
        String director = scanner.nextLine();
        
        System.out.println("Ingrese la duración de la película en minutos:");
        int duracion = scanner.nextInt();
        scanner.nextLine(); // consumir el salto de línea
        
        Pelicula pelicula = new Pelicula(titulo, director, duracion);
        
        while (true) {
            System.out.println("Ingrese el nombre del actor (o 'fin' para terminar):");
            String nombre = scanner.nextLine();
            if (nombre.equalsIgnoreCase("fin")) {
                break;
            }
            
            System.out.println("Ingrese el año de nacimiento del actor:");
            int nacimiento = scanner.nextInt();
            scanner.nextLine(); // consumir el salto de línea
            
            Actor actor = new Actor(nombre, nacimiento);
            pelicula.agregarActor(actor);
        }
        
        pelicula.mostarPelicula();
        
        scanner.close();
    }
}

