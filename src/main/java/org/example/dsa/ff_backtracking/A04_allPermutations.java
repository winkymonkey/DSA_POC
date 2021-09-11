package org.example.dsa.ff_backtracking;

/**
 * ***************************************************************************************
 * Find all permutations of a given string
 * ***************************************************************************************
 * Input:	abc
 * Output:	abc acb bac bca cba cab
 * 
 * ***************************************************************************************
 */

public class A04_allPermutations {
	/*
	 * --------------------
	 * ---NAIVE APPROACH---
	 * --------------------
	 * Initially, if the string has "n" characters, we can swap the 1st character with all "n" characters.
	 * E.g, for "ABCD", A can be swapped with A,B,C,D.... so combinations are ABCD,BACD,CBAD,DBCA
	 * 
	 * After this level, the 1st character is fixed.
	 * Now we will repeat the same process for remaining part of the string
	 * 
	 * Recursion tree:
	 * 
	 *                                   ABC
	 *                         ___________|____________
	 *                        /           |            \
	 *                     A,BC          B,AC         C,BA
	 *                    __|__         __|__         __|__
	 *                   /     \       /     \       /     \
	 *                 AB,C   AC,B   BA,C   BC,A   CB,A   CA,B
	 * 
	 * 
	 *                                   AAC
	 *                         ___________|____________
	 *                        /           |            \
	 *                     A,AC          A,AC         C,AA
	 *                    __|__         __|__         __|__
	 *                   /     \       /     \       /     \
	 *                 AA,C   AC,A   AA,C   AC,A   CA,A   CA,A
	 * 
	 * 
	 * 
	 * 
	 * TIME:  O(n*n!)			// there are n! combinations and it requires O(n) time to print a permutation
	 * SPACE: O(1)
	 * 
	 * 
	 * 
	 * ---------------------
	 * ---BETTER APPROACH---
	 * ---------------------
	 * The above solution does not consider duplicate characters in the input and prints duplicate combinations.
	 * We can improve the above solution.
	 * 
	 * Before swapping we just need to check ---- 
	 * 		If i-th element is not swapped with itself and still the characters are same, then no need to swap. 
	 * 		Otherwise do as usual.
	 * 
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {
		String str = "AAC";
		permute(str, 0, str.length()-1);
	}
	
	
	private static void permute(String str, int left, int right) {
		if (left == right) {
			System.out.print(str + " ");
		}
		else {
			for (int i = left; i <= right; i++) {
				if (i != left && str.charAt(left) == str.charAt(i)) {
					continue;
				}
				else {
					str = swap(str, left, i);					// swap
					permute(str, left+1, right);				// current call is for S[left...right] and this recursion call is for S[left+1...right]]
					str = swap(str, left, i);					// reverse swap
				}
			}
		}
	}
	
	
	public static String swap(String str, int i, int j) {
		char[] arr = str.toCharArray();
		char temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return String.valueOf(arr);
	}
		
}
