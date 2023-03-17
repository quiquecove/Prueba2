package Tarea1;

/**
 * @author Quique
 */
public class Test {
    public static void main(String[] args) {
        // Coche.masCoche();
        Coche damcar = new Coche(4, 0, 60);
        damcar.acelerar(100);
        System.out.println();
        damcar.consumir(20);
        damcar.frenar(40);
        System.out.println();
        System.out.println("Combustible restante: " + damcar.getCombustible() + " litros");
        System.out.println();
        damcar.acelerar(30);
        damcar.consumir(10);
        damcar.frenar(90);
        System.out.println();
        damcar.repostar(20);
        System.out.println();
        System.out.println("Combustible restante: " + damcar.getCombustible() + " litros");

    }

}
