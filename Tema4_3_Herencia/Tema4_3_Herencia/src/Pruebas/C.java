package Pruebas;

public class C extends B {

    protected int C = 3;

    public void metodoC() {

        System.out.println("Soy C");
    }

    public void disparar() {

        System.out.println("pum pistola");
    }

    // ojito

    public void dispararOriginal() {

        super.disparar();

    }

    public C(int a, int b, int c) {
        super(a, b);
        C = c;
    }

    public void prueba() {

        super.metodoA();
    }

}
