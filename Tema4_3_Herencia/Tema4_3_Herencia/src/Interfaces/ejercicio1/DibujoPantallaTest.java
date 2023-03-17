package Interfaces.ejercicio1;

import java.util.Scanner;

public class DibujoPantallaTest {
    public static void main(String[] args) {
        Pantalla pantalla = new Pantalla();
        Scanner sc = new Scanner(System.in);
        int opcion = -1;

        while (opcion != 0) {
            System.out.println("Elige una opción:");
            System.out.println("1. Añadir figura");
            System.out.println("2. Modificar caracter de las figuras");
            System.out.println("3. Listar figuras");
            System.out.println("4. Calcular área de la pantalla");
            System.out.println("5. Mostrar pantalla");
            System.out.println("0. Salir");

            opcion = sc.nextInt();
            boolean bandera = true;
            while (bandera)
                // Menu
                System.out.println("¿Qué figura deseas añadir? (1 = Rectángulo, 2 = Triángulo)");
                int opcionFigura = sc.nextInt();
                switch (opcion) {
                    case 1:

                        if (opcionFigura == 1) {

                            System.out.println("Introduce el ancho del rectángulo:");
                            int ancho = sc.nextInt();

                            System.out.println("Introduce el alto del rectángulo:");
                            int alto = sc.nextInt();
                            System.out.println("Introduce el caracter para dibujar el rectángulo:");
                            char caracter = sc.next().charAt(0);

                            // caracter.setCaracter(sc.next());

                            Rectangulo rectangulo = new Rectangulo(ancho, alto, caracter);
                            pantalla.anade_Figura(rectangulo);
                            System.out.println("Rectángulo añadido correctamente.");
                        }

                    case 2:

                     if (opcionFigura == 2) {
                        System.out.println("Introduce el tamaño de un lado del triángulo equilátero:");
                        int lado = sc.nextInt();
                        System.out.println("Introduce el caracter para dibujar el triángulo:");
                        char caracter = sc.next().charAt(0);

                        Triangulo triangulo = new Triangulo(lado, null, caracter, sc);
                        pantalla.anade_Figura(triangulo);
                        System.out.println("Rectángulo añadido correctamente.");

                        }
    
                    }
                }
    }
}
