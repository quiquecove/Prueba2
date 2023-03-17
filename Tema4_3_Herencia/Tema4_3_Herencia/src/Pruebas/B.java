package Pruebas;

public class B extends A {
    

    protected int B=2;

    public void disparar(){

        System.out.println("pum");
    }

    public void metodoB(){

        System.out.println("Soy B");
    }

    public B(int a, int b) {
        super(a);
        B = b;
    }

    


}
