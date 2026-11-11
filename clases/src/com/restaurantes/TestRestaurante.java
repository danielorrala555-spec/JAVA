package com.restaurantes;

public class TestRestaurante {

	public static void main(String[] args) {
		Restaurante v;
		v = new Restaurante();
		System.out.println("=========Restaurante 1 creado=======");
		System.out.println("nombre :"+v.nombre);
		System.out.println("direccione :"+v.direccion);
		System.out.println("calificacion :"+v.calificacion);
		
		System.out.println("=========Restaurante 2 creado=======");
		System.out.println("nombre :"+v.nombre);
		System.out.println("direccione :"+v.direccion);
		System.out.println("calificacion :"+v.calificacion);
		
		v.nombre="pollo campero";
		v.direccion="avenida 8 de octubre";
		v.calificacion=9.00f;
	
		
		System.out.println("=========Restaurante 1 asignado=======");
		System.out.println("nombre :"+v.nombre);
		System.out.println("direccione :"+v.direccion);
		System.out.println("calificacion :"+v.calificacion);
		
		
		v.nombre="rukito";
		v.direccion="diagonal mol del sol";
		v.calificacion=9.5f;
	
		
		System.out.println("=========Restaurante 2 asignado=======");
		System.out.println("nombre :"+v.nombre);
		System.out.println("direccione :"+v.direccion);
		System.out.println("calificacion :"+v.calificacion);
		
		
	}

}
