package com.krakedev;

public class TestCudrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cuadrado c1 = new Cuadrado();
		c1.lado = 17;
		
		 double perimetroCuadrado = c1.CalculaPerimetro();
		 double areaCuadrado= c1.CalcularArea();
		 System.out.println(" ======================perimetra 1==================== ");
		 System.out.println("el pereimetro del cuadrado es :" + perimetroCuadrado);
		 System.out.println(" ======================srea 1==================== ");
		 System.out.println("el ara del cuadrado es :" + areaCuadrado);

		 Cuadrado c2 = new Cuadrado();
			c2.lado = 15;
			
			 double perimetroCuadrado2 = c2.CalculaPerimetro();
			 double areaCuadrado2= c2.CalcularArea();
			 System.out.println(" ======================perimetra 2==================== ");
			 System.out.println("el pereimetro del cuadrado es :" + perimetroCuadrado2);
			 System.out.println(" ======================srea 2==================== ");
			 System.out.println("el ara del cuadrado es :" + areaCuadrado2);
		 
		 Cuadrado c3 = new Cuadrado();
				c3.lado = 5;
				
			 double perimetroCuadrado3 = c3.CalculaPerimetro();
			 double areaCuadrado3= c3.CalcularArea();				 
			 System.out.println(" ======================perimetra 3==================== ");
			 System.out.println("el pereimetro del cuadrado es :" + perimetroCuadrado3);
			 System.out.println(" ======================srea 3==================== ");
			 System.out.println("el ara del cuadrado es :" + areaCuadrado3);

	}

}
