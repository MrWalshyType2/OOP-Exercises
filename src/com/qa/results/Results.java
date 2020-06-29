package com.qa.results;

public class Results {
	private int physics, chemistry, biology, total;
	private int passPercent = 60;
	private int marksPerExam = 150;
	private double percentage;
	// formula: percent_of_num = (percentage_wanted / 100) * total_num
	private double examPassMark = ((double)passPercent / 100) * marksPerExam;;
	
	public Results(int physics, int chemistry, int biology) {
		this.physics = physics;
		this.chemistry = chemistry;
		this.biology = biology;
		this.total = physics + chemistry + biology;
		this.percentage = (this.total * 100) / 450;
//		this.examPassMark = setExamPassMark();
	}
	
	public void displayResults() {
		System.out.println(" ---------------------");
		System.out.println("| EXAM RESULTS     ");
		System.out.println(" ---------------------");
		System.out.printf("| PHYSICS    : %d/150\n", this.physics);
		System.out.printf("| CHEMISTRY  : %d/150\n", this.chemistry);
		System.out.printf("| BIOLOGY    : %d/150\n", this.biology);
		System.out.println(" ---------------------");
		System.out.printf("| TOTAL      : %d/450\n", this.total);
		System.out.println(" ---------------------");
	}
	
	public void displayPercentage() {
		if (this.percentage < passPercent || physics < examPassMark
			|| chemistry < examPassMark || biology < examPassMark) {
			int examsFailed = 0;
			if (physics < examPassMark) {examsFailed++;};
			if (chemistry < examPassMark) {examsFailed++;};
			if (biology < examPassMark) {examsFailed++;};
			System.out.println(" ---------------------");
			System.out.printf(" EXAM FAILED: %d\n", examsFailed);
			System.out.println(" ---------------------");
		} else {
			System.out.println(" ---------------------");
			System.out.printf("| PERCENTAGE : %f\n", this.percentage);
			System.out.println(" ---------------------");
		}
	}
}
