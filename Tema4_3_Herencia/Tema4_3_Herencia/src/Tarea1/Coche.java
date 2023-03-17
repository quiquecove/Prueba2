package Tarea1;

/**
 * @author Quique
 */
public class Coche extends Vehiculos {

    protected int combustible;

    public Coche(int ruedas, int velocidad, int combustible) {
        super(ruedas, velocidad);
        this.combustible = combustible;

    }

    public Coche() {
        this(0, 0, 0);
    }

    public int getCombustible() {
        return combustible;
    }

    public void setCombustible(int combustible) {
        this.combustible = combustible;
    }

    public void repostar(int mas) {
        int comb2 = combustible + mas;
        if (comb2 <= 60) {
            combustible = comb2;
            System.out.println("Se ha repostado " + mas + " litros de combustible (Desde la clase hijo) ");
        } else {
            System.out.println("(Desde la clase hijo) No se puede repostar, el depósito está lleno.");
        }
        // System.out.println("(Desde la clase hijo) Combustible total: " + combustible);
    }

    public void consumir(int menos) {
        int comb2 = combustible - menos;
        if (comb2 >= 0) {
            combustible = comb2;
        } else {
            System.out.println("El depósito está vacío. (Desde la clase hijo) ");
        }
        System.out.println("Se ha consumido " + menos + " litros de combustible (Desde la clase hijo) ");
        // System.out.println("(Desde la clase hijo) Combustible restante: " + combustible);
    }

}
