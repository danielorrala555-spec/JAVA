package com.platos;

public class TestPlato {

	public static void main(String[] args) {
		Plato p;
		p = new Plato();
		System.out.println("=============plato A creado============");
		System.out.println("nombre: "+p.nombre);
		System.out.println("tipo: "+p.tipo);
		System.out.println("Precio: "+p.Precio);
		System.out.println("disponible: "+p.disponible);
		
		
		System.out.println("=============plato B creado============");
		System.out.println("nombre: "+p.nombre);
		System.out.println("tipo: "+p.tipo);
		System.out.println("Precio: "+p.Precio);
		System.out.println("disponible: "+p.disponible);

		
		
		System.out.println("=============plato C creado============");
		System.out.println("nombre: "+p.nombre);
		System.out.println("tipo: "+p.tipo);
		System.out.println("Precio: "+p.Precio);
		System.out.println("disponible: "+p.disponible);
		
		p.nombre="Ceviche de camarón";
		p.tipo="plato fuerte";
		p.Precio=5.50f;
		p.disponible =true;
		
		
		System.out.println("=============plato A valor asignado============");
		System.out.println("nombre: "+p.nombre);
		System.out.println("tipo: "+p.tipo);
		System.out.println("Precio: "+p.Precio);
		if(p.disponible) {
		System.out.println("disponible: si ");
		}else{
		System.out.println("disponible: no ");
		}
		
		
		p.nombre="Patacones";
		p.tipo="entrada";
		p.Precio=2.50f;
		p.disponible =false;
		
		System.out.println("=============plato B valor asignado============");
		System.out.println("nombre: "+p.nombre);
		System.out.println("tipo: "+p.tipo);
		System.out.println("Precio: "+p.Precio);
		if(p.disponible) {
			System.out.println("disponible: si ");
		}else{
			System.out.println("disponible: no ");
		}

		
		p.nombre="helado de fresa mora";
		p.tipo="postre";
		p.Precio=3.50f;
		p.disponible =true;
		
		System.out.println("=============plato C valor asignado============");
		System.out.println("nombre: "+p.nombre);
		System.out.println("tipo: "+p.tipo);
		System.out.println("Precio: "+p.Precio);
		if(p.disponible) {
			System.out.println("disponible: si ");
		}else{
			System.out.println("disponible: no ");
		}

	}

}
