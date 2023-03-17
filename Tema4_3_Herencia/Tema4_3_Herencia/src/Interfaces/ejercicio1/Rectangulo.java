package Interfaces.ejercicio1;

import Interfaces.Figura;


/**
 * 
 * @author HUGO RISCO
 *@revisor Daniel Guevara
 */

public class Rectangulo implements Figura{
	protected int base;
	protected int altura;
	protected char caracter;

	public Rectangulo(int base, int altura, char caracter) {
		// TODO Auto-generated constructor stub
		this.altura= altura;
		this.base= base;
		this.caracter= caracter;
		
	}
	@Override
	public String Nombre() {
		// TODO Auto-generated method stub
		return "soy un rectangulo";
	}

	@Override
	public void Dibujar() {
		// TODO Auto-generated method stub
		for (int i = 0; i < altura; i++) {
			for (int j = 0; j < base-1; j++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
		}
	

	@Override
	public int Area() {
		// TODO Auto-generated method stub
		return base*altura;
	}

	@Override
	public void setCaracter(char c) {
		// TODO Auto-generated method stub
		this.caracter=c;
	}

	@Override
	public char getCaracter() {
		// TODO Auto-generated method stub
		return caracter;
	}
	
	
	
	
	
	
	

}
