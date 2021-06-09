package org.example.dsa.aa_array.d_search;


public class D11C_findTheSpecialPair {
	
	public static void main(String[] args) {
		int X[] = { 0, 1, 2, 3, 10, 19, 18 };
		int Y[] = { 11, 15, 9 };

		System.out.print(countPairs(X, Y));
	}
	
	
	private static int countPairs(int X[], int Y[]) {
		int[] suffix = new int[1005];
		long total_pairs = 0;

		for (int i=0; i<Y.length; i++)
			suffix[Y[i]]++;

		// Compute suffix sums till i = 3
		for (int i = (int) 1e3; i >= 3; i--)
			suffix[i] += suffix[i+1];

		for (int i=0; i<X.length; i++) {
			if (X[i] == 0) {
				continue;								// No valid pairs
			}
			else if (X[i] == 1) {
				total_pairs += suffix[0];				// Number of pairs is equal to number of zeroes in Y[]
				continue;
			}
			else if (X[i] == 2) {
				total_pairs += suffix[5];				// Store suffix sum upto 5
			}
			else if (X[i] == 3) {
				total_pairs += suffix[2] + suffix[4];	// Store count of 2 and suffix sum upto 4
			}
			else {
				total_pairs += suffix[X[i] + 1];
			}
			total_pairs += suffix[0] + suffix[1];		// For all x >=2, every y = 0 and every y = 1 makes a valid pair
		}
		return (int) total_pairs;
	}

}
