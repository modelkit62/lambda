package com.example.design_patterns.a_creational.singleton;

public class App {

	public static void main(String[] args) {
		// Instanciacion por constructor prohibido por ser "private"
		// Conexion c = new Conexion();
		// evito que existan nuevas instancias como: Conexion c_2 = new Conexion();
		Conexion c = Conexion.getInstancia();
		c.conectar();
		c.desconectar();

		boolean b = c instanceof Conexion;
		System.out.println(b);
	}

	/*Me conect� a la BD
	Me desconect� de la BD
	true*/

	//Otro ejemplo en: https://www.youtube.com/watch?v=qiFeiYLzIH8
	//Spring Framework gestiona sus beans como Singleton por defecto
}
