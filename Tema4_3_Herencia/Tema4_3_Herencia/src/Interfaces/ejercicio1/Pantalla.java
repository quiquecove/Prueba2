package Interfaces.ejercicio1;

import Interfaces.Figura;
import java.util.LinkedList;

/**
 * @Autor Quique
 */

public class Pantalla {

    LinkedList<Figura> lista = new LinkedList<>();

    public void anade_Figura(Figura fig) {

        lista.add(fig);

    }

    public void modifica_Figura(char c) {

        for (Figura fig : lista) {
            fig.setCaracter(c);
        }
    }

    public void lista_Figuras() {

        for (Figura figura : lista) {

            System.out.println(figura.toString());// get nombre

        }

    }

    public int area_Pantalla() {
        int total = 0;
        for (Figura figura : lista) {

            total += figura.Area();
        }
        return total;
    }

    public void muestra_Pantalla() {

        for (Figura figura : lista) {
            figura.Dibujar();
            System.out.println();
        }

    }
}
