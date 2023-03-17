package Repaso.actRepaso;

public class DNITest {
    public static void main(String[] args) {
        DNI x = new DNI("00243917N");
        if (x.esCorrecto())
            System.out.println("ES CORRECTO " + x.getValue());
        x.setValue("00243917W");
        if (x.esCorrecto())
            System.out.println("ES CORRECTO " + x.getValue());
    }
}
