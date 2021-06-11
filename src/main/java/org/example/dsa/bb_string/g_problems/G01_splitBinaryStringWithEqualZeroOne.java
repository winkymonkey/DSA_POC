package org.example.dsa.bb_string.g_problems;

/**
 * ******************************************************************************
 * Split the binary string into substrings with equal number of 0s and 1s
 * ******************************************************************************
 * Input:	0100110101
 * Output:	4				// 01, 0011, 01, 01
 * 
 * Input:	0111100010
 * Output:	3				// 01, 111000, 10 
 * 
 * Input:	0000000000
 * Output:	-1
 * 
 * ******************************************************************************
 */

public class G01_splitBinaryStringWithEqualZeroOne {
	/*
	 * Traverse the string by each characters and keep track of the number of 0s and 1s so far
	 * Whenever the count of 0s and 1s become equal increment the count
	 * 
	 */
	
	public static void main(String[] args) {
		String str = "0100110101";
	    int n = str.length();
	    int count = divide(str, n);
	    System.out.println(count);
	}
	
	
	private static int divide(String str, int n) {
		int count0 = 0;
		int count1 = 0;
		int finalCount = 0;
		
		for (int i=0; i<n; i++) {
			if (str.charAt(i) == '0')
				count0++;
			else
				count1++;
			
			if (count0 == count1)
				finalCount++;
		}
		
		if (finalCount == 0)
			return -1;
		else
			return finalCount;
	}
	
}
