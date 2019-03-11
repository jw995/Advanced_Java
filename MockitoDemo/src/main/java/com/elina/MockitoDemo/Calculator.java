package com.elina.MockitoDemo;

public class Calculator {
	
	private CalcService service;
	
	public Calculator(CalcService service) {
		this.service = service;
	}
	
	public int perform(int i, int j) {
		return service.add(i , j) * i;
	}

}
