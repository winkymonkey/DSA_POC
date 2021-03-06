package org.example.dsa.bb_string.e_misc;

/**
 * ***************************************************************************************
 * Find the n’th term in Count-and-Say Sequence 
 * ***************************************************************************************
 * The first term is "1"
 * 
 * Second term is "11", generated by reading first term as "One 1"
 * 
 * Third term is "21", generated by reading second term as "Two 1"
 * 
 * Fourth term is "1211", generated by reading third term as "One 2 One 1"
 * 
 * and so on
 * 
 * ***************************************************************************************
 */

public class E02_countAndSaySequence {
	
	public static void main(String[] args) {
		String number = "1";
		int N = 9;
		
		for (int i=0; i<N; i++) {
			System.out.println(number);
			number = countAndSay(number.toCharArray());
		}
	}
	
	private static String countAndSay(char chars[]) {
		String result = "";
		int i = 0;
		
		while (i < chars.length) {
			int count = 1;
			while ((i+1 < chars.length) && (chars[i] == chars[i+1])) {
				i++;
				count++;
			}
			result += (String.valueOf(count) + chars[i]);
			i++;
		}
		return result;
	}
	
}
