package Repaso.actRepaso;

public class Primo {
    private int num;

    public Primo(int num) {
        this.num = num;
    }

    public void setValue(int num) {
        this.num = num;
    }

    public int getValue() {
        return num;
    }

    public boolean esPrimo() {

        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
