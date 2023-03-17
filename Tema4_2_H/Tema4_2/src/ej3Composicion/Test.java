package ej3Composicion;
import java.util.InputMismatchException;
/**
 * @Autor Quique y Oscar
 */
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        // libro quijote = new libro("Quijote", 01231234, "Cervantes", 1424, 3);
        Libro quijote = new Libro("", 0, "", 0, 0);
        quijote.setTitulo("Quijote");
        quijote.setIsbn(1232243);
        quijote.setAutor("Cervantes");
        quijote.setAñoPublicacion(1424);
        quijote.setNumpags(5);
        quijote.setEdicion("segunda");

        int cont = 0;
        Scanner in = new Scanner(System.in);
        Scanner on = new Scanner(System.in); //utilizo 2 scanner porque si no me da problemas, me pide todo el rato numeros
        //seguro que hay alguna solucion sencilla, pero para mi lo más rápido es usar 2 scanner, uno para el contenido y otro para
        //el numero de página.
        int num = 0;
        boolean validInput = true;
        while (cont < quijote.getNumpags() && num!=-1) {
            validInput = true;
            System.out.println("Escribe el contenido de la pagina");
            String contenido = in.nextLine();
            System.out.println("y el numero de pagina, ingrese ' -1 ' para finalizar");
            while (validInput) {
                try {
                    num = on.nextInt();
                    validInput = false;
                } catch (InputMismatchException e) {
                    System.out.println("Por favor, introduce un número entero válido.");
                    on.next(); // Para limpiar el buffer de entrada
              
                    validInput = true;
                }catch(Exception o){
                    System.out.println("Por favor, introduce un número entero válido.");
                    on.next(); 
              
                    validInput = true;

                }
            }
            quijote.añadirPags(contenido, num);
            cont++;
        }
        quijote.mostrarLibro();

        on.close();
        in.close();
    }
}
