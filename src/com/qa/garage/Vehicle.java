package com.qa.garage;

public abstract class Vehicle {
	private int id;
	private int cc; // cubic capacity
	private int wheels;
	private String type;
	private String make;
	private String model;
	private double bill;
	
	public Vehicle(int id, int cc, int wheels, String make, String model) {
		this.id = id;
		this.cc = cc;
		this.wheels = wheels;
		this.make = make;
		this.model = model;
	}
	
	public Vehicle(int id, int wheels, String make, String model) {
		this.id = id;
		this.wheels = wheels;
		this.make = make;
		this.model = model;
	}
	
	@Override
	public String toString() {
		return "Vehicle ID: " + this.getId() +
				"\nVehicle Type: " + this.getType() +
				"\nBill: " + this.getBill();
	}
	
	public void setBill(double amt) {
		this.bill = amt;
	}
	
	public void setTypeCar() {
		this.type = "Car";
	}
	
	public void setTypeMotorcycle() {
		this.type = "Motorcycle";
	}
	
	public void setTypeBicycle() {
		this.type = "Bicycle";
	}
	
	public int getWheels() {
		return this.wheels;
	}
	
	public int getCC() {
		return this.cc;
	}
	
	public int getId() {
		return this.id;
	}
	
	public double getBill() {
		return this.bill;
	}
	
	public String getType() {
		return this.type;
	}
}
