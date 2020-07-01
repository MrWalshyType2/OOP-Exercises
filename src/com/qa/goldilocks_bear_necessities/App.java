package com.qa.goldilocks_bear_necessities;

public class App {
	public static void main(String args[]) {
		Goldilocks goldilocks = new Goldilocks();
		
		Chair c1 = new Chair(100, 100);
		Chair c2 = new Chair(30, 30);
		Chair c3 = new Chair(130, 130);
		Chair c4 = new Chair(90, 90);
		
		System.out.println(goldilocks.canSitAt(c1));
		System.out.println(goldilocks.canSitAt(c2));
		System.out.println(goldilocks.canSitAt(c3));
		System.out.println(goldilocks.canSitAt(c4));
		
		goldilocks.printSittable();
	}
}
