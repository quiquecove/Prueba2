package Interfaces.ejercicio1;

import Interfaces.Figura;

import java.util.Scanner;

public class Triangulo implements Figura {

    private int lado;
    private String tipo;
    private char caracter;
    Scanner sc = new Scanner(System.in);

    public String tipo() {

        if (caracter == 'A') {

            tipo = "A";

        }
        if (caracter == 'B') {

            tipo = "B";

        }
        if (caracter == 'C') {

            tipo = "C";

        } else if (caracter == 'D') {

            tipo = "D";

        }
        return tipo;

    }

    public void lado() {
        System.out.println("Introduce el lado del triangulo");
        lado = sc.nextInt();
    }

    public int Area() {

        return (lado * lado) / 2;
    }

    public void Dibujar() {

        if (caracter == 'A') {
            for (int i = 1; i <= lado; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        if (caracter == 'B') {
            for (int i = 0; i < lado; i++) {
                for (int j = 0; j < lado - i; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < i + 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        if (caracter == 'C') {
            for (int i = 1; i <= lado; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

        }
        if (caracter == 'D') {
            for (int i = 0; i < lado; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                for (int j = i; j < lado; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

    }

    public String Nombre() {

        return "Triangulo";
    }

    public void setCaracter(char c) {

        System.out.println("Introduce el caracter del triangulo");
        caracter = sc.next().charAt(c);

    }

    public char getCaracter() {

        return caracter;
    }

    public Triangulo(int lado, String tipo, char caracter, Scanner sc) {
        this.lado = lado;
        this.tipo = tipo;
        this.caracter = caracter;
        this.sc = sc;
    }

}
