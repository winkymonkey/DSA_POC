package org.example.dsa.bb_string.e_misc;

import java.util.Stack;

/**
 * ***************************************************************************************
 * Remove k digits to build lowest number
 * ***************************************************************************************
 */

public class E06_removeKdigitsToBuildLowestNumver {
	
	public static void main(String[] args) {
		System.out.println(removeKdigits("4325043", 3));		//2043
		System.out.println(removeKdigits("765028321", 5));		//221
		System.out.println(removeKdigits("425", 1));			//25
		System.out.println(removeKdigits("425", 4));			//0
		System.out.println(removeKdigits("0765028321", 4));		//2321
		
		System.out.println(removeKdigits2("4325043", 3));		//2043
		System.out.println(removeKdigits2("765028321", 5));		//221
		System.out.println(removeKdigits2("425", 1));			//25
		System.out.println(removeKdigits2("425", 4));			//0
		System.out.println(removeKdigits2("0765028321", 4));	//2321
	}
	
	
	/*
	 * --------------------
	 * Using O(n) extra space
	 * --------------------
	 */
	private static String removeKdigits(String num, int k) {
		if (k >= num.length())
			return "0";
		
		Stack<Character> stack = new Stack<>();

		for (char digit : num.toCharArray()) {
			while ((stack.size() > 0 && k > 0)  &&  digit < stack.peek()) {
				stack.pop();
				k--;
			}
			stack.push(digit);
		}

		// remove the leading zeros
		StringBuilder result = new StringBuilder();
		boolean isLeadingZero = true;
		for (char digit : stack) {
			if (isLeadingZero && digit == '0')
				continue;
			isLeadingZero = false;
			result.append(digit);
		}
		return result.toString();
	}
	
	
	/*
	 * --------------------
	 * Without extra space
	 * --------------------
	 */
	public static String removeKdigits2(String num, int k) {
		if (k >= num.length())
			return "0";

		StringBuilder sb = new StringBuilder(num);
		
		// in each iteration, remove the digit for which the next digit is smaller
		for (int i=0; i<k; i++) {
			int j = 0;
			while (j < sb.length()-1  &&  sb.charAt(j) <= sb.charAt(j+1)) {
				j++;
			}
			sb.delete(j, j+1);
		}
		
		// remove leading zeros
		while (sb.length() > 1  &&  sb.charAt(0) == '0')
			sb.delete(0, 1);

		if (sb.length() == 0) {
			return "0";
		}
		
		return sb.toString();
	}
	
}
