package Repaso.actRepaso;

public class DNI {

    private String DNI;

    public DNI(String dni) {
        this.DNI = dni;
    }
    
    public void setValue(String dni) {
        this.DNI = dni;
    }
    
    public String getValue() {
        return DNI;
    }

    public boolean esCorrecto() {
        String caracteres = "TRWAGMYFPDXBNJZSQVHLCKE";
        int dniNumero = Integer.parseInt(DNI.substring(0, DNI.length() - 1));
        int resto = dniNumero % 23;
        return DNI.charAt(DNI.length() - 1) == caracteres.charAt(resto);
    }

}
