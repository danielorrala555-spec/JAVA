package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		Calculadora c1 = new Calculadora();
		System.out.println("==============SUMAR==============");
		double cr;
		cr = c1.Sumar(6,9);
		System.out.println("resultado suma :"+ cr);
		
		System.out.println("==============RESTAR==============");
		int r2;
		r2 = c1.restar(8, 4);
		System.out.println("resultado resta :"+ r2);
		
		System.out.println("==============MULTIPLICAR==============");
		double m1;
		m1 = c1.Multiplicar(5, 7);
		System.out.println("resultado multiplicacion :"+ m1);
		
		System.out.println("==============DIVIDIR==============");
		double d1;
		d1 = c1.Diovidir(25, 5);
		System.out.println("resultado divicion :"+ d1);
		
		System.out.println("==============PROMEDIO==============");
		double p1;
		p1 =c1.Promedio(40, 20, 50);
		System.out.printf("resultado promedio : %.2f%n", p1);
		
		System.out.println("==============MENSAJE==============");
		
		Mensaje m2 = new Mensaje();
		m2.MostrarResultado();
		
		
		

	}

}
