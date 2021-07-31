package org.example.dsa.ff_string.g_misc;

/**
 * ***************************************************************************************
 * Convert a sentence into its equivalent mobile numeric keypad sequence
 * (consider all characters are in upper case)
 * ***************************************************************************************
 * Input:	INDIA
 * Output:	4446634442		//I=444, N=66, D=3, I=444, A=2
 * 
 * ***************************************************************************************
 */

public class G03_mobileKeypadSequence {
	/*
	 * For each character, pre-populate the sequence in an array
	 */
	
	public static void main(String[] args) {
		String str = "INDIA IS GREAT";
		System.out.println(findSequence(str));
	}
	
	
	private static String findSequence(String str) {
		String arr[] = { "2", "22", "222", "3", "33", "333", "4", "44", "444", "5", "55", "555", "6", "66", "666", 
						"7", "77", "777", "7777", "8", "88", "888", "9", "99", "999", "9999" };
		
		String output = "";
		int n = str.length();
		
		for (int i=0; i<n; i++) {
			if (str.charAt(i) == ' ') {
				output = output + "0";
			}
			else {
				int position = str.charAt(i) - 'A';		//considering all characters are in upper case
				output = output + arr[position];
			}
		}
		return output;
	}
	
}
