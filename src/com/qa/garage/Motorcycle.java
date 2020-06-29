package com.qa.garage;

public class Motorcycle extends Vehicle {

	public Motorcycle(int id, int cc, int wheels, String make, String model) {
		super(id, cc, wheels, make, model);
		this.setTypeMotorcycle();
	}
	
}
