package pruebasAbstractas;

public class Test {
    public static void main(String[] args) {
        
Cuadrado ej= new Cuadrado(10);
System.out.println(ej.area());
ej.mostrarNombre();
System.out.println();
Triangulo ej2=new Triangulo(5, 10);
System.out.println(ej2.area());
ej2.mostrarNombre();
    }
    
}
