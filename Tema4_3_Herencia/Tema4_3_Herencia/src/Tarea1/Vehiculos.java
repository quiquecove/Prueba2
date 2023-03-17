package Tarea1;

// import java.util.ArrayList;

/**
 * @author Quique
 */
public class Vehiculos {
    protected int ruedas;
    protected int velocidad;

    // private static ArrayList<Coche> coches = new ArrayList<>();

    public Vehiculos(int ruedas, int velocidad) {
        this.ruedas = ruedas;
        this.velocidad = velocidad;
    }

    public Vehiculos() {
        this(0, 0);
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public void acelerar(int acl) {
        int aux = this.velocidad + acl;
        System.out.println("(Desde la clase padre) Acelerando a: " + aux);
        if (aux <= 120) {
            this.velocidad = aux;
            System.out.println("(Desde la clase padre) La velocidad actual es de: " + this.velocidad);
        } else {

            System.out.println("El vehículo ha sobrepasado el limite de velocidad (Desde el Padre)" + this.velocidad);
        }

    }

    public void frenar(int brake) {

        int aux = this.velocidad - brake;
        System.out.println("(Desde la clase padre) Frenando a: " + aux);
        if (aux > 0) {
            this.velocidad = aux;
            System.out.println("(Desde la clase padre) La velocidad actual es de: " + this.velocidad);

        } else {

            System.out.println("El vehículo está detenido (Desde el Padre)");
        }

    }

}
