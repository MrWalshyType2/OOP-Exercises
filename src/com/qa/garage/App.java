package com.qa.garage;

public class App {
	public static void main(String args[]) {
		Garage g = new Garage();
		
		g.addVehicle(new Car(1, 1995, 4, "BMW", "320D"));
		g.addVehicle(new Bicycle(2, 2, "Diamondback", "Crawler"));
		g.addVehicle(new Motorcycle(3, 4000, 2, "Kawasaki", "Ninja"));
		
		g.fixVehicles();
		g.printCurrentVehicles();
		
		g.removeVehicle(1);
		g.printCurrentVehicles();
		
		g.emptyGarage();
		g.printCurrentVehicles();
	}
}
