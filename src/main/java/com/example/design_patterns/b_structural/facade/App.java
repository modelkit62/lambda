package com.example.design_patterns.b_structural.facade;

import com.example.design_patterns.b_structural.facade.facade.CheckFacade;

/* reducir a un solo punto el acceso a la complejidad de una app
*  Le digo solo buscar vuelo y me retorna una lista de hoteles tambien */
public class App {
	
	public static void main(String[] args) {
		CheckFacade cliente1 = new CheckFacade();
		cliente1.buscar("02/07/2018", "08/07/2018", "Lima", "Canc�n");
		
		CheckFacade cliente2 = new CheckFacade();
		cliente2.buscar("02/07/2018", "08/07/2018", "Lima", "Quito");
	}

}
