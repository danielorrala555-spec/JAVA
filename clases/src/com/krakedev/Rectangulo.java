package com.krakedev;

public class Rectangulo {
	int Base;
	int Altura;
	
	int CalcularArea() {
		
		int area = Base * Altura;
		return area;
	}
	 double CalculaPerimetro() {
		 double perimetro = (Base *2 + Altura*2);
		 return perimetro;
		 
	 }

}
