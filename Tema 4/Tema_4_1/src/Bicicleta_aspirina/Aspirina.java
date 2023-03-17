package Bicicleta_aspirina;

import java.util.Scanner;

public class Aspirina {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Humano Hijo = new Humano();
        Humano Madre = new Humano();
        Humano Farmaceutica = new Humano();
        System.out.println("Cuantos años tiene la madre?");
        Madre.setEdad(in.nextInt());
        System.out.println("¿Cuantos años tiene el hijo?");
        Hijo.setEdad(in.nextInt());
        System.out.println("¿Cuanto dinero tiene el hijo? (Recuerde que las pastillas valen 4 euros)");
        Hijo.setDinero(in.nextInt());

        System.out.println("Una madre de " + Madre.getEdad() + " años tiene dolor de cabeza.");
        System.out.println("Por lo que le pregunta a su hijo de " + Hijo.getEdad() + " que le ayude");

        System.out.println("Madre: ¿Hijo, podrias traerme una aspirina? Por favor");

        if (Hijo.mirarBotiquin(in)) {
            System.out.println("Hijo: Aqui tienes madre, espero que te mejores");
            System.out.println("Madre: Gracias hijo, me encuentro un poco mejor");
        } else {

            System.out.println("Hijo: Mama, voy a ir a la farmacia a comprarte una aspirina");
            System.out.println("Madre: Vale hijo, muchas gracias, ¡Ten cuidado!");

            Farmaceutica.ComprarAspirina();
            System.out.println("Farmaceutica: ¿Cuantas?");
            Farmaceutica.pagar(in.nextInt());

            System.out.println("La cuenta es: "+Farmaceutica.getFactura());
           
           

            if (Hijo.saldo>=0) {
                System.out.println("Hijo: Perfecto, muchas gracias\n ¡Hasta luego!");
            } else{
                System.out.println(
                        "Farmaceutica: Lo siento, pero no tienes dinero suficiente dinero, igualmente, como tu madre está muy mal, te las regalo");

            }

            if (Madre.TomarPastillas(in)) {

                System.out.println("Madre: Gracias hijo, en un rato estaré mejor");

            } else {

                System.out.println("Madre: Muchas gracias hijo, pero en lo que has tardado ya se me ha pasasdo");
            }

        }
        System.out.println("FIN");
    }

}
