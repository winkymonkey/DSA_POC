package org.example.dsa.aa_array.p_miscellaneous;

import java.util.Arrays;

/**
 * ***************************************************************************************
 * Merge Overlapping Intervals
 * ***************************************************************************************
 * Input:	{{1,3}, {2,4}, {5,7}, {6,8}}
 * Output:	{1,4}, {5,8}
 * 
 * Input:	{{6,8}, {1,9}, {2,4}, {4,7}}
 * Output:	{1,9}
 * 
 * ***************************************************************************************
 */

public class P01_mergeOverlappingIntervals {
	
	public static void main(String args[]) {
		Interval A[] = new Interval[8];
		A[0] = new Interval(1, 3);
		A[1] = new Interval(2, 6);
		A[2] = new Interval(8, 10);
		A[3] = new Interval(8, 9);
		A[4] = new Interval(9, 11);
		A[5] = new Interval(15, 18);
		A[6] = new Interval(2, 4);
		A[7] = new Interval(16, 17);
		mergeIntervals(A);
	}
	
	
	public static void mergeIntervals(Interval A[]) {
		Arrays.sort(A);													// sort on the basis of `start` time of each interval
		System.out.println(Arrays.toString(A));
		

		int index = 0; 													// index of last element in output array (modified A[])

		for (int i=1; i<A.length; i++) {
			if (A[index].end >= A[i].start) {							// If this is not first Interval and overlaps with the previous one, merge both the Intervals
				A[index].start = Math.min(A[index].start, A[i].start);
				A[index].end = Math.max(A[index].end, A[i].end);
			}
			else {
				index++;
				A[index] = A[i];
			}
		}

		System.out.print("The Merged Intervals are: ");
		for (int i = 0; i <= index; i++) {
			System.out.print("{" + A[i].start + "," + A[i].end + "}");
		}
	}

}

class Interval implements Comparable<Interval> {
	int start, end;

	public Interval(int start, int end) {
		this.start = start;
		this.end = end;
	}

	@Override
	public int compareTo(Interval interval) {
		return this.start - interval.start;
	}
	
	public String toString() {
		return "("+start+","+end+")";
	}
}