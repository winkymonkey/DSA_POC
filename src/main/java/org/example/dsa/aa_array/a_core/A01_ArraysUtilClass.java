package org.example.dsa.aa_array.a_core;

import java.util.Arrays;
import java.util.Collections;


public class A01_ArraysUtilClass {
	
	public static void main(String[] args) {
		
		// print array elements
		int A1[] = {13, 7, 6, 45, 21, 9, 101, 102};
		System.out.println(Arrays.toString(A1));
		System.out.println("--------------------");
		
		
		// sorting (full)
		int A2[] = {13, 7, 6, 45, 21, 9, 101, 102};
		Arrays.sort(A2);								// quick sort
		System.out.println(Arrays.toString(A2));
		System.out.println("--------------------");
		
		
		// sorting (partial)
		int A3[] = {13, 7, 6, 45, 21, 9, 101, 102};
		Arrays.sort(A3, 1, 3);							// quick sort (fromIndex inclusive to toIndex exclusive)
		System.out.println(Arrays.toString(A3));
		System.out.println("--------------------");
		
		
		// binary search (full)
		int A4[] = {13, 7, 6, 45, 21, 9, 101, 102};
		Arrays.binarySearch(A4, 9);
		System.out.println(Arrays.toString(A4));
		System.out.println("--------------------");
		
		
		// binary search (partial)
		int A5[] = {13, 7, 6, 45, 21, 9, 101, 102};
		Arrays.binarySearch(A5, 0, 3, 9);				// fromIndex inclusive to toIndex exclusive
		System.out.println(Arrays.toString(A5));
		System.out.println("--------------------");
		
		
		// checks if both arrays contain same elements
		int A6[] = {13, 7, 6, 45, 21, 9, 101, 102};
		int A7[] = {13, 7, 6, 45, 21, 9, 101, 102, 99};
		boolean isEqual = Arrays.equals(A6, A7);
		System.out.println(isEqual);
		System.out.println("--------------------");
		
		
		// fill array with default values
		int A8[] = new int[20];
		Arrays.fill(A8, 9);								// array should have some size 
		System.out.println(Arrays.toString(A8));
		System.out.println("--------------------");
		
		
		// find min/max/sum/avg
		int A9[] = {13, 7, 6, 45, 21, 9, 101, 102};
		int min = Arrays.stream(A9).min().getAsInt();
		int max = Arrays.stream(A9).max().getAsInt();
		int sum = Arrays.stream(A9).sum();
		double avg = Arrays.stream(A9).average().getAsDouble();
		System.out.println(min);
		System.out.println(max);
		System.out.println(sum);
		System.out.println(avg);
		System.out.println("--------------------");
		
		
		// count frequency
		int A10[] = {13, 7, 6, 45, 21, 9, 101, 102};
		int freq = Collections.frequency(Arrays.asList(A10), 5);
		System.out.println(freq);
		System.out.println("--------------------");
				
	}
	
}
