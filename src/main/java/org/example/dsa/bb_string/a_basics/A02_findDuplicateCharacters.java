package org.example.dsa.bb_string.a_basics;

import java.util.HashMap;
import java.util.Map;

/**
 * ***************************************************************************************
 * Find Duplicate characters in a string
 * ***************************************************************************************
 * Input:	banana
 * Output:	a n
 * 
 * Input:	apple
 * Output:	p
 * 
 * ***************************************************************************************
 */

public class A02_findDuplicateCharacters {
	/*
	 * -----------------
	 * ---USE HASHING---
	 * -----------------
	 * traverse the characters of the string
	 * and keep a count of each visited characters in a Hash
	 * at the end, print the characters for which the count is more than 1
	 * 
	 * TIME --- O(n)
	 * SPACE -- O(n)
	 * 
	 * 
	 * --------------------
	 * ---BIT OPERATIONS---
	 * --------------------
	 * Instead of using a hash we can use an integer REFERENCE and leverage the bit positions like hash.
	 * An integer contains 32 bit. So it can be considered as a bit array of size 32.
	 * 
	 * Now we can represent each characters in the string with its position in alphabets like below
	 * 		a ---- 0
	 * 		b ---- 1
	 * 		c ---- 2
	 * 		d ---- 3
	 * 		.....
	 * 		..... 
	 * So "banana" becomes ----- [1, 0, 13, 0, 13, 0]
	 * To achieve this, when we traverse each chars of the string, we can subtract 'a' from it.
	 * Hence
	 * 		b = b - 'a' = 1
	 * 		a = a - 'a' = 0
	 * 		n = n - 'a' = 13
	 * 		a = a - 'a' = 0
	 * 		n = n - 'a' = 13
	 * 		n = n - 'a' = 13
	 * 		a = a - 'a' = 0
	 * 
	 * Now, traverse each chars of the string, we check if that bit is set in the reference variable
	 * 	- if yes, then it's a duplicate
	 * 	- if no, we set this bit and proceed to next character
	 * 
	 * 
	 * TIME --- O(n)
	 * SPACE -- O(1)
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		String str = "kolkatao";
		
		findDuplicate_usingHash(str);
		findDuplicate_usingBitOperation(str);
	}
	
	
	private static void findDuplicate_usingHash(String str) {
		Map<Character, Integer> map = new HashMap<>();
		
		for (char ch : str.toCharArray()) {
			if (map.containsKey(ch))
				map.put(ch, map.get(ch)+1);
			else
				map.put(ch, 1);
		}
		
		for (Character ch : map.keySet()) {
			if (map.get(ch) > 1)
				System.out.println(ch);
		}
	}
	
	
	private static void findDuplicate_usingBitOperation(String str) {
		int reference = 0;							//An integer to store presence/absence of 26 characters using its 32 bits.
		for (int i=0; i< str.length(); i++) {
			int k = str.charAt(i) - 'a';
			
			if ((reference & (1 << k)) > 0)	{		//If k'th bit is set in Reference
				System.out.println(str.charAt(i));
			}
			else {
				reference = reference | (1 << k);	//Set k'th bit in Reference
			}
		}
	}
	
}
