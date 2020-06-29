package com.qa.garage;

public class Car extends Vehicle {

	public Car(int id, int cc, int wheels , String make, String model) {
		super(id, cc, wheels, make, model);
		this.setTypeCar();
	}

}
