package com.qa.goldilocks_bear_necessities;

public class Chair {
	private static int idCount = 1;
	private int id;
	private int weightCapacity;
	private Porridge porridge;
	private Light light;

	public Chair() {
		this.id = idCount;
		idCount++;
	}

	public Chair(int weightCapacity, Porridge porridge, Light light) {
		this.id = idCount;
		this.weightCapacity = weightCapacity;
		this.porridge = porridge;
		this.light = light;
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

	public Porridge getPorridge() {
		return porridge;
	}

	public void setPorridge(Porridge porridge) {
		this.porridge = porridge;
	}

	public Light getLight() {
		return light;
	}

	public void setLight(Light light) {
		this.light = light;
	}

}
