package com.qa.goldilocks_bear_necessities;

import java.util.ArrayList;
import java.util.List;

public class Goldilocks {
	private String name = "Goldilocks";
	private int goldilocks_weight = 50;
	private int goldilocks_max_tolerable_temp = 80;
	private List<Integer> sittable = new ArrayList<>();

	public Goldilocks() {

	}

	public boolean canSitAt(Chair chair) {
		if ((chair.getWeightCapacity() < this.goldilocks_weight)
				|| (chair.getPorridge().getPorridgeTemperature() > this.goldilocks_max_tolerable_temp)
				|| (chair.getLight().getLuminosity() < 70)) {
			return false;
		}
		this.sittable.add(chair.getId());
		return true;
	}

	public void printSittable() {
		for (int seat : sittable) {
			System.out.println("#" + Integer.toString(seat));
		}
	}
}
