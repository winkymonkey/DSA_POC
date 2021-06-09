package org.example.dsa.aa_array.d_search;

import java.util.Arrays;


public class D11B_findTheSpecialPair {
	
	public static void main(String args[]) {
		int X[] = { 10, 19, 18 };
		int Y[] = { 11, 15, 9 };

		System.out.println("Total pairs = " + countPairs(X, Y));
	}
	
	
	private static int countPairs(int X[], int Y[]) {
		//Store counts of 0, 1, 2, 3, 4 in Y[]
		int NoOfY[] = new int[5];
		for (int i=0; i<Y.length; i++)
			if (Y[i] < 5)
				NoOfY[Y[i]]++;

		Arrays.sort(Y);

		int total_pairs = 0;

		for (int i=0; i<X.length; i++) {				//Take every element of X and count pairs with it
			if (X[i] == 0) {
				return 0;								//No valid pairs
			}
			if (X[i] == 1) {
				return NoOfY[0];						//Number of pairs is equal to number of zeroes in Y[]
			}
			
			int idx = Arrays.binarySearch(Y, X[i]);		//Find the index of the element in sorted Y[] which is greater than X[i]
			int ans;
			if (idx < 0) {
				idx = Math.abs(idx + 1);
				ans = Y.length - idx;
			}
			else {
				while (idx<Y.length && Y[idx]==X[i]) {
					idx++;
				}
				ans = Y.length - idx;
			}
			
			ans += NoOfY[0];			//If we have reached here, then x > 1, so increase number of pairs for (x>1,y=0)
			ans += NoOfY[1];			//If we have reached here, then x > 1, so increase number of pairs for (x>1,y=1)

			if (X[i] == 2) {
				ans -= NoOfY[3];		// Decrease number of pairs for (x=2, y=3)
				ans -= NoOfY[4];		// Decrease number of pairs for (x=2, y=4)
			}

			if (X[i] == 3) {
				ans += NoOfY[2];		// Increase number of pairs for (x=3, y=2)
			}
			
			total_pairs += ans;
		}
		return total_pairs;
	}
	
}
