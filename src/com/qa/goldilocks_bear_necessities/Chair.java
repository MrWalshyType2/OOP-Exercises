package com.qa.goldilocks_bear_necessities;

public class Chair {
	private static int idCount = 1;
	private int id;
	private int weightCapacity;
	private int porridgeTemperature;
	
	public Chair() {
		this.id = idCount;
		idCount++;
	}
	
	public Chair(int weightCapacity, int porridgeTemperature) {
		this.id = idCount;
		this.weightCapacity = weightCapacity;
		this.porridgeTemperature = porridgeTemperature;
		idCount++;
	}

	public int getId() {
		return id;
	}

	public int getWeightCapacity() {
		return weightCapacity;
	}

	public void setWeightCapacity(int weightCapacity) {
		this.weightCapacity = weightCapacity;
	}

	public int getPorridgeTemperature() {
		return porridgeTemperature;
	}

	public void setPorridgeTemperature(int porridgeTemperature) {
		this.porridgeTemperature = porridgeTemperature;
	}
	
	
}
