package com.example.design_patterns.b_structural.facade.facade;


import com.example.design_patterns.b_structural.facade.api.AvionAPI;
import com.example.design_patterns.b_structural.facade.api.HotelAPI;

public class CheckFacade {

	private AvionAPI avionAPI;
	private HotelAPI hotelAPI;
	
	public CheckFacade() {
		avionAPI = new AvionAPI();
		hotelAPI = new HotelAPI();
	}
	
	public void buscar(String fechaIda, String fechaVuelta, String origen, String destino) {
		avionAPI.buscarVuelos(fechaIda, fechaVuelta, origen, destino);
		hotelAPI.buscarHoteles(fechaIda, fechaVuelta, origen, destino);
	}		
}
