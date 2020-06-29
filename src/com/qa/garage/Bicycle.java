package com.qa.garage;

public class Bicycle extends Vehicle {

	public Bicycle(int id, int wheels, String make, String model) {
		super(id, wheels, make, model);
		this.setTypeBicycle();
	}
	
}
