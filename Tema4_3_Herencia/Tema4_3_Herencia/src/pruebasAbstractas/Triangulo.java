package pruebasAbstractas;

public class Triangulo extends Figura {
    
protected int base;
protected int altura;

public Triangulo(int base, int altura) {
    this.base = base;
    this.altura = altura;
}


public double area() { 
    return base*altura/2; 
}

public void mostrarNombre() {
System.out.println("La figura es un triángulo");
} 

}
