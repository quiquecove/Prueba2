package Repaso.actRepaso;

public class DobleNumero {
    private int num;
    
    public DobleNumero(int num) {
        this.num = num;
    }
    
    public void setValue(int num) {
        this.num = num;
    }
    
    public int getValue() {
        return num * 2;
    }
}

