package com.example.design_patterns.c_behavourial.observer.EXAMPLE_1;


import com.example.design_patterns.c_behavourial.observer.EXAMPLE_1.observer.PesoARGObservador;
import com.example.design_patterns.c_behavourial.observer.EXAMPLE_1.observer.PesoMXObservador;
import com.example.design_patterns.c_behavourial.observer.EXAMPLE_1.observer.SolObservador;
import com.example.design_patterns.c_behavourial.observer.EXAMPLE_1.observer.Subject;

public class App {

	public static void main(String[] args) {
		Subject subject = new Subject();

		new SolObservador(subject);
		new PesoARGObservador(subject);
		new PesoMXObservador(subject);
		
		System.out.println("Si desea cambiar 10 d�lares obtendr� : ");
		subject.setEstado(10);
		System.out.println("-----------------");
		System.out.println("Si desea cambiar 100 d�lares obtendr� : ");
		subject.setEstado(100);
	}
}
