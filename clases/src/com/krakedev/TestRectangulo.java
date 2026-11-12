package com.krakedev;

public class TestRectangulo {

	public static void main(String[] args) {
		Rectangulo r1 = new Rectangulo();
		
		r1.Altura = 13;
		r1.Base = 15;
		
		int ResultadoArea = r1.CalcularArea();
		
		System.out.println("resultado del area es :"+ResultadoArea);
		
		Rectangulo r2 = new Rectangulo();
		
		r2.Altura = 10;
		r2.Base = 8;
		
		int ResultadoArea2 = r2.CalcularArea();
		
		System.out.println("resultado 2 del area es :"+ ResultadoArea2);
		Rectangulo p1 =new Rectangulo();
		
		
		double  ResultadoPereimetro = r2.CalculaPerimetro();
		System.out.println("resultado 2 del perimtro es :"+ ResultadoPereimetro);
		
		
		

	}

}
