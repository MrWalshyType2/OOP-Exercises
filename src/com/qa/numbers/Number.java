package com.qa.numbers;

public class Number {
	private static String units[] = {"", "one", "two", "three", "four", "five", "six", "seven",
					  "eight", "nine"};
	private static String tens[] = {"", "", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy",
					 "eighty", "ninety"};
	private static String uniques[] = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen",
						"sixteen", "seventeen", "eighteen", "nineteen"};
	
	
	public static int sumDigitsInNum( int num ) {
		String strNum = Integer.toString(num);
		int sum = 0;
		
		if ( num < 10 || num > 99 ) { return 0; }
		
		// Num 32 would look like:
		// 32 % 10 = 2, sum += 2, sum is equal to 2
		// 32 / 10 = 3
		// 3 % 10 = 3 as 3 is left over, sum += 3 so:
		// sum = 2 + 3 = 5
		for ( int i = 0; i < strNum.length(); i++ ) {
			// Add leftover num from how many times ten goes into num (32 % 10 = 2) 
			sum = sum + (num % 10);
			// Divide num by 10 to get the next digit (from right to left)
			num = num / 10; // any (num < 10) % 10 is always the original num 
		}
		
		return sum;
	}
	
	public static String getString(int num) {
		StringBuilder sb = new StringBuilder();
		int numLength = Integer.toString(num).length();
		int[] numArray = new int[numLength];
		int numCopy = 0 + num;
		
		for (int i = numLength; i > 0; i--) {
			numArray[i - 1] = num % 10;
			num = num / 10;
		}
		
		for (int i = 0; i < numLength; i++) {
			System.out.println(numCopy);
			// thousands
			if (numCopy >= 1000) {
				sb.append(units[numArray[i]] + "-thousand ");
				numCopy /= 10;
			// hundreds above two hundred
			} else if (numCopy >= 100) {
				sb.append(units[numArray[i]] + "-hundred ");
				numCopy /= 10;
			// tens above twenty
			} else if (numCopy >= 20) {
				sb.append(tens[numArray[i]] + " ");
				numCopy /= 10;
			} else if (numCopy >= 10) {
				sb.append(uniques[numArray[i]] + " ");
				num /= 10;
			} else if (numArray[i - 1] == 0) {
				sb.append(units[numArray[i]]);
			}
			
		}
		
		String result = sb.toString();
		return result;
	}
}
