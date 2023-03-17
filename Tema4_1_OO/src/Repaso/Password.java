package Repaso;

public class Password {
    private String pwd;
    private int fallos;

    public Password(String pwd) {
        this.pwd = pwd;
        this.fallos = 0;
    }

    boolean login(String txt) {

        if (txt.equals(pwd)) {
            fallos = 0;
            return true;

        } else {
            fallos++;
            return false;
        }

    }

    public int getFallos() {
        return fallos;
    }

    // public void setFallos(int fallos) {
    //     this.fallos = fallos;
    // }

    public static void main(String[] args) {
        
        Password user1= new Password("123");
       System.out.println("Su acceso es "+user1.login("123"));
        
    }

}
