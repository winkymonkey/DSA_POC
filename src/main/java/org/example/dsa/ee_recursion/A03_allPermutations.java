package org.example.dsa.ee_recursion;

/**
 * ***************************************************************************************
 * All Permutations
 * ***************************************************************************************
 * Find all permutations of a given string
 * ***************************************************************************************
 * Input:	abc
 * Output:	abc acb bac bca cba cab
 * ***************************************************************************************
 */

public class A03_allPermutations {
	/*
	 * --------------------
	 * ---NAIVE APPROACH---
	 * --------------------
	 * The string has "n" characters.
	 * 
	 * We swap the 1st character with all "n" characters.
	 * 		E.g, for "ABCD", A is swapped with A,B,C,D.... so permutations are ABCD,BACD,CBAD,DBCA
	 * 
	 * Now the 1st character is fixed. And we swap the 2nd character with all "n-1" characters.
	 * Now the 2nd character is also fixed. And we swap the 3rd character with all "n-1" characters.
	 * .....
	 * .....
	 * .....
	 * We keep on doing this until we reach the last character
	 * 
	 * --------------
	 * Recursion tree
	 * --------------
	 *                                   ABC
	 *                         ___________|____________
	 *                        /           |            \
	 *                     A,BC          B,AC         C,BA		--- A is swapped with A	 and  A is swapped with B  and  A is swapped with C
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
	 * TIME:  O(n!)			// n characters have n! permutations
	 * SPACE: O(1)
	 * 
	 * 
	 * 
	 * ---------------------
	 * ---BETTER APPROACH---
	 * ---------------------
	 * The above solution does not consider duplicate characters in the input and prints duplicate permutations.
	 * We can improve the above solution.
	 * 
	 * Before swapping we just need to check ---- 
	 * 		If i-th element is not swapped with itself and still the characters are same, then no need to swap. 
	 * 		Otherwise do as usual.
	 * 
	 */
	
	public static void main(String[] args) {
		String str = "AAC";
		int n = str.length();
		permute(str.toCharArray(), 0, n-1);
	}
	
	
	private static void permute(char A[], int start, int end) {
		if (start == end) {
			System.out.print(new String(A) + " ");
		}
		else {
			for (int i=start; i<=end; i++) {
				if (i != start && A[i] == A[start]) {	// if index are different, but characters on that index are same
					continue;							// it means those are duplicate characters & no need to permute these two characters as it will produce same output.
				}
				else {
					swap(A, start, i);				// swap
					permute(A, start+1, end);		// permute next character with all other characters
					swap(A, start, i);				// revert the swap we did previously
				}
			}
		}
	}
	
	
	private static void swap(char A[], int x, int y) {
		char temp = A[x];
		A[x] = A[y];
		A[y] = temp;
	}
	
}
