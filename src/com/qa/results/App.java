package com.qa.results;

public class App {
	public static void main(String args[]) {
		Results totalFailuresResults = new Results(30, 20, 5);
		Results failedPhysics = new Results(89, 150, 150);
		Results failedChemistry = new Results(150, 89, 150);
		Results failedBiology = new Results(150, 150, 89);

		totalFailuresResults.displayPercentage(); // EXAMS FAILED: 3
		totalFailuresResults.displayResults();
		
		failedPhysics.displayPercentage(); // EXAMS FAILED: 1
		failedPhysics.displayResults();
		
		failedChemistry.displayPercentage(); // EXAMS FAILED: 1
		failedChemistry.displayResults();
		
		failedBiology.displayPercentage(); // EXAMS FAILED: 1
		failedBiology.displayResults();
	}
	
}
