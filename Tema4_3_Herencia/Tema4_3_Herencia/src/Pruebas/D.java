package Pruebas;

public class D extends B{
    

    protected int D=4;
    public void metodoD(){

        System.out.println("Soy D");
    }
    
    public void disparar(){

        System.out.println("pum arco");
    }

        //ojito
    
        public void dispararOriginal(){

            super.disparar();
            
        }

        public D(int a, int b, int d) {
            super(a, b);
            D = d;
        }

 






        
}
