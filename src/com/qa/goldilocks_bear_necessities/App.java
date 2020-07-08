package com.qa.goldilocks_bear_necessities;

public class App {
	public static void main(String args[]) {
		Goldilocks goldilocks = new Goldilocks();

		Chair c1 = new Chair(100, new Porridge(100), new Light(32));
		Chair c2 = new Chair(30, new Porridge(30), new Light(16));
		Chair c3 = new Chair(130, new Porridge(130), new Light(64));
		Chair c4 = new Chair(90, new Porridge(90), new Light(96));
		Chair c5 = new Chair(140, new Porridge(50), new Light(100));

		System.out.println(goldilocks.canSitAt(c1));
		System.out.println(goldilocks.canSitAt(c2));
		System.out.println(goldilocks.canSitAt(c3));
		System.out.println(goldilocks.canSitAt(c4));
		System.out.println(goldilocks.canSitAt(c5));

		goldilocks.printSittable();
	}
}
