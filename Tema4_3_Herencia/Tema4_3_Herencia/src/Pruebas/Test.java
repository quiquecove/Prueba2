package Pruebas;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        A miA = new A(0);
        B miB = new B(0, 0);
        C miC = new C(0,0,0);
        D miD = new D(0,0,0);

        miA.metodoA();
        miB.metodoB();
        miC.metodoC();
        miD.metodoD();

        Scanner in = new Scanner(System.in);

        System.out.println("Indica la clase");
        String resp = in.next();
        // Object objeto;
        B objeto;
        if (resp.equalsIgnoreCase("C")) {
            objeto = new C(0, 0, 0);
        } else {
            objeto = new D(0, 0, 0);
        }

        // ((D) objeto).dispararOriginal();
        

        objeto.disparar();

        // cateo a C
        // ((C) objeto).metodoC();

        // objeto.metodoB();
        // Object objeto = new A();
        // Object objeto2 = new D();
    }
}
