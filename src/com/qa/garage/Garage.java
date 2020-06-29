package com.qa.garage;

import java.util.ArrayList;
import java.util.List;

public class Garage implements CalcBill {
	private List<Vehicle> vehicles = new ArrayList<>();

	public void addVehicle(Vehicle vh) {
		vehicles.add(vh);
	}
	
	public void removeVehicle(Vehicle vh) {
		vehicles.remove(vh);
	}
	
	public void removeVehicle(List<Vehicle> vList) {
		for (Vehicle vh : vList) {
			vehicles.remove(vh);
		}
	}
	
	public void removeVehicle(int id) {
		for (Vehicle vh : vehicles) {
			if (vh.getId() == id) {
				vehicles.remove(vh);
				break;
			}
		}
	}
	
	public void removeVehicle(String type) {
		for (Vehicle vh : vehicles) {
			if (vh.getType() == type) {
				vehicles.remove(vh);
				break;
			}
		}
	}
	
	@Override
	public void calcBill() {
		for (Vehicle vh : vehicles) {
			if (vh instanceof Bicycle) {
				vh.setBill(vh.getWheels() * 7.50);
			} else {
				vh.setBill(vh.getWheels() * vh.getCC());
			}
		}
	}
	
	public void fixVehicles() {
		calcBill();
	}
	
	public void emptyGarage() {
		vehicles.clear();
	}
	
	public void printCurrentVehicles() {
		if (this.vehicles.size() != 0) {
			for (Vehicle vh : vehicles) {
				System.out.println(vh);
			}
		} else {
			System.out.println("No vehicles in garage!");
		}
	}

}
