package org.example.dsa.aa_array.d_search;


public class D02B_findMajorityElement {
	
	public static void main(String[] args) {
		int A[] = { 3, 3, 4, 2, 4, 4, 2, 4, 4 };
		//		    0  1  2  3  4  5  6  7  8
		
		printMajority(A);
	}
	
	
	private static void printMajority(int A[]) {
		int majIndex = 0;
		int count = 1;
		
		for (int i=1; i<A.length; i++) {
			if (A[i] == A[majIndex])
				count++;
			else
				count--;
			
			if (count == 0) {
				majIndex = i;
				count = 1;
			}
		}
		int candidate = A[majIndex];
		
		int countMajority = 0;
		for (int i=0; i<A.length; i++) {
			if (A[i] == candidate)
				countMajority++;
		}
		
		if (countMajority > A.length/2)
			System.out.println(candidate);
		else
			System.out.println("No Majority Element");
		
	}
}
