package Bicicleta_aspirina;

import java.util.Scanner;

public class Humano {
    int saldo;
    int factura;

    public int getFactura() {
        return factura;
    }

    int dinero;

    public int setDinero(int dinero) {
        this.dinero = dinero;
        return dinero;

    }

    public int getDinero() {
        return dinero;
    }

    int edad;

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return this.edad;
    }

    boolean mirarBotiquin(Scanner in) {
        System.out.println("Voy a mirar al Botiquín");
        System.out.println("¿Hay aspirinas en el botiquin?");
        String hayasp = in.next();

        if (hayasp.equalsIgnoreCase("si")) {
            return true;

        } else

        {
            return false;
        }
    }

    public void ComprarAspirina() {
        System.out.println();
        System.out.println("Farmaceutica: ¿Qué desea?");
        System.out.println("Hijo: Quiero aspirinas");

    }

    void pagar(int cantidad) {

        System.out.println();

        int precio = 4;
        this.factura = cantidad * precio;

    }

    int saldo (){
        return this.saldo = dinero-factura;
    }


    

    boolean TomarPastillas(Scanner in) {
        System.out.println();
        System.out.println("Hijo: Ya estoy de vuelta, ¿Aun quieres las pastillas?");
        String resp = in.next();
        if (resp.equalsIgnoreCase("si")) {
            return true;

        } else {
            return false;
        }
    }

}
