package org.example.dsa.bb_string.a_basics;

import java.util.Arrays;

/**
 * ***************************************************************************************
 * Reverse a String
 * ***************************************************************************************
 * Input:	['h','e','l','l','o']
 * Output:	['o','l','l','e','h']
 * 
 * Input:	['H','a','n','n','a','h']
 * Output:	['h','a','n','n','a','H']
 * 
 * ***************************************************************************************
 */

public class A01_reverseString {
	
	public static void main(String[] args) {
		char arr[] = {'h','e','l','l','o'};
		reverse(arr);
	}
	
	private static void reverse(char A[]) {
		int start = 0;
		int end = A.length-1;
		
		while (start <= end) {
			char temp = A[end];
			A[end] = A[start];
			A[start] = temp;
			start++;
			end--;
		}
		System.out.println(Arrays.toString(A));
	}
	
}
