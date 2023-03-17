package pruebasAbstractas;

public class Cuadrado extends Figura {
    
protected int lado;

public Cuadrado(int lado) {
    this.lado = lado;
}

public double area() { 
    return lado*lado; 
}

public void mostrarNombre() {
System.out.println("La figura es un cuadrado");
} 





}
