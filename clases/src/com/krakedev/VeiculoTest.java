package com.krakedev;

public class VeiculoTest {

	public static void main(String[] args) {
		Veiculo v;
		v = new Veiculo();
		System.out.println("=========veiculo 1 creado=======");
		System.out.println("veiculo "+ v.año);
		System.out.println("veiculo "+ v.marca);
		System.out.println("veiculo "+ v.modelo);
		
		
		System.out.println("=========veiculo 1 asignado=======");
		
		v.año = "2012";
		v.marca = "toyota";
		v.modelo = "yaris";
		
		System.out.println("veiculo "+ v.año);
		System.out.println("veiculo "+ v.marca);
		System.out.println("veiculo "+ v.modelo);


	}

}
