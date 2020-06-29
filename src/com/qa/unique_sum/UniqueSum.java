package com.qa.unique_sum;

public class UniqueSum {
	public static int getSum(int a, int b, int c) {
		int aTmp = a, bTmp = b, cTmp = c;
		if (a == b || a == c) { aTmp = 0; }		
		if (b == a || b == c) { bTmp = 0; }
		if (c == b || c == a) { cTmp = 0; }
		
		return aTmp + bTmp + cTmp;
	}
}
