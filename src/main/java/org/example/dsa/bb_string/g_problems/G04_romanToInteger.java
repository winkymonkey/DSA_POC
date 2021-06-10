package org.example.dsa.bb_string.g_problems;

import java.util.HashMap;
import java.util.Map;

/**
 * ******************************************************************************
 * Roman Number to Integer
 * ******************************************************************************
 * Input:	VIII
 * Output:	8
 * 
 * Input:	XL
 * Output:	40
 * 
 * Input:	MCMIV
 * Output:	1904
 * 
 * ******************************************************************************
 */

public class G04_romanToInteger {
	/*
	 * Integer representation
	 * 		I = 1
	 * 		V = 5
	 * 		X = 10
	 * 		L = 50
	 * 		C = 100
	 * 		D = 500
	 * 		M = 1000
	 * 
	 * In Roman Number System, symbols are written in descending order (e.g. M's first, then D's etc)
	 * Rules:
	 * 		- upto three consecutive characters, the corresponding count increases
	 * 		- I can be placed before V to indicate 1 less		--- IV = 4 (1 less than 5)
	 * 		- I can be placed before X to indicate 1 less		--- IX = 9 (1 less than 10)
	 * 		- X can be placed before L to indicate 10 less		---	XL = 40 (10 less then 50)
	 * 		- X can be placed before C to indicate 10 less		---	XC = 90 (10 less then 100)
	 * 		- C can be placed before D to indicate 100 less		--- CD = 400 (100 less than 500)
	 * 		- C can be placed before M to indicate 100 less		--- CM = 900 (100 less than 1000)
	 * 
	 */
	
	public static void main(String args[]) {
		String str = "MCMIV";
		System.out.println(romanToDecimal(str));
		System.out.println(romanToDecimalNew(str));
	}
	
	private static int romanToDecimal(String str) {
		Map<Character, Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		
		int result = 0;
		
		for (int i=0; i<str.length()-1; i++) {
			int v1 = map.get(str.charAt(i));
			int v2 = map.get(str.charAt(i+1));
			
			if (v1 >= v2 ) {
				result = result + v1;
			}
			else {
				result = result - v1;
			}
		}
		
		result = result + map.get(str.charAt(str.length()-1));		//after the loop, the last character is still unprocessed		
		return result;
	}
	
	
	private static int romanToDecimalNew(String str) {
		str = str.replaceAll("IV", "IIII").replaceAll("IX", "VIIII")
				.replaceAll("XL", "XXXX").replaceAll("XC", "LXXXX")
				.replaceAll("CD", "CCCC").replaceAll("CM", "DCCCC");
		
		Map<Character, Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		
		int result = 0;
		
		for (int i=0; i<str.length(); i++) {
			int v1 = map.get(str.charAt(i));
			result = result + v1;
		}
		return result;
	}
}
