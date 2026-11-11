package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		Calculadora c1 = new Calculadora();
		double cr;
		cr = c1.Sumar(6,9);
		System.out.println("resultado suma :"+ cr);
		
		int r2;
		r2 = c1.restar(8, 4);
		System.out.println("resultado resta :"+ r2);
		
		double m1;
		m1 = c1.Multiplicar(5, 7);
		System.out.println("resultado multiplicacion :"+ m1);
		
		double d1;
		d1 = c1.Diovidir(25, 5);
		System.out.println("resultado divicion :"+ d1);
		
		

	}

}
